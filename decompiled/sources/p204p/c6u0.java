package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c6u0 {

    /* JADX INFO: renamed from: a */
    public final int f34630a;

    /* JADX INFO: renamed from: b */
    public final int f34631b;

    /* JADX INFO: renamed from: c */
    public final int f34632c;

    public c6u0(int i, int i2, int i3) {
        this.f34630a = i;
        this.f34631b = i2;
        this.f34632c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6u0)) {
            return false;
        }
        c6u0 c6u0Var = (c6u0) obj;
        return this.f34630a == c6u0Var.f34630a && this.f34631b == c6u0Var.f34631b && this.f34632c == c6u0Var.f34632c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34632c) + mt60.m62800g(this.f34631b, Integer.hashCode(this.f34630a) * 31, 31);
    }

    public /* synthetic */ c6u0(int i, int i2, int i3, int i4) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 0);
    }
}
