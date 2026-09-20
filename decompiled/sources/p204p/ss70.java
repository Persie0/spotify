package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ss70 {

    /* JADX INFO: renamed from: a */
    public final int f213509a;

    /* JADX INFO: renamed from: b */
    public final rs70[] f213510b;

    /* JADX INFO: renamed from: c */
    public final ia70 f213511c;

    /* JADX INFO: renamed from: d */
    public final List f213512d;

    /* JADX INFO: renamed from: e */
    public final int f213513e;

    /* JADX INFO: renamed from: f */
    public final int f213514f;

    /* JADX INFO: renamed from: g */
    public final int f213515g;

    public ss70(int i, rs70[] rs70VarArr, ia70 ia70Var, List list, int i2) {
        this.f213509a = i;
        this.f213510b = rs70VarArr;
        this.f213511c = ia70Var;
        this.f213512d = list;
        this.f213513e = i2;
        int iMax = 0;
        for (rs70 rs70Var : rs70VarArr) {
            iMax = Math.max(iMax, rs70Var.f202207n);
        }
        this.f213514f = iMax;
        int i3 = iMax + this.f213513e;
        this.f213515g = i3 >= 0 ? i3 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final rs70[] m79188a() {
        return this.f213510b;
    }

    /* JADX INFO: renamed from: b */
    public final rs70[] m79189b(int i, int i2, int i3) {
        rs70[] rs70VarArr = this.f213510b;
        int length = rs70VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            rs70 rs70Var = rs70VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((tz10) this.f213512d.get(i5)).f225083a;
            rs70Var.m76313m(i, ((int[]) this.f213511c.f100167c)[i6], i2, i3, this.f213509a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return rs70VarArr;
    }
}
