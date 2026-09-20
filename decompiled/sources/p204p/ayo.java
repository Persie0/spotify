package p204p;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class ayo implements e67 {

    /* JADX INFO: renamed from: e0 */
    public static final AtomicInteger f21274e0 = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public long f21275A;

    /* JADX INFO: renamed from: B */
    public long f21276B;

    /* JADX INFO: renamed from: C */
    public long f21277C;

    /* JADX INFO: renamed from: D */
    public long f21278D;

    /* JADX INFO: renamed from: E */
    public int f21279E;

    /* JADX INFO: renamed from: F */
    public boolean f21280F;

    /* JADX INFO: renamed from: G */
    public boolean f21281G;

    /* JADX INFO: renamed from: H */
    public long f21282H;

    /* JADX INFO: renamed from: I */
    public long f21283I;

    /* JADX INFO: renamed from: J */
    public float f21284J;

    /* JADX INFO: renamed from: K */
    public ByteBuffer f21285K;

    /* JADX INFO: renamed from: L */
    public int f21286L;

    /* JADX INFO: renamed from: M */
    public ByteBuffer f21287M;

    /* JADX INFO: renamed from: N */
    public boolean f21288N;

    /* JADX INFO: renamed from: O */
    public boolean f21289O;

    /* JADX INFO: renamed from: P */
    public boolean f21290P;

    /* JADX INFO: renamed from: Q */
    public boolean f21291Q;

    /* JADX INFO: renamed from: R */
    public boolean f21292R;

    /* JADX INFO: renamed from: S */
    public int f21293S;

    /* JADX INFO: renamed from: T */
    public boolean f21294T;

    /* JADX INFO: renamed from: U */
    public j78 f21295U;

    /* JADX INFO: renamed from: V */
    public AudioDeviceInfo f21296V;

    /* JADX INFO: renamed from: W */
    public int f21297W;

    /* JADX INFO: renamed from: X */
    public boolean f21298X;

    /* JADX INFO: renamed from: Y */
    public long f21299Y;

    /* JADX INFO: renamed from: Z */
    public boolean f21300Z;

    /* JADX INFO: renamed from: a */
    public final Context f21301a;

    /* JADX INFO: renamed from: a0 */
    public boolean f21302a0;

    /* JADX INFO: renamed from: b */
    public final qzn f21303b;

    /* JADX INFO: renamed from: b0 */
    public long f21304b0;

    /* JADX INFO: renamed from: c */
    public final pnc f21305c;

    /* JADX INFO: renamed from: c0 */
    public long f21306c0;

    /* JADX INFO: renamed from: d */
    public final wk91 f21307d;

    /* JADX INFO: renamed from: d0 */
    public Handler f21308d0;

    /* JADX INFO: renamed from: e */
    public final ix71 f21309e;

    /* JADX INFO: renamed from: f */
    public final ix71 f21310f;

    /* JADX INFO: renamed from: g */
    public final wsv0 f21311g;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f21312h;

    /* JADX INFO: renamed from: i */
    public final boolean f21313i;

    /* JADX INFO: renamed from: j */
    public int f21314j;

    /* JADX INFO: renamed from: k */
    public wxo f21315k;

    /* JADX INFO: renamed from: l */
    public final fdb f21316l;

    /* JADX INFO: renamed from: m */
    public final fdb f21317m;

    /* JADX INFO: renamed from: n */
    public w9p0 f21318n;

    /* JADX INFO: renamed from: o */
    public l3d0 f21319o;

    /* JADX INFO: renamed from: p */
    public yxo f21320p;

    /* JADX INFO: renamed from: q */
    public yxo f21321q;

    /* JADX INFO: renamed from: r */
    public p27 f21322r;

    /* JADX INFO: renamed from: s */
    public l07 f21323s;

    /* JADX INFO: renamed from: t */
    public vxo f21324t;

    /* JADX INFO: renamed from: u */
    public i77 f21325u;

    /* JADX INFO: renamed from: v */
    public xs6 f21326v;

    /* JADX INFO: renamed from: w */
    public zxo f21327w;

    /* JADX INFO: renamed from: x */
    public zxo f21328x;

    /* JADX INFO: renamed from: y */
    public h1p0 f21329y;

    /* JADX INFO: renamed from: z */
    public boolean f21330z;

    public ayo(xxo xxoVar) {
        int deviceId;
        Context context = (Context) xxoVar.f267035c;
        this.f21301a = context == null ? null : context.getApplicationContext();
        this.f21326v = xs6.f265509i;
        this.f21303b = (qzn) xxoVar.f267037e;
        this.f21313i = xxoVar.f267033a;
        this.f21314j = 0;
        this.f21323s = (l77) xxoVar.f267039g;
        pnc pncVar = new pnc();
        this.f21305c = pncVar;
        wk91 wk91Var = new wk91();
        wk91Var.f252167m = h0b1.f86201b;
        this.f21307d = wk91Var;
        this.f21309e = new ix71(1);
        this.f21310f = new ix71(0);
        this.f21311g = pf40.m69795u(wk91Var, pncVar);
        this.f21284J = 1.0f;
        this.f21293S = 0;
        this.f21295U = new j78();
        h1p0 h1p0Var = h1p0.f86671d;
        this.f21328x = new zxo(h1p0Var, 0L, 0L);
        this.f21329y = h1p0Var;
        this.f21330z = false;
        this.f21312h = new ArrayDeque();
        this.f21316l = new fdb();
        this.f21317m = new fdb();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f21297W = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX INFO: renamed from: i */
    public static int m27527i(ByteBuffer byteBuffer, int i) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((ybg1.m93280q(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = h0b1.f86200a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = h0b1.f86200a;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return fn1.m42185n(new ohc(bArr, 16)).f151899c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(s571.m77246e(i, "Unexpected audio encoding: "));
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return th1.f220300a[((byteBuffer.get(byteBuffer.position() + 4) & MessagePack.Code.NIL) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b = byteBuffer.get(iPosition4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    /* JADX INFO: renamed from: a */
    public final void m27528a(long j) {
        h1p0 h1p0Var;
        boolean zM27549w = m27549w();
        boolean z = false;
        qzn qznVar = this.f21303b;
        if (zM27549w) {
            h1p0Var = h1p0.f86671d;
        } else {
            if (this.f21298X || !yxo.m94847b(this.f21321q)) {
                h1p0Var = h1p0.f86671d;
            } else {
                int i = this.f21321q.f277285a.f195363M;
                h1p0Var = this.f21329y;
                xp31 xp31Var = (xp31) qznVar.f194231d;
                float f = h1p0Var.f86674a;
                xp31Var.getClass();
                c95.m31843i(f > 0.0f);
                if (xp31Var.f264420d != f) {
                    xp31Var.f264420d = f;
                    xp31Var.f264426j = true;
                }
                float f2 = h1p0Var.f86675b;
                c95.m31843i(f2 > 0.0f);
                if (xp31Var.f264421e != f2) {
                    xp31Var.f264421e = f2;
                    xp31Var.f264426j = true;
                }
            }
            this.f21329y = h1p0Var;
        }
        h1p0 h1p0Var2 = h1p0Var;
        if (!this.f21298X && yxo.m94847b(this.f21321q)) {
            int i2 = this.f21321q.f277285a.f195363M;
            z = this.f21330z;
            ((d721) qznVar.f194230c).f45963o = z;
        }
        this.f21330z = z;
        this.f21312h.add(new zxo(h1p0Var2, Math.max(0L, j), h0b1.m46308e0(this.f21321q.f277289e.f117908b, m27536j())));
        m27548v(j);
        l3d0 l3d0Var = this.f21319o;
        if (l3d0Var != null) {
            boolean z2 = this.f21330z;
            fw40 fw40Var = ((rad0) l3d0Var.f129295b).f197272i2;
            Handler handler = (Handler) fw40Var.f73934b;
            if (handler != null) {
                handler.post(new i57(fw40Var, z2, 0));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final i77 m27529b(k07 k07Var) throws AudioSink$InitializationException {
        try {
            return ((l77) this.f21323s).m58393a(k07Var);
        } catch (AudioOutputProvider$InitializationException e) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(k07Var.f117908b, k07Var.f117909c, k07Var.f117907a, k07Var.f117912f, this.f21321q.f277285a, k07Var.f117911e, e);
            l3d0 l3d0Var = this.f21319o;
            if (l3d0Var == null) {
                throw audioSink$InitializationException;
            }
            l3d0Var.m58001f(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27530c(c67 c67Var) throws AudioSink$ConfigurationException {
        int iM46338z;
        p27 p27Var;
        r300 r300Var;
        int i;
        if (this.f21324t == null && this.f21301a != null) {
            vxo vxoVar = new vxo(this);
            this.f21324t = vxoVar;
            l77 l77Var = (l77) this.f21323s;
            l77Var.m58398f();
            if (l77Var.f130590f == null) {
                l77Var.f130590f = new n890(Thread.currentThread());
            }
            l77Var.f130590f.m63831b(vxoVar);
        }
        r300 r300Var2 = c67Var.f34407a;
        String str = r300Var2.f195387p;
        int i2 = r300Var2.f195360J;
        int i3 = r300Var2.f195363M;
        if ("audio/raw".equals(str)) {
            c95.m31843i(h0b1.m46288P(i3));
            int iM46338z2 = h0b1.m46338z(i3) * i2;
            jf40 jf40Var = new jf40(4);
            jf40Var.m28987e(this.f21311g);
            jf40Var.m28985c(this.f21309e);
            jf40Var.m28986d((t27[]) this.f21303b.f194229b);
            p27 p27Var2 = new p27(jf40Var.m53150g());
            if (p27Var2.equals(this.f21322r)) {
                p27Var2 = this.f21322r;
            }
            int i4 = r300Var2.f195364N;
            int i5 = r300Var2.f195365O;
            wk91 wk91Var = this.f21307d;
            wk91Var.f252163i = i4;
            wk91Var.f252164j = i5;
            this.f21305c.f179367i = c67Var.f34408b;
            try {
                q27 q27VarM68881a = p27Var2.m68881a(new q27(r300Var2));
                int i6 = q27VarM68881a.f184527b;
                int i7 = q27VarM68881a.f184528c;
                p300 p300VarM74564a = r300Var2.m74564a();
                p300VarM74564a.f173505L = i7;
                p300VarM74564a.f173504K = q27VarM68881a.f184526a;
                p300VarM74564a.f173502I = i6;
                p300VarM74564a.f173503J = i6 == i2 ? r300Var2.f195361K : -1;
                r300 r300Var3 = new r300(p300VarM74564a);
                iM46338z = h0b1.m46338z(i7) * i6;
                p27Var = p27Var2;
                i = iM46338z2;
                r300Var = r300Var3;
            } catch (AudioProcessor$UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, r300Var2);
            }
        } else {
            iM46338z = -1;
            p27Var = new p27(wsv0.f254763e);
            r300Var = r300Var2;
            i = -1;
        }
        g07 g07VarM27534g = m27534g(r300Var);
        r300 r300Var4 = g07VarM27534g.f75293a;
        try {
            k07 k07VarM58395c = ((l77) this.f21323s).m58395c(g07VarM27534g);
            boolean z = k07VarM58395c.f117911e;
            if (k07VarM58395c.f117907a == 0) {
                throw new AudioSink$ConfigurationException("Invalid output encoding (isOffload=" + z + ")", r300Var4);
            }
            if (k07VarM58395c.f117909c == 0) {
                throw new AudioSink$ConfigurationException("Invalid output channel config (isOffload=" + z + ")", r300Var4);
            }
            this.f21300Z = false;
            qp71 qp71Var = c67Var.f34409c;
            vsd0 vsd0Var = c67Var.f34410d;
            yxo yxoVar = new yxo(r300Var2, r300Var, i, iM46338z, k07VarM58395c, p27Var, qp71Var, vsd0Var != null ? vsd0Var.f244408a : null);
            if (m27540n()) {
                this.f21320p = yxoVar;
            } else {
                this.f21321q = yxoVar;
            }
        } catch (AudioOutputProvider$ConfigurationException e2) {
            throw new AudioSink$ConfigurationException(e2, r300Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m27531d(long j) throws AudioSink$WriteException {
        l3d0 l3d0Var;
        jjx jjxVar;
        if (this.f21287M == null) {
            return;
        }
        fdb fdbVar = this.f21317m;
        if (((Exception) fdbVar.f68421c) != null && (f21274e0.get() > 0 || SystemClock.elapsedRealtime() < fdbVar.f68420b)) {
            return;
        }
        int iRemaining = this.f21287M.remaining();
        boolean z = false;
        try {
            boolean zM49841g = this.f21325u.m49841g(this.f21286L, j, this.f21287M);
            this.f21299Y = SystemClock.elapsedRealtime();
            fdbVar.f68421c = null;
            fdbVar.f68419a = -9223372036854775807L;
            fdbVar.f68420b = -9223372036854775807L;
            if (this.f21325u.m49837c()) {
                if (this.f21278D > 0) {
                    this.f21302a0 = false;
                }
                if (this.f21291Q && (l3d0Var = this.f21319o) != null && !zM49841g && !this.f21302a0 && (jjxVar = ((rad0) l3d0Var.f129295b).f239236h1) != null) {
                    jjxVar.f113115a.f189368q1 = true;
                }
            }
            if (yxo.m94847b(this.f21321q)) {
                this.f21277C += (long) (iRemaining - this.f21287M.remaining());
            }
            if (zM49841g) {
                if (!yxo.m94847b(this.f21321q)) {
                    c95.m31855u(this.f21287M == this.f21285K);
                    this.f21278D = (((long) this.f21279E) * ((long) this.f21286L)) + this.f21278D;
                }
                this.f21287M = null;
            }
        } catch (AudioOutput$WriteException e) {
            boolean z2 = e.f986b;
            if (z2) {
                if (m27536j() > 0) {
                    z = true;
                } else if (this.f21325u.m49837c()) {
                    if (this.f21321q.f277289e.f117911e) {
                        this.f21300Z = true;
                    }
                    z = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e.f985a, this.f21321q.f277285a, z);
            l3d0 l3d0Var2 = this.f21319o;
            if (l3d0Var2 != null) {
                l3d0Var2.m58001f(audioSink$WriteException);
            }
            if (z2) {
                throw audioSink$WriteException;
            }
            fdbVar.m41369c(audioSink$WriteException);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m27532e() throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        if (!this.f21322r.m68886f()) {
            m27531d(Long.MIN_VALUE);
            return this.f21287M == null;
        }
        this.f21322r.m68888h();
        m27543q(Long.MIN_VALUE);
        return this.f21322r.m68885e() && ((byteBuffer = this.f21287M) == null || !byteBuffer.hasRemaining());
    }

    /* JADX INFO: renamed from: f */
    public final void m27533f() {
        if (m27540n()) {
            this.f21275A = 0L;
            this.f21276B = 0L;
            this.f21277C = 0L;
            this.f21278D = 0L;
            this.f21302a0 = false;
            this.f21279E = 0;
            this.f21328x = new zxo(this.f21329y, 0L, 0L);
            this.f21282H = 0L;
            this.f21327w = null;
            this.f21312h.clear();
            this.f21285K = null;
            this.f21286L = 0;
            this.f21287M = null;
            this.f21289O = false;
            this.f21288N = false;
            this.f21290P = false;
            this.f21307d.f252169o = 0L;
            m27548v(-9223372036854775807L);
            this.f21315k = null;
            yxo yxoVar = this.f21320p;
            if (yxoVar != null) {
                this.f21321q = yxoVar;
                this.f21320p = null;
            }
            f21274e0.incrementAndGet();
            i77 i77Var = this.f21325u;
            if (i77Var.f99446f.f140701d.getPlayState() == 3) {
                i77Var.f99441a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && i77Var.m49837c()) {
                h77 h77Var = i77Var.f99449i;
                h77Var.getClass();
                h77.m46757a(h77Var);
            }
            nh61 nh61Var = i77Var.f99445e;
            if (nh61Var != null) {
                AudioTrack audioTrack = (AudioTrack) nh61Var.f153884b;
                e77 e77Var = (e77) nh61Var.f153887e;
                e77Var.getClass();
                audioTrack.removeOnRoutingChangedListener(e77Var);
                nh61Var.f153887e = null;
                i77Var.f99445e = null;
            }
            AudioTrack audioTrack2 = i77Var.f99441a;
            n890 n890Var = i77Var.f99450j;
            Handler handlerM46330r = h0b1.m46330r(null);
            synchronized (i77.f99438s) {
                try {
                    if (i77.f99439t == null) {
                        i77.f99439t = Executors.newSingleThreadScheduledExecutor(new ygi("ExoPlayer:AudioTrackReleaseThread", 2));
                    }
                    i77.f99440u++;
                    i77.f99439t.schedule(new zq4(audioTrack2, handlerM46330r, n890Var, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f21325u = null;
        }
        fdb fdbVar = this.f21317m;
        fdbVar.f68421c = null;
        fdbVar.f68419a = -9223372036854775807L;
        fdbVar.f68420b = -9223372036854775807L;
        fdb fdbVar2 = this.f21316l;
        fdbVar2.f68421c = null;
        fdbVar2.f68419a = -9223372036854775807L;
        fdbVar2.f68420b = -9223372036854775807L;
        this.f21304b0 = 0L;
        this.f21306c0 = 0L;
        Handler handler = this.f21308d0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final g07 m27534g(r300 r300Var) {
        g07 g07Var = new g07(r300Var);
        g07Var.f75294b = this.f21326v;
        g07Var.f75296d = this.f21313i;
        g07Var.f75297e = this.f21314j != 0;
        g07Var.f75295c = this.f21296V;
        g07Var.f75298f = this.f21293S;
        g07Var.f75300h = this.f21298X;
        g07Var.f75301i = -1;
        g07Var.f75299g = this.f21297W;
        return new g07(g07Var);
    }

    /* JADX INFO: renamed from: h */
    public final int m27535h(r300 r300Var) {
        boolean z;
        if (!h0b1.m46288P(r300Var.f195363M) || r300Var.f195363M == 2) {
            z = false;
        } else {
            p300 p300VarM74564a = r300Var.m74564a();
            p300VarM74564a.f173505L = 2;
            r300Var = new r300(p300VarM74564a);
            z = true;
        }
        int i = ((l77) this.f21323s).m58394b(m27534g(r300Var)).f97151d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final long m27536j() {
        if (!yxo.m94847b(this.f21321q)) {
            return this.f21278D;
        }
        long j = this.f21277C;
        long j2 = this.f21321q.f277288d;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: k */
    public final boolean m27537k(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ayo.m27537k(int, long, java.nio.ByteBuffer):boolean");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m27538l() {
        if (!m27540n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f21325u.m49837c() && this.f21290P) {
            return false;
        }
        long jM27536j = m27536j();
        long jM49835a = this.f21325u.m49835a();
        i77 i77Var = this.f21325u;
        i77Var.getClass();
        return jM27536j > h0b1.m46332t(i77Var.f99441a.getSampleRate(), jM49835a);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m27539m() throws AudioSink$InitializationException {
        int i;
        i77 i77VarM27529b;
        kab0 kab0Var;
        fdb fdbVar = this.f21316l;
        if (((Exception) fdbVar.f68421c) != null && (f21274e0.get() > 0 || SystemClock.elapsedRealtime() < fdbVar.f68420b)) {
            return false;
        }
        try {
            i77VarM27529b = m27529b(this.f21321q.f277289e);
        } catch (AudioSink$InitializationException e) {
            k07 k07Var = this.f21321q.f277289e;
            int iMax = k07Var.f117912f;
            if (h0b1.m46288P(k07Var.f117907a)) {
                yxo yxoVar = this.f21321q;
                i = yxoVar.f277289e.f117908b * yxoVar.f277288d;
            } else {
                yxo yxoVar2 = this.f21321q;
                int i2 = yxoVar2.f277285a.f195382k;
                if (i2 != -1) {
                    i = i2 / 8;
                } else {
                    int iM94500o = ysj0.m94500o(yxoVar2.f277289e.f117907a);
                    if (iM94500o == -2147483647) {
                        iM94500o = 1000000;
                    }
                    i = iM94500o;
                }
            }
            k07 k07Var2 = this.f21321q.f277289e;
            int iMax2 = Math.max(i, AudioTrack.getMinBufferSize(k07Var2.f117908b, k07Var2.f117909c, k07Var2.f117907a));
            int i3 = this.f21321q.f277288d;
            if (i3 == -1) {
                i3 = 1;
            }
            while (true) {
                if (iMax <= iMax2) {
                    if (!this.f21321q.f277289e.f117911e) {
                        throw e;
                    }
                    this.f21300Z = true;
                    throw e;
                }
                iMax = Math.max(iMax2, iMax / 2);
                int i4 = iMax % i3;
                if (i4 != 0) {
                    iMax = (i3 - i4) + iMax;
                }
                j07 j07VarM54931a = this.f21321q.f277289e.m54931a();
                j07VarM54931a.f107372f = iMax;
                k07 k07Var3 = new k07(j07VarM54931a);
                try {
                    i77 i77VarM27529b2 = m27529b(k07Var3);
                    this.f21321q = yxo.m94846a(this.f21321q, k07Var3);
                    i77VarM27529b = i77VarM27529b2;
                    break;
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                }
            }
        }
        this.f21325u = i77VarM27529b;
        wxo wxoVar = new wxo(this, this.f21321q.f277289e);
        this.f21315k = wxoVar;
        i77VarM27529b.f99450j.m63831b(wxoVar);
        if (this.f21325u.m49837c()) {
            yxo yxoVar3 = this.f21321q;
            if (yxoVar3.f277289e.f117917k) {
                i77 i77Var = this.f21325u;
                r300 r300Var = yxoVar3.f277285a;
                i77Var.m49838d(r300Var.f195364N, r300Var.f195365O);
            }
        }
        w9p0 w9p0Var = this.f21318n;
        if (w9p0Var != null) {
            this.f21325u.m49840f(w9p0Var);
        }
        if (m27540n()) {
            this.f21325u.f99441a.setVolume(this.f21284J);
        }
        this.f21295U.getClass();
        AudioDeviceInfo audioDeviceInfo = this.f21296V;
        if (audioDeviceInfo != null) {
            this.f21325u.f99441a.setPreferredDevice(audioDeviceInfo);
        }
        this.f21281G = true;
        int audioSessionId = this.f21325u.f99441a.getAudioSessionId();
        boolean z = audioSessionId != this.f21293S;
        this.f21293S = audioSessionId;
        l3d0 l3d0Var = this.f21319o;
        if (l3d0Var != null) {
            k07 k07Var4 = this.f21321q.f277289e;
            d67 d67Var = new d67(0);
            fw40 fw40Var = ((rad0) l3d0Var.f129295b).f197272i2;
            Handler handler = (Handler) fw40Var.f73934b;
            if (handler != null) {
                handler.post(new g57(fw40Var, d67Var, 1));
            }
            if (z) {
                this.f21294T = true;
                yxo yxoVar4 = this.f21321q;
                j07 j07VarM54931a2 = yxoVar4.f277289e.m54931a();
                j07VarM54931a2.f107374h = this.f21293S;
                this.f21321q = yxo.m94846a(yxoVar4, new k07(j07VarM54931a2));
                yxo yxoVar5 = this.f21320p;
                if (yxoVar5 != null) {
                    j07 j07VarM54931a3 = yxoVar5.f277289e.m54931a();
                    j07VarM54931a3.f107374h = this.f21293S;
                    this.f21320p = yxo.m94846a(yxoVar5, new k07(j07VarM54931a3));
                }
                l3d0 l3d0Var2 = this.f21319o;
                int i5 = this.f21293S;
                rad0 rad0Var = (rad0) l3d0Var2.f129295b;
                if (Build.VERSION.SDK_INT >= 35 && (kab0Var = rad0Var.f197274k2) != null) {
                    kab0Var.m55902d(i5);
                }
                fw40 fw40Var2 = rad0Var.f197272i2;
                Handler handler2 = (Handler) fw40Var2.f73934b;
                if (handler2 != null) {
                    handler2.post(new lx6(fw40Var2, i5, 1));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m27540n() {
        return this.f21325u != null;
    }

    /* JADX INFO: renamed from: o */
    public final void m27541o() {
        this.f21291Q = true;
        if (m27540n()) {
            i77 i77Var = this.f21325u;
            m77 m77Var = i77Var.f99446f;
            if (m77Var.f140718u != -9223372036854775807L) {
                m77Var.f140699b.getClass();
                m77Var.f140718u = h0b1.m46295W(SystemClock.elapsedRealtime());
            }
            m77Var.f140707j = h0b1.m46308e0(m77Var.f140702e, m77Var.m61050a());
            m77Var.f140705h.m35186a(0);
            if (!i77Var.f99451k || i77Var.m49837c()) {
                i77Var.f99441a.play();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m27542p() {
        if (this.f21289O) {
            return;
        }
        this.f21289O = true;
        if (this.f21325u.m49837c()) {
            this.f21290P = false;
        }
        i77 i77Var = this.f21325u;
        if (i77Var.f99451k) {
            return;
        }
        i77Var.f99451k = true;
        m77 m77Var = i77Var.f99446f;
        long jM49836b = i77Var.m49836b();
        m77Var.f140720w = m77Var.m61050a();
        m77Var.f140699b.getClass();
        m77Var.f140718u = h0b1.m46295W(SystemClock.elapsedRealtime());
        m77Var.f140721x = jM49836b;
        i77Var.f99441a.stop();
        i77Var.f99456p = 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m27543q(long j) throws AudioSink$WriteException {
        m27531d(j);
        if (this.f21287M != null) {
            return;
        }
        if (!this.f21322r.m68886f()) {
            ByteBuffer byteBuffer = this.f21285K;
            if (byteBuffer != null) {
                m27547u(byteBuffer);
                m27531d(j);
                return;
            }
            return;
        }
        while (!this.f21322r.m68885e()) {
            do {
                ByteBuffer byteBufferM68884d = this.f21322r.m68884d();
                if (byteBufferM68884d.hasRemaining()) {
                    m27547u(byteBufferM68884d);
                    m27531d(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f21285K;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f21322r.m68889i(this.f21285K);
                    }
                }
            } while (this.f21287M == null);
            return;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m27544r() {
        if (this.f21321q != null) {
            yxo yxoVar = this.f21320p;
            if (yxoVar != null) {
                this.f21321q = yxoVar;
                this.f21320p = null;
            }
            try {
                this.f21321q = yxo.m94846a(this.f21321q, ((l77) this.f21323s).m58395c(m27534g(this.f21321q.f277286b)));
            } catch (AudioOutputProvider$ConfigurationException e) {
                throw new IllegalStateException(new AudioSink$ConfigurationException(e, this.f21321q.f277285a));
            }
        }
        m27533f();
    }

    /* JADX INFO: renamed from: s */
    public final void m27545s() {
        m27533f();
        kf40 kf40VarListIterator = this.f21311g.listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            ((t27) kf40VarListIterator.next()).reset();
        }
        this.f21309e.reset();
        this.f21310f.reset();
        p27 p27Var = this.f21322r;
        if (p27Var != null) {
            p27Var.m68890j();
        }
        this.f21291Q = false;
        this.f21300Z = false;
    }

    /* JADX INFO: renamed from: t */
    public final void m27546t() {
        if (m27540n()) {
            i77 i77Var = this.f21325u;
            h1p0 h1p0Var = this.f21329y;
            AudioTrack audioTrack = i77Var.f99441a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h0b1.m46315i(h1p0Var.f86674a, 0.1f, i77Var.f99443c)).setPitch(h0b1.m46315i(h1p0Var.f86675b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                yif1.m93821x0("Failed to set playback params", e);
            }
            m77 m77Var = i77Var.f99446f;
            m77Var.f140706i = audioTrack.getPlaybackParams().getSpeed();
            m77Var.f140705h.m35186a(0);
            m77Var.m61054e();
            PlaybackParams playbackParams = this.f21325u.f99441a.getPlaybackParams();
            this.f21329y = new h1p0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023d  */
    /* JADX WARN: Code duplicated, block: B:101:0x024a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0276  */
    /* JADX WARN: Code duplicated, block: B:105:0x027e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0285  */
    /* JADX WARN: Code duplicated, block: B:107:0x028c  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[PHI: r9
      0x00b7: PHI (r9v91 double) = (r9v86 double), (r9v98 double) binds: [B:49:0x00f1, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd A[PHI: r9
      0x00bd: PHI (r9v87 double) = (r9v86 double), (r9v98 double) binds: [B:49:0x00f1, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da A[PHI: r9
      0x00da: PHI (r9v62 float) = (r9v57 float), (r9v97 float) binds: [B:59:0x0183, B:44:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[PHI: r9
      0x00e0: PHI (r9v58 float) = (r9v57 float), (r9v97 float) binds: [B:59:0x0183, B:44:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x01af  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0201  */
    /* JADX WARN: Code duplicated, block: B:97:0x020a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0212  */
    /* JADX WARN: Code duplicated, block: B:99:0x022a  */
    /* JADX INFO: renamed from: u */
    public final void m27547u(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        double d;
        float fM46315i;
        float f2;
        double dMax;
        double d2;
        c95.m31855u(this.f21287M == null);
        if (byteBuffer.hasRemaining()) {
            if (yxo.m94847b(this.f21321q)) {
                int iM46332t = (int) h0b1.m46332t(this.f21321q.f277289e.f117908b, h0b1.m46295W(20L));
                long jM27536j = m27536j();
                long j = iM46332t;
                if (jM27536j >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    yxo yxoVar = this.f21321q;
                    int i5 = yxoVar.f277289e.f117907a;
                    int i6 = yxoVar.f277288d;
                    int i7 = (int) jM27536j;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iM46332t) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                fM46315i = h0b1.m46315i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fM46315i < 0.0f) {
                                    f2 = (-fM46315i) * (-2.1474836E9f);
                                } else {
                                    f2 = fM46315i * 2.1474836E9f;
                                }
                                i3 = (int) f2;
                            } else if (i5 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i5 != 22) {
                                if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 != 1610612736) {
                                    if (i5 == 1879048192) {
                                        dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    } else if (i5 == 1895825408) {
                                        fM46315i = h0b1.m46315i(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                        if (fM46315i < 0.0f) {
                                            f2 = (-fM46315i) * (-2.1474836E9f);
                                        } else {
                                            f2 = fM46315i * 2.1474836E9f;
                                        }
                                        i3 = (int) f2;
                                    } else {
                                        if (i5 != 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        dMax = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    }
                                    i3 = (int) d2;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i5 != 1879048192) {
                                    if (i5 != 1895825408) {
                                        if (i4 < 0) {
                                            f = (-i4) / (-2.1474836E9f);
                                        } else {
                                            f = i4 / 2.1474836E9f;
                                        }
                                        byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                    } else {
                                        if (i5 == 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        if (i4 < 0) {
                                            d = (-i4) / (-2.147483648E9d);
                                        } else {
                                            d = ((double) i4) / 2.147483647E9d;
                                        }
                                        byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                    }
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i5 != 1879048192) {
                                if (i5 != 1895825408) {
                                    if (i4 < 0) {
                                        f = (-i4) / (-2.1474836E9f);
                                    } else {
                                        f = i4 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                } else {
                                    if (i5 == 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    if (i4 < 0) {
                                        d = (-i4) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i4) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.f21287M = byteBufferOrder;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m27548v(long j) {
        long j2;
        yxo yxoVar = this.f21321q;
        this.f21322r = yxoVar.f277290f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.f21283I;
            if (yxoVar.f277291g != qp71.f191180a && yxoVar.f277292h != null) {
                bp71 bp71Var = new bp71();
                yxo yxoVar2 = this.f21321q;
                yxoVar2.f277291g.mo46978g(yxoVar2.f277292h, bp71Var);
                j2 += bp71Var.f29347e;
            }
        }
        p27 p27Var = this.f21322r;
        r27 r27Var = new r27(0);
        yxo yxoVar3 = this.f21321q;
        r27Var.f195073b = yxoVar3.f277291g;
        r27Var.f195074c = yxoVar3.f277292h;
        r27Var.f195072a = j2;
        p27Var.m68882b(r27Var.m74507e());
    }

    /* JADX INFO: renamed from: w */
    public final boolean m27549w() {
        yxo yxoVar = this.f21321q;
        return yxoVar != null && yxoVar.f277289e.f117916j;
    }
}
