package p204p;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class zbn0 extends wz60 {

    /* JADX INFO: renamed from: q */
    public Path f281352q;

    /* JADX INFO: renamed from: r */
    public final wz60 f281353r;

    public zbn0(u8b0 u8b0Var, wz60 wz60Var) {
        super(u8b0Var, (PointF) wz60Var.f256493b, (PointF) wz60Var.f256494c, wz60Var.f256495d, wz60Var.f256496e, wz60Var.f256497f, wz60Var.f256498g, wz60Var.f256499h);
        this.f281353r = wz60Var;
        m95868d();
    }

    /* JADX INFO: renamed from: d */
    public final void m95868d() {
        Object obj;
        Object obj2 = this.f256494c;
        Object obj3 = this.f256493b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f256494c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        wz60 wz60Var = this.f281353r;
        PointF pointF3 = wz60Var.f256506o;
        PointF pointF4 = wz60Var.f256507p;
        qlo qloVar = x0b1.f256851a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.f281352q = path;
    }
}
