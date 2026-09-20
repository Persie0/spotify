package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fu5 implements gu5 {

    /* JADX INFO: renamed from: a */
    public final int f73404a;

    /* JADX INFO: renamed from: b */
    public final int f73405b;

    /* JADX INFO: renamed from: c */
    public final Object f73406c;

    public fu5(int i, int i2, List list) {
        this.f73404a = i;
        this.f73405b = i2;
        this.f73406c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu5)) {
            return false;
        }
        fu5 fu5Var = (fu5) obj;
        return this.f73404a == fu5Var.f73404a && this.f73405b == fu5Var.f73405b && this.f73406c.equals(fu5Var.f73406c);
    }

    public final int hashCode() {
        return this.f73406c.hashCode() + mt60.m62800g(this.f73405b, Integer.hashCode(this.f73404a) * 31, 31);
    }
}
