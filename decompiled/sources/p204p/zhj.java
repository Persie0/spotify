package p204p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zhj implements sgs, ybn0, jz8, mu60 {

    /* JADX INFO: renamed from: a */
    public final zd70 f282945a;

    /* JADX INFO: renamed from: b */
    public final RectF f282946b;

    /* JADX INFO: renamed from: c */
    public final Matrix f282947c;

    /* JADX INFO: renamed from: d */
    public final Path f282948d;

    /* JADX INFO: renamed from: e */
    public final RectF f282949e;

    /* JADX INFO: renamed from: f */
    public final String f282950f;

    /* JADX INFO: renamed from: g */
    public final boolean f282951g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f282952h;

    /* JADX INFO: renamed from: i */
    public final r9b0 f282953i;

    /* JADX INFO: renamed from: j */
    public ArrayList f282954j;

    /* JADX INFO: renamed from: k */
    public final h591 f282955k;

    public zhj(r9b0 r9b0Var, oz8 oz8Var, lh01 lh01Var, u8b0 u8b0Var) {
        ow4 ow4Var;
        String str = lh01Var.f133335a;
        boolean z = lh01Var.f133337c;
        List list = lh01Var.f133336b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            hej hejVarMo26175a = ((pmj) list.get(i2)).mo26175a(r9b0Var, u8b0Var, oz8Var);
            if (hejVarMo26175a != null) {
                arrayList.add(hejVarMo26175a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                ow4Var = null;
                break;
            }
            pmj pmjVar = (pmj) list.get(i);
            if (pmjVar instanceof ow4) {
                ow4Var = (ow4) pmjVar;
                break;
            }
            i++;
        }
        this(r9b0Var, oz8Var, str, z, arrayList, ow4Var);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f282953i.invalidateSelf();
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f282952h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            hej hejVar = (hej) arrayList.get(size2);
            hejVar.mo27896b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(hejVar);
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        h591 h591Var = this.f282955k;
        if (h591Var != null) {
            h591Var.m46675c(obj, xh70Var);
        }
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: d */
    public final void mo25333d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.f282947c;
        matrix2.set(matrix);
        h591 h591Var = this.f282955k;
        if (h591Var != null) {
            matrix2.preConcat(h591Var.m46677e());
        }
        RectF rectF2 = this.f282949e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f282952h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hej hejVar = (hej) arrayList.get(size);
            if (hejVar instanceof sgs) {
                ((sgs) hejVar).mo25333d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final List m96166e() {
        if (this.f282954j == null) {
            this.f282954j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f282952h;
                if (i >= arrayList.size()) {
                    break;
                }
                hej hejVar = (hej) arrayList.get(i);
                if (hejVar instanceof ybn0) {
                    this.f282954j.add((ybn0) hejVar);
                }
                i++;
            }
        }
        return this.f282954j;
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: f */
    public final void mo27897f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
        String str = this.f282950f;
        if (!lu60Var.m59931e(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            lu60Var2 = lu60Var2.m59927a(str);
            if (lu60Var.m59928b(i, str)) {
                arrayList.add(lu60Var2.m59933g(this));
            }
        }
        if (!lu60Var.m59932f(i, str)) {
            return;
        }
        int iM59930d = lu60Var.m59930d(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f282952h;
            if (i2 >= arrayList2.size()) {
                return;
            }
            hej hejVar = (hej) arrayList2.get(i2);
            if (hejVar instanceof mu60) {
                ((mu60) hejVar).mo27897f(lu60Var, iM59930d, arrayList, lu60Var2);
            }
            i2++;
        }
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: g */
    public final void mo27898g(Canvas canvas, Matrix matrix, int i) {
        if (this.f282951g) {
            return;
        }
        Matrix matrix2 = this.f282947c;
        matrix2.set(matrix);
        h591 h591Var = this.f282955k;
        if (h591Var != null) {
            matrix2.preConcat(h591Var.m46677e());
            mz8 mz8Var = h591Var.f87783j;
            i = (int) (((((mz8Var == null ? 100 : ((Integer) mz8Var.mo46515e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f282953i.f196975Q0;
        boolean z2 = false;
        ArrayList arrayList = this.f282952h;
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if ((arrayList.get(i3) instanceof sgs) && (i2 = i2 + 1) >= 2) {
                    if (i == 255) {
                        break;
                    }
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            RectF rectF = this.f282946b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo25333d(rectF, matrix2, true);
            zd70 zd70Var = this.f282945a;
            zd70Var.setAlpha(i);
            qlo qloVar = x0b1.f256851a;
            canvas.saveLayer(rectF, zd70Var);
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof sgs) {
                ((sgs) obj).mo27898g(canvas, matrix2, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // p204p.hej
    public final String getName() {
        throw null;
    }

    @Override // p204p.ybn0
    public final Path getPath() {
        Matrix matrix = this.f282947c;
        matrix.reset();
        h591 h591Var = this.f282955k;
        if (h591Var != null) {
            matrix.set(h591Var.m46677e());
        }
        Path path = this.f282948d;
        path.reset();
        if (!this.f282951g) {
            ArrayList arrayList = this.f282952h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                hej hejVar = (hej) arrayList.get(size);
                if (hejVar instanceof ybn0) {
                    path.addPath(((ybn0) hejVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public zhj(r9b0 r9b0Var, oz8 oz8Var, String str, boolean z, ArrayList arrayList, ow4 ow4Var) {
        this.f282945a = new zd70();
        this.f282946b = new RectF();
        this.f282947c = new Matrix();
        this.f282948d = new Path();
        this.f282949e = new RectF();
        this.f282950f = str;
        this.f282953i = r9b0Var;
        this.f282951g = z;
        this.f282952h = arrayList;
        if (ow4Var != null) {
            h591 h591Var = new h591(ow4Var);
            this.f282955k = h591Var;
            h591Var.m46673a(oz8Var);
            h591Var.m46674b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hej hejVar = (hej) arrayList.get(size);
            if (hejVar instanceof cy10) {
                arrayList2.add((cy10) hejVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((cy10) arrayList2.get(size2)).mo34336e(arrayList.listIterator(arrayList.size()));
        }
    }
}
