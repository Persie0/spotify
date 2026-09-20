package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class l1b1 implements Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final l1b1 f128680c = new l1b1(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f128681a;

    /* JADX INFO: renamed from: b */
    public final long f128682b;

    public l1b1(long j, long j2) {
        this.f128681a = j;
        this.f128682b = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        m1b1 m1b1Var = new m1b1();
        m1b1Var.f138923a = this.f128681a;
        m1b1Var.f138924b = this.f128682b;
        return m1b1Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l1b1 l1b1Var = (l1b1) obj;
        long j = l1b1Var.f128681a;
        long j2 = this.f128681a;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f128682b ^ Long.MIN_VALUE, l1b1Var.f128682b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1b1)) {
            return false;
        }
        l1b1 l1b1Var = (l1b1) obj;
        return this.f128681a == l1b1Var.f128681a && this.f128682b == l1b1Var.f128682b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f128681a ^ this.f128682b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        epv0.m39695o(this.f128681a, bArr, 0, 0, 4);
        bArr[8] = 45;
        epv0.m39695o(this.f128681a, bArr, 9, 4, 6);
        bArr[13] = 45;
        epv0.m39695o(this.f128681a, bArr, 14, 6, 8);
        bArr[18] = 45;
        epv0.m39695o(this.f128682b, bArr, 19, 0, 2);
        bArr[23] = 45;
        epv0.m39695o(this.f128682b, bArr, 24, 2, 8);
        return new String(bArr, vuc.f244913a);
    }
}
