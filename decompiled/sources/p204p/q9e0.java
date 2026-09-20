package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q9e0 extends h1h1 {

    /* JADX INFO: renamed from: b */
    public final String f186577b;

    /* JADX INFO: renamed from: c */
    public final boolean f186578c;

    public q9e0(String str, boolean z) {
        this.f186577b = str;
        this.f186578c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9e0)) {
            return false;
        }
        q9e0 q9e0Var = (q9e0) obj;
        return wj50.m88271j(this.f186577b, q9e0Var.f186577b) && this.f186578c == q9e0Var.f186578c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186578c) + (this.f186577b.hashCode() * 31);
    }
}
