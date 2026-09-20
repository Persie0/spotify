package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m3w {

    /* JADX INFO: renamed from: a */
    public final int f139768a;

    /* JADX INFO: renamed from: b */
    public final int f139769b;

    public m3w(int i, int i2) {
        this.f139768a = i;
        this.f139769b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3w)) {
            return false;
        }
        m3w m3wVar = (m3w) obj;
        return this.f139768a == m3wVar.f139768a && this.f139769b == m3wVar.f139769b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139769b) + (Integer.hashCode(this.f139768a) * 31);
    }
}
