package p204p;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes6.dex */
public final class wu4 implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final wu4 f255099a = new wu4();

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
