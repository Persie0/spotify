package p204p;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class cga implements dk31 {

    /* JADX INFO: renamed from: a */
    public static final aga f37608a = new aga();

    /* JADX INFO: renamed from: b */
    public static final boolean f37609b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, bga.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f37609b = z;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: a */
    public final boolean mo32685a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: b */
    public final boolean mo32686b() {
        return f37609b;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: c */
    public final String mo32687c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: d */
    public final void mo32688d(SSLSocket sSLSocket, String str, List list) {
        if (mo32685a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            wco0 wco0Var = wco0.f250081a;
            parameters.setApplicationProtocols((String[]) tco0.m80477b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
