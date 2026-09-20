package p204p;

import android.util.SparseLongArray;
import androidx.compose.p002ui.geometry.Offset;
import com.google.android.gms.common.api.ApiException;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.decipher.transport.DecipherSseTransport;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class gd5 implements Predicate, iab, Function, v4p0, d5y, e5y, oad0, mu61, oal0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78728a;

    /* JADX INFO: renamed from: b */
    public long f78729b;

    /* JADX INFO: renamed from: c */
    public Object f78730c;

    public /* synthetic */ gd5(long j, Object obj, int i) {
        this.f78728a = i;
        this.f78729b = j;
        this.f78730c = obj;
    }

    /* JADX INFO: renamed from: O */
    public static void m44349O(gd5 gd5Var) {
        gd5Var.f78729b = 0L;
    }

    /* JADX INFO: renamed from: A */
    public int m44350A(int i) {
        gd5 gd5Var = (gd5) this.f78730c;
        if (gd5Var == null) {
            return i >= 64 ? Long.bitCount(this.f78729b) : Long.bitCount(this.f78729b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f78729b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f78729b) + gd5Var.m44350A(i - 64);
    }

    /* JADX INFO: renamed from: B */
    public void m44351B() {
        if (((gd5) this.f78730c) == null) {
            this.f78730c = new gd5(1);
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m44352C(int i) {
        if (i < 64) {
            return (this.f78729b & (1 << i)) != 0;
        }
        m44351B();
        return ((gd5) this.f78730c).m44352C(i - 64);
    }

    /* JADX INFO: renamed from: D */
    public v8l0 m44353D() {
        return (v8l0) this.f78730c;
    }

    /* JADX INFO: renamed from: E */
    public long m44354E() {
        return this.f78729b;
    }

    /* JADX INFO: renamed from: F */
    public long m44355F(float f, long j, boolean z) {
        long jM257g;
        if (z) {
            jM257g = Offset.m257g(this.f78729b, j);
            this.f78729b = jM257g;
        } else {
            jM257g = Offset.m257g(this.f78729b, j);
        }
        if ((((vvl0) this.f78730c) == null ? Offset.m254d(jM257g) : Math.abs(m44358J(jM257g))) < f) {
            return 9205357640488583168L;
        }
        if (((vvl0) this.f78730c) == null) {
            long j2 = this.f78729b;
            return Offset.m256f(this.f78729b, Offset.m258h(Offset.m252b(j2, Offset.m254d(j2)), f));
        }
        float fM44358J = m44358J(this.f78729b) - (Math.signum(m44358J(this.f78729b)) * f);
        long j3 = this.f78729b;
        vvl0 vvl0Var = (vvl0) this.f78730c;
        vvl0 vvl0Var2 = vvl0.f245249b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (vvl0Var == vvl0Var2 ? j3 & 4294967295L : j3 >> 32));
        if (((vvl0) this.f78730c) == vvl0Var2) {
            return (((long) Float.floatToRawIntBits(fM44358J)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fM44358J)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    /* JADX INFO: renamed from: H */
    public void m44356H(int i, boolean z) {
        if (i >= 64) {
            m44351B();
            ((gd5) this.f78730c).m44356H(i - 64, z);
            return;
        }
        long j = this.f78729b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f78729b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m44363P(i);
        } else {
            m44366z(i);
        }
        if (z2 || ((gd5) this.f78730c) != null) {
            m44351B();
            ((gd5) this.f78730c).m44356H(0, z2);
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m44357I(long j) {
        long jM257g = Offset.m257g(this.f78729b, j);
        double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jM257g & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM257g >> 32))))) * 180)) / 3.141592653589793d;
        vvl0 vvl0Var = (vvl0) this.f78730c;
        int i = vvl0Var == null ? -1 : ga81.f78002a[vvl0Var.ordinal()];
        if (i != 1) {
            if (i != 2 || dAtan2 <= 30.0d) {
                return false;
            }
        } else if (dAtan2 >= 30.0d) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public float m44358J(long j) {
        return Float.intBitsToFloat((int) (((vvl0) this.f78730c) == vvl0.f245249b ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: K */
    public Object m44359K(Object obj) {
        ebq ebqVar = (ebq) ((LinkedHashMap) this.f78730c).get(obj);
        if (ebqVar != null) {
            if (System.currentTimeMillis() - ebqVar.f58113b >= cks.m33187f(this.f78729b)) {
                ebqVar = null;
            }
            if (ebqVar != null) {
                return ebqVar.f58112a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public boolean m44360L(int i) {
        if (i >= 64) {
            m44351B();
            return ((gd5) this.f78730c).m44360L(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f78729b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f78729b = j3;
        long j4 = j - 1;
        this.f78729b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        gd5 gd5Var = (gd5) this.f78730c;
        if (gd5Var != null) {
            if (gd5Var.m44352C(0)) {
                m44363P(63);
            }
            ((gd5) this.f78730c).m44360L(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: M */
    public void m44361M() {
        this.f78729b = 0L;
        gd5 gd5Var = (gd5) this.f78730c;
        if (gd5Var != null) {
            gd5Var.m44361M();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m44362N(long j) {
        this.f78729b = j;
    }

    /* JADX INFO: renamed from: P */
    public void m44363P(int i) {
        if (i < 64) {
            this.f78729b |= 1 << i;
        } else {
            m44351B();
            ((gd5) this.f78730c).m44363P(i - 64);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m44364Q(vvl0 vvl0Var) {
        this.f78730c = vvl0Var;
    }

    /* JADX INFO: renamed from: R */
    public void m44365R(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.f78730c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.f78729b) {
                String str = h0b1.f86200a;
                if (sparseLongArray.size() == 0) {
                    throw new NoSuchElementException();
                }
                long jMin = Long.MAX_VALUE;
                for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                    jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
                }
                this.f78729b = jMin;
            }
        }
    }

    @Override // p204p.v4p0
    public void apply(long j) {
        hqb hqbVar = (hqb) this.f78730c;
        if (50 + j < this.f78729b) {
            hqbVar.resumeWith(null);
        } else {
            hqbVar.resumeWith(Long.valueOf(j));
        }
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: b */
    public boolean mo35035b(int i, boolean z) {
        return ((d5y) this.f78730c).mo35035b(i, true);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: c */
    public boolean mo35036c(byte[] bArr, int i, int i2, boolean z) {
        return ((d5y) this.f78730c).mo35036c(bArr, i, i2, z);
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: d */
    public void mo37835d(ddz0 ddz0Var) {
        ((e5y) this.f78730c).mo37835d(new br41(this, ddz0Var, ddz0Var));
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: f */
    public void mo31884f(y8b y8bVar, IOException iOException) {
        if (((zuu0) y8bVar).f286524P0) {
            return;
        }
        ((DecipherSseTransport) this.f78730c).nativeOnError(this.f78729b);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: g */
    public void mo35037g() {
        ((d5y) this.f78730c).mo35037g();
    }

    @Override // p204p.d5y
    public long getLength() {
        return ((d5y) this.f78730c).getLength() - this.f78729b;
    }

    @Override // p204p.d5y
    public long getPosition() {
        return ((d5y) this.f78730c).getPosition() - this.f78729b;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: h */
    public boolean mo35038h(byte[] bArr, int i, int i2, boolean z) {
        return ((d5y) this.f78730c).mo35038h(bArr, 0, i2, z);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: i */
    public void mo35039i(int i, byte[] bArr, int i2) {
        ((d5y) this.f78730c).mo35039i(i, bArr, i2);
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: j */
    public h1p0 mo41694j() {
        return h1p0.f86671d;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: k */
    public long mo35040k() {
        return ((d5y) this.f78730c).mo35040k() - this.f78729b;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: n */
    public void mo35041n(int i) {
        ((d5y) this.f78730c).mo35041n(i);
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        switch (this.f78728a) {
            case 19:
                int statusCode = exc instanceof ApiException ? ((ApiException) exc).getStatusCode() : 13;
                long j = this.f78729b;
                Iterator it = ((ydw0) ((g7d1) this.f78730c).f77249d).f271866c.f168559d.iterator();
                while (it.hasNext()) {
                    ((shf1) it.next()).m78132d(j, statusCode, null);
                }
                break;
            default:
                ((AtomicLong) ((bka1) this.f78730c).f27888c).set(this.f78729b);
                break;
        }
    }

    @Override // p204p.mu61
    public void onSuccess() {
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.f78730c;
        if (!videoSurfaceView.f3081q1) {
            videoSurfaceView.f3081q1 = true;
        }
        tcz0 seekFramePrefetcher = videoSurfaceView.getSeekFramePrefetcher();
        if (seekFramePrefetcher != null) {
            ((rvw0) seekFramePrefetcher).m76501q(this.f78729b);
        }
    }

    @Override // p204p.mu61
    /* JADX INFO: renamed from: p */
    public void mo25096p(Exception exc) {
        tcz0 seekFramePrefetcher = ((VideoSurfaceView) this.f78730c).getSeekFramePrefetcher();
        if (seekFramePrefetcher != null) {
            ((rvw0) seekFramePrefetcher).m76501q(this.f78729b);
        }
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: q */
    public long mo41696q() {
        return this.f78729b;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: r */
    public int mo35042r(int i, byte[] bArr, int i2) {
        return ((d5y) this.f78730c).mo35042r(i, bArr, i2);
    }

    @Override // p204p.fho
    public int read(byte[] bArr, int i, int i2) {
        return ((d5y) this.f78730c).read(bArr, i, i2);
    }

    @Override // p204p.d5y
    public void readFully(byte[] bArr, int i, int i2) {
        ((d5y) this.f78730c).readFully(bArr, i, i2);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: s */
    public int mo35043s(int i) {
        return ((d5y) this.f78730c).mo35043s(i);
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: t */
    public void mo37836t() {
        ((e5y) this.f78730c).mo37836t();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        hd5 hd5Var = (hd5) this.f78730c;
        if (hd5Var.f90005t <= 20) {
            return false;
        }
        ((wy3) hd5Var.f89999d).getClass();
        return System.currentTimeMillis() > this.f78729b;
    }

    public String toString() {
        switch (this.f78728a) {
            case 1:
                if (((gd5) this.f78730c) == null) {
                    return Long.toBinaryString(this.f78729b);
                }
                return ((gd5) this.f78730c).toString() + "xx" + Long.toBinaryString(this.f78729b);
            default:
                return super.toString();
        }
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: v */
    public void mo35044v(int i) {
        ((d5y) this.f78730c).mo35044v(i);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: w */
    public boolean mo35045w(int i, boolean z) {
        return ((d5y) this.f78730c).mo35045w(i, true);
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: x */
    public ck81 mo37837x(int i, int i2) {
        return ((e5y) this.f78730c).mo37837x(i, i2);
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: y */
    public void mo31897y(y8b y8bVar, n2x0 n2x0Var) {
        try {
            try {
                if (n2x0Var.f149860d != 200) {
                    ((DecipherSseTransport) this.f78730c).nativeOnError(this.f78729b);
                    n2x0Var.close();
                    return;
                }
                ((DecipherSseTransport) this.f78730c).nativeOnConnected(this.f78729b);
                byte[] bArr = new byte[8192];
                InputStream inputStreamM69091a = n2x0Var.f149863g.m69091a();
                DecipherSseTransport decipherSseTransport = (DecipherSseTransport) this.f78730c;
                long j = this.f78729b;
                while (true) {
                    try {
                        int i = inputStreamM69091a.read(bArr);
                        if (i == -1) {
                            inputStreamM69091a.close();
                            ((DecipherSseTransport) this.f78730c).nativeOnDisconnected(this.f78729b);
                            n2x0Var.close();
                            return;
                        }
                        decipherSseTransport.nativeOnData(j, bArr, i);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            n0e1.m63430g(inputStreamM69091a, th);
                            throw th2;
                        }
                    }
                }
            } catch (IOException unused) {
                if (!((zuu0) y8bVar).f286524P0) {
                    ((DecipherSseTransport) this.f78730c).nativeOnError(this.f78729b);
                }
                n2x0Var.close();
            }
        } catch (Throwable th3) {
            n2x0Var.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m44366z(int i) {
        if (i < 64) {
            this.f78729b &= ~(1 << i);
            return;
        }
        gd5 gd5Var = (gd5) this.f78730c;
        if (gd5Var != null) {
            gd5Var.m44366z(i - 64);
        }
    }

    public /* synthetic */ gd5(Object obj, long j, int i) {
        this.f78728a = i;
        this.f78730c = obj;
        this.f78729b = j;
    }

    public gd5(long j, xre xreVar) {
        this.f78728a = 3;
        this.f78729b = j;
        this.f78730c = new LinkedHashMap();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f78728a) {
            case 4:
                v6n0 v6n0Var = (v6n0) obj;
                long jMo74867a = v6n0Var.mo74867a() - this.f78729b;
                long j = ((ykq) this.f78730c).f273787b;
                if (jMo74867a > j) {
                    jMo74867a = j;
                }
                return Completable.m23291w(jMo74867a, TimeUnit.MILLISECONDS, Schedulers.f10369b).m23293d(Observable.just(v6n0Var));
            case 5:
                xzx xzxVar = ((wos) this.f78730c).f253564a.f235651a.f246568h;
                return ((c0y) xzxVar).m31201j(this.f78729b, (xul0) obj);
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    return ((jb80) this.f78730c).f110690c.mo48939a(this.f78729b);
                }
                Observable observableEmpty = Observable.empty();
                wj50.m88279p(observableEmpty);
                return observableEmpty;
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    return ((kb80) this.f78730c).f121132c.mo25420a(this.f78729b);
                }
                Observable observableEmpty2 = Observable.empty();
                wj50.m88279p(observableEmpty2);
                return observableEmpty2;
            case 8:
                return ((c0y) ((uzx) ((u4i) this.f78730c).f226723b).f235651a.f246568h).m31200i(this.f78729b, xul0.m92201d((LoggingParams) obj));
            case 9:
            default:
                hvi0 hvi0Var = cks.f39079b;
                long j2 = this.f78729b;
                ((wy3) ((zb21) this.f78730c).f281217a).getClass();
                return new cks(((cks) n0e1.m63432i(new cks(jwg1.m54450E(j2 - System.currentTimeMillis(), ils.MILLISECONDS)), new cks(0L))).f39083a);
            case 10:
                vcj0 vcj0Var = (vcj0) this.f78730c;
                lv31 lv31VarEdit = vcj0Var.f240140a.mo35842b(vcj0Var.f240144e, (String) obj).edit();
                lv31VarEdit.m60050c(fv31.f73628b.m78181M("key_tap_bt_permissions_timestamp"), this.f78729b);
                lv31VarEdit.m60054g();
                return CompletableEmpty.f7437a;
        }
    }

    public gd5(d5y d5yVar, long j) {
        this.f78728a = 14;
        this.f78730c = d5yVar;
        c95.m31843i(d5yVar.getPosition() >= j);
        this.f78729b = j;
    }

    public gd5(int i) {
        this.f78728a = i;
        switch (i) {
            case 17:
                this.f78730c = new SparseLongArray();
                break;
            default:
                this.f78729b = 0L;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd5(vvl0 vvl0Var) {
        this(vvl0Var, 0L, 16);
        this.f78728a = 16;
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: l */
    public void mo41695l(h1p0 h1p0Var) {
    }
}
