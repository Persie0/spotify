package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v3q0 extends c4q0 {

    /* JADX INFO: renamed from: a */
    public final String f236925a;

    /* JADX INFO: renamed from: b */
    public final String f236926b;

    public v3q0(String str, String str2) {
        this.f236925a = str;
        this.f236926b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3q0)) {
            return false;
        }
        v3q0 v3q0Var = (v3q0) obj;
        return wj50.m88271j(this.f236925a, v3q0Var.f236925a) && wj50.m88271j(this.f236926b, v3q0Var.f236926b);
    }

    public final int hashCode() {
        return this.f236926b.hashCode() + (this.f236925a.hashCode() * 31);
    }
}
