package br.com.casadocodigo.loja.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Component
public class FileSaver {

    @Autowired
    private HttpServletRequest request;

    public String write(String baseFolder, MultipartFile file) throws IOException {
        String realPath = request.getServletContext().getRealPath("/" + baseFolder);
        String pathname = realPath + "/" + file.getOriginalFilename();
        file.transferTo(new File(pathname));
        return baseFolder + "/" + file.getOriginalFilename();
    }
}
