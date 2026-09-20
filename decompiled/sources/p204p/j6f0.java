package p204p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j6f0 {

    /* JADX INFO: renamed from: a */
    public final s5f0[] f109303a;

    /* JADX INFO: renamed from: b */
    public final long f109304b;

    public j6f0(s5f0... s5f0VarArr) {
        this(-9223372036854775807L, s5f0VarArr);
    }

    /* JADX INFO: renamed from: a */
    public final j6f0 m52573a(s5f0... s5f0VarArr) {
        if (s5f0VarArr.length == 0) {
            return this;
        }
        String str = h0b1.f86200a;
        s5f0[] s5f0VarArr2 = this.f109303a;
        Object[] objArrCopyOf = Arrays.copyOf(s5f0VarArr2, s5f0VarArr2.length + s5f0VarArr.length);
        System.arraycopy(s5f0VarArr, 0, objArrCopyOf, s5f0VarArr2.length, s5f0VarArr.length);
        return new j6f0(this.f109304b, (s5f0[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: b */
    public final j6f0 m52574b(j6f0 j6f0Var) {
        return j6f0Var == null ? this : m52573a(j6f0Var.f109303a);
    }

    /* JADX INFO: renamed from: c */
    public final wsv0 m52575c(Class cls) {
        jf40 jf40VarM69788m = pf40.m69788m();
        for (s5f0 s5f0Var : this.f109303a) {
            if (cls.isAssignableFrom(s5f0Var.getClass())) {
                jf40VarM69788m.m28985c((s5f0) cls.cast(s5f0Var));
            }
        }
        return jf40VarM69788m.m53150g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j6f0.class == obj.getClass()) {
            j6f0 j6f0Var = (j6f0) obj;
            if (Arrays.equals(this.f109303a, j6f0Var.f109303a) && this.f109304b == j6f0Var.f109304b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return kgg1.m56352o(this.f109304b) + (Arrays.hashCode(this.f109303a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f109303a));
        long j = this.f109304b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public j6f0(long j, s5f0... s5f0VarArr) {
        this.f109304b = j;
        this.f109303a = s5f0VarArr;
    }

    public j6f0(List list) {
        this((s5f0[]) list.toArray(new s5f0[0]));
    }
}
