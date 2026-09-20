package p204p;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class lt3 implements dk31 {
    @Override // p204p.dk31
    /* JADX INFO: renamed from: a */
    public final boolean mo32685a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: b */
    public final boolean mo32686b() {
        wco0 wco0Var = wco0.f250081a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: c */
    public final String mo32687c(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: d */
    public final void mo32688d(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            wco0 wco0Var = wco0.f250081a;
            sSLParameters.setApplicationProtocols((String[]) tco0.m80477b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
