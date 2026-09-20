package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zti0 {

    /* JADX INFO: renamed from: a */
    public final int f286192a;

    /* JADX INFO: renamed from: b */
    public final String f286193b;

    /* JADX INFO: renamed from: c */
    public final String f286194c;

    /* JADX INFO: renamed from: d */
    public final boolean f286195d;

    public zti0(String str, int i, String str2, boolean z) {
        this.f286192a = i;
        this.f286193b = str;
        this.f286194c = str2;
        this.f286195d = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m96934a() {
        return this.f286192a;
    }

    /* JADX INFO: renamed from: b */
    public final String m96935b() {
        return this.f286193b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zti0)) {
            return false;
        }
        zti0 zti0Var = (zti0) obj;
        return this.f286192a == zti0Var.f286192a && wj50.m88271j(this.f286193b, zti0Var.f286193b) && this.f286194c.equals(zti0Var.f286194c) && this.f286195d == zti0Var.f286195d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286195d) + s571.m77243b(s571.m77243b(edb.m38547C(this.f286192a) * 31, 31, this.f286193b), 31, this.f286194c);
    }
}
