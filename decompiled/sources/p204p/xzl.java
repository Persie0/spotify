package p204p;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes6.dex */
public final class xzl {

    /* JADX INFO: renamed from: a */
    public final PointF f267714a;

    /* JADX INFO: renamed from: b */
    public final PointF f267715b;

    /* JADX INFO: renamed from: c */
    public final PointF f267716c;

    /* JADX INFO: renamed from: d */
    public final PointF f267717d;

    public xzl(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.f267714a = pointF;
        this.f267715b = pointF2;
        this.f267716c = pointF3;
        this.f267717d = pointF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzl)) {
            return false;
        }
        xzl xzlVar = (xzl) obj;
        return wj50.m88271j(this.f267714a, xzlVar.f267714a) && wj50.m88271j(this.f267715b, xzlVar.f267715b) && wj50.m88271j(this.f267716c, xzlVar.f267716c) && wj50.m88271j(this.f267717d, xzlVar.f267717d);
    }

    public final int hashCode() {
        return this.f267717d.hashCode() + ((this.f267716c.hashCode() + ((this.f267715b.hashCode() + (this.f267714a.hashCode() * 31)) * 31)) * 31);
    }
}
