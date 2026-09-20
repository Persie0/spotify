package p204p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class v5p0 implements g261, cvb0 {

    /* JADX INFO: renamed from: L0 */
    public static final Set f237554L0 = s601.m77310m0("watchfeed", "lyrics", "settings");

    /* JADX INFO: renamed from: X */
    public sr31 f237555X;

    /* JADX INFO: renamed from: Y */
    public di41 f237556Y;

    /* JADX INFO: renamed from: Z */
    public final zv41 f237557Z;

    /* JADX INFO: renamed from: a */
    public final uer f237558a;

    /* JADX INFO: renamed from: b */
    public final mb80 f237559b;

    /* JADX INFO: renamed from: c */
    public final zcp f237560c;

    /* JADX INFO: renamed from: d */
    public final dj70 f237561d;

    /* JADX INFO: renamed from: e */
    public final Flowable f237562e;

    /* JADX INFO: renamed from: f */
    public final a24 f237563f;

    /* JADX INFO: renamed from: g */
    public final b161 f237564g;

    /* JADX INFO: renamed from: h */
    public final b141 f237565h;

    /* JADX INFO: renamed from: i */
    public final c9k f237566i;

    /* JADX INFO: renamed from: t */
    public final zv41 f237567t;

    public v5p0(uer uerVar, mb80 mb80Var, zcp zcpVar, dj70 dj70Var, Flowable flowable, a24 a24Var, b161 b161Var, b141 b141Var, luk lukVar) {
        this.f237558a = uerVar;
        this.f237559b = mb80Var;
        this.f237560c = zcpVar;
        this.f237561d = dj70Var;
        this.f237562e = flowable;
        this.f237563f = a24Var;
        this.f237564g = b161Var;
        this.f237565h = b141Var;
        this.f237566i = edb.m38577z(lukVar);
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f237567t = zv41VarM52819d;
        this.f237557Z = zv41VarM52819d;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX INFO: renamed from: i */
    public static final Object m84741i(v5p0 v5p0Var, ibk ibkVar) {
        s5p0 s5p0Var;
        String str;
        pqm0 pqm0VarM69840u;
        a24 a24Var = v5p0Var.f237563f;
        b141 b141Var = v5p0Var.f237565h;
        if (ibkVar instanceof s5p0) {
            s5p0Var = (s5p0) ibkVar;
            int i = s5p0Var.f205884d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5p0Var.f205884d = i - Integer.MIN_VALUE;
            } else {
                s5p0Var = new s5p0(v5p0Var, ibkVar);
            }
        } else {
            s5p0Var = new s5p0(v5p0Var, ibkVar);
        }
        s5p0 s5p0Var2 = s5p0Var;
        Object objM82914g = s5p0Var2.f205882b;
        String str2 = s5p0Var2.f205884d;
        try {
            if (str2 == 0) {
                bga.m29073P(objM82914g);
                int iOrdinal = a24Var.m24488d().ordinal();
                if (iOrdinal == 0) {
                    str = "smart_control_nudge";
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "bottom_sheet_nudge";
                }
                String str3 = str;
                b141Var.m27884q(new o161("playback", str3));
                uer uerVar = v5p0Var.f237558a;
                Long lM74181K = qyg1.m74181K(5000L);
                jfo0 jfo0Var = new jfo0(v5p0Var, 24);
                s5p0Var2.f205881a = str3;
                s5p0Var2.f205884d = 1;
                objM82914g = uerVar.m82914g("playback_trigger", ddr.f47852a, lM74181K, jfo0Var, s5p0Var2);
                yuk yukVar = yuk.f276404a;
                str2 = str3;
                if (objM82914g == yukVar) {
                    return yukVar;
                }
            } else {
                if (str2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str4 = s5p0Var2.f205881a;
                bga.m29073P(objM82914g);
                str2 = str4;
            }
            qcr qcrVar = (qcr) objM82914g;
            w2a1 w2a1Var = w2a1.f247311a;
            if (qcrVar == null) {
                b141Var.m27884q(new n161("playback", str2, null, "BACKEND_NO_SUGGESTION"));
                return w2a1Var;
            }
            int iM38547C = edb.m38547C(qcrVar.mo66722a());
            y14 y14Var = y14.LOW;
            boolean zContains = false;
            if (iM38547C != 0) {
                if (iM38547C == 1) {
                    zContains = h6f.m46715L(y14Var, y14.MID).contains(a24Var.m24486b());
                } else if (iM38547C == 2) {
                    zContains = true;
                } else if (iM38547C != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (a24Var.m24486b() == y14Var) {
                zContains = true;
            }
            if (!zContains) {
                Objects.toString(a24Var.m24486b());
                b141Var.m27884q(new n161("playback", str2, qcrVar.mo66725d(), "BELOW_CONFIDENCE_THRESHOLD"));
                return w2a1Var;
            }
            if (!v5p0Var.m84742j()) {
                b141Var.m27884q(new n161("playback", str2, qcrVar.mo66725d(), "INELIGIBLE"));
                return w2a1Var;
            }
            int iOrdinal2 = a24Var.m24488d().ordinal();
            if (iOrdinal2 == 0) {
                pqm0VarM69840u = pft0.m69840u(nw21.f159008a, kkc0.m56695h0(pft0.m69840u("instrumentationId", wgg0.PLAYBACK_DEVICE_PREDICTABILITY), pft0.m69840u("dismissTimeout", Long.valueOf(a24Var.m24487c()))));
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                pqm0VarM69840u = pft0.m69840u(gea.f79065a, c95.m31821M(pft0.m69840u("instrumentationId", ymg0.PLAYBACK_DEVICE_PREDICTABILITY)));
            }
            d061 d061Var = new d061(qcrVar, (Map) pqm0VarM69840u.f180351b, (f261) pqm0VarM69840u.f180350a);
            d061Var.m34526b().getClass();
            b141Var.m27884q(new k161("playback", d061Var.m34526b().mo40579a(), qcrVar.mo66725d(), qhg1.m72835z(qcrVar.mo66722a())));
            zv41 zv41Var = v5p0Var.f237567t;
            zv41Var.getClass();
            zv41Var.m97091m(null, d061Var);
            return w2a1Var;
        } catch (r5p0 e) {
            b141Var.m27884q(new h161("playback", str2, e.m74821a()));
            throw e;
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        if (this.f237563f.m24485a()) {
            this.f237555X = this.f237564g.m27891c(this);
            x0h1.m89578u(this.f237566i, null, 0, new t5p0(this, null, 0), 3);
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        di41 di41Var = this.f237556Y;
        if (di41Var != null) {
            di41Var.mo38779R(new r5p0("UI_HIDDEN"));
        }
        qlg1.m73215t(this.f237566i.f35578a);
        this.f237567t.m97090l(null);
        this.f237556Y = null;
        sr31 sr31Var = this.f237555X;
        if (sr31Var != null) {
            sr31Var.m78990d();
        }
        this.f237555X = null;
    }

    @Override // p204p.g261
    /* JADX INFO: renamed from: e */
    public final String mo43371e() {
        return "playback";
    }

    @Override // p204p.g261
    /* JADX INFO: renamed from: f */
    public final zv41 mo43372f() {
        return this.f237557Z;
    }

    @Override // p204p.g261
    /* JADX INFO: renamed from: h */
    public final void mo43373h(a161 a161Var) {
        a161Var.toString();
        if ((a161Var instanceof w061) || (a161Var instanceof y061)) {
            this.f237567t.m97090l(null);
        } else if (!(a161Var instanceof x061) && !(a161Var instanceof z061)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m84742j() {
        String str;
        if (this.f237559b.f141817b.current().getValue() == null && !((Boolean) this.f237560c.f281556b.getValue()).booleanValue()) {
            ocm0 ocm0VarMo32928a = this.f237561d.mo32928a(null);
            if (ocm0VarMo32928a == null || (str = ocm0VarMo32928a.f163961c) == null) {
                return true;
            }
            Set set = f237554L0;
            if ((set instanceof Collection) && set.isEmpty()) {
                return true;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (bm51.m29803n0(str, (String) it.next(), false)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
    }
}
