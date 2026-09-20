package p204p;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes.dex */
public final class dgj implements eh00 {

    /* JADX INFO: renamed from: b */
    public static final dgj f48812b = new dgj(0);

    /* JADX INFO: renamed from: c */
    public static final dgj f48813c = new dgj(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ dgj f48814d = new dgj(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48815a;

    public /* synthetic */ dgj(int i) {
        this.f48815a = i;
    }

    @Override // p204p.eh00
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (this.f48815a) {
            case 0:
                int i = n6f.f150872l;
                return new n6f(ly5.m60218h());
            case 1:
                return null;
            default:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
        }
    }
}
