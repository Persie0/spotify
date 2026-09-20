package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class us5 implements vs5 {

    /* JADX INFO: renamed from: a */
    public final long f233527a;

    public us5(long j) {
        this.f233527a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us5) && this.f233527a == ((us5) obj).f233527a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f233527a);
    }
}
