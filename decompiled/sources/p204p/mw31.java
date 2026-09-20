package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mw31 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f147708a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int[] f147709b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f147710c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f147711d;

    public mw31(int i) {
        int iM41468q = fem.m41468q(10);
        this.f147709b = new int[iM41468q];
        this.f147710c = new Object[iM41468q];
    }

    /* JADX INFO: renamed from: b */
    public final void m62981b(int i, Object obj) {
        int i2 = this.f147711d;
        if (i2 != 0 && i <= this.f147709b[i2 - 1]) {
            m62985g(i, obj);
            return;
        }
        if (this.f147708a && i2 >= this.f147709b.length) {
            fag1.m41162k(this);
        }
        int i3 = this.f147711d;
        if (i3 >= this.f147709b.length) {
            int iM41468q = fem.m41468q(i3 + 1);
            this.f147709b = Arrays.copyOf(this.f147709b, iM41468q);
            this.f147710c = Arrays.copyOf(this.f147710c, iM41468q);
        }
        this.f147709b[i3] = i;
        this.f147710c[i3] = obj;
        this.f147711d = i3 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final mw31 clone() {
        mw31 mw31Var = (mw31) super.clone();
        mw31Var.f147709b = (int[]) this.f147709b.clone();
        mw31Var.f147710c = (Object[]) this.f147710c.clone();
        return mw31Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m62983d(int i) {
        if (this.f147708a) {
            fag1.m41162k(this);
        }
        return fem.m41459g(this.f147711d, i, this.f147709b) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m62984e(int i) {
        if (this.f147708a) {
            fag1.m41162k(this);
        }
        return this.f147709b[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m62985g(int i, Object obj) {
        int iM41459g = fem.m41459g(this.f147711d, i, this.f147709b);
        if (iM41459g >= 0) {
            this.f147710c[iM41459g] = obj;
            return;
        }
        int i2 = ~iM41459g;
        int i3 = this.f147711d;
        if (i2 < i3) {
            Object[] objArr = this.f147710c;
            if (objArr[i2] == fag1.f67555a) {
                this.f147709b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f147708a && i3 >= this.f147709b.length) {
            fag1.m41162k(this);
            i2 = ~fem.m41459g(this.f147711d, i, this.f147709b);
        }
        int i4 = this.f147711d;
        if (i4 >= this.f147709b.length) {
            int iM41468q = fem.m41468q(i4 + 1);
            this.f147709b = Arrays.copyOf(this.f147709b, iM41468q);
            this.f147710c = Arrays.copyOf(this.f147710c, iM41468q);
        }
        int i5 = this.f147711d;
        if (i5 - i2 != 0) {
            int[] iArr = this.f147709b;
            int i6 = i2 + 1;
            bk5.m29627o0(i6, i2, i5, iArr, iArr);
            Object[] objArr2 = this.f147710c;
            bk5.m29629p0(i6, i2, this.f147711d, objArr2, objArr2);
        }
        this.f147709b[i2] = i;
        this.f147710c[i2] = obj;
        this.f147711d++;
    }

    /* JADX INFO: renamed from: h */
    public final int m62986h() {
        if (this.f147708a) {
            fag1.m41162k(this);
        }
        return this.f147711d;
    }

    /* JADX INFO: renamed from: i */
    public final Object m62987i(int i) {
        if (this.f147708a) {
            fag1.m41162k(this);
        }
        Object[] objArr = this.f147710c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (m62986h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f147711d * 28);
        sb.append('{');
        int i = this.f147711d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m62984e(i2));
            sb.append('=');
            Object objM62987i = m62987i(i2);
            if (objM62987i != this) {
                sb.append(objM62987i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
