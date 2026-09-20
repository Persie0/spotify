package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rpe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f201569a;

    /* JADX INFO: renamed from: b */
    public final lzu0 f201570b;

    public rpe0(String str, lzu0 lzu0Var) {
        this.f201569a = str;
        this.f201570b = lzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpe0)) {
            return false;
        }
        rpe0 rpe0Var = (rpe0) obj;
        return wj50.m88271j(this.f201569a, rpe0Var.f201569a) && this.f201570b == rpe0Var.f201570b;
    }

    public final int hashCode() {
        return this.f201570b.hashCode() + (this.f201569a.hashCode() * 31);
    }
}
