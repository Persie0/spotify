package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w441 extends y441 {

    /* JADX INFO: renamed from: a */
    public final int f247704a;

    public w441(int i) {
        this.f247704a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w441) && this.f247704a == ((w441) obj).f247704a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f247704a);
    }
}
