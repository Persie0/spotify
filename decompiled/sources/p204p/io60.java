package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class io60 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f104136a;

    /* JADX INFO: renamed from: b */
    public final int f104137b;

    /* JADX INFO: renamed from: c */
    public final int f104138c;

    static {
        new io60(fbf0.f67818g.f176997a);
        new io60(fbf0.f67819h.f176997a);
    }

    public io60(int i, int i2, int i3) {
        this.f104136a = i;
        this.f104137b = i2;
        this.f104138c = i3;
        if (i < 0) {
            throw new IllegalArgumentException("Major version should be not less than 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Minor version should be not less than 0");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Patch version should be not less than 0");
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(io60 io60Var) {
        int iM88282u = wj50.m88282u(this.f104136a, io60Var.f104136a);
        if (iM88282u != 0) {
            return iM88282u;
        }
        int iM88282u2 = wj50.m88282u(this.f104137b, io60Var.f104137b);
        return iM88282u2 != 0 ? iM88282u2 : wj50.m88282u(this.f104138c, io60Var.f104138c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io60.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        io60 io60Var = (io60) obj;
        return this.f104136a == io60Var.f104136a && this.f104137b == io60Var.f104137b && this.f104138c == io60Var.f104138c;
    }

    public final int hashCode() {
        return (((this.f104136a * 31) + this.f104137b) * 31) + this.f104138c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f104136a);
        sb.append('.');
        sb.append(this.f104137b);
        sb.append('.');
        sb.append(this.f104138c);
        return sb.toString();
    }

    public io60(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
    }
}
