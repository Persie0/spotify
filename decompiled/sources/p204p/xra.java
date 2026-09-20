package p204p;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class xra implements e5y {

    /* JADX INFO: renamed from: X */
    public static final vaq0 f265305X = new vaq0();

    /* JADX INFO: renamed from: a */
    public final c5y f265306a;

    /* JADX INFO: renamed from: b */
    public final int f265307b;

    /* JADX INFO: renamed from: c */
    public final r300 f265308c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f265309d;

    /* JADX INFO: renamed from: e */
    public final wra f265310e;

    /* JADX INFO: renamed from: f */
    public boolean f265311f;

    /* JADX INFO: renamed from: g */
    public nt7 f265312g;

    /* JADX INFO: renamed from: h */
    public long f265313h;

    /* JADX INFO: renamed from: i */
    public ddz0 f265314i;

    /* JADX INFO: renamed from: t */
    public r300[] f265315t;

    public xra(c5y c5yVar, int i, r300 r300Var) {
        wra wraVar = wra.f254298b;
        this.f265306a = c5yVar;
        this.f265307b = i;
        this.f265308c = r300Var;
        this.f265309d = new SparseArray();
        this.f265310e = wraVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m91919a(nt7 nt7Var, long j, long j2) {
        this.f265312g = nt7Var;
        this.f265313h = j2;
        boolean z = this.f265311f;
        c5y c5yVar = this.f265306a;
        if (!z) {
            c5yVar.mo31288b(this);
            if (j != -9223372036854775807L) {
                c5yVar.mo31287a(0L, j);
            }
            this.f265311f = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        c5yVar.mo31287a(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f265309d;
            if (i >= sparseArray.size()) {
                return;
            }
            vra vraVar = (vra) sparseArray.valueAt(i);
            if (nt7Var == null) {
                vraVar.f244122f = vraVar.f244119c;
            } else {
                vraVar.f244123g = j2;
                ck81 ck81VarM65610n = nt7Var.m65610n(vraVar.f244117a);
                vraVar.f244122f = ck81VarM65610n;
                r300 r300Var = vraVar.f244121e;
                if (r300Var != null) {
                    ck81VarM65610n.mo33087a(r300Var);
                }
            }
            i++;
        }
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: d */
    public final void mo37835d(ddz0 ddz0Var) {
        this.f265314i = ddz0Var;
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: t */
    public final void mo37836t() {
        SparseArray sparseArray = this.f265309d;
        r300[] r300VarArr = new r300[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            r300 r300Var = ((vra) sparseArray.valueAt(i)).f244121e;
            r300Var.getClass();
            r300VarArr[i] = r300Var;
        }
        this.f265315t = r300VarArr;
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: x */
    public final ck81 mo37837x(int i, int i2) {
        SparseArray sparseArray = this.f265309d;
        vra vraVar = (vra) sparseArray.get(i);
        if (vraVar == null) {
            c95.m31855u(this.f265315t == null);
            vraVar = new vra(i, i2, i2 == this.f265307b ? this.f265308c : null, this.f265310e);
            nt7 nt7Var = this.f265312g;
            long j = this.f265313h;
            if (nt7Var == null) {
                vraVar.f244122f = vraVar.f244119c;
            } else {
                vraVar.f244123g = j;
                ck81 ck81VarM65610n = nt7Var.m65610n(i2);
                vraVar.f244122f = ck81VarM65610n;
                r300 r300Var = vraVar.f244121e;
                if (r300Var != null) {
                    ck81VarM65610n.mo33087a(r300Var);
                }
            }
            sparseArray.put(i, vraVar);
        }
        return vraVar;
    }
}
