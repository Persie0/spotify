package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ptu0 implements qtu0 {

    /* JADX INFO: renamed from: a */
    public final int f181257a;

    public ptu0(int i) {
        this.f181257a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptu0) && this.f181257a == ((ptu0) obj).f181257a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f181257a);
    }
}
