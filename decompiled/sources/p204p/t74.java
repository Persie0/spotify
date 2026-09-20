package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final s74 f217672a;

    /* JADX INFO: renamed from: b */
    public final boolean f217673b;

    /* JADX INFO: renamed from: c */
    public final boolean f217674c;

    /* JADX INFO: renamed from: d */
    public final boolean f217675d;

    /* JADX INFO: renamed from: e */
    public final bji f217676e;

    /* JADX INFO: renamed from: f */
    public final wg61 f217677f = new wg61(new f74(this, 11));

    public t74(s74 s74Var, boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f217672a = s74Var;
        this.f217673b = z;
        this.f217674c = z2;
        this.f217675d = z3;
        this.f217676e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final s74 m80178a() {
        s74 s74VarM80178a;
        t74 t74Var = (t74) this.f217677f.getValue();
        return (t74Var == null || (s74VarM80178a = t74Var.m80178a()) == null) ? this.f217672a : s74VarM80178a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80179b() {
        t74 t74Var = (t74) this.f217677f.getValue();
        return t74Var != null ? t74Var.m80179b() : this.f217673b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m80180c() {
        t74 t74Var = (t74) this.f217677f.getValue();
        return t74Var != null ? t74Var.m80180c() : this.f217674c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m80181d() {
        t74 t74Var = (t74) this.f217677f.getValue();
        return t74Var != null ? t74Var.m80181d() : this.f217675d;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m80178a().f206272a;
        s74[] s74VarArrValues = s74.values();
        ArrayList arrayList = new ArrayList(s74VarArrValues.length);
        for (s74 s74Var : s74VarArrValues) {
            arrayList.add(s74Var.f206272a);
        }
        return h6f.m46715L(new k8a("data_source_behavior", "android-feature-version-sunsetting", str, arrayList), new k8a("dialog_can_be_blocking", "android-feature-version-sunsetting", m80179b()), new k8a("dialog_enabled", "android-feature-version-sunsetting", m80180c()), new k8a("player_observer_enabled", "android-feature-version-sunsetting", m80181d()));
    }
}
