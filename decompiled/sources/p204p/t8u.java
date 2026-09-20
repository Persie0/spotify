package p204p;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class t8u {

    /* JADX INFO: renamed from: a */
    public int f218130a = 1;

    /* JADX INFO: renamed from: b */
    public final o8f0 f218131b;

    /* JADX INFO: renamed from: c */
    public o8f0 f218132c;

    /* JADX INFO: renamed from: d */
    public o8f0 f218133d;

    /* JADX INFO: renamed from: e */
    public int f218134e;

    /* JADX INFO: renamed from: f */
    public int f218135f;

    public t8u(o8f0 o8f0Var) {
        this.f218131b = o8f0Var;
        this.f218132c = o8f0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m80266a(int i) {
        SparseArray sparseArray = this.f218132c.f162797a;
        o8f0 o8f0Var = sparseArray == null ? null : (o8f0) sparseArray.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.f218130a == 2) {
            if (o8f0Var != null) {
                this.f218132c = o8f0Var;
                this.f218135f++;
            } else if (i == 65038) {
                m80267b();
            } else if (i != 65039) {
                o8f0 o8f0Var2 = this.f218132c;
                if (o8f0Var2.f162798b != null) {
                    i3 = 3;
                    if (this.f218135f != 1) {
                        this.f218133d = o8f0Var2;
                        m80267b();
                    } else if (m80268c()) {
                        this.f218133d = this.f218132c;
                        m80267b();
                    } else {
                        m80267b();
                    }
                } else {
                    m80267b();
                }
            }
            i2 = i3;
        } else if (o8f0Var == null) {
            m80267b();
        } else {
            this.f218130a = 2;
            this.f218132c = o8f0Var;
            this.f218135f = 1;
            i2 = i3;
        }
        this.f218134e = i;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m80267b() {
        this.f218130a = 1;
        this.f218132c = this.f218131b;
        this.f218135f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m80268c() {
        k7f0 k7f0VarM39641c = this.f218132c.f162798b.m39641c();
        int iM83534a = k7f0VarM39641c.m83534a(6);
        return !(iM83534a == 0 || k7f0VarM39641c.f232071b.get(iM83534a + k7f0VarM39641c.f232070a) == 0) || this.f218134e == 65039;
    }
}
