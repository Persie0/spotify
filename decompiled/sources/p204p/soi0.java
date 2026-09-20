package p204p;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class soi0 {

    /* JADX INFO: renamed from: a */
    public int[] f211199a;

    /* JADX INFO: renamed from: b */
    public int f211200b;

    public soi0(int i) {
        this.f211199a = i == 0 ? f450.f65676a : new int[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m78648a(int i) {
        m78649b(this.f211200b + 1);
        int[] iArr = this.f211199a;
        int i2 = this.f211200b;
        iArr[i2] = i;
        this.f211200b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m78649b(int i) {
        int[] iArr = this.f211199a;
        if (iArr.length < i) {
            this.f211199a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m78650c(int i) {
        if (i >= 0 && i < this.f211200b) {
            return this.f211199a[i];
        }
        epv0.m39675K("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final int m78651d() {
        int i = this.f211200b;
        if (i != 0) {
            return this.f211199a[i - 1];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    /* JADX INFO: renamed from: e */
    public final void m78652e(int i) {
        int[] iArr = this.f211199a;
        int i2 = this.f211200b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (i == iArr[i3]) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            m78653f(i3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof soi0) {
            soi0 soi0Var = (soi0) obj;
            int i = soi0Var.f211200b;
            int i2 = this.f211200b;
            if (i == i2) {
                int[] iArr = this.f211199a;
                int[] iArr2 = soi0Var.f211199a;
                b450 b450VarM63417Y = n0e1.m63417Y(0, i2);
                int i3 = b450VarM63417Y.f278778a;
                int i4 = b450VarM63417Y.f278779b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m78653f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f211200b)) {
            epv0.m39675K("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f211199a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            bk5.m29627o0(i, i + 1, i2, iArr, iArr);
        }
        this.f211200b--;
    }

    /* JADX INFO: renamed from: g */
    public final void m78654g(int i, int i2) {
        if (i < 0 || i >= this.f211200b) {
            epv0.m39675K("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f211199a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.f211199a;
        int i = this.f211200b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f211199a;
        int i = this.f211200b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ soi0() {
        this(16);
    }
}
