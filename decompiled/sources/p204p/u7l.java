package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u7l implements w7l {

    /* JADX INFO: renamed from: a */
    public final int f227720a;

    /* JADX INFO: renamed from: b */
    public final int f227721b;

    public u7l(int i, int i2) {
        this.f227720a = i;
        this.f227721b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7l)) {
            return false;
        }
        u7l u7lVar = (u7l) obj;
        return this.f227720a == u7lVar.f227720a && this.f227721b == u7lVar.f227721b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f227721b) + (Integer.hashCode(this.f227720a) * 31);
    }
}
