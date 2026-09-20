package p204p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class x1b1 {

    /* JADX INFO: renamed from: q */
    public static final xra0 f257125q = bsa0.m30425b(x1b1.class);

    /* JADX INFO: renamed from: a */
    public ByteBuffer f257126a;

    /* JADX INFO: renamed from: d */
    public byte f257129d;

    /* JADX INFO: renamed from: f */
    public o1b1 f257131f;

    /* JADX INFO: renamed from: g */
    public p1b1 f257132g;

    /* JADX INFO: renamed from: i */
    public x1b1 f257134i;

    /* JADX INFO: renamed from: j */
    public int f257135j;

    /* JADX INFO: renamed from: m */
    public long f257138m;

    /* JADX INFO: renamed from: n */
    public int f257139n;

    /* JADX INFO: renamed from: o */
    public boolean f257140o;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f257127b = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: c */
    public final w1b1 f257128c = new w1b1(512);

    /* JADX INFO: renamed from: h */
    public final ByteArrayOutputStream f257133h = new ByteArrayOutputStream(1024);

    /* JADX INFO: renamed from: k */
    public final long f257136k = 67108864;

    /* JADX INFO: renamed from: l */
    public final int f257137l = 67108864;

    /* JADX INFO: renamed from: p */
    public boolean f257141p = true;

    /* JADX INFO: renamed from: e */
    public final s1b1 f257130e = new s1b1(this);

    public x1b1() {
        m89629f();
    }

    /* JADX INFO: renamed from: a */
    public final void m89624a(ByteBuffer byteBuffer, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        s1b1 s1b1Var = this.f257130e;
        if (!this.f257140o) {
            m89629f();
            throw new IOException("decodeChunk() called without startDecoding()");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f257127b.remaining() + byteBuffer.remaining());
        byteBufferAllocate.put(this.f257127b);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        this.f257127b = byteBufferAllocate.duplicate();
        try {
            int iM89628e = m89628e(byteBufferAllocate);
            if (iM89628e == 0) {
                iM89628e = m89627d(byteBufferAllocate);
            }
            w1b1 w1b1Var = this.f257128c;
            if (iM89628e == 0) {
                while (byteBufferAllocate.hasRemaining() && s1b1Var.m76937a(byteBufferAllocate) == 0 && !m89626c()) {
                    if (!this.f257141p) {
                        byteArrayOutputStream.write(w1b1Var.m86994a(), this.f257139n, w1b1Var.size() - this.f257139n);
                        w1b1Var.reset();
                        s1b1Var.f204664j = 0;
                        this.f257139n = 0;
                    }
                }
            }
            this.f257127b = byteBufferAllocate;
            ByteBuffer byteBufferM86995c = w1b1Var.m86995c();
            byteBufferM86995c.position(this.f257139n);
            while (byteBufferM86995c.hasRemaining()) {
                byteArrayOutputStream.write(byteBufferM86995c.get());
            }
            this.f257139n = byteBufferM86995c.limit();
        } catch (IOException e) {
            m89629f();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0038 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x000f, B:10:0x0015, B:25:0x0038, B:26:0x003f, B:11:0x0017, B:14:0x001d, B:17:0x0024, B:20:0x002b, B:29:0x0042, B:30:0x0049), top: B:33:0x0000 }] */
    /* JADX INFO: renamed from: b */
    public final void m89625b() {
        boolean zHasRemaining;
        try {
            if (!this.f257140o) {
                throw new IOException("finishDecoding() called before startDecoding(), or called after decodeChunk() returned false");
            }
            boolean z = true;
            if (this.f257131f != null) {
                if (this.f257134i != null || this.f257130e.f204656b) {
                    z = false;
                } else if (!m89626c()) {
                    zHasRemaining = this.f257127b.hasRemaining();
                }
                if (z) {
                    throw new IOException("finishDecoding() called before parsing entire delta file window");
                }
                m89629f();
            }
            zHasRemaining = this.f257127b.hasRemaining();
            z = true ^ zHasRemaining;
            if (z) {
                throw new IOException("finishDecoding() called before parsing entire delta file window");
            }
            m89629f();
        } catch (Throwable th) {
            m89629f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89626c() {
        int i = this.f257135j;
        if (i == -3) {
            return false;
        }
        long j = this.f257138m;
        long j2 = i;
        if (j <= j2) {
            return j == j2;
        }
        throw new IllegalStateException(String.format("Internal error: Decoded data size %d exceeds planned target file size %d", Long.valueOf(this.f257138m), Integer.valueOf(this.f257135j)));
    }

    /* JADX INFO: renamed from: d */
    public final int m89627d(ByteBuffer byteBuffer) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.f257133h;
        x1b1 x1b1Var = this.f257134i;
        if (x1b1Var == null) {
            return 0;
        }
        if (this.f257132g == null) {
            throw new IllegalStateException("Internal error: custom_code_table_decoder_ is set, but custom_code_table_ is null");
        }
        try {
            x1b1Var.m89624a(ByteBuffer.wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()), byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            int i = p1b1.f173030t;
            if (size < i) {
                byteBuffer.position(byteBuffer.limit());
                return -2;
            }
            this.f257134i.m89625b();
            if (byteArrayOutputStream.size() != i) {
                throw new IOException(String.format("Decoded custom code table size (%d) does not match size of a code table (%d)", Integer.valueOf(byteArrayOutputStream.size()), Integer.valueOf(i)));
            }
            this.f257132g = new p1b1(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
            byteBuffer.position(byteBuffer.limit() - this.f257134i.f257127b.remaining());
            this.f257134i = null;
            p1b1 p1b1Var = this.f257132g;
            short sM66049b = this.f257131f.m66049b();
            s1b1 s1b1Var = this.f257130e;
            s1b1Var.getClass();
            s1b1Var.f204668n = new q1b1(p1b1Var, sM66049b);
            return 0;
        } catch (IOException e) {
            IOException iOException = new IOException("Failed to write to custom_code_table_string_");
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX INFO: renamed from: e */
    public final int m89628e(ByteBuffer byteBuffer) throws IOException {
        boolean z;
        int iPosition;
        boolean z2;
        if (this.f257131f != null) {
            return 0;
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((ByteBuffer) byteBuffer.slice().limit(Math.min(5, byteBuffer.remaining())));
        byteBufferAllocate.rewind();
        byte b = byteBufferAllocate.get();
        byte b2 = byteBufferAllocate.get();
        byte b3 = byteBufferAllocate.get();
        byte b4 = byteBufferAllocate.get();
        byte b5 = byteBufferAllocate.get();
        if (iRemaining != 0) {
            z = true;
            if (iRemaining != 1) {
                if (iRemaining == 2) {
                    z2 = false;
                } else {
                    if (iRemaining != 3) {
                        this.f257129d = b4;
                        if (b4 != 0 && b4 != 83) {
                            throw new IOException("Unrecognized VCDIFF format version");
                        }
                    }
                    if (b3 != -60) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (b2 != -61) {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (b == -42) {
                z = z2;
            }
        } else {
            z = false;
        }
        if (z) {
            throw new IOException("Did not find VCDIFF header bytes; input is not a VCDIFF delta file");
        }
        if (iRemaining >= 5) {
            int i = b5 & 252;
            if (i != 0) {
                throw new IOException(String.format("Unrecognized hdr_indicator flags: %02x", Integer.valueOf(i)));
            }
            if ((b5 & 1) != 0) {
                throw new IOException("Secondary compression is not supported");
            }
            if ((b5 & 2) == 0) {
                this.f257131f = new o1b1((short) 4, (short) 3);
                byteBuffer.position(byteBuffer.position() + 5);
                return 0;
            }
            v1b1 v1b1Var = new v1b1(ByteBuffer.wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position() + 5, byteBuffer.remaining() - 5).slice());
            Integer numM84459b = v1b1Var.m84459b("size of near cache");
            xra0 xra0Var = f257125q;
            if (numM84459b == null) {
                xra0Var.mo27144o("Failed to parse size of near cache");
                iPosition = v1b1Var.f236311a;
            } else {
                Integer numM84459b2 = v1b1Var.m84459b("size of same cache");
                if (numM84459b2 == null) {
                    xra0Var.mo27144o("Failed to parse size of same cache");
                    iPosition = v1b1Var.f236311a;
                } else {
                    this.f257132g = new p1b1();
                    this.f257133h.reset();
                    this.f257131f = new o1b1(numM84459b.shortValue(), numM84459b2.shortValue());
                    this.f257134i = new x1b1();
                    byte[] bArrM68784c = p1b1.f173029i.m68784c();
                    x1b1 x1b1Var = this.f257134i;
                    x1b1Var.getClass();
                    x1b1Var.m89630g(ByteBuffer.wrap(bArrM68784c));
                    this.f257134i.f257135j = bArrM68784c.length;
                    iPosition = v1b1Var.f236314d.duplicate().asReadOnlyBuffer().position();
                }
            }
            if (iPosition != -2) {
                byteBuffer.position(byteBuffer.position() + 5 + iPosition);
                return 0;
            }
        }
        return -2;
    }

    /* JADX INFO: renamed from: f */
    public final void m89629f() {
        this.f257140o = false;
        this.f257126a = null;
        this.f257129d = (byte) 0;
        this.f257135j = -3;
        this.f257138m = 0L;
        this.f257131f = null;
        this.f257132g = null;
        this.f257134i = null;
        this.f257130e.m76938b();
        this.f257139n = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m89630g(ByteBuffer byteBuffer) {
        if (this.f257140o) {
            throw new IllegalStateException("startDecoding() called twice without finishDecoding()");
        }
        this.f257127b = ByteBuffer.allocate(0);
        this.f257128c.reset();
        m89629f();
        this.f257126a = byteBuffer;
        this.f257140o = true;
    }
}
