package p204p;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qyt implements ybn0, jz8, nu60 {

    /* JADX INFO: renamed from: b */
    public final String f194027b;

    /* JADX INFO: renamed from: c */
    public final r9b0 f194028c;

    /* JADX INFO: renamed from: d */
    public final d6q0 f194029d;

    /* JADX INFO: renamed from: e */
    public final mz8 f194030e;

    /* JADX INFO: renamed from: f */
    public final tde f194031f;

    /* JADX INFO: renamed from: h */
    public boolean f194033h;

    /* JADX INFO: renamed from: a */
    public final Path f194026a = new Path();

    /* JADX INFO: renamed from: g */
    public final jw4 f194032g = new jw4(2);

    public qyt(r9b0 r9b0Var, oz8 oz8Var, tde tdeVar) {
        this.f194027b = tdeVar.f219291a;
        this.f194028c = r9b0Var;
        mz8 mz8VarMo48914j0 = tdeVar.f219293c.mo48914j0();
        this.f194029d = (d6q0) mz8VarMo48914j0;
        mz8 mz8VarMo48914j1 = tdeVar.f219292b.mo48914j0();
        this.f194030e = mz8VarMo48914j1;
        this.f194031f = tdeVar;
        oz8Var.m68627e(mz8VarMo48914j0);
        oz8Var.m68627e(mz8VarMo48914j1);
        mz8VarMo48914j0.m63235a(this);
        mz8VarMo48914j1.m63235a(this);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f194033h = false;
        this.f194028c.invalidateSelf();
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            hej hejVar = (hej) arrayList.get(i);
            if (hejVar instanceof vk91) {
                vk91 vk91Var = (vk91) hejVar;
                if (vk91Var.f242179c == 1) {
                    this.f194032g.m54401c(vk91Var);
                    vk91Var.m85816c(this);
                }
            }
            i++;
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        if (obj == bab0.f25151f) {
            this.f194029d.m63238j(xh70Var);
        } else if (obj == bab0.f25154i) {
            this.f194030e.m63238j(xh70Var);
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: f */
    public final void mo27897f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
        eff0.m38736f(lu60Var, i, arrayList, lu60Var2, this);
    }

    @Override // p204p.hej
    public final String getName() {
        return this.f194027b;
    }

    @Override // p204p.ybn0
    public final Path getPath() {
        boolean z = this.f194033h;
        Path path = this.f194026a;
        if (z) {
            return path;
        }
        path.reset();
        tde tdeVar = this.f194031f;
        if (tdeVar.f219295e) {
            this.f194033h = true;
            return path;
        }
        PointF pointF = (PointF) this.f194029d.mo46515e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (tdeVar.f219294d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.f194030e.mo46515e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f194032g.m54402d(path);
        this.f194033h = true;
        return path;
    }
}
