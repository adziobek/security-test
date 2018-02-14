package security.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import security.service.DecodeService;

@RestController
public class SecurityController {

    @Autowired
    private DecodeService decodeService;

    @RequestMapping(value = "/decode-base64", method = RequestMethod.POST)
    public String decodeBase64(@RequestBody final String input) {
        return decodeService.decodeBase64(input);
    }
}
