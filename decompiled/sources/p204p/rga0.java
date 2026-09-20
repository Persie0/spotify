package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rga0 extends d6a0 implements w3x0 {

    /* JADX INFO: renamed from: X */
    public di41 f198905X;

    /* JADX INFO: renamed from: Y */
    public di41 f198906Y;

    /* JADX INFO: renamed from: d */
    public final wcm f198907d;

    /* JADX INFO: renamed from: e */
    public final yfa0 f198908e;

    /* JADX INFO: renamed from: f */
    public final xjp f198909f;

    /* JADX INFO: renamed from: g */
    public final gma0 f198910g;

    /* JADX INFO: renamed from: h */
    public final c9k f198911h = kk40.m56664f();

    /* JADX INFO: renamed from: i */
    public final zv41 f198912i;

    /* JADX INFO: renamed from: t */
    public final nuu0 f198913t;

    public rga0(wcm wcmVar, yfa0 yfa0Var, xjp xjpVar, gma0 gma0Var) {
        vga0 vga0Var;
        this.f198907d = wcmVar;
        this.f198908e = yfa0Var;
        this.f198909f = xjpVar;
        this.f198910g = gma0Var;
        f251 f251Var = wcmVar.f250072c;
        vla0 vla0Var = null;
        bma0 bma0Var = f251Var instanceof bma0 ? (bma0) f251Var : null;
        if (bma0Var == null) {
            vga0Var = new vga0(vla0Var, 31);
        } else {
            String str = bma0Var.f28481a;
            vga0Var = (str == null || wl51.m88460J0(str)) ? new vga0(vla0Var, 27) : new vga0(new vla0(str, bma0Var.f28482b), 26);
        }
        zv41 zv41VarM52819d = jag1.m52819d(vga0Var);
        this.f198912i = zv41VarM52819d;
        this.f198913t = bzf1.m31021m(zv41VarM52819d);
    }

    @Override // p204p.w3x0
    /* JADX INFO: renamed from: a */
    public final void mo31963a(Bundle bundle) {
        zv41 zv41Var;
        Object value;
        uga0 uga0Var = (uga0) bundle.getParcelable("location-ui-state");
        if (uga0Var != null) {
            do {
                zv41Var = this.f198912i;
                value = zv41Var.getValue();
            } while (!zv41Var.m97089k(value, vga0.m85408a((vga0) value, uga0Var.f230058a, uga0Var.f230059b, uga0Var.f230060c, m261.f139235a, null, 16)));
            if (this.f45638b.get() != c6a0.f34467a) {
                m75474m(uga0Var.f230059b);
            }
        }
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        m35107j();
        m35106i();
        q950 q950Var = new q950(this, null, 29);
        c9k c9kVar = this.f198911h;
        x0h1.m89578u(c9kVar, null, 0, q950Var, 3);
        x0h1.m89578u(c9kVar, null, 0, new q91(this, null), 3);
        m75474m(((vga0) this.f198912i.getValue()).f241189b);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        zv41 zv41Var;
        Object value;
        vga0 vga0VarM85408a;
        qlg1.m73214s(this.f198911h.f35578a, null);
        this.f198905X = null;
        this.f198906Y = null;
        do {
            zv41Var = this.f198912i;
            value = zv41Var.getValue();
            vga0VarM85408a = (vga0) value;
            if (vga0VarM85408a.f241190c == 2) {
                vga0VarM85408a = vga0.m85408a(vga0VarM85408a, null, null, 1, null, null, 27);
            }
        } while (!zv41Var.m97089k(value, vga0VarM85408a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m75472k(ibk ibkVar) {
        pga0 pga0Var;
        Object objM93550a;
        if (ibkVar instanceof pga0) {
            pga0Var = (pga0) ibkVar;
            int i = pga0Var.f177274c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pga0Var.f177274c = i - Integer.MIN_VALUE;
            } else {
                pga0Var = new pga0(this, ibkVar);
            }
        } else {
            pga0Var = new pga0(this, ibkVar);
        }
        Object obj = pga0Var.f177272a;
        int i2 = pga0Var.f177274c;
        if (i2 == 0) {
            bga.m29073P(obj);
            pga0Var.f177274c = 1;
            objM93550a = this.f198908e.m93550a(pga0Var);
            yuk yukVar = yuk.f276404a;
            if (objM93550a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM93550a = ((s6x0) obj).f206218a;
        }
        if (objM93550a instanceof c6x0) {
            return null;
        }
        return objM93550a;
    }

    /* JADX INFO: renamed from: l */
    public final void m75473l(gh00 gh00Var, boolean z) {
        di41 di41Var = this.f198905X;
        if (di41Var == null || !di41Var.isActive()) {
            fbk fbkVar = null;
            if (z) {
                gma0 gma0Var = this.f198910g;
                kv91 kv91Var = (kv91) gma0Var.f81350a.get();
                ipg0 ipg0Var = gma0Var.f81351b;
                ipg0Var.getClass();
                yt91 yt91VarM96903c = ipg0Var.f104499b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("location_preview", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("current_location_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            }
            di41 di41VarM89578u = x0h1.m89578u(this.f198911h, null, 2, new q0a0(this, gh00Var, fbkVar, 5), 1);
            this.f198905X = di41VarM89578u;
            di41VarM89578u.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m75474m(String str) {
        di41 di41Var = this.f198906Y;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        if (str.length() == 0) {
            return;
        }
        this.f198906Y = x0h1.m89578u(this.f198911h, null, 0, new g3a0(this, str, fbkVar, 11), 3);
    }

    /* JADX INFO: renamed from: n */
    public final void m75475n(ema0 ema0Var, boolean z) {
        zv41 zv41Var;
        Object value;
        vga0 vga0Var;
        ArrayList arrayList;
        di41 di41Var;
        di41 di41Var2 = this.f198905X;
        fbk fbkVar = null;
        if (di41Var2 != null) {
            di41Var2.mo26601e(null);
        }
        this.f198905X = null;
        if (z && (di41Var = this.f198906Y) != null) {
            di41Var.mo26601e(null);
        }
        do {
            zv41Var = this.f198912i;
            value = zv41Var.getValue();
            vga0Var = (vga0) value;
            List listM46715L = h6f.m46715L(ema0Var.f60859a, ema0Var.f60860b);
            arrayList = new ArrayList();
            for (Object obj : listM46715L) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } while (!zv41Var.m97089k(value, vga0.m85408a(vga0Var, new vla0(g6f.m43753y0(arrayList, ", ", null, null, null, 62), true), z ? "" : vga0Var.f241189b, 3, z ? m261.f139235a : vga0Var.f241191d, null, 16)));
        x0h1.m89578u(this.f198911h, null, 0, new qga0(this, ema0Var, fbkVar, 1), 3);
    }

    @Override // p204p.w3x0
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        zv41 zv41Var = this.f198912i;
        bundle.putParcelable("location-ui-state", new uga0(((vga0) zv41Var.getValue()).f241188a, ((vga0) zv41Var.getValue()).f241189b, ((vga0) zv41Var.getValue()).f241190c == 2 ? 1 : ((vga0) zv41Var.getValue()).f241190c));
        return bundle;
    }
}
