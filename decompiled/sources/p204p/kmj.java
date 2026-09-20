package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface kmj {
    /* JADX INFO: renamed from: a */
    static long m56929a(kmj kmjVar) {
        byte[] bArr = (byte[]) ((r8p) kmjVar).f196825b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
