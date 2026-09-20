package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class qcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f187389c;

    /* JADX INFO: renamed from: d */
    public final float f187390d;

    /* JADX INFO: renamed from: e */
    public final float f187391e;

    /* JADX INFO: renamed from: f */
    public final float f187392f;

    public qcn0(float f, float f2, float f3, float f4) {
        super(2);
        this.f187389c = f;
        this.f187390d = f2;
        this.f187391e = f3;
        this.f187392f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcn0)) {
            return false;
        }
        qcn0 qcn0Var = (qcn0) obj;
        return Float.compare(this.f187389c, qcn0Var.f187389c) == 0 && Float.compare(this.f187390d, qcn0Var.f187390d) == 0 && Float.compare(this.f187391e, qcn0Var.f187391e) == 0 && Float.compare(this.f187392f, qcn0Var.f187392f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f187392f) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f187389c) * 31, 31, this.f187390d), 31, this.f187391e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f187389c);
        sb.append(", dy1=");
        sb.append(this.f187390d);
        sb.append(", dx2=");
        sb.append(this.f187391e);
        sb.append(", dy2=");
        return ms2.m62684i(sb, this.f187392f, ')');
    }
}
