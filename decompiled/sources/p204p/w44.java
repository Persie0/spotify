package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f247698a;

    /* JADX INFO: renamed from: b */
    public final u44 f247699b;

    /* JADX INFO: renamed from: c */
    public final boolean f247700c;

    /* JADX INFO: renamed from: d */
    public final boolean f247701d;

    /* JADX INFO: renamed from: e */
    public final bji f247702e;

    /* JADX INFO: renamed from: f */
    public final wg61 f247703f;

    public w44(boolean z, u44 u44Var, boolean z2, boolean z3, bji bjiVar) {
        this.f247698a = z;
        this.f247699b = u44Var;
        this.f247700c = z2;
        this.f247701d = z3;
        this.f247702e = bjiVar;
        this.f247703f = new wg61(new f30(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87121a() {
        w44 w44Var = (w44) this.f247703f.getValue();
        return w44Var != null ? w44Var.m87121a() : this.f247698a;
    }

    /* JADX INFO: renamed from: b */
    public final u44 m87122b() {
        u44 u44VarM87122b;
        w44 w44Var = (w44) this.f247703f.getValue();
        return (w44Var == null || (u44VarM87122b = w44Var.m87122b()) == null) ? this.f247699b : u44VarM87122b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87123c() {
        w44 w44Var = (w44) this.f247703f.getValue();
        return w44Var != null ? w44Var.m87123c() : this.f247700c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m87124d() {
        w44 w44Var = (w44) this.f247703f.getValue();
        return w44Var != null ? w44Var.m87124d() : this.f247701d;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("personalized_recommendations_redirect_enabled", "android-feature-dsa", m87121a());
        String str = m87122b().f226577a;
        u44[] u44VarArrValues = u44.values();
        ArrayList arrayList = new ArrayList(u44VarArrValues.length);
        for (u44 u44Var : u44VarArrValues) {
            arrayList.add(u44Var.f226577a);
        }
        return h6f.m46715L(k8aVar, new k8a("personalized_recommendations_sheets_copy", "android-feature-dsa", str, arrayList), new k8a("personalized_recommendations_toggle_enabled", "android-feature-dsa", m87123c()), new k8a("should_display_empty_state", "android-feature-dsa", m87124d()));
    }

    public w44(bji bjiVar) {
        this(false, u44.V3, false, true, bjiVar);
    }
}
