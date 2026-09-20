package p204p;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public final class q4j implements hkq {
    @Override // p204p.hkq
    /* JADX INFO: renamed from: a */
    public final boolean mo24958a(SSLSocket sSLSocket) {
        return s4j.f205606b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p204p.hkq
    /* JADX INFO: renamed from: k */
    public final dk31 mo24964k(SSLSocket sSLSocket) {
        return new s4j();
    }
}
