package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w2c {

    /* JADX INFO: renamed from: a */
    public final float f247317a;

    /* JADX INFO: renamed from: b */
    public final float f247318b;

    public w2c(float f, float f2) {
        this.f247317a = f;
        this.f247318b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2c)) {
            return false;
        }
        w2c w2cVar = (w2c) obj;
        return ybs.m93301b(this.f247317a, w2cVar.f247317a) && ybs.m93301b(this.f247318b, w2cVar.f247318b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f247318b) + (Float.hashCode(this.f247317a) * 31);
    }
}
