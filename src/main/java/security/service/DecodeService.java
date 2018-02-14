package security.service;

import java.util.Base64;

import org.springframework.stereotype.Service;

@Service
public class DecodeService {
    public String decodeBase64(String str) {
        byte[] bytesFromBase64 = Base64.getDecoder().decode(str);
        return new String(bytesFromBase64);
    }

    public String decodeBase64() {
        byte[] bytesFromBase64 = Base64.getDecoder().decode("T2Rrb2Rvd2FueSB0ZWtzdA==");
        return new String(bytesFromBase64);
    }
}
