package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nas implements qas {

    /* JADX INFO: renamed from: a */
    public final float f152114a;

    public nas(float f) {
        this.f152114a = f;
    }

    /* JADX INFO: renamed from: a */
    public final float m64038a() {
        return this.f152114a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nas) && Float.compare(this.f152114a, ((nas) obj).f152114a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f152114a);
    }
}
