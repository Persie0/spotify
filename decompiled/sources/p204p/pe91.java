package p204p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.trending.p166v1.TrendingLocationSignalPayload;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class pe91 implements ap80, lx41 {

    /* JADX INFO: renamed from: a */
    public final String f176674a;

    /* JADX INFO: renamed from: b */
    public final e9r f176675b;

    /* JADX INFO: renamed from: c */
    public final bga0 f176676c;

    /* JADX INFO: renamed from: d */
    public final p8o f176677d;

    /* JADX INFO: renamed from: e */
    public final z9j0 f176678e;

    /* JADX INFO: renamed from: f */
    public final skp f176679f;

    /* JADX INFO: renamed from: g */
    public final vw90 f176680g;

    /* JADX INFO: renamed from: h */
    public final luk f176681h;

    /* JADX INFO: renamed from: i */
    public final luk f176682i;

    /* JADX INFO: renamed from: j */
    public c9k f176683j;

    /* JADX INFO: renamed from: k */
    public di41 f176684k;

    /* JADX INFO: renamed from: l */
    public p7x0 f176685l;

    /* JADX INFO: renamed from: m */
    public hqb f176686m;

    /* JADX INFO: renamed from: n */
    public boolean f176687n;

    public pe91(String str, e9r e9rVar, bga0 bga0Var, p8o p8oVar, z9j0 z9j0Var, skp skpVar, vw90 vw90Var, luk lukVar, luk lukVar2) {
        this.f176674a = str;
        this.f176675b = e9rVar;
        this.f176676c = bga0Var;
        this.f176677d = p8oVar;
        this.f176678e = z9j0Var;
        this.f176679f = skpVar;
        this.f176680g = vw90Var;
        this.f176681h = lukVar;
        this.f176682i = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m69711d(pe91 pe91Var, ibk ibkVar) throws Throwable {
        oe91 oe91Var;
        if (ibkVar instanceof oe91) {
            oe91Var = (oe91) ibkVar;
            int i = oe91Var.f164389c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oe91Var.f164389c = i - Integer.MIN_VALUE;
            } else {
                oe91Var = new oe91(pe91Var, ibkVar);
            }
        } else {
            oe91Var = new oe91(pe91Var, ibkVar);
        }
        Object objM89557A = oe91Var.f164387a;
        int i2 = oe91Var.f164389c;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            oe91Var.f164389c = 1;
            objM89557A = x0h1.m89557A(pe91Var.f176682i, new xw61(pe91Var, z7r.f280273b, fbkVar, 22), oe91Var);
            if (objM89557A != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM89557A);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM89557A);
                return w2a1Var;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    bga.m29073P(objM89557A);
                    return w2a1Var;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
                return w2a1Var;
            }
            bga.m29073P(objM89557A);
        }
        if (wj50.m88271j((hga0) objM89557A, fga0.f69262a)) {
            oe91Var.f164389c = 4;
            if (pe91Var.m69713r(oe91Var) != obj) {
                return obj;
            }
            return w2a1Var;
        }
        oe91Var.f164389c = 5;
        if (pe91Var.m69712h(oe91Var) != obj) {
            return obj;
        }
        return w2a1Var;
        if (((c8r) objM89557A) != c8r.f35305a) {
            oe91Var.f164389c = 2;
            if (pe91Var.m69712h(oe91Var) != obj) {
                return w2a1Var;
            }
        } else {
            bga0 bga0Var = pe91Var.f176676c;
            ne91 ne91Var = new ne91(pe91Var, fbkVar, 1);
            oe91Var.f164389c = 3;
            objM89557A = bga0Var.m29105a("tny_load", ne91Var, oe91Var);
            if (objM89557A != obj) {
                if (wj50.m88271j((hga0) objM89557A, fga0.f69262a)) {
                    oe91Var.f164389c = 4;
                    if (pe91Var.m69713r(oe91Var) != obj) {
                        return w2a1Var;
                    }
                } else {
                    oe91Var.f164389c = 5;
                    if (pe91Var.m69712h(oe91Var) != obj) {
                        return w2a1Var;
                    }
                }
            }
        }
        return obj;
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: a */
    public final void mo26656a() {
        p7x0 p7x0Var = this.f176685l;
        if (p7x0Var != null) {
            p7x0Var.unregister();
        }
        this.f176685l = null;
        hqb hqbVar = this.f176686m;
        if (hqbVar != null) {
            hqbVar.mo42416r(null);
        }
        this.f176686m = null;
        di41 di41Var = this.f176684k;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f176684k = null;
        c9k c9kVar = this.f176683j;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f176683j = null;
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: b */
    public final void mo26657b() {
        this.f176683j = kk40.m56661c(this.f176681h);
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: e */
    public final void mo32993e(Bundle bundle) {
        this.f176687n = bundle != null ? bundle.getBoolean("tny_location_has_requested_refresh") : false;
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: f */
    public final void mo32994f(Bundle bundle) {
        bundle.putBoolean("tny_location_has_requested_refresh", this.f176687n);
    }

    /* JADX INFO: renamed from: h */
    public final Object m69712h(ibk ibkVar) throws Throwable {
        Object objM89557A = x0h1.m89557A(this.f176682i, new r611(this, null, 15), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: m */
    public final void mo26658m() {
        di41 di41Var = this.f176684k;
        di41 di41Var2 = null;
        if (di41Var != null && di41Var.mo26606t()) {
            this.f176684k = null;
        }
        if (this.f176684k == null && this.f176685l == null) {
            if (this.f176680g.m86541o() == null && this.f176687n) {
                return;
            }
            c9k c9kVar = this.f176683j;
            this.f176684k = c9kVar != null ? x0h1.m89578u(c9kVar, null, 0, new wm81(this, di41Var2, 7), 3) : null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m69713r(ibk ibkVar) {
        le91 le91Var;
        if (ibkVar instanceof le91) {
            le91Var = (le91) ibkVar;
            int i = le91Var.f132495c;
            if ((i & Integer.MIN_VALUE) != 0) {
                le91Var.f132495c = i - Integer.MIN_VALUE;
            } else {
                le91Var = new le91(this, ibkVar);
            }
        } else {
            le91Var = new le91(this, ibkVar);
        }
        Object obj = le91Var.f132493a;
        int i2 = le91Var.f132495c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
                ((s6x0) obj).getClass();
                return w2a1Var;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        ccc0 ccc0VarM86541o = this.f176680g.m86541o();
        Object obj2 = yuk.f276404a;
        if (ccc0VarM86541o == null) {
            le91Var.f132495c = 2;
            if (m69714s(le91Var) == obj2) {
                return obj2;
            }
            return w2a1Var;
        }
        ge91 ge91VarM21857r = TrendingLocationSignalPayload.m21857r();
        ge91VarM21857r.m44459m(ccc0VarM86541o.f36378a);
        ge91VarM21857r.m44462s(ccc0VarM86541o.f36379b);
        ge91VarM21857r.m44460q(ccc0VarM86541o.f36380c);
        TrendingLocationSignalPayload trendingLocationSignalPayload = (TrendingLocationSignalPayload) ge91VarM21857r.build();
        wj50.m88279p(trendingLocationSignalPayload);
        le91Var.f132495c = 1;
        if (this.f176679f.m78380d(this.f176674a, trendingLocationSignalPayload, le91Var) == obj2) {
            return obj2;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m69714s(ibk ibkVar) {
        me91 me91Var;
        if (ibkVar instanceof me91) {
            me91Var = (me91) ibkVar;
            int i = me91Var.f142642c;
            if ((i & Integer.MIN_VALUE) != 0) {
                me91Var.f142642c = i - Integer.MIN_VALUE;
            } else {
                me91Var = new me91(this, ibkVar);
            }
        } else {
            me91Var = new me91(this, ibkVar);
        }
        Object objM38260c = me91Var.f142640a;
        int i2 = me91Var.f142642c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM38260c);
            this.f176687n = true;
            me91Var.f142642c = 1;
            objM38260c = this.f176675b.m38260c(30000L, "tny_load", me91Var);
            if (objM38260c != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM38260c);
            ((s6x0) objM38260c).getClass();
            return w2a1Var;
        }
        bga.m29073P(objM38260c);
        b9r b9rVar = (b9r) objM38260c;
        if (b9rVar instanceof a9r) {
            Logger.m3969e("TNY: Device location refreshed and written", new Object[0]);
            ge91 ge91VarM21857r = TrendingLocationSignalPayload.m21857r();
            ge91VarM21857r.m44461r();
            TrendingLocationSignalPayload trendingLocationSignalPayload = (TrendingLocationSignalPayload) ge91VarM21857r.build();
            wj50.m88279p(trendingLocationSignalPayload);
            me91Var.f142642c = 2;
            return this.f176679f.m78380d(this.f176674a, trendingLocationSignalPayload, me91Var) == yukVar ? yukVar : w2a1Var;
        }
        if (b9rVar instanceof z8r) {
            Logger.m3969e("TNY: Device location refreshed but write failed: %s", kfe1.f122154a);
            return w2a1Var;
        }
        if ((b9rVar instanceof u8r) || (b9rVar instanceof t8r) || (b9rVar instanceof x8r)) {
            Logger.m3969e("TNY: Unexpected result after consent acquired: %s", b9rVar);
            return w2a1Var;
        }
        if (b9rVar instanceof w8r) {
            Logger.m3969e("TNY: Location services disabled", new Object[0]);
            return w2a1Var;
        }
        if (b9rVar instanceof y8r) {
            Logger.m3969e("TNY: Location request timed out", new Object[0]);
            return w2a1Var;
        }
        if (!(b9rVar instanceof v8r)) {
            throw new NoWhenBranchMatchedException();
        }
        Logger.m3969e("TNY: Location fetch failed: %s", ((v8r) b9rVar).f238647a);
        return w2a1Var;
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: n */
    public final void mo26659n() {
    }
}
