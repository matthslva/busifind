package br.com.matthslva.busifind.service;

import br.com.matthslva.busifind.dto.EmpresaDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service 
public class EmpresaService {

    public EmpresaDTO buscarPorCnpj(String cnpj) {
        // Regex pra remover os pontos, traços e barras
        String cnpjLimpo = cnpj.replaceAll("[^0-9]", "");
        
        String url = "https://cnpja.com/api/open/" + cnpjLimpo;

        RestTemplate restTemplate = new RestTemplate();
        
        try {
            // Ele vai na URL, pega o JSON e converte para o EmpresaDTO
            return restTemplate.getForObject(url, EmpresaDTO.class);
        } catch (Exception e) {
            return null;
        }
    }
}
