package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cq91 extends kq91 {

    /* JADX INFO: renamed from: b */
    public final long f40801b;

    public cq91(long j) {
        super("dtms");
        this.f40801b = j;
    }

    @Override // p204p.kq91
    /* JADX INFO: renamed from: a */
    public final String mo30203a() {
        return String.valueOf(this.f40801b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq91) && this.f40801b == ((cq91) obj).f40801b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40801b);
    }
}
