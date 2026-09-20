package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ntu0 implements qtu0 {

    /* JADX INFO: renamed from: a */
    public final int f158151a;

    public ntu0(int i) {
        this.f158151a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntu0) && this.f158151a == ((ntu0) obj).f158151a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f158151a);
    }
}
