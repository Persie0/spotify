package p204p;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0b1 implements zw10 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m0b1 f128356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f128357b;

    public /* synthetic */ l0b1(m0b1 m0b1Var, String str) {
        this.f128356a = m0b1Var;
        this.f128357b = str;
    }

    @Override // p204p.zw10
    /* JADX INFO: renamed from: a */
    public final void mo41049a(gx10 gx10Var) {
        JSONObject jSONObject = gx10Var.f85148d;
        e8y e8yVar = gx10Var.f85147c;
        m0b1 m0b1Var = this.f128356a;
        if (e8yVar != null) {
            m0b1Var.mo60459d(e8yVar.f57312i);
        } else {
            if (jSONObject == null) {
                throw new IllegalStateException("Required value was null.");
            }
            gxr0.f85326a.put(this.f128357b, jSONObject);
            m0b1Var.mo60458c(jSONObject);
        }
    }
}
