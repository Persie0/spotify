package p204p;

/* JADX INFO: loaded from: classes.dex */
public class nhf1 extends zhf1 {

    /* JADX INFO: renamed from: c */
    public final byte[] f154001c;

    public nhf1(byte[] bArr) {
        this.f282916a = 0;
        bArr.getClass();
        this.f154001c = bArr;
    }

    @Override // p204p.zhf1
    /* JADX INFO: renamed from: a */
    public byte mo29246a(int i) {
        return this.f154001c[i];
    }

    @Override // p204p.zhf1
    /* JADX INFO: renamed from: b */
    public byte mo29247b(int i) {
        return this.f154001c[i];
    }

    @Override // p204p.zhf1
    /* JADX INFO: renamed from: d */
    public int mo29248d() {
        return this.f154001c.length;
    }

    @Override // p204p.zhf1
    /* JADX INFO: renamed from: e */
    public void mo29249e(byte[] bArr, int i) {
        System.arraycopy(this.f154001c, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zhf1) && mo29248d() == ((zhf1) obj).mo29248d()) {
            if (mo29248d() == 0) {
                return true;
            }
            if (!(obj instanceof nhf1)) {
                return obj.equals(this);
            }
            nhf1 nhf1Var = (nhf1) obj;
            int i = this.f282916a;
            int i2 = nhf1Var.f282916a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iMo29248d = mo29248d();
                if (iMo29248d > nhf1Var.mo29248d()) {
                    throw new IllegalArgumentException("Length too large: " + iMo29248d + mo29248d());
                }
                if (iMo29248d > nhf1Var.mo29248d()) {
                    throw new IllegalArgumentException(s571.m77247f(iMo29248d, "Ran off end of other: 0, ", nhf1Var.mo29248d(), ", "));
                }
                byte[] bArr = nhf1Var.f154001c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iMo29248d) {
                    if (this.f154001c[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
