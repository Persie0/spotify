package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tt90 extends yt90 {

    /* JADX INFO: renamed from: b */
    public final js90 f223561b;

    public tt90(js90 js90Var) {
        super(is90.f105197e);
        this.f223561b = js90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt90) && this.f223561b.equals(((tt90) obj).f223561b);
    }

    public final int hashCode() {
        return this.f223561b.hashCode() + (is90.f105197e.hashCode() * 31);
    }
}
