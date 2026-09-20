package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f111149c;

    /* JADX INFO: renamed from: d */
    public final float f111150d;

    public jcn0(float f, float f2) {
        super(1);
        this.f111149c = f;
        this.f111150d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcn0)) {
            return false;
        }
        jcn0 jcn0Var = (jcn0) obj;
        return Float.compare(this.f111149c, jcn0Var.f111149c) == 0 && Float.compare(this.f111150d, jcn0Var.f111150d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f111150d) + (Float.hashCode(this.f111149c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f111149c);
        sb.append(", y=");
        return ms2.m62684i(sb, this.f111150d, ')');
    }
}
