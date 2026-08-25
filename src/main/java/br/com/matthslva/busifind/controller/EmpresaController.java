package br.com.matthslva.busifind.controller;

import br.com.matthslva.busifind.dto.EmpresaDTO;
import br.com.matthslva.busifind.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/")
    public String exibirPaginaInicial() {
        return "index"; 
    }

    @GetMapping("/buscar")
    public String buscarCnpj(@RequestParam("cnpj") String cnpj, Model model) {
        
        EmpresaDTO empresaEncontrada = empresaService.buscarPorCnpj(cnpj);
        
        if (empresaEncontrada != null) {
            // Envia os dados da empresa para o HTML
            model.addAttribute("empresa", empresaEncontrada);
        } else {
            model.addAttribute("erro", "CNPJ não encontrado ou inválido!");
        }
        
        // Retorna para a página index.html
        return "index"; 
    }
}
