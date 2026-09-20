package p204p;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public final class s4j implements dk31 {

    /* JADX INFO: renamed from: a */
    public static final q4j f205605a = new q4j();

    /* JADX INFO: renamed from: b */
    public static final boolean f205606b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, r4j.class.getClassLoader());
            if (Conscrypt.isAvailable() && r4j.m74757a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f205606b = z;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: a */
    public final boolean mo32685a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: b */
    public final boolean mo32686b() {
        return f205606b;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: c */
    public final String mo32687c(SSLSocket sSLSocket) {
        if (mo32685a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: d */
    public final void mo32688d(SSLSocket sSLSocket, String str, List list) {
        if (mo32685a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            wco0 wco0Var = wco0.f250081a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) tco0.m80477b(list).toArray(new String[0]));
        }
    }
}
