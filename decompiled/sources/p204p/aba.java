package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aba extends ywg1 {

    /* JADX INFO: renamed from: b */
    public final float f14076b;

    public aba(float f) {
        this.f14076b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aba) && Float.compare(this.f14076b, ((aba) obj).f14076b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14076b);
    }
}
