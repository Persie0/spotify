package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qh2 {

    /* JADX INFO: renamed from: a */
    public final int f188601a;

    public qh2(int i) {
        this.f188601a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh2) && this.f188601a == ((qh2) obj).f188601a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188601a);
    }
}
