package p204p;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class ya70 implements ap80, lx41 {

    /* JADX INFO: renamed from: h */
    public static final tjo f270821h;

    /* JADX INFO: renamed from: i */
    public static final tjo f270822i;

    /* JADX INFO: renamed from: j */
    public static final tjo f270823j;

    /* JADX INFO: renamed from: k */
    public static final ns5 f270824k;

    /* JADX INFO: renamed from: a */
    public final pgo f270825a;

    /* JADX INFO: renamed from: b */
    public final kq80 f270826b;

    /* JADX INFO: renamed from: c */
    public final se4 f270827c;

    /* JADX INFO: renamed from: d */
    public boolean f270828d;

    /* JADX INFO: renamed from: e */
    public di41 f270829e;

    /* JADX INFO: renamed from: f */
    public guf f270830f;

    /* JADX INFO: renamed from: g */
    public final c9k f270831g;

    static {
        jqv0 jqv0Var = qpv0.f191387a;
        f270821h = pag1.m69487w(new rko(new txr(jqv0Var.mo54112b(v140.class)), 1, p470.f173848Y0, new pko(p470.f173842U0), p470.f173850Z0), p470.f173843V0);
        f270822i = pag1.m69487w(new rko(new txr(jqv0Var.mo54112b(erc1.class)), 1, p470.f173851a1, new pko(p470.f173844W0), p470.f173853b1), p470.f173846X0);
        f270823j = pag1.m69487w(new rko(new txr(jqv0Var.mo54112b(daj.class)), 1, p470.f173855c1, new pko(p470.f173840S0), xa70.f259606b), p470.f173841T0);
        f270824k = ns5.f157673k;
    }

    public ya70(pgo pgoVar, kq80 kq80Var, luk lukVar, se4 se4Var) {
        this.f270825a = pgoVar;
        this.f270826b = kq80Var;
        this.f270827c = se4Var;
        this.f270831g = AbstractC0000a.m16o(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Serializable m93205d(ya70 ya70Var, int i, ibk ibkVar) {
        va70 va70Var;
        if (ibkVar instanceof va70) {
            va70Var = (va70) ibkVar;
            int i2 = va70Var.f239135d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                va70Var.f239135d = i2 - Integer.MIN_VALUE;
            } else {
                va70Var = new va70(ya70Var, ibkVar);
            }
        } else {
            va70Var = new va70(ya70Var, ibkVar);
        }
        Object objM86756u = va70Var.f239133b;
        int i3 = va70Var.f239135d;
        if (i3 == 0) {
            bga.m29073P(objM86756u);
            kmx kmxVarM81305c = ((tq80) ya70Var.f270826b).m81305c();
            f3q f3qVar = new f3q(i, null, 23, false);
            va70Var.f239132a = i;
            va70Var.f239135d = 1;
            objM86756u = vyf1.m86756u(kmxVarM81305c, f3qVar, va70Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = va70Var.f239132a;
            bga.m29073P(objM86756u);
        }
        t5a0 t5a0Var = (t5a0) objM86756u;
        if (t5a0Var.f217255a == 0) {
            return lau.f131415a;
        }
        List listM43714b1 = g6f.m43714b1(t5a0Var.f217256b, i);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM43714b1, 10));
        Iterator it = listM43714b1.iterator();
        while (it.hasNext()) {
            arrayList.add(((s5a0) it.next()).getUri());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final void m93206h(ya70 ya70Var, int i, guf gufVar, ibk ibkVar) {
        wa70 wa70Var;
        if (ibkVar instanceof wa70) {
            wa70Var = (wa70) ibkVar;
            int i2 = wa70Var.f249411c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wa70Var.f249411c = i2 - Integer.MIN_VALUE;
            } else {
                wa70Var = new wa70(ya70Var, ibkVar);
            }
        } else {
            wa70Var = new wa70(ya70Var, ibkVar);
        }
        Object obj = wa70Var.f249409a;
        int i3 = wa70Var.f249411c;
        if (i3 == 0) {
            bga.m29073P(obj);
            q91 q91Var = new q91(ya70Var, i, gufVar, (fbk) null);
            wa70Var.f249411c = 1;
            if (kk40.m56684z(q91Var, wa70Var) == yuk.f276404a) {
                return;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: a */
    public final void mo26656a() {
        di41 di41Var = this.f270829e;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f270829e = null;
        this.f270830f = null;
        kk40.m56680v(this.f270831g, null);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: b */
    public final void mo26657b() {
        se4 se4Var = this.f270827c;
        if (se4Var.m77882b() > 0 && se4Var.m77881a() > 0 && !this.f270828d) {
            this.f270828d = true;
            guf gufVarM62210c = mlg1.m62210c();
            this.f270830f = gufVarM62210c;
            this.f270829e = x0h1.m89578u(this.f270831g, null, 0, new n860(this, gufVarM62210c, (fbk) null, 3), 3);
        }
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: e */
    public final void mo32993e(Bundle bundle) {
        this.f270828d = bundle != null ? bundle.getBoolean("kodiak_prefetch_has_prefetched") : false;
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: f */
    public final void mo32994f(Bundle bundle) {
        bundle.putBoolean("kodiak_prefetch_has_prefetched", this.f270828d);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: o */
    public final Object mo26660o(bya0 bya0Var) {
        guf gufVar;
        int iM77882b = this.f270827c.m77882b();
        if (iM77882b <= 0 || (gufVar = this.f270830f) == null) {
            return w2a1.f247311a;
        }
        hvi0 hvi0Var = cks.f39079b;
        return s1h1.m76981v(jwg1.m54449D(iM77882b, ils.MILLISECONDS), new s47(gufVar, null, 5), bya0Var);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: m */
    public final void mo26658m() {
    }
}
