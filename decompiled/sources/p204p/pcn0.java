package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class pcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f176175c;

    /* JADX INFO: renamed from: d */
    public final float f176176d;

    /* JADX INFO: renamed from: e */
    public final float f176177e;

    /* JADX INFO: renamed from: f */
    public final float f176178f;

    public pcn0(float f, float f2, float f3, float f4) {
        super(1);
        this.f176175c = f;
        this.f176176d = f2;
        this.f176177e = f3;
        this.f176178f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcn0)) {
            return false;
        }
        pcn0 pcn0Var = (pcn0) obj;
        return Float.compare(this.f176175c, pcn0Var.f176175c) == 0 && Float.compare(this.f176176d, pcn0Var.f176176d) == 0 && Float.compare(this.f176177e, pcn0Var.f176177e) == 0 && Float.compare(this.f176178f, pcn0Var.f176178f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f176178f) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f176175c) * 31, 31, this.f176176d), 31, this.f176177e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f176175c);
        sb.append(", dy1=");
        sb.append(this.f176176d);
        sb.append(", dx2=");
        sb.append(this.f176177e);
        sb.append(", dy2=");
        return ms2.m62684i(sb, this.f176178f, ')');
    }
}
