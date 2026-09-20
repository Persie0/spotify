package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class z8f {

    /* JADX INFO: renamed from: a */
    public final String f280461a;

    /* JADX INFO: renamed from: b */
    public final long f280462b;

    /* JADX INFO: renamed from: c */
    public final int f280463c;

    public z8f(long j, int i, String str) {
        this.f280461a = str;
        this.f280462b = j;
        this.f280463c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo25696a(int i);

    /* JADX INFO: renamed from: b */
    public abstract float mo25697b(int i);

    /* JADX INFO: renamed from: c */
    public boolean mo87851c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo25698d(float f, float f2, float f3);

    /* JADX INFO: renamed from: e */
    public abstract float mo25699e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z8f z8fVar = (z8f) obj;
        if (this.f280463c == z8fVar.f280463c && wj50.m88271j(this.f280461a, z8fVar.f280461a)) {
            return v7f.m84848a(this.f280462b, z8fVar.f280462b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo25700f(float f, float f2, float f3, float f4, z8f z8fVar);

    public int hashCode() {
        int iHashCode = this.f280461a.hashCode() * 31;
        int i = v7f.f238175e;
        return dq60.m36605e(iHashCode, this.f280462b, 31) + this.f280463c;
    }

    public final String toString() {
        return this.f280461a + " (id=" + this.f280463c + ", model=" + ((Object) v7f.m84849b(this.f280462b)) + ')';
    }
}
