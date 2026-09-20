package p204p;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.comscore.util.crashreport.CrashReportManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sjp implements i7a0 {

    /* JADX INFO: renamed from: U0 */
    public static final wwo f209896U0 = new wwo(21);

    /* JADX INFO: renamed from: L0 */
    public pf40 f209897L0;

    /* JADX INFO: renamed from: M0 */
    public pf40 f209898M0;

    /* JADX INFO: renamed from: N0 */
    public pf40 f209899N0;

    /* JADX INFO: renamed from: O0 */
    public pf40 f209900O0;

    /* JADX INFO: renamed from: P0 */
    public Uri f209901P0;

    /* JADX INFO: renamed from: Q0 */
    public a130 f209902Q0;

    /* JADX INFO: renamed from: R0 */
    public Uri f209903R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f209904S0;

    /* JADX INFO: renamed from: X */
    public e130 f209906X;

    /* JADX INFO: renamed from: Y */
    public ParserException f209907Y;

    /* JADX INFO: renamed from: Z */
    public x43 f209908Z;

    /* JADX INFO: renamed from: a */
    public final m030 f209909a;

    /* JADX INFO: renamed from: b */
    public final i130 f209910b;

    /* JADX INFO: renamed from: c */
    public final zz11 f209911c;

    /* JADX INFO: renamed from: f */
    public zk1 f209914f;

    /* JADX INFO: renamed from: g */
    public s1e1 f209915g;

    /* JADX INFO: renamed from: h */
    public Handler f209916h;

    /* JADX INFO: renamed from: i */
    public b130 f209917i;

    /* JADX INFO: renamed from: t */
    public at8 f209918t;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f209913e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f209912d = new HashMap();

    /* JADX INFO: renamed from: T0 */
    public long f209905T0 = -9223372036854775807L;

    public sjp(m030 m030Var, zz11 zz11Var, i130 i130Var) {
        this.f209909a = m030Var;
        this.f209910b = i130Var;
        this.f209911c = zz11Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m78352a(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            m130 m130Var = (m130) list.get(i);
            rjp rjpVar = new rjp(this, m130Var, z);
            o3a1 it = hg40.m47406p(m130Var.f138834b.values()).iterator();
            while (it.hasNext()) {
                this.f209912d.put((Uri) it.next(), rjpVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final a130 m78353b(Uri uri, boolean z) {
        HashMap map = this.f209912d;
        rjp rjpVar = (rjp) map.get(uri);
        if (rjpVar == null) {
            return null;
        }
        a130 a130VarM75649a = rjp.m75649a(rjpVar, uri);
        if (a130VarM75649a != null && z) {
            m78359h(uri, false);
            rjp rjpVar2 = (rjp) map.get(uri);
            rjpVar2.getClass();
            HashMap map2 = rjpVar2.f199879b;
            c95.m31855u(map2.containsKey(uri));
            qjp qjpVar = (qjp) map2.get(uri);
            qjpVar.getClass();
            if (!qjpVar.f189280Y) {
                c95.m31855u(map2.containsKey(uri));
                qjp qjpVar2 = (qjp) map2.get(uri);
                qjpVar2.getClass();
                qjpVar2.f189280Y = true;
                a130 a130VarM75649a2 = rjp.m75649a(rjpVar2, uri);
                if (a130VarM75649a2 != null && !a130VarM75649a2.f11305o) {
                    rjp.m75650b(rjpVar2, uri, true);
                }
            }
        }
        return a130VarM75649a;
    }

    /* JADX INFO: renamed from: c */
    public final pf40 m78354c(int i) {
        if (i == 0) {
            return this.f209897L0;
        }
        if (i == 1) {
            return this.f209898M0;
        }
        if (i == 2) {
            return this.f209899N0;
        }
        if (i != 3) {
            return null;
        }
        return this.f209900O0;
    }

    /* JADX INFO: renamed from: d */
    public final Uri m78355d(Uri uri) {
        w030 w030Var;
        a130 a130Var = this.f209902Q0;
        if (a130Var == null || !a130Var.f11312v.f277950e || (w030Var = (w030) a130Var.f11310t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(w030Var.f246629b));
        int i = w030Var.f246630c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m78356e(Uri uri, long j) {
        rjp rjpVar = (rjp) this.f209912d.get(uri);
        if (rjpVar != null) {
            return rjpVar.m75652d(uri, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m78357f(m130 m130Var, long j) {
        rjp rjpVar = (rjp) this.f209912d.get(m130Var.m60528b());
        if (rjpVar == null) {
            return false;
        }
        Iterator it = rjpVar.f199879b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((qjp) it.next()).f189290i;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m78358g(Uri uri) {
        int i;
        rjp rjpVar = (rjp) this.f209912d.get(uri);
        if (rjpVar == null) {
            return false;
        }
        HashMap map = rjpVar.f199879b;
        c95.m31855u(map.containsKey(uri));
        qjp qjpVar = (qjp) map.get(uri);
        qjpVar.getClass();
        if (qjpVar.f189286e == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, h0b1.m46326n0(qjpVar.f189286e.f11311u));
        a130 a130Var = qjpVar.f189286e;
        return a130Var.f11305o || (i = a130Var.f11294d) == 2 || i == 1 || qjpVar.f189287f + jMax > jElapsedRealtime;
    }

    /* JADX INFO: renamed from: h */
    public final void m78359h(Uri uri, boolean z) {
        if (uri.equals(this.f209901P0)) {
            return;
        }
        HashMap map = this.f209912d;
        rjp rjpVar = (rjp) map.get(uri);
        boolean z2 = false;
        if (rjpVar != null ? rjpVar.f199880c : false) {
            a130 a130Var = this.f209902Q0;
            if (a130Var == null || !a130Var.f11305o) {
                rjp rjpVar2 = (rjp) map.get(uri);
                rjpVar2.getClass();
                a130 a130VarM75649a = rjp.m75649a(rjpVar2, uri);
                if (a130VarM75649a != null && a130VarM75649a.f11305o) {
                    z2 = true;
                }
                if (!z2 && z) {
                    rjpVar2.m75653e(uri, m78355d(uri));
                    this.f209903R0 = uri;
                    return;
                }
                this.f209901P0 = uri;
                if (!z2) {
                    rjpVar2.m75653e(uri, m78355d(uri));
                } else {
                    this.f209902Q0 = a130VarM75649a;
                    this.f209917i.m27865E(a130VarM75649a);
                }
            }
        }
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: i */
    public final void mo34939i(k7a0 k7a0Var, long j, long j2, int i) {
        w2n0 w2n0Var = (w2n0) k7a0Var;
        n0a0 n0a0Var = new n0a0(w2n0Var.f247391a, w2n0Var.f247392b, j);
        if (i != 0) {
            nz41 nz41Var = w2n0Var.f247394d;
            n0a0Var.f148955d = nz41Var.f159997c;
            n0a0Var.f148956e = nz41Var.f159998d;
            n0a0Var.f148957f = j2;
            n0a0Var.f148958g = nz41Var.f159996b;
        }
        this.f209914f.m96265H(new o0a0(n0a0Var), w2n0Var.f247393c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: j */
    public final void mo34940j(k7a0 k7a0Var, long j, long j2) {
        e130 e130Var;
        w2n0 w2n0Var = (w2n0) k7a0Var;
        f130 f130Var = (f130) w2n0Var.f247396f;
        boolean z = f130Var instanceof a130;
        if (z) {
            String str = f130Var.f64777a;
            e130 e130Var2 = e130.f55103o;
            Uri uri = Uri.parse(str);
            p300 p300Var = new p300();
            p300Var.f173513a = "0";
            p300Var.f173526n = def0.m35799p("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new d130(uri, new r300(p300Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            e130Var = new e130("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list, null);
        } else {
            e130Var = (e130) f130Var;
        }
        this.f209906X = e130Var;
        j4u j4uVar = new j4u(e130Var);
        try {
            j4uVar.m52396u();
            this.f209897L0 = (pf40) j4uVar.f108788g;
            this.f209898M0 = j4uVar.m52394s(1);
            this.f209899N0 = j4uVar.m52394s(2);
            this.f209900O0 = j4uVar.m52394s(3);
            tey teyVar = this.f209906X.f55114n;
            if (teyVar != null) {
                m030 m030Var = this.f209909a;
                m3n m3nVar = new m3n(this, 10);
                at8 at8Var = this.f209918t;
                at8Var.getClass();
                x43 x43Var = new x43(m030Var, this, m3nVar, at8Var);
                this.f209908Z = x43Var;
                Uri uri2 = (Uri) teyVar.f219808b;
                String str2 = (String) teyVar.f219809c;
                zk1 zk1Var = this.f209914f;
                if (str2 != null) {
                    c95.m31855u(((HashSet) x43Var.f257966i).contains(str2));
                    x43Var.f257956Y = str2;
                }
                x43Var.f257959b = true;
                x43Var.m89832g(-9223372036854775807L);
                h12 h12Var = (h12) x43Var.f257960c;
                dmu dmuVar = new dmu(x43Var, 21);
                h12Var.f86409e = uri2;
                h12Var.f86410f = dmuVar;
                h12Var.f86411g = zk1Var;
                h12Var.f86413i = new kh61(new Handler(h0b1.m46276D(), null));
                h12Var.f86414j = new s1e1("SteeringManifestTracker");
                h12Var.f86405a = true;
                h12Var.m46380g();
            }
            this.f209901P0 = ((m130) this.f209897L0.get(0)).m60528b();
            this.f209913e.add(new pjp(this));
            m78352a(this.f209897L0, true);
            m78352a(this.f209898M0, false);
            m78352a(this.f209899N0, false);
            m78352a(this.f209900O0, false);
            n0a0 n0a0Var = new n0a0(w2n0Var.f247391a, w2n0Var.f247392b, j);
            nz41 nz41Var = w2n0Var.f247394d;
            n0a0Var.f148955d = nz41Var.f159997c;
            n0a0Var.f148956e = nz41Var.f159998d;
            n0a0Var.f148957f = j2;
            n0a0Var.f148958g = nz41Var.f159996b;
            o0a0 o0a0Var = new o0a0(n0a0Var);
            rjp rjpVar = (rjp) this.f209912d.get(this.f209901P0);
            rjpVar.getClass();
            if (z) {
                Uri uri3 = w2n0Var.f247394d.f159997c;
                HashMap map = rjpVar.f199879b;
                c95.m31855u(map.containsKey(uri3));
                qjp qjpVar = (qjp) map.get(uri3);
                qjpVar.getClass();
                qjpVar.m72934d((a130) f130Var, o0a0Var);
            } else {
                rjp.m75650b(rjpVar, this.f209901P0, false);
            }
            this.f209911c.getClass();
            this.f209914f.m96262E(o0a0Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (ParserException e) {
            this.f209907Y = e;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m78360k(Uri uri) throws IOException {
        rjp rjpVar = (rjp) this.f209912d.get(uri);
        if (rjpVar != null) {
            HashMap map = rjpVar.f199879b;
            c95.m31855u(map.containsKey(uri));
            qjp qjpVar = (qjp) map.get(uri);
            qjpVar.getClass();
            qjpVar.f189284c.m76957n();
            IOException iOException = qjpVar.f189279X;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: n */
    public final void mo34943n(k7a0 k7a0Var, long j, long j2, boolean z) {
        w2n0 w2n0Var = (w2n0) k7a0Var;
        n0a0 n0a0Var = new n0a0(w2n0Var.f247391a, w2n0Var.f247392b, j);
        nz41 nz41Var = w2n0Var.f247394d;
        n0a0Var.f148955d = nz41Var.f159997c;
        n0a0Var.f148956e = nz41Var.f159998d;
        n0a0Var.f148957f = j2;
        n0a0Var.f148958g = nz41Var.f159996b;
        o0a0 o0a0Var = new o0a0(n0a0Var);
        this.f209911c.getClass();
        this.f209914f.m96261D(o0a0Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p204p.i7a0
    /* JADX INFO: renamed from: o */
    public final zkq mo34944o(k7a0 k7a0Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        w2n0 w2n0Var = (w2n0) k7a0Var;
        n0a0 n0a0Var = new n0a0(w2n0Var.f247391a, w2n0Var.f247392b, j);
        nz41 nz41Var = w2n0Var.f247394d;
        n0a0Var.f148955d = nz41Var.f159997c;
        n0a0Var.f148956e = nz41Var.f159998d;
        n0a0Var.f148957f = j2;
        n0a0Var.f148958g = nz41Var.f159996b;
        o0a0 o0a0Var = new o0a0(n0a0Var);
        int i2 = w2n0Var.f247393c;
        this.f209911c.getClass();
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
        boolean z = jMin == -9223372036854775807L;
        this.f209914f.m96264G(o0a0Var, i2, iOException, z);
        return z ? s1e1.f204701i : new zkq(jMin, false, 0);
    }
}
