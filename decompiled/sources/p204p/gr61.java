package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gr61 extends hpg1 {

    /* JADX INFO: renamed from: c */
    public final int f83673c;

    public gr61(int i) {
        this.f83673c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr61) && this.f83673c == ((gr61) obj).f83673c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83673c);
    }
}
