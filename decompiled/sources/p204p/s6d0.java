package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s6d0 {

    /* JADX INFO: renamed from: a */
    public final int f206085a;

    /* JADX INFO: renamed from: b */
    public final List f206086b;

    /* JADX INFO: renamed from: c */
    public final long f206087c;

    /* JADX INFO: renamed from: d */
    public final Object f206088d;

    /* JADX INFO: renamed from: e */
    public final jb3 f206089e;

    /* JADX INFO: renamed from: f */
    public final vb9 f206090f;

    /* JADX INFO: renamed from: g */
    public final ko70 f206091g;

    /* JADX INFO: renamed from: h */
    public final boolean f206092h;

    /* JADX INFO: renamed from: i */
    public final int f206093i;

    /* JADX INFO: renamed from: j */
    public final int[] f206094j;

    /* JADX INFO: renamed from: k */
    public int f206095k;

    /* JADX INFO: renamed from: l */
    public int f206096l;

    public s6d0(int i, int i2, List list, long j, Object obj, vvl0 vvl0Var, jb3 jb3Var, vb9 vb9Var, ko70 ko70Var) {
        this.f206085a = i;
        this.f206086b = list;
        this.f206087c = j;
        this.f206088d = obj;
        this.f206089e = jb3Var;
        this.f206090f = vb9Var;
        this.f206091g = ko70Var;
        this.f206092h = vvl0Var == vvl0.f245248a;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            t5o0 t5o0Var = (t5o0) list.get(i3);
            iMax = Math.max(iMax, !this.f206092h ? t5o0Var.f217323b : t5o0Var.f217322a);
        }
        this.f206093i = iMax;
        this.f206094j = new int[this.f206086b.size() * 2];
        this.f206096l = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m77324a(int i) {
        this.f206095k += i;
        int[] iArr = this.f206094j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.f206092h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77325b(int i, int i2, int i3) {
        int i4;
        this.f206095k = i;
        boolean z = this.f206092h;
        this.f206096l = z ? i3 : i2;
        List list = this.f206086b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            t5o0 t5o0Var = (t5o0) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.f206094j;
            if (z) {
                jb3 jb3Var = this.f206089e;
                if (jb3Var == null) {
                    throw mt60.m62801h("null horizontalAlignment");
                }
                iArr[i6] = jb3Var.mo52864a(t5o0Var.f217322a, i2, this.f206091g);
                iArr[i6 + 1] = i;
                i4 = t5o0Var.f217323b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                vb9 vb9Var = this.f206090f;
                if (vb9Var == null) {
                    throw mt60.m62801h("null verticalAlignment");
                }
                iArr[i7] = vb9Var.m85124a(t5o0Var.f217323b, i3);
                i4 = t5o0Var.f217322a;
            }
            i += i4;
        }
    }
}
