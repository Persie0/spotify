package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ijj0 {

    /* JADX INFO: renamed from: a */
    public final String f102814a;

    /* JADX INFO: renamed from: b */
    public final int f102815b;

    public ijj0(String str, int i) {
        this.f102814a = str;
        this.f102815b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijj0)) {
            return false;
        }
        ijj0 ijj0Var = (ijj0) obj;
        return this.f102814a.equals(ijj0Var.f102814a) && this.f102815b == ijj0Var.f102815b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f102815b) + (this.f102814a.hashCode() * 31);
    }
}
