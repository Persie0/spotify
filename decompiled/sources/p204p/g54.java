package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final f54 f76582a;

    /* JADX INFO: renamed from: b */
    public final bji f76583b;

    /* JADX INFO: renamed from: c */
    public final wg61 f76584c = new wg61(new y34(this, 23));

    public g54(f54 f54Var, y9w0 y9w0Var) {
        this.f76582a = f54Var;
        this.f76583b = y9w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final f54 m43587a() {
        f54 f54VarM43587a;
        g54 g54Var = (g54) this.f76584c.getValue();
        return (g54Var == null || (f54VarM43587a = g54Var.m43587a()) == null) ? this.f76582a : f54VarM43587a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m43587a().f65932a;
        f54[] f54VarArrValues = f54.values();
        ArrayList arrayList = new ArrayList(f54VarArrValues.length);
        for (f54 f54Var : f54VarArrValues) {
            arrayList.add(f54Var.f65932a);
        }
        return geg1.m44518y(new k8a("enable_post_signup_premium_upsell_v1", "android-feature-login", str, arrayList));
    }
}
