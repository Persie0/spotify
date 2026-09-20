package p204p;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fh01 implements ybn0, jz8, nu60 {

    /* JADX INFO: renamed from: b */
    public final String f69518b;

    /* JADX INFO: renamed from: c */
    public final boolean f69519c;

    /* JADX INFO: renamed from: d */
    public final r9b0 f69520d;

    /* JADX INFO: renamed from: e */
    public final nh01 f69521e;

    /* JADX INFO: renamed from: f */
    public boolean f69522f;

    /* JADX INFO: renamed from: a */
    public final Path f69517a = new Path();

    /* JADX INFO: renamed from: g */
    public final jw4 f69523g = new jw4(2);

    public fh01(r9b0 r9b0Var, oz8 oz8Var, xh01 xh01Var) {
        this.f69518b = xh01Var.f261410a;
        this.f69519c = xh01Var.f261413d;
        this.f69520d = r9b0Var;
        nh01 nh01VarM48913F1 = xh01Var.f261412c.m48913F1();
        this.f69521e = nh01VarM48913F1;
        oz8Var.m68627e(nh01VarM48913F1);
        nh01VarM48913F1.m63235a(this);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f69522f = false;
        this.f69520d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.f69521e.f153826m = arrayList;
                return;
            }
            hej hejVar = (hej) arrayList2.get(i);
            if (hejVar instanceof vk91) {
                vk91 vk91Var = (vk91) hejVar;
                if (vk91Var.f242179c == 1) {
                    this.f69523g.m54401c(vk91Var);
                    vk91Var.m85816c(this);
                } else if (!(hejVar instanceof mmx0)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((mmx0) hejVar);
                }
            } else if (!(hejVar instanceof mmx0)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((mmx0) hejVar);
            }
            i++;
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        if (obj == bab0.f25145K) {
            this.f69521e.m63238j(xh70Var);
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: f */
    public final void mo27897f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
        eff0.m38736f(lu60Var, i, arrayList, lu60Var2, this);
    }

    @Override // p204p.hej
    public final String getName() {
        return this.f69518b;
    }

    @Override // p204p.ybn0
    public final Path getPath() {
        boolean z = this.f69522f;
        nh01 nh01Var = this.f69521e;
        Path path = this.f69517a;
        if (z && nh01Var.f148646e == null) {
            return path;
        }
        path.reset();
        if (this.f69519c) {
            this.f69522f = true;
            return path;
        }
        Path path2 = (Path) nh01Var.mo46515e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f69523g.m54402d(path);
        this.f69522f = true;
        return path;
    }
}
