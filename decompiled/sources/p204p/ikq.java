package p204p;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class ikq implements dk31 {

    /* JADX INFO: renamed from: a */
    public final hkq f103186a;

    /* JADX INFO: renamed from: b */
    public dk31 f103187b;

    public ikq(hkq hkqVar) {
        this.f103186a = hkqVar;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: a */
    public final boolean mo32685a(SSLSocket sSLSocket) {
        return this.f103186a.mo24958a(sSLSocket);
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: b */
    public final boolean mo32686b() {
        return true;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: c */
    public final String mo32687c(SSLSocket sSLSocket) {
        dk31 dk31VarM50952e = m50952e(sSLSocket);
        if (dk31VarM50952e != null) {
            return dk31VarM50952e.mo32687c(sSLSocket);
        }
        return null;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: d */
    public final void mo32688d(SSLSocket sSLSocket, String str, List list) {
        dk31 dk31VarM50952e = m50952e(sSLSocket);
        if (dk31VarM50952e != null) {
            dk31VarM50952e.mo32688d(sSLSocket, str, list);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized dk31 m50952e(SSLSocket sSLSocket) {
        try {
            if (this.f103187b == null && this.f103186a.mo24958a(sSLSocket)) {
                this.f103187b = this.f103186a.mo24964k(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f103187b;
    }
}
