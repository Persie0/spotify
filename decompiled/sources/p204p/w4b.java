package p204p;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class w4b {

    /* JADX INFO: renamed from: a */
    public final int f247760a;

    /* JADX INFO: renamed from: b */
    public final String f247761b;

    /* JADX INFO: renamed from: c */
    public final TreeSet f247762c = new TreeSet();

    /* JADX INFO: renamed from: d */
    public final ArrayList f247763d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public r8p f247764e;

    public w4b(int i, String str, r8p r8pVar) {
        this.f247760a = i;
        this.f247761b = str;
        this.f247764e = r8pVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m87178a(pb21 pb21Var) {
        this.f247762c.add(pb21Var);
    }

    /* JADX INFO: renamed from: b */
    public final long m87179b(long j, long j2) {
        c95.m31843i(j >= 0);
        c95.m31843i(j2 >= 0);
        pb21 pb21VarM87181d = m87181d(j, j2);
        long j3 = pb21VarM87181d.f108645c;
        if (!pb21VarM87181d.f108646d) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = pb21VarM87181d.f108644b + j3;
        if (jMax < j5) {
            for (pb21 pb21Var : this.f247762c.tailSet(pb21VarM87181d, false)) {
                long j6 = pb21Var.f108644b;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + pb21Var.f108645c);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    /* JADX INFO: renamed from: c */
    public final r8p m87180c() {
        return this.f247764e;
    }

    /* JADX INFO: renamed from: d */
    public final pb21 m87181d(long j, long j2) {
        pb21 pb21Var = new pb21(this.f247761b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f247762c;
        pb21 pb21Var2 = (pb21) treeSet.floor(pb21Var);
        if (pb21Var2 != null && pb21Var2.f108644b + pb21Var2.f108645c > j) {
            return pb21Var2;
        }
        pb21 pb21Var3 = (pb21) treeSet.ceiling(pb21Var);
        if (pb21Var3 != null) {
            long jMin = pb21Var3.f108644b - j;
            if (j2 != -1) {
                jMin = Math.min(jMin, j2);
            }
            j2 = jMin;
        }
        return pb21.m69511d(j, this.f247761b, j2);
    }

    /* JADX INFO: renamed from: e */
    public final TreeSet m87182e() {
        return this.f247762c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w4b.class == obj.getClass()) {
            w4b w4bVar = (w4b) obj;
            if (this.f247760a == w4bVar.f247760a && this.f247761b.equals(w4bVar.f247761b) && this.f247762c.equals(w4bVar.f247762c) && this.f247764e.equals(w4bVar.f247764e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m87183f() {
        return this.f247762c.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m87184g(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f247763d;
            if (i >= arrayList.size()) {
                return false;
            }
            v4b v4bVar = (v4b) arrayList.get(i);
            long j3 = v4bVar.f237105a;
            long j4 = v4bVar.f237106b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m87185h(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f247763d;
            if (i >= arrayList.size()) {
                arrayList.add(new v4b(j, j2));
                return true;
            }
            v4b v4bVar = (v4b) arrayList.get(i);
            long j3 = v4bVar.f237105a;
            if (j3 <= j) {
                long j4 = v4bVar.f237106b;
                if (j4 == -1 || j3 + j4 > j) {
                    return false;
                }
                i++;
            } else {
                if (j2 == -1 || j + j2 > j3) {
                    return false;
                }
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.f247764e.hashCode() + s571.m77243b(this.f247760a * 31, 31, this.f247761b);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m87186i(j4b j4bVar) {
        if (!this.f247762c.remove(j4bVar)) {
            return false;
        }
        File file = j4bVar.f108647e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final pb21 m87187j(pb21 pb21Var, long j, boolean z) {
        long j2;
        File file;
        TreeSet treeSet = this.f247762c;
        c95.m31855u(treeSet.remove(pb21Var));
        File file2 = pb21Var.f108647e;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            j2 = j;
            File fileM69512e = pb21.m69512e(parentFile, this.f247760a, pb21Var.f108644b, j2);
            if (file2.renameTo(fileM69512e)) {
                file = fileM69512e;
            } else {
                yif1.m93819w0("Failed to rename " + file2 + " to " + fileM69512e);
            }
            c95.m31855u(pb21Var.f108646d);
            pb21 pb21Var2 = new pb21(pb21Var.f108643a, pb21Var.f108644b, pb21Var.f108645c, j2, file);
            treeSet.add(pb21Var2);
            return pb21Var2;
        }
        j2 = j;
        file = file2;
        c95.m31855u(pb21Var.f108646d);
        pb21 pb21Var3 = new pb21(pb21Var.f108643a, pb21Var.f108644b, pb21Var.f108645c, j2, file);
        treeSet.add(pb21Var3);
        return pb21Var3;
    }

    /* JADX INFO: renamed from: k */
    public final void m87188k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f247763d;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((v4b) arrayList.get(i)).f237105a == j) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }
}
