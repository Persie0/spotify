package p204p;

import com.davidehrmann.vcdiff.util.VarInt$VarIntEndOfBufferException;
import com.davidehrmann.vcdiff.util.VarInt$VarIntParseException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes16.dex */
public final class s1b1 {

    /* JADX INFO: renamed from: a */
    public final x1b1 f204655a;

    /* JADX INFO: renamed from: b */
    public boolean f204656b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f204657c;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f204659e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f204660f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f204661g;

    /* JADX INFO: renamed from: h */
    public int f204662h;

    /* JADX INFO: renamed from: i */
    public Integer f204663i;

    /* JADX INFO: renamed from: j */
    public int f204664j;

    /* JADX INFO: renamed from: k */
    public boolean f204665k;

    /* JADX INFO: renamed from: m */
    public final Adler32 f204667m;

    /* JADX INFO: renamed from: n */
    public q1b1 f204668n;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f204658d = new AtomicInteger(0);

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f204666l = new AtomicInteger(0);

    static {
        bsa0.m30425b(s1b1.class);
    }

    public s1b1(x1b1 x1b1Var) {
        uye1 uye1Var = new uye1();
        uye1Var.f235239a = 0;
        this.f204667m = uye1Var;
        this.f204668n = new q1b1();
        this.f204655a = x1b1Var;
        m76938b();
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0305  */
    /* JADX WARN: Code duplicated, block: B:127:0x0309  */
    /* JADX WARN: Code duplicated, block: B:175:0x0436  */
    /* JADX WARN: Code duplicated, block: B:223:0x0564  */
    /* JADX WARN: Code duplicated, block: B:225:0x0567  */
    /* JADX WARN: Code duplicated, block: B:227:0x056a  */
    /* JADX WARN: Code duplicated, block: B:229:0x056d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0570  */
    /* JADX WARN: Code duplicated, block: B:231:0x0573  */
    /* JADX WARN: Code duplicated, block: B:232:0x0576  */
    /* JADX WARN: Code duplicated, block: B:233:0x0579  */
    /* JADX WARN: Code duplicated, block: B:293:0x0597 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m76937a(ByteBuffer byteBuffer) throws IOException {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        boolean z;
        int i;
        String str;
        t1b1 t1b1VarM84460c;
        Integer numM84459b;
        Integer numValueOf;
        u1b1 u1b1Var;
        short s;
        boolean z2 = this.f204656b;
        AtomicInteger atomicInteger = this.f204666l;
        AtomicInteger atomicInteger2 = this.f204658d;
        x1b1 x1b1Var = this.f204655a;
        if (z2) {
            b = 2;
            if (!m76940d()) {
                throw new IOException("Internal error: Resumed decoding of a delta file window when interleaved format is not being used");
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.f204659e = byteBufferSlice;
            int iRemaining = byteBufferSlice.remaining();
            int i2 = this.f204662h;
            if (iRemaining > i2) {
                this.f204659e.limit(i2);
            }
            ByteBuffer byteBuffer2 = this.f204659e;
            this.f204660f = byteBuffer2;
            this.f204661g = byteBuffer2;
            q1b1 q1b1Var = this.f204668n;
            q1b1Var.f184284b = byteBuffer2;
            q1b1Var.f184285c = -1;
            q1b1Var.f184287e = q1b1Var.f184286d;
        } else {
            w1b1 w1b1Var = x1b1Var.f257128c;
            v1b1 v1b1Var = new v1b1(byteBuffer.slice());
            int iLimit = x1b1Var.f257126a.limit();
            int size = w1b1Var.size();
            boolean z3 = x1b1Var.f257141p;
            Byte bM84458a = v1b1Var.m84458a();
            if (bM84458a == null) {
                t1b1VarM84460c = null;
            } else {
                int iByteValue = bM84458a.byteValue() & 248;
                if (iByteValue != 0) {
                    v1b1.f236310f.mo27144o(String.format("Unrecognized win_indicator flags: 0x%02x", Integer.valueOf(iByteValue)));
                }
                int iByteValue2 = bM84458a.byteValue() & 3;
                if (iByteValue2 == 1) {
                    t1b1VarM84460c = v1b1Var.m84460c(iLimit, bM84458a.byteValue(), "end of dictionary", "dictionary");
                } else if (iByteValue2 != 2) {
                    if (iByteValue2 == 3) {
                        IOException iOException = new IOException("Win_Indicator must not have both VCD_SOURCE and VCD_TARGET set");
                        v1b1Var.f236312b = iOException;
                        throw iOException;
                    }
                    t1b1VarM84460c = new t1b1(bM84458a.byteValue(), 0, 0);
                } else {
                    if (!z3) {
                        IOException iOException2 = new IOException("Delta file contains VCD_TARGET flag, which is not allowed by current decoder settings");
                        v1b1Var.f236312b = iOException2;
                        throw iOException2;
                    }
                    t1b1VarM84460c = v1b1Var.m84460c(size, bM84458a.byteValue(), "current target position", "target file");
                }
            }
            if (t1b1VarM84460c == null) {
                s = v1b1Var.f236311a;
            } else {
                int i3 = t1b1VarM84460c.f216213c;
                byte b5 = t1b1VarM84460c.f216211a;
                atomicInteger2.set(t1b1VarM84460c.f216212b);
                this.f204665k = x1b1Var.f257129d == 83 && (b5 & 4) != 0;
                if (v1b1Var.f236315e != null) {
                    IOException iOException3 = new IOException("Internal error: VCDiffHeaderParser.ParseWindowLengths was called twice for the same delta window");
                    v1b1Var.f236312b = iOException3;
                    throw iOException3;
                }
                Integer numM84459b2 = v1b1Var.m84459b("length of the delta encoding");
                v1b1Var.f236313c = numM84459b2;
                ByteBuffer byteBuffer3 = v1b1Var.f236314d;
                if (numM84459b2 == null) {
                    numM84459b = null;
                } else {
                    v1b1Var.f236315e = byteBuffer3.duplicate();
                    numM84459b = v1b1Var.m84459b("size of the target window");
                }
                this.f204663i = numM84459b;
                if (numM84459b == null) {
                    s = v1b1Var.f236311a;
                } else {
                    int iIntValue = numM84459b.intValue();
                    if (iIntValue > x1b1Var.f257137l) {
                        throw new IOException(String.format("Length of target window (%d) exceeds limit of %d bytes", numM84459b, Integer.valueOf(x1b1Var.f257137l)));
                    }
                    int i4 = x1b1Var.f257135j;
                    b = 2;
                    if (i4 != -3 && iIntValue > ((long) i4) - x1b1Var.f257138m) {
                        throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed planned size of %d bytes", numM84459b, Long.valueOf(x1b1Var.f257138m), Integer.valueOf(x1b1Var.f257135j)));
                    }
                    if (iIntValue > x1b1Var.f257136k - x1b1Var.f257138m) {
                        throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed maximum target file size of %d bytes", numM84459b, Long.valueOf(x1b1Var.f257138m), Long.valueOf(x1b1Var.f257136k)));
                    }
                    Byte bM84458a2 = v1b1Var.m84458a();
                    if (bM84458a2 != null && (bM84458a2.byteValue() & 7) != 0) {
                        IOException iOException4 = new IOException("Secondary compression of delta file sections is not supported");
                        v1b1Var.f236312b = iOException4;
                        throw iOException4;
                    }
                    boolean z4 = this.f204665k;
                    Integer numM84459b3 = v1b1Var.m84459b("length of data for ADDs and RUNs");
                    Integer numM84459b4 = v1b1Var.m84459b("length of instructions section");
                    Integer numM84459b5 = v1b1Var.m84459b("length of addresses for COPYs");
                    if (z4 && v1b1Var.f236311a == 0) {
                        IOException iOException5 = v1b1Var.f236312b;
                        if (iOException5 != null) {
                            throw iOException5;
                        }
                        try {
                            byteBuffer3.mark();
                            try {
                                long jM37769c = e4b1.m37769c(byteBuffer3);
                                if ((jM37769c & (-4294967296L)) != 0) {
                                    byteBuffer3.reset();
                                    IOException iOException6 = new IOException("Value of {} ({}) is too large for unsigned 32-bit integer");
                                    v1b1Var = v1b1Var;
                                    v1b1Var.f236312b = iOException6;
                                    throw iOException6;
                                }
                                numValueOf = Integer.valueOf((int) jM37769c);
                                v1b1Var = v1b1Var;
                            } catch (VarInt$VarIntEndOfBufferException unused) {
                                v1b1Var = v1b1Var;
                                v1b1Var.f236311a = (short) -2;
                                byteBuffer3.reset();
                                numValueOf = null;
                            } catch (VarInt$VarIntParseException unused2) {
                                v1b1Var = v1b1Var;
                                byteBuffer3.reset();
                                IOException iOException7 = new IOException("Expected {}; found invalid variable-length integer");
                                v1b1Var.f236312b = iOException7;
                                throw iOException7;
                            }
                        } catch (VarInt$VarIntEndOfBufferException unused3) {
                        } catch (VarInt$VarIntParseException unused4) {
                        }
                        v1b1Var.f236311a = (short) -2;
                        byteBuffer3.reset();
                        numValueOf = null;
                    } else {
                        numValueOf = null;
                    }
                    if (v1b1Var.f236311a != 0) {
                        u1b1Var = null;
                    } else {
                        IOException iOException8 = v1b1Var.f236312b;
                        if (iOException8 != null) {
                            throw iOException8;
                        }
                        if (v1b1Var.f236315e == null) {
                            IOException iOException9 = new IOException("Internal error: VCDiffHeaderParser.parseSectionLengths was called before ParseWindowLengths");
                            v1b1Var.f236312b = iOException9;
                            throw iOException9;
                        }
                        Integer num = numValueOf;
                        if (v1b1Var.f236313c.intValue() != ((long) (byteBuffer3.position() - v1b1Var.f236315e.position())) + ((long) numM84459b3.intValue()) + ((long) numM84459b4.intValue()) + ((long) numM84459b5.intValue())) {
                            IOException iOException10 = new IOException("The length of the delta encoding does not match the size of the header plus the sizes of the data sections");
                            v1b1Var.f236312b = iOException10;
                            throw iOException10;
                        }
                        u1b1Var = new u1b1(numM84459b3.intValue(), numM84459b4.intValue(), numM84459b5.intValue(), num != null ? num.intValue() : 0);
                    }
                    if (u1b1Var == null) {
                        s = v1b1Var.f236311a;
                    } else {
                        int i5 = u1b1Var.f225748d;
                        int i6 = u1b1Var.f225746b;
                        int i7 = u1b1Var.f225747c;
                        int i8 = u1b1Var.f225745a;
                        int iM37767a = e4b1.m37767a(this.f204663i.intValue()) + 1 + e4b1.m37767a(i8) + e4b1.m37767a(i7) + e4b1.m37767a(i6) + i8 + i7 + i6;
                        if (this.f204665k) {
                            atomicInteger.set(i5);
                            iM37767a += e4b1.m37767a(i5);
                        }
                        if (x1b1Var.f257129d == 83 && i8 == 0 && i7 == 0) {
                            this.f204662h = i6;
                            ByteBuffer byteBufferSlice2 = byteBuffer3.duplicate().asReadOnlyBuffer().slice();
                            this.f204659e = byteBufferSlice2;
                            int iRemaining2 = byteBufferSlice2.remaining();
                            int i9 = this.f204662h;
                            if (iRemaining2 > i9) {
                                this.f204659e.limit(i9);
                            }
                            ByteBuffer byteBuffer4 = this.f204659e;
                            this.f204660f = byteBuffer4;
                            this.f204661g = byteBuffer4;
                        } else if (byteBuffer3.duplicate().asReadOnlyBuffer().remaining() < i8 + i6 + i7) {
                            s = -2;
                        } else {
                            ByteBuffer byteBufferSlice3 = byteBuffer3.duplicate().asReadOnlyBuffer().slice();
                            this.f204660f = byteBufferSlice3;
                            byteBufferSlice3.position(i8);
                            ByteBuffer byteBufferSlice4 = this.f204660f.slice();
                            this.f204659e = byteBufferSlice4;
                            byteBufferSlice4.position(i6);
                            ByteBuffer byteBufferSlice5 = this.f204659e.slice();
                            this.f204661g = byteBufferSlice5;
                            byteBufferSlice5.position(i7);
                            this.f204660f.flip();
                            this.f204659e.flip();
                            this.f204661g.flip();
                            if (v1b1Var.f236313c.intValue() != iM37767a) {
                                throw new IOException("The end of the instructions section does not match the end of the delta window");
                            }
                        }
                        q1b1 q1b1Var2 = this.f204668n;
                        q1b1Var2.f184284b = this.f204659e;
                        q1b1Var2.f184285c = -1;
                        q1b1Var2.f184286d = (short) 256;
                        q1b1Var2.f184287e = (short) 256;
                        s = 0;
                    }
                    if (s == 0) {
                        if ((b5 & 1) != 0) {
                            ByteBuffer byteBuffer5 = (ByteBuffer) x1b1Var.f257126a.duplicate().rewind();
                            this.f204657c = byteBuffer5;
                            byteBuffer5.position(i3);
                        } else if ((b5 & 2) != 0) {
                            ByteBuffer byteBufferM86995c = w1b1Var.m86995c();
                            this.f204657c = byteBufferM86995c;
                            byteBufferM86995c.position(i3);
                        }
                        this.f204656b = true;
                        byteBuffer.position(byteBuffer.position() + byteBuffer3.duplicate().asReadOnlyBuffer().position());
                        x1b1Var.f257138m += (long) this.f204663i.intValue();
                        s = 0;
                    }
                }
                if (s == -2) {
                    return -2;
                }
                o1b1 o1b1Var = x1b1Var.f257131f;
                Arrays.fill(o1b1Var.f160685b, 0);
                Arrays.fill(o1b1Var.f160686c, 0);
                o1b1Var.f160684a = 0;
            }
            b = 2;
            if (s == -2) {
                return -2;
            }
            o1b1 o1b1Var2 = x1b1Var.f257131f;
            Arrays.fill(o1b1Var2.f160685b, 0);
            Arrays.fill(o1b1Var2.f160686c, 0);
            o1b1Var2.f160684a = 0;
        }
        while (true) {
            if (m76941e() >= this.f204663i.intValue()) {
                if (m76941e() != this.f204663i.intValue()) {
                    throw new IOException(String.format("Decoded target window size (%d bytes) does not match expected size (%d bytes)", Integer.valueOf(m76941e()), this.f204663i));
                }
                if (this.f204665k) {
                    byte[] bArrM86994a = x1b1Var.f257128c.m86994a();
                    int i10 = this.f204664j;
                    int iIntValue2 = this.f204663i.intValue();
                    Adler32 adler32 = this.f204667m;
                    adler32.update(bArrM86994a, i10, iIntValue2);
                    int value = (int) adler32.getValue();
                    adler32.reset();
                    if (value != atomicInteger.get()) {
                        throw new IOException("Target data does not match checksum; this could mean that the wrong dictionary was used");
                    }
                }
                if (this.f204659e.hasRemaining()) {
                    throw new IOException("Excess instructions and sizes left over after decoding target window");
                }
                if (m76940d()) {
                    m76942f(byteBuffer);
                } else {
                    if (this.f204660f.hasRemaining()) {
                        throw new IOException("Excess ADD/RUN data left over after decoding target window");
                    }
                    if (this.f204661g.hasRemaining()) {
                        throw new IOException("Excess COPY addresses left over after decoding target window");
                    }
                    byteBuffer.position(byteBuffer.position() + this.f204659e.limit() + this.f204660f.limit() + this.f204661g.limit());
                }
                m76938b();
                return 0;
            }
            AtomicInteger atomicInteger3 = new AtomicInteger(0);
            AtomicInteger atomicInteger4 = new AtomicInteger(0);
            q1b1 q1b1Var3 = this.f204668n;
            p1b1 p1b1Var = q1b1Var3.f184283a;
            ByteBuffer byteBuffer6 = q1b1Var3.f184284b;
            if (byteBuffer6 == null) {
                throw new IllegalStateException("Internal error: getNextInstruction() called before init()");
            }
            q1b1Var3.f184285c = byteBuffer6.position();
            q1b1Var3.f184287e = q1b1Var3.f184286d;
            while (true) {
                short s2 = q1b1Var3.f184286d;
                if (s2 == 256) {
                    if (q1b1Var3.f184284b.hasRemaining()) {
                        byte b6 = q1b1Var3.f184284b.get();
                        int i11 = b6 & 255;
                        if (p1b1Var.f173032b[i11] != 0) {
                            q1b1Var3.f184286d = b6;
                        }
                        b2 = p1b1Var.f173031a[i11];
                        byte b7 = p1b1Var.f173033c[i11];
                        byte b8 = p1b1Var.f173035e[i11];
                        if (b2 != 0) {
                            b4 = b8;
                            b3 = b7;
                        }
                    }
                    b2 = 5;
                    if (b2 != 5) {
                        z = true;
                        m76942f(byteBuffer);
                        break;
                    }
                    i = atomicInteger3.get();
                    if (i <= this.f204663i.intValue() || m76941e() + i > this.f204663i.intValue()) {
                        xra0 xra0Var = p1b1.f173028h;
                        if (b2 != 0) {
                            str = "NOOP";
                        } else if (b2 != 1) {
                            str = "ADD";
                        } else if (b2 != 2) {
                            str = "RUN";
                        } else if (b2 != 3) {
                            str = "";
                        } else {
                            str = "COPY";
                        }
                        throw new IOException(String.format("%s with size %d plus existing %d bytes of target data exceeds length of target window (%d bytes)", str, Integer.valueOf(i), Integer.valueOf(m76941e()), this.f204663i));
                    }
                    if (b2 == 1) {
                        if (i > this.f204660f.remaining()) {
                            this.f204668n.m71920a();
                            m76942f(byteBuffer);
                            z = true;
                            break;
                        }
                        m76939c(this.f204660f, i);
                        b = 2;
                    } else if (b2 != b) {
                        if (b2 != 3) {
                            throw new IOException("Unexpected instruction type " + ((int) b2) + " in opcode stream");
                        }
                        short s3 = (short) atomicInteger4.get();
                        int iM76941e = m76941e();
                        int i12 = atomicInteger2.get() + iM76941e;
                        try {
                            int iM66048a = x1b1Var.f257131f.m66048a(i12, s3, this.f204661g);
                            if (iM66048a == -2) {
                                this.f204668n.m71920a();
                                m76942f(byteBuffer);
                                z = true;
                                break;
                            }
                            if (iM66048a < 0 || iM66048a > i12) {
                                throw new IllegalStateException(String.format("Internal error: unexpected address %d returned from DecodeAddress, with here_address = %d", Integer.valueOf(iM66048a), Integer.valueOf(i12)));
                            }
                            if (iM66048a + i <= atomicInteger2.get()) {
                                m76939c((ByteBuffer) this.f204657c.slice().position(iM66048a), i);
                            } else {
                                if (iM66048a < atomicInteger2.get()) {
                                    int i13 = atomicInteger2.get() - iM66048a;
                                    m76939c((ByteBuffer) this.f204657c.slice().position(iM66048a), i13);
                                    iM76941e += i13;
                                    iM66048a += i13;
                                    i -= i13;
                                }
                                int i14 = iM66048a - atomicInteger2.get();
                                ByteBuffer byteBufferM86995c2 = x1b1Var.f257128c.m86995c();
                                byteBufferM86995c2.position(this.f204664j);
                                while (true) {
                                    int i15 = iM76941e - i14;
                                    if (i <= i15) {
                                        break;
                                    }
                                    m76939c((ByteBuffer) byteBufferM86995c2.slice().position(i14), i15);
                                    iM76941e += i15;
                                    i14 += i15;
                                    i -= i15;
                                    byteBufferM86995c2 = x1b1Var.f257128c.m86995c();
                                    byteBufferM86995c2.position(this.f204664j);
                                }
                                m76939c((ByteBuffer) byteBufferM86995c2.slice().position(i14), i);
                            }
                            b = 2;
                        } catch (IOException e) {
                            new IOException("Unable to decode address for COPY").initCause(e);
                            throw e;
                        }
                    } else {
                        if (!this.f204660f.hasRemaining()) {
                            this.f204668n.m71920a();
                            m76942f(byteBuffer);
                            z = true;
                            break;
                        }
                        byte b9 = this.f204660f.get();
                        for (int i16 = 0; i16 < i; i16++) {
                            x1b1Var.f257128c.write(b9);
                        }
                        b = 2;
                    }
                } else {
                    q1b1Var3.f184286d = (short) 256;
                    int i17 = ((byte) s2) & 255;
                    b2 = p1b1Var.f173032b[i17];
                    b3 = p1b1Var.f173034d[i17];
                    b4 = p1b1Var.f173036f[i17];
                }
                if (b3 == 0) {
                    try {
                        atomicInteger3.set(e4b1.m37768b(q1b1Var3.f184284b));
                    } catch (VarInt$VarIntEndOfBufferException unused5) {
                        q1b1Var3.m71920a();
                        b2 = 5;
                    } catch (VarInt$VarIntParseException unused6) {
                        throw new IOException("Instruction size is not a valid variable-length integer");
                    }
                } else {
                    atomicInteger3.set(b3);
                }
                atomicInteger4.set(b4);
                if (b2 != 5) {
                    z = true;
                    m76942f(byteBuffer);
                    break;
                }
                i = atomicInteger3.get();
                if (i <= this.f204663i.intValue()) {
                }
                xra0 xra0Var2 = p1b1.f173028h;
                if (b2 != 0) {
                    str = "NOOP";
                } else if (b2 != 1) {
                    str = "ADD";
                } else if (b2 != 2) {
                    str = "RUN";
                } else if (b2 != 3) {
                    str = "";
                } else {
                    str = "COPY";
                }
                throw new IOException(String.format("%s with size %d plus existing %d bytes of target data exceeds length of target window (%d bytes)", str, Integer.valueOf(i), Integer.valueOf(m76941e()), this.f204663i));
            }
        }
        if ((!m76940d() || this.f204662h <= 0) ? false : z) {
            return -2;
        }
        throw new IOException("End of data reached while decoding VCDIFF delta file");
    }

    /* JADX INFO: renamed from: b */
    public final void m76938b() {
        this.f204656b = false;
        x1b1 x1b1Var = this.f204655a;
        this.f204664j = x1b1Var != null ? x1b1Var.f257128c.size() : 0;
        this.f204663i = 0;
        this.f204657c = null;
        this.f204658d.set(0);
        this.f204659e = null;
        this.f204660f = null;
        this.f204661g = null;
        this.f204662h = 0;
        this.f204665k = false;
        this.f204666l.set(0);
    }

    /* JADX INFO: renamed from: c */
    public final void m76939c(ByteBuffer byteBuffer, int i) throws IOException {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            this.f204655a.f257128c.write(byteBuffer.get());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m76940d() {
        ByteBuffer byteBuffer = this.f204661g;
        ByteBuffer byteBuffer2 = this.f204659e;
        return byteBuffer == byteBuffer2 && this.f204660f == byteBuffer2;
    }

    /* JADX INFO: renamed from: e */
    public final int m76941e() {
        return this.f204655a.f257128c.size() - this.f204664j;
    }

    /* JADX INFO: renamed from: f */
    public final void m76942f(ByteBuffer byteBuffer) {
        if (m76940d()) {
            int iPosition = this.f204659e.position();
            this.f204662h -= iPosition;
            byteBuffer.position(byteBuffer.position() + iPosition);
        }
    }
}
