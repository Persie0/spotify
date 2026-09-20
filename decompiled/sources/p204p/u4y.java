package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u4y {

    /* JADX INFO: renamed from: a */
    public final int f226825a;

    /* JADX INFO: renamed from: b */
    public final int f226826b;

    public u4y(int i, int i2) {
        this.f226825a = i;
        this.f226826b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4y)) {
            return false;
        }
        u4y u4yVar = (u4y) obj;
        return this.f226825a == u4yVar.f226825a && this.f226826b == u4yVar.f226826b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f226826b) + (Integer.hashCode(this.f226825a) * 31);
    }
}
