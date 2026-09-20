package p204p;

import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ize1 implements Comparable, Serializable {

    /* JADX INFO: renamed from: a */
    public final lba0 f107207a;

    /* JADX INFO: renamed from: b */
    public final hze1 f107208b;

    /* JADX INFO: renamed from: c */
    public final hze1 f107209c;

    public ize1(lba0 lba0Var, hze1 hze1Var, hze1 hze1Var2) {
        this.f107207a = lba0Var;
        this.f107208b = hze1Var;
        this.f107209c = hze1Var2;
    }

    /* JADX INFO: renamed from: h */
    public static ize1 m51992h(DataInput dataInput) throws IOException {
        long jM51640a = itz0.m51640a(dataInput);
        hze1 hze1VarM51642c = itz0.m51642c(dataInput);
        hze1 hze1VarM51642c2 = itz0.m51642c(dataInput);
        if (hze1VarM51642c.equals(hze1VarM51642c2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new ize1(jM51640a, hze1VarM51642c, hze1VarM51642c2);
    }

    private Object writeReplace() {
        return new itz0((byte) 2, this);
    }

    /* JADX INFO: renamed from: a */
    public final lba0 m51993a() {
        return this.f107207a.m58646B6(this.f107209c.f96910b - this.f107208b.f96910b);
    }

    /* JADX INFO: renamed from: b */
    public final lba0 m51994b() {
        return this.f107207a;
    }

    /* JADX INFO: renamed from: c */
    public final dks m51995c() {
        return dks.m36312a(0, this.f107209c.f96910b - this.f107208b.f96910b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ize1 ize1Var = (ize1) obj;
        return this.f107207a.m41300m6(this.f107208b).compareTo(ize1Var.f107207a.m41300m6(ize1Var.f107208b));
    }

    /* JADX INFO: renamed from: d */
    public final hze1 m51996d() {
        return this.f107209c;
    }

    /* JADX INFO: renamed from: e */
    public final hze1 m51997e() {
        return this.f107208b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ize1) {
            ize1 ize1Var = (ize1) obj;
            if (this.f107207a.equals(ize1Var.f107207a) && this.f107208b.equals(ize1Var.f107208b) && this.f107209c.equals(ize1Var.f107209c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final List m51998f() {
        return m51999g() ? Collections.EMPTY_LIST : Arrays.asList(this.f107208b, this.f107209c);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m51999g() {
        return this.f107209c.f96910b > this.f107208b.f96910b;
    }

    public final int hashCode() {
        return (this.f107207a.hashCode() ^ this.f107208b.f96910b) ^ Integer.rotateLeft(this.f107209c.f96910b, 16);
    }

    public final long toEpochSecond() {
        return this.f107207a.m41299l6(this.f107208b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m51999g() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f107207a);
        sb.append(this.f107208b);
        sb.append(" to ");
        sb.append(this.f107209c);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        itz0.m51643d(toEpochSecond(), objectOutput);
        itz0.m51644e(this.f107208b, objectOutput);
        itz0.m51644e(this.f107209c, objectOutput);
    }

    public ize1(long j, hze1 hze1Var, hze1 hze1Var2) {
        this.f107207a = lba0.m58642w6(j, 0, hze1Var);
        this.f107208b = hze1Var;
        this.f107209c = hze1Var2;
    }
}
