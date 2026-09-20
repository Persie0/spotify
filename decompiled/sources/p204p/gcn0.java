package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f78624c;

    /* JADX INFO: renamed from: d */
    public final float f78625d;

    public gcn0(float f, float f2) {
        super(3);
        this.f78624c = f;
        this.f78625d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcn0)) {
            return false;
        }
        gcn0 gcn0Var = (gcn0) obj;
        return Float.compare(this.f78624c, gcn0Var.f78624c) == 0 && Float.compare(this.f78625d, gcn0Var.f78625d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f78625d) + (Float.hashCode(this.f78624c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f78624c);
        sb.append(", y=");
        return ms2.m62684i(sb, this.f78625d, ')');
    }
}
