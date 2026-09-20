package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class y310 {

    /* JADX INFO: renamed from: a */
    public final x310 f268724a;

    /* JADX INFO: renamed from: b */
    public final int[] f268725b;

    public y310(x310 x310Var, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f268724a = x310Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f268725b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f268725b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.f268725b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public final y310 m92714a(y310 y310Var) {
        x310 x310Var = y310Var.f268724a;
        x310 x310Var2 = this.f268724a;
        if (!x310Var2.equals(x310Var)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.f268725b;
        if (iArr[0] == 0) {
            return y310Var;
        }
        int[] iArr2 = y310Var.f268725b;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new y310(x310Var2, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public final int m92715b() {
        return this.f268725b.length - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(m92715b() * 8);
        for (int iM92715b = m92715b(); iM92715b >= 0; iM92715b--) {
            int[] iArr = this.f268725b;
            int i = iArr[(iArr.length - 1) - iM92715b];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM92715b == 0 || i != 1) {
                    x310 x310Var = this.f268724a;
                    if (i == 0) {
                        x310Var.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i2 = x310Var.f257660b[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
                }
                if (iM92715b != 0) {
                    if (iM92715b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM92715b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
