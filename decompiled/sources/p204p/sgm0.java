package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class sgm0 implements hc80, ijc1 {

    /* JADX INFO: renamed from: X */
    public boolean f208894X;

    /* JADX INFO: renamed from: a */
    public final hjc1 f208895a;

    /* JADX INFO: renamed from: b */
    public final f2m0 f208896b;

    /* JADX INFO: renamed from: c */
    public final hjc1 f208897c;

    /* JADX INFO: renamed from: d */
    public final hc80 f208898d;

    /* JADX INFO: renamed from: e */
    public final hc80 f208899e;

    /* JADX INFO: renamed from: f */
    public final wg61 f208900f;

    /* JADX INFO: renamed from: g */
    public final String f208901g;

    /* JADX INFO: renamed from: h */
    public final t6m0 f208902h;

    /* JADX INFO: renamed from: i */
    public boolean f208903i;

    /* JADX INFO: renamed from: t */
    public boolean f208904t;

    public sgm0(tgm0 tgm0Var, rfm0 rfm0Var, Parcelable parcelable, eh00 eh00Var, Bundle bundle, gb80 gb80Var, Object obj, hjc1 hjc1Var, int i) {
        String string;
        a6j a6jVarM30830g;
        gb80 gb80Var2 = (i & 32) != 0 ? null : gb80Var;
        Object obj2 = (i & 64) != 0 ? w2a1.f247311a : obj;
        hjc1 hjc1Var2 = (i & 128) != 0 ? null : hjc1Var;
        this.f208895a = hjc1Var2;
        f2m0 f2m0Var = new f2m0();
        this.f208896b = f2m0Var;
        oc80 oc80Var = f2m0Var.f65214a;
        hc80 hc80Var = f2m0Var;
        if (gb80Var2 != null) {
            a6jVarM30830g = bxg1.m30830g(oc80Var, gb80Var2);
        }
        if (hjc1Var2 == null) {
            hc80Var = a6jVarM30830g;
            hjc1Var2 = new hjc1();
        }
        hc80Var = a6jVarM30830g;
        this.f208897c = hjc1Var2;
        y641 y641VarM49322D = i091.m49322D(hc80Var);
        hc80 hc80VarM92946b = y641VarM49322D.m92946b();
        this.f208898d = hc80VarM92946b;
        this.f208899e = y641VarM49322D.m92945a();
        ((f2m0) hc80VarM92946b).f65214a.mo31986a(new qgm0(this));
        this.f208900f = new wg61(new rgm0(rfm0Var, eh00Var, this, tgm0Var, parcelable, obj2));
        this.f208901g = (bundle == null || (string = bundle.getString("page-id")) == null) ? UUID.randomUUID().toString() : string;
        m78106b().mo46731a(bundle != null ? bundle.getBundle("instrumentation-state") : null);
        oc80Var.m66678i(fb80.f67751b);
        m78106b().mo46732b(sbm0.f207526e);
        this.f208902h = m78107c().mo24327b().mo34969k(m78108d().f68154h, bundle != null ? bundle.getBundle("datasource-state") : null);
        m78106b().mo46732b(rbm0.f197636e);
        oc80Var.m66678i(fb80.f67752c);
        this.f208903i = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m78105a() {
        this.f208894X = true;
        m78111g();
        fcm0 fcm0VarM78108d = m78108d();
        fcm0VarM78108d.f68151e.dispose();
        fcm0VarM78108d.m41328a().dispose();
        this.f208896b.f65214a.m66678i(fb80.f67750a);
    }

    /* JADX INFO: renamed from: b */
    public final obm0 m78106b() {
        return m78108d().m41328a();
    }

    /* JADX INFO: renamed from: c */
    public final r4m0 m78107c() {
        return m78108d().m41329b();
    }

    /* JADX INFO: renamed from: d */
    public final fcm0 m78108d() {
        return (fcm0) this.f208900f.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m78109e() {
        return pp91.m70529j(pft0.m69840u("page-id", this.f208901g), pft0.m69840u("datasource-state", this.f208902h.mo40418n().serialize()), pft0.m69840u("instrumentation-state", m78106b().mo46733d()));
    }

    /* JADX INFO: renamed from: f */
    public final void m78110f() {
        if (this.f208894X) {
            throw new IllegalStateException("Can't restart a page runtime after it has been destroyed");
        }
        if (this.f208903i) {
            this.f208903i = false;
            m78106b().mo46732b(ubm0.f228826e);
        }
        if (this.f208904t) {
            return;
        }
        this.f208896b.f65214a.m66678i(fb80.f67754e);
        this.f208902h.mo40418n().getState().m33099f(this, new ccf0(this, 4));
        this.f208904t = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m78111g() {
        if (this.f208904t) {
            this.f208896b.f65214a.m66678i(fb80.f67752c);
            this.f208904t = false;
        }
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f208899e.getLifecycle();
    }

    @Override // p204p.ijc1
    /* JADX INFO: renamed from: w */
    public final hjc1 mo34134w() {
        return this.f208897c;
    }
}
