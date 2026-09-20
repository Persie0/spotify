package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ocn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f163964c;

    /* JADX INFO: renamed from: d */
    public final float f163965d;

    public ocn0(float f, float f2) {
        super(3);
        this.f163964c = f;
        this.f163965d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocn0)) {
            return false;
        }
        ocn0 ocn0Var = (ocn0) obj;
        return Float.compare(this.f163964c, ocn0Var.f163964c) == 0 && Float.compare(this.f163965d, ocn0Var.f163965d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f163965d) + (Float.hashCode(this.f163964c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f163964c);
        sb.append(", dy=");
        return ms2.m62684i(sb, this.f163965d, ')');
    }
}
