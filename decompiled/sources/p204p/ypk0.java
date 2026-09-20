package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ypk0 {

    /* JADX INFO: renamed from: a */
    public final long f274985a;

    /* JADX INFO: renamed from: b */
    public final long f274986b;

    public ypk0(long j, long j2) {
        this.f274985a = j;
        this.f274986b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypk0)) {
            return false;
        }
        ypk0 ypk0Var = (ypk0) obj;
        return this.f274985a == ypk0Var.f274985a && this.f274986b == ypk0Var.f274986b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f274986b) + (Long.hashCode(this.f274985a) * 31);
    }
}
