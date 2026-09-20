package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pr4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f180493a;

    /* JADX INFO: renamed from: b */
    public final or4 f180494b;

    /* JADX INFO: renamed from: c */
    public final boolean f180495c;

    /* JADX INFO: renamed from: d */
    public final bji f180496d;

    /* JADX INFO: renamed from: e */
    public final wg61 f180497e = new wg61(new kp4(this, 27));

    public pr4(int i, or4 or4Var, boolean z, bji bjiVar) {
        this.f180493a = i;
        this.f180494b = or4Var;
        this.f180495c = z;
        this.f180496d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m70701a() {
        pr4 pr4Var = (pr4) this.f180497e.getValue();
        return pr4Var != null ? pr4Var.m70701a() : this.f180493a;
    }

    /* JADX INFO: renamed from: b */
    public final or4 m70702b() {
        or4 or4VarM70702b;
        pr4 pr4Var = (pr4) this.f180497e.getValue();
        return (pr4Var == null || (or4VarM70702b = pr4Var.m70702b()) == null) ? this.f180494b : or4VarM70702b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m70703c() {
        pr4 pr4Var = (pr4) this.f180497e.getValue();
        return pr4Var != null ? pr4Var.m70703c() : this.f180495c;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("rehearsal_port", "android-the-stage-vtec", m70701a(), 1, 49151);
        String str = m70702b().f168437a;
        or4[] or4VarArrValues = or4.values();
        ArrayList arrayList = new ArrayList(or4VarArrValues.length);
        for (or4 or4Var : or4VarArrValues) {
            arrayList.add(or4Var.f168437a);
        }
        return h6f.m46715L(k8aVar, new k8a("rehearsal_site_override", "android-the-stage-vtec", str, arrayList), new k8a("remote_debugging_enabled", "android-the-stage-vtec", m70703c()));
    }
}
