package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class swk0 {

    /* JADX INFO: renamed from: a */
    public final String f214682a;

    /* JADX INFO: renamed from: b */
    public final rwk0 f214683b;

    /* JADX INFO: renamed from: c */
    public final long f214684c;

    public swk0(String str, rwk0 rwk0Var, long j) {
        this.f214682a = str;
        this.f214683b = rwk0Var;
        this.f214684c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swk0)) {
            return false;
        }
        swk0 swk0Var = (swk0) obj;
        return wj50.m88271j(this.f214682a, swk0Var.f214682a) && this.f214683b == swk0Var.f214683b && this.f214684c == swk0Var.f214684c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214684c) + ((this.f214683b.hashCode() + (this.f214682a.hashCode() * 31)) * 31);
    }
}
