package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v1g0 {

    /* JADX INFO: renamed from: a */
    public final hv31 f236363a;

    /* JADX INFO: renamed from: b */
    public final fk60 f236364b;

    public v1g0(hv31 hv31Var, fk60 fk60Var) {
        this.f236363a = hv31Var;
        this.f236364b = fk60Var;
    }

    /* JADX INFO: renamed from: a */
    public final u1g0 m84463a() {
        String strMo48710e = this.f236363a.mo48710e(w1g0.f247098a, null);
        if (strMo48710e != null) {
            u1g0 u1g0Var = (u1g0) this.f236364b.m41880a(strMo48710e, u1g0.Companion.serializer());
            if (u1g0Var != null) {
                return u1g0Var;
            }
        }
        return new u1g0(0, gbu.f78413a);
    }
}
