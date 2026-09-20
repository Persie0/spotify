package p204p;

import io.ably.lib.types.AblyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes16.dex */
public abstract class gyl {

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f85669a;

    /* JADX INFO: renamed from: b */
    public final IvParameterSpec f85670b;

    /* JADX INFO: renamed from: c */
    public final Cipher f85671c;

    /* JADX INFO: renamed from: d */
    public final int f85672d;

    /* JADX INFO: renamed from: e */
    public final String f85673e;

    public gyl(hyl hylVar) throws AblyException {
        String str = hylVar.f96600a;
        String str2 = str.toUpperCase(Locale.ROOT) + "/CBC/PKCS5Padding";
        try {
            this.f85673e = str + '-' + hylVar.f96601b + "-cbc";
            this.f85669a = hylVar.f96602c;
            IvParameterSpec ivParameterSpec = hylVar.f96603d;
            this.f85670b = ivParameterSpec;
            this.f85672d = ivParameterSpec.getIV().length;
            this.f85671c = Cipher.getInstance(str2);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw AblyException.fromThrowable(e);
        }
    }
}
