package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qi9 {

    /* JADX INFO: renamed from: a */
    public final yc8 f188963a;

    /* JADX INFO: renamed from: b */
    public final long f188964b;

    public qi9(yc8 yc8Var, long j) {
        this.f188963a = yc8Var;
        this.f188964b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi9)) {
            return false;
        }
        qi9 qi9Var = (qi9) obj;
        return wj50.m88271j(this.f188963a, qi9Var.f188963a) && this.f188964b == qi9Var.f188964b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f188964b) + (this.f188963a.hashCode() * 31);
    }
}
