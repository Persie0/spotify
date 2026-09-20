package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class or21 {

    /* JADX INFO: renamed from: a */
    public final b450 f168428a;

    /* JADX INFO: renamed from: b */
    public final tr21 f168429b;

    public or21(b450 b450Var, tr21 tr21Var) {
        this.f168428a = b450Var;
        this.f168429b = tr21Var;
    }

    /* JADX INFO: renamed from: a */
    public final b450 m67687a() {
        return this.f168428a;
    }

    /* JADX INFO: renamed from: b */
    public final or21 m67688b(int i, int i2, b450 b450Var, int i3) {
        b450 b450Var2 = new b450(i, i2, 1);
        tr21 tr21Var = this.f168429b;
        int i4 = tr21Var.f222950a;
        int iMin = Math.min(i, b450Var.f278778a);
        int iMax = Math.max(b450Var2.f278779b, b450Var.f278779b);
        int iMax2 = Math.max(0, iMin);
        int i5 = (iMax - iMax2) + 1;
        if (i5 < i4) {
            int i6 = i4 - i5;
            int iM38547C = edb.m38547C(i3);
            if (iM38547C == 0) {
                iMax += i6;
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                int iMin2 = Math.min(i6, iMax2);
                iMax2 -= iMin2;
                iMax += i6 - iMin2;
            }
        }
        return new or21(new b450(iMax2, iMax, 1), tr21Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or21)) {
            return false;
        }
        or21 or21Var = (or21) obj;
        return wj50.m88271j(this.f168428a, or21Var.f168428a) && wj50.m88271j(this.f168429b, or21Var.f168429b);
    }

    public final int hashCode() {
        return this.f168429b.hashCode() + (this.f168428a.hashCode() * 31);
    }
}
