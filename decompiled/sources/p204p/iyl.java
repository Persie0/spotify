package p204p;

import io.ably.lib.types.AblyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes16.dex */
public final class iyl extends gyl {
    /* JADX INFO: renamed from: a */
    public final byte[] m51940a(byte[] bArr) throws AblyException {
        int i = this.f85672d;
        Cipher cipher = this.f85671c;
        if (bArr == null) {
            return null;
        }
        try {
            cipher.init(2, this.f85669a, new IvParameterSpec(bArr, 0, i));
            return cipher.doFinal(bArr, i, bArr.length - i);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            throw AblyException.fromThrowable(e);
        }
    }
}
