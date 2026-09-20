package p204p;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.comscore.util.crashreport.CrashReportManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s8s0 implements xhd0, e5y, i7a0, l7a0, o0y0 {

    /* JADX INFO: renamed from: t1 */
    public static final Map f206727t1;

    /* JADX INFO: renamed from: u1 */
    public static final r300 f206728u1;

    /* JADX INFO: renamed from: L0 */
    public final s1e1 f206729L0;

    /* JADX INFO: renamed from: M0 */
    public final i26 f206730M0;

    /* JADX INFO: renamed from: N0 */
    public final fhi f206731N0;

    /* JADX INFO: renamed from: O0 */
    public final l8s0 f206732O0;

    /* JADX INFO: renamed from: P0 */
    public final l8s0 f206733P0;

    /* JADX INFO: renamed from: Q0 */
    public final Handler f206734Q0;

    /* JADX INFO: renamed from: R0 */
    public whd0 f206735R0;

    /* JADX INFO: renamed from: S0 */
    public oz30 f206736S0;

    /* JADX INFO: renamed from: T0 */
    public o8s0[] f206737T0;

    /* JADX INFO: renamed from: U0 */
    public p0y0[] f206738U0;

    /* JADX INFO: renamed from: V0 */
    public r8s0[] f206739V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f206740W0;

    /* JADX INFO: renamed from: X */
    public final boolean f206741X;

    /* JADX INFO: renamed from: X0 */
    public boolean f206742X0;

    /* JADX INFO: renamed from: Y */
    public final r300 f206743Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f206744Y0;

    /* JADX INFO: renamed from: Z */
    public final long f206745Z;

    /* JADX INFO: renamed from: Z0 */
    public boolean f206746Z0;

    /* JADX INFO: renamed from: a */
    public final Uri f206747a;

    /* JADX INFO: renamed from: a1 */
    public vyr0 f206748a1;

    /* JADX INFO: renamed from: b */
    public final uio f206749b;

    /* JADX INFO: renamed from: b1 */
    public ddz0 f206750b1;

    /* JADX INFO: renamed from: c */
    public final ihs f206751c;

    /* JADX INFO: renamed from: c1 */
    public long f206752c1;

    /* JADX INFO: renamed from: d */
    public final zz11 f206753d;

    /* JADX INFO: renamed from: d1 */
    public boolean f206754d1;

    /* JADX INFO: renamed from: e */
    public final zk1 f206755e;

    /* JADX INFO: renamed from: e1 */
    public int f206756e1;

    /* JADX INFO: renamed from: f */
    public final ehs f206757f;

    /* JADX INFO: renamed from: f1 */
    public long f206758f1 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: g */
    public final v8s0 f206759g;

    /* JADX INFO: renamed from: g1 */
    public boolean f206760g1;

    /* JADX INFO: renamed from: h */
    public final mn3 f206761h;

    /* JADX INFO: renamed from: h1 */
    public boolean f206762h1;

    /* JADX INFO: renamed from: i */
    public final String f206763i;

    /* JADX INFO: renamed from: i1 */
    public boolean f206764i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f206765j1;

    /* JADX INFO: renamed from: k1 */
    public int f206766k1;

    /* JADX INFO: renamed from: l1 */
    public final ArrayList f206767l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f206768m1;

    /* JADX INFO: renamed from: n1 */
    public long f206769n1;

    /* JADX INFO: renamed from: o1 */
    public long f206770o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f206771p1;

    /* JADX INFO: renamed from: q1 */
    public int f206772q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f206773r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f206774s1;

    /* JADX INFO: renamed from: t */
    public final long f206775t;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f206727t1 = Collections.unmodifiableMap(map);
        p300 p300Var = new p300();
        p300Var.f173513a = "icy";
        p300Var.f173527o = def0.m35799p("application/x-icy");
        f206728u1 = new r300(p300Var);
    }

    public s8s0(Uri uri, uio uioVar, i26 i26Var, ihs ihsVar, ehs ehsVar, zz11 zz11Var, zk1 zk1Var, v8s0 v8s0Var, mn3 mn3Var, String str, int i, boolean z, r300 r300Var, long j, ie60 ie60Var) {
        this.f206747a = uri;
        this.f206749b = uioVar;
        this.f206751c = ihsVar;
        this.f206757f = ehsVar;
        this.f206753d = zz11Var;
        this.f206755e = zk1Var;
        this.f206759g = v8s0Var;
        this.f206761h = mn3Var;
        this.f206763i = str;
        this.f206775t = i;
        this.f206741X = z;
        this.f206743Y = r300Var;
        this.f206729L0 = ie60Var != null ? new s1e1(ie60Var, 2) : new s1e1("ProgressiveMediaPeriod");
        this.f206730M0 = i26Var;
        this.f206745Z = j;
        this.f206731N0 = new fhi();
        this.f206732O0 = new l8s0(this, 0);
        this.f206733P0 = new l8s0(this, 1);
        this.f206734Q0 = h0b1.m46330r(null);
        this.f206739V0 = new r8s0[0];
        this.f206738U0 = new p0y0[0];
        this.f206737T0 = new o8s0[0];
        this.f206767l1 = new ArrayList();
        this.f206770o1 = -9223372036854775807L;
        this.f206756e1 = 1;
    }

    /* JADX INFO: renamed from: A */
    public final int m77526A() {
        int iM68750t = 0;
        for (p0y0 p0y0Var : this.f206738U0) {
            iM68750t += p0y0Var.m68750t();
        }
        return iM68750t;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: B */
    public final long m77527B(boolean z) {
        p0y0 p0y0Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f206738U0.length; i++) {
            if (z) {
                p0y0Var = this.f206738U0[i];
                synchronized (p0y0Var) {
                    jMax = Math.max(jMax, p0y0Var.f172866w);
                }
            } else {
                vyr0 vyr0Var = this.f206748a1;
                vyr0Var.getClass();
                if (((boolean[]) vyr0Var.f246315d)[i]) {
                    p0y0Var = this.f206738U0[i];
                    synchronized (p0y0Var) {
                    }
                    jMax = Math.max(jMax, p0y0Var.f172866w);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m77528C() {
        return this.f206770o1 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: D */
    public final void m77529D() {
        long j;
        char c;
        if (this.f206774s1 || this.f206742X0 || !this.f206740W0 || this.f206750b1 == null) {
            return;
        }
        for (p0y0 p0y0Var : this.f206738U0) {
            if (p0y0Var.m68749s() == null) {
                return;
            }
        }
        this.f206731N0.m41670d();
        int length = this.f206738U0.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c2 = 1;
            if (i2 >= length) {
                break;
            }
            r300 r300VarM68749s = this.f206738U0[i2].m68749s();
            r300VarM68749s.getClass();
            int iM35792i = def0.m35792i(r300VarM68749s.f195387p);
            if (iM35792i == 1) {
                c = 3;
            } else if (iM35792i == 2) {
                c = 4;
            } else if (iM35792i != 3) {
                c = iM35792i != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i == 1) {
                c2 = 3;
            } else if (i == 2) {
                c2 = 4;
            } else if (i != 3) {
                c2 = i != 4 ? (char) 0 : (char) 2;
            }
            if (c > c2) {
                i3 = i2;
                i = iM35792i;
            }
            i2++;
        }
        kf81[] kf81VarArr = new kf81[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (true) {
            j = this.f206745Z;
            if (i4 >= length) {
                break;
            }
            r300 r300VarM68749s2 = this.f206738U0[i4].m68749s();
            r300VarM68749s2.getClass();
            String str = r300VarM68749s2.f195387p;
            boolean zM35794k = def0.m35794k(str);
            boolean z = zM35794k || def0.m35798o(str);
            zArr[i4] = z;
            this.f206744Y0 |= z;
            this.f206746Z0 = j != -9223372036854775807L && length == 1 && def0.m35796m(str);
            oz30 oz30Var = this.f206736S0;
            if (oz30Var != null) {
                int i5 = oz30Var.f172063a;
                if (zM35794k || this.f206739V0[i4].f196831b) {
                    j6f0 j6f0Var = r300VarM68749s2.f195384m;
                    j6f0 j6f0Var2 = j6f0Var == null ? new j6f0(oz30Var) : j6f0Var.m52573a(oz30Var);
                    p300 p300VarM74564a = r300VarM68749s2.m74564a();
                    p300VarM74564a.f173524l = j6f0Var2;
                    r300VarM68749s2 = new r300(p300VarM74564a);
                }
                if (zM35794k && r300VarM68749s2.f195380i == -1 && r300VarM68749s2.f195381j == -1 && i5 != -1) {
                    p300 p300VarM74564a2 = r300VarM68749s2.m74564a();
                    p300VarM74564a2.f173521i = i5;
                    r300VarM68749s2 = new r300(p300VarM74564a2);
                }
            }
            r300 r300VarM74565b = r300VarM68749s2.m74565b(this.f206751c.mo44756c(r300VarM68749s2));
            if (i4 != i3) {
                p300 p300VarM74564a3 = r300VarM74565b.m74564a();
                p300VarM74564a3.f173525m = Integer.toString(i3);
                r300VarM74565b = new r300(p300VarM74564a3);
            }
            kf81VarArr[i4] = new kf81(Integer.toString(i4), r300VarM74565b);
            this.f206738U0[i4].m68735D(this.f206758f1);
            i4++;
        }
        this.f206748a1 = new vyr0(new lf81(kf81VarArr), zArr);
        if (this.f206746Z0 && this.f206752c1 == -9223372036854775807L) {
            this.f206752c1 = j;
            this.f206750b1 = new m8s0(this, this.f206750b1);
        }
        this.f206759g.m84926E(this.f206752c1, this.f206750b1, this.f206754d1);
        this.f206742X0 = true;
        whd0 whd0Var = this.f206735R0;
        whd0Var.getClass();
        whd0Var.mo26781i(this);
    }

    /* JADX INFO: renamed from: E */
    public final void m77530E(int i) {
        m77536s();
        vyr0 vyr0Var = this.f206748a1;
        boolean[] zArr = (boolean[]) vyr0Var.f246316e;
        if (zArr[i]) {
            return;
        }
        r300 r300Var = ((lf81) vyr0Var.f246313b).m58848a(i).f122102d[0];
        this.f206755e.m96284k(def0.m35792i(r300Var.f195387p), r300Var, 0, null, this.f206769n1);
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: F */
    public final void m77531F(int i) {
        m77536s();
        if (this.f206771p1) {
            if ((!this.f206744Y0 || ((boolean[]) this.f206748a1.f246314c)[i]) && !this.f206738U0[i].m68751u(false)) {
                this.f206770o1 = 0L;
                this.f206771p1 = false;
                this.f206762h1 = true;
                this.f206769n1 = 0L;
                this.f206772q1 = 0;
                for (p0y0 p0y0Var : this.f206738U0) {
                    p0y0Var.m68732A(false);
                }
                whd0 whd0Var = this.f206735R0;
                whd0Var.getClass();
                whd0Var.mo26776d(this);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final ck81 m77532G(r8s0 r8s0Var) {
        int length = this.f206738U0.length;
        for (int i = 0; i < length; i++) {
            if (r8s0Var.equals(this.f206739V0[i])) {
                return this.f206738U0[i];
            }
        }
        if (this.f206740W0) {
            yif1.m93819w0("Extractor added new track (id=" + r8s0Var.f196830a + ") after finishing tracks.");
            return new nlr();
        }
        ihs ihsVar = this.f206751c;
        ihsVar.getClass();
        p0y0 p0y0Var = new p0y0(this.f206761h, ihsVar, this.f206757f);
        o8s0 o8s0Var = new o8s0(p0y0Var);
        p0y0Var.f172849f = this;
        int i2 = length + 1;
        r8s0[] r8s0VarArr = (r8s0[]) Arrays.copyOf(this.f206739V0, i2);
        r8s0VarArr[length] = r8s0Var;
        this.f206739V0 = r8s0VarArr;
        p0y0[] p0y0VarArr = (p0y0[]) Arrays.copyOf(this.f206738U0, i2);
        p0y0VarArr[length] = p0y0Var;
        this.f206738U0 = p0y0VarArr;
        o8s0[] o8s0VarArr = (o8s0[]) Arrays.copyOf(this.f206737T0, i2);
        o8s0VarArr[length] = o8s0Var;
        this.f206737T0 = o8s0VarArr;
        return o8s0Var;
    }

    /* JADX INFO: renamed from: H */
    public final void m77533H(ddz0 ddz0Var) {
        this.f206750b1 = this.f206736S0 == null ? ddz0Var : new ra8(-9223372036854775807L);
        this.f206752c1 = ddz0Var.mo25852g();
        boolean z = !this.f206768m1 && ddz0Var.mo25852g() == -9223372036854775807L;
        this.f206754d1 = z;
        this.f206756e1 = z ? 7 : 1;
        if (this.f206742X0) {
            this.f206759g.m84926E(this.f206752c1, ddz0Var, z);
        } else {
            m77529D();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m77534I() {
        p8s0 p8s0Var = new p8s0(this, this.f206747a, this.f206749b, this.f206730M0, this, this.f206731N0);
        if (this.f206742X0) {
            c95.m31855u(m77528C());
            long j = this.f206758f1;
            if (j == Long.MIN_VALUE) {
                j = this.f206752c1;
            }
            if (j != -9223372036854775807L && this.f206770o1 > j) {
                this.f206773r1 = true;
                this.f206770o1 = -9223372036854775807L;
                return;
            }
            ddz0 ddz0Var = this.f206750b1;
            ddz0Var.getClass();
            long j2 = ddz0Var.mo25847b(this.f206770o1).f36973a.f152876b;
            long j3 = this.f206770o1;
            p8s0Var.f175037g.f239314a = j2;
            p8s0Var.f175040j = j3;
            p8s0Var.f175039i = true;
            p8s0Var.f175043m = false;
            for (p0y0 p0y0Var : this.f206738U0) {
                p0y0Var.f172863t = this.f206770o1;
            }
            this.f206770o1 = -9223372036854775807L;
        }
        this.f206772q1 = m77526A();
        this.f206729L0.m76959q(p8s0Var, this, this.f206753d.m97255k(this.f206756e1));
    }

    /* JADX INFO: renamed from: J */
    public final boolean m77535J() {
        return this.f206762h1 || m77528C();
    }

    @Override // p204p.o0y0
    /* JADX INFO: renamed from: a */
    public final void mo66028a() {
        this.f206734Q0.post(this.f206732O0);
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: b */
    public final long mo26774b() {
        return mo26791y();
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: c */
    public final boolean mo26775c() {
        return !this.f206773r1 && this.f206729L0.m76956m() && this.f206731N0.m41671e();
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: d */
    public final void mo37835d(ddz0 ddz0Var) {
        this.f206734Q0.post(new mpd0(16, this, ddz0Var));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf A[LOOP:2: B:48:0x00bd->B:49:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3 A[LOOP:3: B:53:0x00d1->B:54:0x00d3, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ba, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00cb, please report this as an issue */
    @Override // p204p.xhd0
    /* JADX INFO: renamed from: e */
    public final long mo26777e(long j) {
        int i;
        int i2;
        Iterator it = this.f206767l1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            lke0 lke0Var = (lke0) it.next();
            lke0Var.f134333e.clear();
            lke0Var.f134335g = null;
            lke0Var.f134336h = -9223372036854775807L;
            lke0Var.f134337i = false;
            lke0Var.f134338t = false;
            lke0Var.f134332d.mo51465g();
        }
        m77536s();
        boolean[] zArr = (boolean[]) this.f206748a1.f246314c;
        if (!this.f206750b1.mo25849d()) {
            j = 0;
        }
        this.f206762h1 = false;
        boolean z = true;
        boolean z2 = this.f206769n1 == j;
        this.f206769n1 = j;
        if (m77528C()) {
            this.f206770o1 = j;
            return j;
        }
        int i3 = this.f206756e1;
        s1e1 s1e1Var = this.f206729L0;
        if (i3 == 7 || !(this.f206773r1 || s1e1Var.m76956m())) {
            this.f206771p1 = false;
            this.f206770o1 = j;
            this.f206773r1 = false;
            this.f206764i1 = false;
            if (s1e1Var.m76956m()) {
                for (p0y0 p0y0Var : this.f206738U0) {
                    p0y0Var.m68740j();
                }
                s1e1Var.m76949d();
                return j;
            }
            s1e1Var.f204705d = null;
            for (p0y0 p0y0Var2 : this.f206738U0) {
                p0y0Var2.m68732A(false);
            }
        } else {
            int length = this.f206738U0.length;
            for (int i4 = 0; i4 < length; i4++) {
                p0y0 p0y0Var3 = this.f206738U0[i4];
                if (this.f206737T0[i4].f162864d.get() == n8s0.f151616a && (p0y0Var3.m68746p() != 0 || !z2)) {
                    if (!(this.f206746Z0 ? p0y0Var3.m68733B(p0y0Var3.f172860q) : p0y0Var3.m68734C(j, this.f206773r1)) && (zArr[i4] || !this.f206744Y0)) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z) {
                this.f206771p1 = false;
                this.f206770o1 = j;
                this.f206773r1 = false;
                this.f206764i1 = false;
                if (s1e1Var.m76956m()) {
                    while (i < r1) {
                        p0y0Var.m68740j();
                    }
                    s1e1Var.m76949d();
                    return j;
                }
                s1e1Var.f204705d = null;
                while (i2 < r1) {
                    p0y0Var2.m68732A(false);
                }
            }
        }
        return j;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: g */
    public final long mo26779g() {
        if (!this.f206765j1 && this.f206764i1) {
            this.f206764i1 = false;
            return this.f206769n1;
        }
        if (!this.f206762h1) {
            return -9223372036854775807L;
        }
        if (!this.f206773r1 && m77526A() <= this.f206772q1) {
            return -9223372036854775807L;
        }
        this.f206762h1 = false;
        return this.f206769n1;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: h */
    public final boolean mo26780h(m8a0 m8a0Var) {
        if (this.f206773r1) {
            return false;
        }
        s1e1 s1e1Var = this.f206729L0;
        if (s1e1Var.m76953j() || this.f206771p1) {
            return false;
        }
        if ((this.f206742X0 || this.f206743Y != null) && this.f206766k1 == 0) {
            return false;
        }
        boolean zM41672f = this.f206731N0.m41672f();
        if (s1e1Var.m76956m()) {
            return zM41672f;
        }
        m77534I();
        return true;
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: i */
    public final void mo34939i(k7a0 k7a0Var, long j, long j2, int i) {
        p8s0 p8s0Var = (p8s0) k7a0Var;
        nz41 nz41Var = p8s0Var.f175033c;
        n0a0 n0a0Var = new n0a0(p8s0Var.f175031a, p8s0Var.f175041k, j);
        if (i != 0) {
            n0a0Var.f148955d = nz41Var.f159997c;
            n0a0Var.f148956e = nz41Var.f159998d;
            n0a0Var.f148957f = j2;
            n0a0Var.f148958g = nz41Var.f159996b;
        }
        this.f206755e.m96265H(new o0a0(n0a0Var), 1, -1, null, 0, null, p8s0Var.f175040j, this.f206752c1, i);
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: j */
    public final void mo34940j(k7a0 k7a0Var, long j, long j2) {
        p8s0 p8s0Var = (p8s0) k7a0Var;
        if (this.f206752c1 == -9223372036854775807L && this.f206750b1 != null) {
            long jM77527B = m77527B(true);
            long j3 = jM77527B == Long.MIN_VALUE ? 0L : jM77527B + 10000;
            this.f206752c1 = j3;
            this.f206759g.m84926E(j3, this.f206750b1, this.f206754d1);
        }
        nz41 nz41Var = p8s0Var.f175033c;
        n0a0 n0a0Var = new n0a0(p8s0Var.f175031a, p8s0Var.f175041k, j);
        n0a0Var.f148955d = nz41Var.f159997c;
        n0a0Var.f148956e = nz41Var.f159998d;
        n0a0Var.f148957f = j2;
        n0a0Var.f148958g = nz41Var.f159996b;
        o0a0 o0a0Var = new o0a0(n0a0Var);
        this.f206753d.getClass();
        this.f206755e.m96262E(o0a0Var, 1, -1, null, 0, null, p8s0Var.f175040j, this.f206752c1);
        this.f206773r1 = true;
        whd0 whd0Var = this.f206735R0;
        whd0Var.getClass();
        whd0Var.mo26776d(this);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: k */
    public final long mo46188k(long j) {
        this.f206758f1 = j;
        for (p0y0 p0y0Var : this.f206738U0) {
            p0y0Var.m68735D(j);
        }
        return j;
    }

    @Override // p204p.l7a0
    /* JADX INFO: renamed from: l */
    public final void mo58411l() {
        for (p0y0 p0y0Var : this.f206738U0) {
            p0y0Var.m68732A(true);
            bhs bhsVar = p0y0Var.f172851h;
            if (bhsVar != null) {
                bhsVar.mo29258b(p0y0Var.f172848e);
                p0y0Var.f172851h = null;
                p0y0Var.f172850g = null;
            }
        }
        i26 i26Var = this.f206730M0;
        c5y c5yVar = (c5y) i26Var.f97753c;
        if (c5yVar != null) {
            c5yVar.release();
            i26Var.f97753c = null;
        }
        i26Var.f97754d = null;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x024b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // p204p.xhd0
    /* JADX INFO: renamed from: m */
    public final long mo26784m(xjx[] xjxVarArr, boolean[] zArr, p1y0[] p1y0VarArr, boolean[] zArr2, long j) {
        ?? r12;
        boolean z;
        ArrayList arrayList;
        byte[] bArr;
        boolean[] zArr3;
        lf81 lf81Var;
        boolean z2;
        xjx xjxVar;
        Object obj;
        p0y0 p0y0Var;
        boolean z3;
        boolean z4;
        Object obj2;
        xjx[] xjxVarArr2 = xjxVarArr;
        long jMo26777e = j;
        m77536s();
        vyr0 vyr0Var = this.f206748a1;
        lf81 lf81Var2 = (lf81) vyr0Var.f246313b;
        boolean[] zArr4 = (boolean[]) vyr0Var.f246315d;
        int i = this.f206766k1;
        int i2 = 0;
        while (true) {
            r12 = 1;
            if (i2 >= xjxVarArr2.length) {
                z = false;
                break;
            }
            xjx xjxVar2 = xjxVarArr2[i2];
            if (xjxVar2 != null && Objects.equals(lf81Var2.m58848a(lf81Var2.m58849b(xjxVar2.mo34618n())).f122102d[0].f195387p, "application/x-itut-t35")) {
                z = true;
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length = xjxVarArr2.length;
            arrayList = this.f206767l1;
            if (i3 >= length) {
                break;
            }
            ?? r13 = p1y0VarArr[i3];
            if (r13 != 0) {
                if (xjxVarArr2[i3] == null || !zArr[i3]) {
                    obj2 = null;
                } else if (z) {
                    obj2 = null;
                    if (r13 instanceof lke0) {
                    }
                }
                if (r13 instanceof lke0) {
                    lke0 lke0Var = (lke0) r13;
                    arrayList.remove(lke0Var);
                    int i4 = lke0Var.f134329a.f186377a;
                    c95.m31855u(zArr4[i4]);
                    this.f206766k1--;
                    zArr4[i4] = false;
                    int i5 = lke0Var.f134330b.f186377a;
                    c95.m31855u(zArr4[i5]);
                    this.f206766k1--;
                    zArr4[i5] = false;
                } else {
                    int i6 = ((q8s0) r13).f186377a;
                    c95.m31855u(zArr4[i6]);
                    this.f206766k1--;
                    zArr4[i6] = false;
                }
                p1y0VarArr[i3] = obj2;
            }
            i3++;
        }
        byte[] bArr2 = null;
        boolean z5 = !this.f206760g1 ? jMo26777e == 0 || this.f206746Z0 : i != 0;
        int i7 = 0;
        boolean z6 = false;
        while (i7 < xjxVarArr2.length) {
            if (p1y0VarArr[i7] != 0 || (xjxVar = xjxVarArr2[i7]) == null) {
                zArr3 = zArr4;
                lf81Var = lf81Var2;
                z2 = z5;
            } else {
                c95.m31855u(xjxVar.length() == r12 ? r12 : 0);
                c95.m31855u(xjxVar.mo34614f(0) == 0 ? r12 : 0);
                int iM58849b = lf81Var2.m58849b(xjxVar.mo34618n());
                c95.m31855u(!zArr4[iM58849b]);
                boolean z7 = r12;
                this.f206766k1++;
                zArr4[iM58849b] = z7;
                z6 |= xjxVar.mo34621s().f195393v;
                q8s0 q8s0Var = new q8s0(this, iM58849b, xjxVar.mo34621s().f195393v);
                if (this.f206741X) {
                    zArr3 = zArr4;
                    if (Build.VERSION.SDK_INT >= 37 && !z && def0.m35798o(xjxVar.mo34621s().f195387p)) {
                        int i8 = 0;
                        ?? r18 = z7;
                        while (true) {
                            if (i8 < lf81Var2.f132853a) {
                                r300 r300Var = lf81Var2.m58848a(i8).f122102d[0];
                                lf81Var = lf81Var2;
                                String str = r300Var.f195387p;
                                List list = r300Var.f195390s;
                                if (Objects.equals(str, "application/x-itut-t35") && !list.isEmpty()) {
                                    byte[] bArr3 = (byte[]) list.get(0);
                                    if (bArr3.length >= 5 && bArr3[0] == -75 && bArr3[r18] == 0 && bArr3[2] == -112 && bArr3[3] == 0 && bArr3[4] == (z4 = r18)) {
                                        c95.m31855u((zArr3[i8] ? 1 : 0) ^ (z4 ? 1 : 0));
                                        this.f206766k1 += z4 ? 1 : 0;
                                        zArr3[i8] = z4;
                                        z2 = z5;
                                        lke0 lke0Var2 = new lke0(q8s0Var, new q8s0(this, i8, false), xjxVar.mo34621s());
                                        arrayList.add(lke0Var2);
                                        obj = lke0Var2;
                                        break;
                                    }
                                }
                                i8++;
                                z5 = z5;
                                lf81Var2 = lf81Var;
                                r18 = 1;
                            }
                        }
                    }
                    p1y0VarArr[i7] = obj;
                    zArr2[i7] = true;
                    if (!z2) {
                        p0y0Var = this.f206738U0[iM58849b];
                        if (p0y0Var.m68746p() != 0 || p0y0Var.m68734C(jMo26777e, true)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        z5 = z3;
                    }
                    i7++;
                    xjxVarArr2 = xjxVarArr;
                    zArr4 = zArr3;
                    lf81Var2 = lf81Var;
                    r12 = 1;
                } else {
                    zArr3 = zArr4;
                }
                lf81Var = lf81Var2;
                z2 = z5;
                obj = q8s0Var;
                p1y0VarArr[i7] = obj;
                zArr2[i7] = true;
                if (!z2) {
                    p0y0Var = this.f206738U0[iM58849b];
                    if (p0y0Var.m68746p() != 0) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    z5 = z3;
                }
                i7++;
                xjxVarArr2 = xjxVarArr;
                zArr4 = zArr3;
                lf81Var2 = lf81Var;
                r12 = 1;
            }
            z5 = z2;
            i7++;
            xjxVarArr2 = xjxVarArr;
            zArr4 = zArr3;
            lf81Var2 = lf81Var;
            r12 = 1;
        }
        boolean z8 = z5;
        if (this.f206764i1 || !this.f206760g1) {
            this.f206764i1 = z6;
        }
        if (this.f206766k1 == 0) {
            this.f206771p1 = false;
            this.f206762h1 = false;
            this.f206764i1 = false;
            s1e1 s1e1Var = this.f206729L0;
            if (s1e1Var.m76956m()) {
                for (p0y0 p0y0Var2 : this.f206738U0) {
                    p0y0Var2.m68740j();
                }
                s1e1Var.m76949d();
            } else {
                boolean z9 = false;
                this.f206773r1 = false;
                p0y0[] p0y0VarArr = this.f206738U0;
                int length2 = p0y0VarArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    p0y0VarArr[i9].m68732A(z9);
                    i9++;
                    z9 = false;
                }
            }
        } else if (z8) {
            jMo26777e = mo26777e(jMo26777e);
            int i10 = 0;
            while (i10 < p1y0VarArr.length) {
                ?? r1 = p1y0VarArr[i10];
                if (r1 != 0) {
                    zArr2[i10] = true;
                    if (r1 instanceof lke0) {
                        lke0 lke0Var3 = (lke0) r1;
                        lke0Var3.f134333e.clear();
                        bArr = bArr2;
                        lke0Var3.f134335g = bArr;
                        lke0Var3.f134336h = -9223372036854775807L;
                        lke0Var3.f134337i = false;
                        lke0Var3.f134338t = false;
                        lke0Var3.f134332d.mo51465g();
                    } else {
                        bArr = bArr2;
                    }
                } else {
                    bArr = bArr2;
                }
                i10++;
                bArr2 = bArr;
            }
        }
        this.f206760g1 = true;
        return jMo26777e;
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: n */
    public final void mo34943n(k7a0 k7a0Var, long j, long j2, boolean z) {
        p8s0 p8s0Var = (p8s0) k7a0Var;
        nz41 nz41Var = p8s0Var.f175033c;
        n0a0 n0a0Var = new n0a0(p8s0Var.f175031a, p8s0Var.f175041k, j);
        n0a0Var.f148955d = nz41Var.f159997c;
        n0a0Var.f148956e = nz41Var.f159998d;
        n0a0Var.f148957f = j2;
        n0a0Var.f148958g = nz41Var.f159996b;
        o0a0 o0a0Var = new o0a0(n0a0Var);
        this.f206753d.getClass();
        this.f206755e.m96261D(o0a0Var, 1, -1, null, 0, null, p8s0Var.f175040j, this.f206752c1);
        if (z) {
            return;
        }
        for (p0y0 p0y0Var : this.f206738U0) {
            p0y0Var.m68732A(false);
        }
        if (this.f206766k1 > 0) {
            whd0 whd0Var = this.f206735R0;
            whd0Var.getClass();
            whd0Var.mo26776d(this);
        }
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: o */
    public final zkq mo34944o(k7a0 k7a0Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        zkq zkqVar;
        ddz0 ddz0Var;
        p8s0 p8s0Var = (p8s0) k7a0Var;
        nz41 nz41Var = p8s0Var.f175033c;
        n0a0 n0a0Var = new n0a0(p8s0Var.f175031a, p8s0Var.f175041k, j);
        n0a0Var.f148955d = nz41Var.f159997c;
        n0a0Var.f148956e = nz41Var.f159998d;
        n0a0Var.f148957f = j2;
        n0a0Var.f148958g = nz41Var.f159996b;
        o0a0 o0a0Var = new o0a0(n0a0Var);
        String str = h0b1.f86200a;
        this.f206753d.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, CrashReportManager.TIME_WINDOW);
                break;
            }
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).f971a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zkqVar = s1e1.f204701i;
        } else {
            int iM77526A = m77526A();
            int i2 = iM77526A > this.f206772q1 ? 1 : 0;
            if (this.f206768m1 || !((ddz0Var = this.f206750b1) == null || ddz0Var.mo25852g() == -9223372036854775807L)) {
                this.f206772q1 = iM77526A;
            } else if (!this.f206742X0 || m77535J()) {
                this.f206762h1 = this.f206742X0;
                this.f206769n1 = 0L;
                this.f206772q1 = 0;
                for (p0y0 p0y0Var : this.f206738U0) {
                    p0y0Var.m68732A(false);
                }
                p8s0Var.f175037g.f239314a = 0L;
                p8s0Var.f175040j = 0L;
                p8s0Var.f175039i = true;
                p8s0Var.f175043m = false;
            } else {
                this.f206771p1 = true;
                zkqVar = s1e1.f204700h;
            }
            zkqVar = new zkq(jMin, false, i2);
        }
        this.f206755e.m96263F(o0a0Var, 1, -1, null, 0, null, p8s0Var.f175040j, this.f206752c1, iOException, !zkqVar.m96335e());
        return zkqVar;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: p */
    public final void mo26785p() {
        this.f206765j1 = true;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: q */
    public final void mo26786q() throws IOException {
        int iM97255k = this.f206753d.m97255k(this.f206756e1);
        s1e1 s1e1Var = this.f206729L0;
        IOException iOException = (IOException) s1e1Var.f204705d;
        if (iOException != null) {
            throw iOException;
        }
        j7a0 j7a0Var = (j7a0) s1e1Var.f204704c;
        if (j7a0Var != null) {
            if (iM97255k == Integer.MIN_VALUE) {
                iM97255k = j7a0Var.f109547a;
            }
            IOException iOException2 = j7a0Var.f109551e;
            if (iOException2 != null && j7a0Var.f109552f > iM97255k) {
                throw iOException2;
            }
        }
        if (this.f206773r1 && !this.f206742X0) {
            throw ParserException.m752a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: r */
    public final void mo26787r(long j) throws Throwable {
        if (this.f206746Z0) {
            return;
        }
        m77536s();
        if (m77528C()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f206748a1.f246315d;
        int length = this.f206738U0.length;
        for (int i = 0; i < length; i++) {
            this.f206738U0[i].m68739i(j, zArr[i]);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m77536s() {
        c95.m31855u(this.f206742X0);
        this.f206748a1.getClass();
        this.f206750b1.getClass();
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: t */
    public final void mo37836t() {
        this.f206740W0 = true;
        this.f206734Q0.post(this.f206732O0);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: u */
    public final long mo26788u(long j, mdz0 mdz0Var) {
        m77536s();
        if (!this.f206750b1.mo25849d()) {
            return 0L;
        }
        cdz0 cdz0VarMo25847b = this.f206750b1.mo25847b(j);
        return mdz0Var.m61531a(j, cdz0VarMo25847b.f36973a.f152875a, cdz0VarMo25847b.f36974b.f152875a);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: v */
    public final lf81 mo26789v() {
        m77536s();
        return (lf81) this.f206748a1.f246313b;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: w */
    public final void mo26790w(whd0 whd0Var, long j) {
        this.f206735R0 = whd0Var;
        r300 r300Var = this.f206743Y;
        if (r300Var == null) {
            this.f206731N0.m41672f();
            m77534I();
        } else {
            mo37837x(0, 3).mo33087a(r300Var);
            m77533H(new vn40(-9223372036854775807L, new long[]{0}, new long[]{0}));
            mo37836t();
            this.f206770o1 = j;
        }
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: x */
    public final ck81 mo37837x(int i, int i2) {
        return m77532G(new r8s0(i, false));
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: y */
    public final long mo26791y() {
        long jM77527B;
        boolean z;
        long j;
        m77536s();
        if (this.f206773r1 || this.f206766k1 == 0) {
            return Long.MIN_VALUE;
        }
        if (m77528C()) {
            return this.f206770o1;
        }
        if (this.f206744Y0) {
            int length = this.f206738U0.length;
            jM77527B = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                vyr0 vyr0Var = this.f206748a1;
                if (((boolean[]) vyr0Var.f246314c)[i] && ((boolean[]) vyr0Var.f246315d)[i]) {
                    p0y0 p0y0Var = this.f206738U0[i];
                    synchronized (p0y0Var) {
                        z = p0y0Var.f172869z;
                    }
                    if (z) {
                        continue;
                    } else {
                        p0y0 p0y0Var2 = this.f206738U0[i];
                        synchronized (p0y0Var2) {
                            j = p0y0Var2.f172866w;
                        }
                        jM77527B = Math.min(jM77527B, j);
                    }
                }
            }
        } else {
            jM77527B = Long.MAX_VALUE;
        }
        if (jM77527B == Long.MAX_VALUE) {
            jM77527B = m77527B(false);
        }
        return jM77527B == Long.MIN_VALUE ? this.f206769n1 : jM77527B;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: z */
    public final void mo26792z(long j) {
        boolean z;
        if (this.f206766k1 <= 0 || m77528C()) {
            return;
        }
        boolean z2 = false;
        if (this.f206758f1 != Long.MIN_VALUE) {
            m77536s();
            boolean z3 = true;
            int i = 0;
            while (true) {
                p0y0[] p0y0VarArr = this.f206738U0;
                if (i >= p0y0VarArr.length) {
                    break;
                }
                vyr0 vyr0Var = this.f206748a1;
                if (((boolean[]) vyr0Var.f246315d)[i] && (((boolean[]) vyr0Var.f246314c)[i] || !this.f206744Y0)) {
                    p0y0 p0y0Var = p0y0VarArr[i];
                    synchronized (p0y0Var) {
                        z = p0y0Var.f172867x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.f206773r1 = true;
        }
    }
}
