package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class js5 implements ks5 {

    /* JADX INFO: renamed from: a */
    public final float f115399a;

    public js5(float f) {
        this.f115399a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js5) && ybs.m93301b(this.f115399a, ((js5) obj).f115399a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f115399a);
    }
}
