package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n260 implements p260 {

    /* JADX INFO: renamed from: a */
    public final int f149650a;

    public n260(int i) {
        this.f149650a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n260) && this.f149650a == ((n260) obj).f149650a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f149650a);
    }
}
