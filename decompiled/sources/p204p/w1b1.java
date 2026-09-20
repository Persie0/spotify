package p204p;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class w1b1 extends ByteArrayOutputStream {
    /* JADX INFO: renamed from: a */
    public final byte[] m86994a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized ByteBuffer m86995c() {
        return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count).asReadOnlyBuffer();
    }
}
