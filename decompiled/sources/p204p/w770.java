package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w770 extends z770 {

    /* JADX INFO: renamed from: a */
    public final float f248579a;

    public w770(float f) {
        this.f248579a = f;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Float.valueOf(this.f248579a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w770) && Float.compare(this.f248579a, ((w770) obj).f248579a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f248579a);
    }
}
