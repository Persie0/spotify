package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q4v0 {

    /* JADX INFO: renamed from: a */
    public final String f185353a;

    /* JADX INFO: renamed from: b */
    public final String f185354b;

    public q4v0(String str, String str2) {
        this.f185353a = str;
        this.f185354b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4v0)) {
            return false;
        }
        q4v0 q4v0Var = (q4v0) obj;
        return wj50.m88271j(this.f185353a, q4v0Var.f185353a) && wj50.m88271j(this.f185354b, q4v0Var.f185354b);
    }

    public final int hashCode() {
        return this.f185354b.hashCode() + (this.f185353a.hashCode() * 31);
    }
}
