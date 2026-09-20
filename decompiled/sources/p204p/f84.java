package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f84 {

    /* JADX INFO: renamed from: a */
    public final float f66848a;

    /* JADX INFO: renamed from: b */
    public final float f66849b;

    public f84(float f, float f2) {
        this.f66848a = f;
        this.f66849b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f84)) {
            return false;
        }
        f84 f84Var = (f84) obj;
        return Float.compare(this.f66848a, f84Var.f66848a) == 0 && Float.compare(this.f66849b, f84Var.f66849b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66849b) + (Float.hashCode(this.f66848a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f66848a);
        sb.append(", velocityCoefficient=");
        return ms2.m62684i(sb, this.f66849b, ')');
    }
}
