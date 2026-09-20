package p204p;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class i77 {

    /* JADX INFO: renamed from: s */
    public static final Object f99438s = new Object();

    /* JADX INFO: renamed from: t */
    public static ScheduledExecutorService f99439t;

    /* JADX INFO: renamed from: u */
    public static int f99440u;

    /* JADX INFO: renamed from: a */
    public final AudioTrack f99441a;

    /* JADX INFO: renamed from: b */
    public final k07 f99442b;

    /* JADX INFO: renamed from: c */
    public final float f99443c;

    /* JADX INFO: renamed from: d */
    public final vbu0 f99444d;

    /* JADX INFO: renamed from: e */
    public nh61 f99445e;

    /* JADX INFO: renamed from: f */
    public final m77 f99446f;

    /* JADX INFO: renamed from: g */
    public final boolean f99447g;

    /* JADX INFO: renamed from: h */
    public final int f99448h;

    /* JADX INFO: renamed from: i */
    public final h77 f99449i;

    /* JADX INFO: renamed from: j */
    public final n890 f99450j = new n890(Thread.currentThread());

    /* JADX INFO: renamed from: k */
    public boolean f99451k;

    /* JADX INFO: renamed from: l */
    public long f99452l;

    /* JADX INFO: renamed from: m */
    public long f99453m;

    /* JADX INFO: renamed from: n */
    public long f99454n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f99455o;

    /* JADX INFO: renamed from: p */
    public int f99456p;

    /* JADX INFO: renamed from: q */
    public int f99457q;

    /* JADX INFO: renamed from: r */
    public int f99458r;

    public i77(AudioTrack audioTrack, k07 k07Var, vbu0 vbu0Var, float f, gh61 gh61Var) {
        this.f99441a = audioTrack;
        this.f99442b = k07Var;
        this.f99443c = f;
        this.f99444d = vbu0Var;
        int i = k07Var.f117907a;
        boolean zM46288P = h0b1.m46288P(i);
        this.f99447g = zM46288P;
        if (zM46288P) {
            this.f99448h = h0b1.m46338z(i) * Integer.bitCount(k07Var.f117909c);
        } else {
            this.f99448h = -1;
        }
        this.f99446f = new m77(new ihj0(this, 24), gh61Var, audioTrack, k07Var.f117907a, this.f99448h, k07Var.f117912f);
        if (vbu0Var != null) {
            this.f99445e = new nh61(audioTrack, vbu0Var);
        }
        this.f99449i = m49837c() ? new h77(this) : null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0284  */
    /* JADX WARN: Code duplicated, block: B:90:0x028e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0293  */
    /* JADX INFO: renamed from: a */
    public final long m49835a() {
        m77 m77Var;
        AudioTrack audioTrack;
        m77 m77Var2;
        long jM61051b;
        int i;
        long j;
        boolean z;
        AudioTimestamp audioTimestamp;
        c77 c77Var;
        int i2;
        Method method;
        Method method2;
        long jM49836b = m49836b();
        m77 m77Var3 = this.f99446f;
        gh61 gh61Var = m77Var3.f140699b;
        int i3 = m77Var3.f140702e;
        d77 d77Var = m77Var3.f140705h;
        AudioTrack audioTrack2 = m77Var3.f140701d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = m77Var3.f140700c;
            gh61Var.getClass();
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - m77Var3.f140709l >= 30000) {
                long jM46308e0 = h0b1.m46308e0(i3, m77Var3.m61050a());
                if (jM46308e0 != 0) {
                    jArr[m77Var3.f140716s] = h0b1.m46282J(jM46308e0, m77Var3.f140706i) - jNanoTime;
                    m77Var3.f140716s = (m77Var3.f140716s + 1) % 10;
                    int i4 = m77Var3.f140717t;
                    if (i4 < 10) {
                        m77Var3.f140717t = i4 + 1;
                    }
                    m77Var3.f140709l = jNanoTime;
                    m77Var3.f140708k = 0L;
                    int i5 = 0;
                    while (true) {
                        int i6 = m77Var3.f140717t;
                        if (i5 >= i6) {
                            break;
                        }
                        m77Var3.f140708k = (jArr[i5] / ((long) i6)) + m77Var3.f140708k;
                        i5++;
                        jArr = jArr;
                    }
                } else {
                    jM49836b = jM49836b;
                    m77Var = m77Var3;
                    gh61Var = gh61Var;
                    i3 = i3;
                    audioTrack = audioTrack2;
                }
            }
            long j2 = m77Var3.f140711n;
            if (!m77Var3.f140704g || (method = m77Var3.f140710m) == null) {
                j = 500000;
            } else {
                j = 500000;
                if (jNanoTime - m77Var3.f140712o >= 500000) {
                    try {
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str = h0b1.f86200a;
                        try {
                            long jIntValue = (((long) num.intValue()) * 1000) - m77Var3.f140703f;
                            m77Var3.f140711n = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            m77Var3.f140711n = jMax;
                            if (jMax > 10000000) {
                                yif1.m93819w0("Ignoring impossibly large audio latency: " + jMax);
                                m77Var3.f140711n = 0L;
                            }
                        } catch (Exception unused) {
                            method2 = null;
                            m77Var3.f140710m = method2;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                    }
                    m77Var3.f140712o = jNanoTime;
                }
            }
            boolean z2 = j2 != m77Var3.f140711n;
            float f = m77Var3.f140706i;
            long jM61051b2 = m77Var3.m61051b(jNanoTime);
            c77 c77Var2 = d77Var.f46005a;
            c77 c77Var3 = d77Var.f46005a;
            int i7 = d77Var.f46006b;
            audioTrack = audioTrack2;
            if (z2 || jNanoTime - d77Var.f46011g >= d77Var.f46010f) {
                d77Var.f46011g = jNanoTime;
                AudioTrack audioTrack3 = c77Var2.f34766a;
                AudioTimestamp audioTimestamp2 = c77Var2.f34767b;
                boolean timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j3 = audioTimestamp2.framePosition;
                    long j4 = c77Var2.f34769d;
                    if (j4 > j3) {
                        if (c77Var2.f34771f) {
                            c77Var2.f34772g += j4;
                            c77Var2.f34771f = false;
                        } else {
                            c77Var2.f34768c++;
                        }
                    }
                    c77Var2.f34769d = j3;
                    c77Var2.f34770e = j3 + c77Var2.f34772g + (c77Var2.f34768c << 32);
                }
                if (timestamp) {
                    ihj0 ihj0Var = d77Var.f46007c;
                    long j5 = audioTimestamp2.nanoTime / 1000;
                    z = timestamp;
                    audioTimestamp = audioTimestamp2;
                    long jM46280H = h0b1.m46280H(jNanoTime - (c77Var3.f34767b.nanoTime / 1000), f) + h0b1.m46308e0(i7, c77Var3.f34770e);
                    if (Math.abs(j5 - jNanoTime) > 5000000) {
                        long j6 = c77Var2.f34770e;
                        ihj0Var.getClass();
                        m77Var = m77Var3;
                        String str2 = "Spurious audio timestamp (system clock mismatch): " + j6 + ", " + j5 + ", " + jNanoTime + ", " + jM61051b2 + ", " + ((i77) ihj0Var.f102306b).m49836b();
                        HashSet hashSet = dgd0.f48781a;
                        yif1.m93819w0(str2);
                        i2 = 4;
                        d77Var.m35186a(4);
                        c77Var = c77Var3;
                    } else {
                        m77Var = m77Var3;
                        if (Math.abs(jM46280H - jM61051b2) > 5000000) {
                            long j7 = c77Var2.f34770e;
                            ihj0Var.getClass();
                            c77Var = c77Var3;
                            String str3 = "Spurious audio timestamp (frame position mismatch): " + j7 + ", " + j5 + ", " + jNanoTime + ", " + jM61051b2 + ", " + ((i77) ihj0Var.f102306b).m49836b();
                            HashSet hashSet2 = dgd0.f48781a;
                            yif1.m93819w0(str3);
                            i2 = 4;
                            d77Var.m35186a(4);
                        } else {
                            c77Var = c77Var3;
                            i2 = 4;
                            if (d77Var.f46008d == 4) {
                                d77Var.m35186a(0);
                            }
                        }
                    }
                } else {
                    m77Var = m77Var3;
                    z = timestamp;
                    audioTimestamp = audioTimestamp2;
                    c77Var = c77Var3;
                    i2 = 4;
                }
                int i8 = d77Var.f46008d;
                if (i8 == 0) {
                    AudioTimestamp audioTimestamp3 = audioTimestamp;
                    if (z) {
                        long j8 = audioTimestamp3.nanoTime;
                        if (j8 / 1000 >= d77Var.f46009e) {
                            d77Var.f46012h = c77Var2.f34770e;
                            d77Var.f46013i = j8 / 1000;
                            d77Var.m35186a(1);
                        }
                    } else if (jNanoTime - d77Var.f46009e > j) {
                        d77Var.m35186a(3);
                    }
                } else if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != i2) {
                                throw new IllegalStateException();
                            }
                        } else if (z) {
                            d77Var.m35186a(0);
                        }
                    } else if (!z) {
                        d77Var.m35186a(0);
                    }
                } else if (z) {
                    long j9 = c77Var2.f34770e;
                    long j10 = d77Var.f46012h;
                    if (j9 > j10) {
                        long jM46280H2 = h0b1.m46280H(jNanoTime - d77Var.f46013i, f) + h0b1.m46308e0(i7, j10);
                        c77 c77Var4 = c77Var;
                        if (Math.abs((h0b1.m46280H(jNanoTime - (c77Var4.f34767b.nanoTime / 1000), f) + h0b1.m46308e0(i7, c77Var4.f34770e)) - jM46280H2) < 1000) {
                            d77Var.m35186a(2);
                        } else if (jNanoTime - d77Var.f46009e > 2000000) {
                            d77Var.m35186a(3);
                        } else {
                            d77Var.f46012h = c77Var2.f34770e;
                            d77Var.f46013i = audioTimestamp.nanoTime / 1000;
                        }
                    } else if (jNanoTime - d77Var.f46009e > 2000000) {
                        d77Var.m35186a(3);
                    } else {
                        d77Var.f46012h = c77Var2.f34770e;
                        d77Var.f46013i = audioTimestamp.nanoTime / 1000;
                    }
                } else {
                    d77Var.m35186a(0);
                }
            } else {
                jM49836b = jM49836b;
                m77Var = m77Var3;
                gh61Var = gh61Var;
                i3 = i3;
            }
        } else {
            jM49836b = jM49836b;
            m77Var = m77Var3;
            gh61Var = gh61Var;
            i3 = i3;
            audioTrack = audioTrack2;
        }
        gh61Var.getClass();
        long jNanoTime2 = System.nanoTime() / 1000;
        boolean z3 = d77Var.f46008d == 2;
        if (z3) {
            m77Var2 = m77Var;
            float f2 = m77Var2.f140706i;
            c77 c77Var5 = d77Var.f46005a;
            jM61051b = h0b1.m46280H(jNanoTime2 - (c77Var5.f34767b.nanoTime / 1000), f2) + h0b1.m46308e0(d77Var.f46006b, c77Var5.f34770e);
        } else {
            m77Var2 = m77Var;
            jM61051b = m77Var2.m61051b(jNanoTime2);
        }
        long jM46319k = jM61051b;
        long jM46308e1 = h0b1.m46308e0(i3, jM49836b);
        if (jM46319k >= jM46308e1) {
            m77Var2.m61054e();
            d77Var.m35186a(0);
            return jM46308e1;
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z3 || ((i = d77Var.f46008d) != 0 && i != 1)) {
                m77Var2.m61053d(jM46319k);
            }
            long j11 = m77Var2.f140723z;
            if (j11 != -9223372036854775807L) {
                long j12 = jM46319k - m77Var2.f140722y;
                long jM46280H3 = h0b1.m46280H(jNanoTime2 - j11, m77Var2.f140706i);
                long j13 = m77Var2.f140722y + jM46280H3;
                long jAbs = Math.abs(j13 - jM46319k);
                if (j12 != 0 && jAbs < 1000000) {
                    long j14 = (jM46280H3 * 10) / 100;
                    jM46319k = h0b1.m46319k(jM46319k, j13 - j14, j13 + j14);
                }
            }
            m77Var2.f140723z = jNanoTime2;
            m77Var2.f140722y = jM46319k;
        } else if (playState == 1) {
            m77Var2.m61053d(jM46319k);
        }
        return jM46319k;
    }

    /* JADX INFO: renamed from: b */
    public final long m49836b() {
        if (!this.f99447g) {
            return this.f99453m;
        }
        long j = this.f99452l;
        long j2 = this.f99448h;
        String str = h0b1.f86200a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m49837c() {
        return Build.VERSION.SDK_INT >= 29 && this.f99441a.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: d */
    public final void m49838d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f99441a.setOffloadDelayPadding(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m49839e() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.f99441a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        m77 m77Var = this.f99446f;
        m77Var.f140696A = true;
        m77Var.f140705h.f46005a.f34771f = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m49840f(w9p0 w9p0Var) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdM87525a = w9p0Var.m87525a();
        if (logSessionIdM87525a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.f99441a.setLogSessionId(logSessionIdM87525a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX INFO: renamed from: g */
    public final boolean m49841g(int i, long j, ByteBuffer byteBuffer) {
        int iWrite;
        boolean z;
        vbu0 vbu0Var;
        l77 l77Var;
        eu6 eu6Var;
        long j2 = j;
        k07 k07Var = this.f99442b;
        boolean z2 = this.f99447g;
        if (!z2 && this.f99457q == 0) {
            this.f99457q = ayo.m27527i(byteBuffer, k07Var.f117907a);
        }
        n890 n890Var = this.f99450j;
        n890Var.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = (Thread) n890Var.f151476c;
        AudioTrack audioTrack = this.f99441a;
        if (threadCurrentThread == thread) {
            m49836b();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.f99458r;
            this.f99458r = underrunCount;
            if (z3) {
                n890Var.m63839j(-1, new q95(25));
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (k07Var.f117910d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.f99454n;
            } else {
                this.f99454n = j2;
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j2 * 1000);
            } else {
                if (this.f99455o == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f99455o = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f99455o.putInt(1431633921);
                }
                if (this.f99456p == 0) {
                    this.f99455o.putInt(4, iRemaining2);
                    this.f99455o.putLong(8, j2 * 1000);
                    this.f99455o.position(0);
                    this.f99456p = iRemaining2;
                }
                int iRemaining3 = this.f99455o.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.f99456p = 0;
                    } else {
                        this.f99456p -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f99455o, iRemaining3, 1);
                    if (iWrite2 < 0) {
                        this.f99456p = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining3) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f99456p = 0;
                        } else {
                            this.f99456p -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.f99452l += (long) iWrite;
                return z;
            }
            if (z) {
                this.f99453m = (((long) this.f99457q) * ((long) i)) + this.f99453m;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (vbu0Var = this.f99444d) != null && (eu6Var = (l77Var = (l77) vbu0Var.f239584b).f130593i) != null) {
            bu6 bu6Var = bu6.f31028f;
            l77Var.f130592h = bu6Var;
            eu6Var.m40034h(bu6Var);
        }
        throw new AudioOutput$WriteException(iWrite, z);
    }
}
