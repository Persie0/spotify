package p204p;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class e32 implements uio {

    /* JADX INFO: renamed from: a */
    public final uio f55597a;

    /* JADX INFO: renamed from: b */
    public final byte[] f55598b;

    /* JADX INFO: renamed from: c */
    public final byte[] f55599c;

    /* JADX INFO: renamed from: d */
    public CipherInputStream f55600d;

    public e32(uio uioVar, byte[] bArr, byte[] bArr2) {
        this.f55597a = uioVar;
        this.f55598b = bArr;
        this.f55599c = bArr2;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: a */
    public final void mo29278a(x491 x491Var) {
        x491Var.getClass();
        this.f55597a.mo29278a(x491Var);
    }

    @Override // p204p.uio
    public final void close() {
        if (this.f55600d != null) {
            this.f55600d = null;
            this.f55597a.close();
        }
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: e */
    public final Map mo28172e() {
        return this.f55597a.mo28172e();
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f55597a.getUri();
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f55600d.getClass();
        int i3 = this.f55600d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f55598b, "AES"), new IvParameterSpec(this.f55599c));
                ljo ljoVar = new ljo(this.f55597a, sjoVar);
                this.f55600d = new CipherInputStream(ljoVar, cipher);
                ljoVar.m59173a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
