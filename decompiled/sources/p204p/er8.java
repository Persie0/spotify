package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class er8 implements jr8 {

    /* JADX INFO: renamed from: a */
    public final int f62039a;

    public er8(int i) {
        this.f62039a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er8) && this.f62039a == ((er8) obj).f62039a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62039a);
    }
}
