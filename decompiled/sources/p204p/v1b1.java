package p204p;

import com.davidehrmann.vcdiff.util.VarInt$VarIntEndOfBufferException;
import com.davidehrmann.vcdiff.util.VarInt$VarIntParseException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class v1b1 {

    /* JADX INFO: renamed from: f */
    public static final xra0 f236310f = bsa0.m30425b(v1b1.class);

    /* JADX INFO: renamed from: b */
    public IOException f236312b;

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f236314d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f236315e;

    /* JADX INFO: renamed from: a */
    public short f236311a = 0;

    /* JADX INFO: renamed from: c */
    public Integer f236313c = 0;

    public v1b1(ByteBuffer byteBuffer) {
        this.f236314d = byteBuffer.duplicate();
    }

    /* JADX INFO: renamed from: a */
    public final Byte m84458a() {
        if (this.f236311a != 0) {
            return null;
        }
        IOException iOException = this.f236312b;
        if (iOException != null) {
            throw iOException;
        }
        ByteBuffer byteBuffer = this.f236314d;
        if (byteBuffer.hasRemaining()) {
            return Byte.valueOf(byteBuffer.get());
        }
        this.f236311a = (short) -2;
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m84459b(String str) {
        if (this.f236311a != 0) {
            return null;
        }
        IOException iOException = this.f236312b;
        if (iOException != null) {
            throw iOException;
        }
        ByteBuffer byteBuffer = this.f236314d;
        byteBuffer.mark();
        try {
            return Integer.valueOf(e4b1.m37768b(byteBuffer));
        } catch (VarInt$VarIntEndOfBufferException unused) {
            byteBuffer.reset();
            this.f236311a = (short) -2;
            return null;
        } catch (VarInt$VarIntParseException unused2) {
            byteBuffer.reset();
            IOException iOException2 = new IOException("Expected " + str + "; found invalid variable-length integer");
            this.f236312b = iOException2;
            throw iOException2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final t1b1 m84460c(long j, byte b, String str, String str2) {
        Integer numM84459b = m84459b("source segment length");
        if (numM84459b == null) {
            return null;
        }
        if (numM84459b.intValue() > j) {
            IOException iOException = new IOException(String.format("Source segment length (%d) is larger than %s (%d)", numM84459b, str2, Long.valueOf(j)));
            this.f236312b = iOException;
            throw iOException;
        }
        Integer numM84459b2 = m84459b("source segment position");
        if (numM84459b2 == null) {
            return null;
        }
        if (numM84459b2.intValue() >= j && numM84459b.intValue() > 0) {
            IOException iOException2 = new IOException(String.format("Source segment position (%d) is past %s (%d)", numM84459b2, str, Long.valueOf(j)));
            this.f236312b = iOException2;
            throw iOException2;
        }
        if (numM84459b2.intValue() + numM84459b.intValue() <= j) {
            return new t1b1(b, numM84459b.intValue(), numM84459b2.intValue());
        }
        IOException iOException3 = new IOException("Source segment end position ({}) is past {} ({})");
        this.f236312b = iOException3;
        throw iOException3;
    }
}
