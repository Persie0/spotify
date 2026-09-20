package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ux9 {

    /* JADX INFO: renamed from: a */
    public final mzq f234847a;

    /* JADX INFO: renamed from: b */
    public final th1 f234848b;

    /* JADX INFO: renamed from: c */
    public final String f234849c;

    public ux9(mzq mzqVar, th1 th1Var, String str) {
        this.f234847a = mzqVar;
        this.f234848b = th1Var;
        this.f234849c = str;
    }

    /* JADX INFO: renamed from: a */
    public static ux9 m84141a(ux9 ux9Var, th1 th1Var, String str, int i) {
        mzq mzqVar = ux9Var.f234847a;
        if ((i & 4) != 0) {
            str = ux9Var.f234849c;
        }
        ux9Var.getClass();
        return new ux9(mzqVar, th1Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux9)) {
            return false;
        }
        ux9 ux9Var = (ux9) obj;
        return this.f234847a == ux9Var.f234847a && wj50.m88271j(this.f234848b, ux9Var.f234848b) && wj50.m88271j(this.f234849c, ux9Var.f234849c);
    }

    public final int hashCode() {
        int iHashCode = (this.f234848b.hashCode() + (this.f234847a.hashCode() * 31)) * 31;
        String str = this.f234849c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ ux9(mzq mzqVar) {
        this(mzqVar, f2u.f65265h, null);
    }
}
