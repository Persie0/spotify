package p204p;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class eke0 implements ybn0, cy10 {

    /* JADX INFO: renamed from: a */
    public final Path f60437a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f60438b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f60439c = new Path();

    /* JADX INFO: renamed from: d */
    public final ArrayList f60440d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final dke0 f60441e;

    public eke0(dke0 dke0Var) {
        this.f60441e = dke0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m39277a(Path.Op op) {
        Path path = this.f60438b;
        path.reset();
        Path path2 = this.f60437a;
        path2.reset();
        ArrayList arrayList = this.f60440d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            ybn0 ybn0Var = (ybn0) arrayList.get(size);
            if (ybn0Var instanceof zhj) {
                zhj zhjVar = (zhj) ybn0Var;
                ArrayList arrayList2 = (ArrayList) zhjVar.m96166e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((ybn0) arrayList2.get(size2)).getPath();
                    Matrix matrixM46677e = zhjVar.f282947c;
                    h591 h591Var = zhjVar.f282955k;
                    if (h591Var != null) {
                        matrixM46677e = h591Var.m46677e();
                    } else {
                        matrixM46677e.reset();
                    }
                    path3.transform(matrixM46677e);
                    path.addPath(path3);
                }
            } else {
                path.addPath(ybn0Var.getPath());
            }
        }
        int i = 0;
        ybn0 ybn0Var2 = (ybn0) arrayList.get(0);
        if (ybn0Var2 instanceof zhj) {
            zhj zhjVar2 = (zhj) ybn0Var2;
            List listM96166e = zhjVar2.m96166e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listM96166e;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((ybn0) arrayList3.get(i)).getPath();
                Matrix matrixM46677e2 = zhjVar2.f282947c;
                h591 h591Var2 = zhjVar2.f282955k;
                if (h591Var2 != null) {
                    matrixM46677e2 = h591Var2.m46677e();
                } else {
                    matrixM46677e2.reset();
                }
                path4.transform(matrixM46677e2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(ybn0Var2.getPath());
        }
        this.f60439c.op(path2, path, op);
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f60440d;
            if (i >= arrayList.size()) {
                return;
            }
            ((ybn0) arrayList.get(i)).mo27896b(list, list2);
            i++;
        }
    }

    @Override // p204p.cy10
    /* JADX INFO: renamed from: e */
    public final void mo34336e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            hej hejVar = (hej) listIterator.previous();
            if (hejVar instanceof ybn0) {
                this.f60440d.add((ybn0) hejVar);
                listIterator.remove();
            }
        }
    }

    @Override // p204p.ybn0
    public final Path getPath() {
        Path path = this.f60439c;
        path.reset();
        dke0 dke0Var = this.f60441e;
        if (!dke0Var.f49962b) {
            int iM38547C = edb.m38547C(dke0Var.f49961a);
            if (iM38547C == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f60440d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((ybn0) arrayList.get(i)).getPath());
                    i++;
                }
            } else {
                if (iM38547C == 1) {
                    m39277a(Path.Op.UNION);
                    return path;
                }
                if (iM38547C == 2) {
                    m39277a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iM38547C == 3) {
                    m39277a(Path.Op.INTERSECT);
                    return path;
                }
                if (iM38547C == 4) {
                    m39277a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
