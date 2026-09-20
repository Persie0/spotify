package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ud61 {

    /* JADX INFO: renamed from: a */
    public final int f229186a;

    /* JADX INFO: renamed from: b */
    public final long f229187b;

    public ud61(int i, long j) {
        this.f229186a = i;
        this.f229187b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud61)) {
            return false;
        }
        ud61 ud61Var = (ud61) obj;
        return this.f229186a == ud61Var.f229186a && this.f229187b == ud61Var.f229187b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f229187b) + (Integer.hashCode(this.f229186a) * 31);
    }
}
