package p204p;

import com.comscore.android.ConnectivityType;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes16.dex */
public abstract class kyl {

    /* JADX INFO: renamed from: a */
    public static final int f127884a;

    /* JADX INFO: renamed from: b */
    public static final SecureRandom f127885b;

    static {
        f127884a = Cipher.getMaxAllowedKeyLength("aes") < 256 ? 128 : 256;
        f127885b = new SecureRandom();
    }

    /* JADX INFO: renamed from: a */
    public static hyl m57720a(Object obj) throws AblyException {
        if (obj != null) {
            if (obj instanceof hyl) {
                return (hyl) obj;
            }
            throw AblyException.fromErrorInfo(new ErrorInfo("ChannelOptions not supported", 400, ConnectivityType.UNKNOWN));
        }
        int i = f127884a;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("aes".toUpperCase(Locale.ROOT));
            keyGenerator.init(i);
            byte[] encoded = keyGenerator.generateKey().getEncoded();
            byte[] bArr = new byte[16];
            f127885b.nextBytes(bArr);
            return new hyl("aes", encoded, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
