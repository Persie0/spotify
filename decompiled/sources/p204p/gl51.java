package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class gl51 {

    /* JADX INFO: renamed from: a */
    public final int f81001a;

    /* JADX INFO: renamed from: b */
    public final Object[] f81002b;

    public gl51(int i, Object[] objArr) {
        this.f81001a = i;
        this.f81002b = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl51)) {
            return false;
        }
        gl51 gl51Var = (gl51) obj;
        return this.f81001a == gl51Var.f81001a && wj50.m88271j(this.f81002b, gl51Var.f81002b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f81002b) + (Integer.hashCode(this.f81001a) * 31);
    }
}
