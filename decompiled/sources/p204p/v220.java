package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v220 {

    /* JADX INFO: renamed from: a */
    public final boolean f236525a;

    /* JADX INFO: renamed from: b */
    public final String f236526b;

    /* JADX INFO: renamed from: c */
    public final qf40 f236527c;

    public v220(String str, qf40 qf40Var, boolean z) {
        this.f236525a = z;
        this.f236526b = str;
        this.f236527c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v220)) {
            return false;
        }
        v220 v220Var = (v220) obj;
        return this.f236525a == v220Var.f236525a && wj50.m88271j(this.f236526b, v220Var.f236526b) && wj50.m88271j(this.f236527c, v220Var.f236527c);
    }

    public final int hashCode() {
        return this.f236527c.hashCode() + s571.m77243b(Boolean.hashCode(this.f236525a) * 31, 31, this.f236526b);
    }
}
