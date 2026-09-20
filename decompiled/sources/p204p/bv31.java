package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class bv31 {

    /* JADX INFO: renamed from: a */
    public final int f31266a;

    /* JADX INFO: renamed from: b */
    public final int f31267b;

    /* JADX INFO: renamed from: c */
    public final int f31268c;

    /* JADX INFO: renamed from: d */
    public final int f31269d;

    public bv31(int i, int i2, int i3, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("lineIndex ", i, " must be >= 0"));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(edb.m38563l("columnIndex ", i2, " must be >= 0"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(edb.m38563l("inputIndex ", i3, " must be >= 0"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(edb.m38563l("length ", i4, " must be >= 0"));
        }
        this.f31266a = i;
        this.f31267b = i2;
        this.f31268c = i3;
        this.f31269d = i4;
    }

    /* JADX INFO: renamed from: a */
    public final bv31 m30583a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(edb.m38563l("beginIndex ", i, " + must be >= 0"));
        }
        int i3 = this.f31269d;
        if (i > i3) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "beginIndex ", i3, " must be <= length "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(edb.m38563l("endIndex ", i2, " + must be >= 0"));
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(s571.m77247f(i2, "endIndex ", i3, " must be <= length "));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "beginIndex ", i2, " must be <= endIndex "));
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new bv31(this.f31266a, this.f31267b + i, this.f31268c + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bv31.class == obj.getClass()) {
            bv31 bv31Var = (bv31) obj;
            if (this.f31266a == bv31Var.f31266a && this.f31267b == bv31Var.f31267b && this.f31268c == bv31Var.f31268c && this.f31269d == bv31Var.f31269d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f31266a), Integer.valueOf(this.f31267b), Integer.valueOf(this.f31268c), Integer.valueOf(this.f31269d));
    }

    public final String toString() {
        StringBuilder sbM36619s = dq60.m36619s(this.f31266a, this.f31267b, "SourceSpan{line=", ", column=", ", input=");
        sbM36619s.append(this.f31268c);
        sbM36619s.append(", length=");
        sbM36619s.append(this.f31269d);
        sbM36619s.append("}");
        return sbM36619s.toString();
    }
}
