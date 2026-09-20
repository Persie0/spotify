package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final int f277385a;

    /* JADX INFO: renamed from: b */
    public final String f277386b;

    /* JADX INFO: renamed from: c */
    public final int f277387c;

    public yy21(int i, String str, int i2) {
        this.f277385a = i;
        this.f277386b = str;
        this.f277387c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy21)) {
            return false;
        }
        yy21 yy21Var = (yy21) obj;
        return this.f277385a == yy21Var.f277385a && wj50.m88271j(this.f277386b, yy21Var.f277386b) && this.f277387c == yy21Var.f277387c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f277387c) + s571.m77243b(Integer.hashCode(this.f277385a) * 31, 31, this.f277386b);
    }
}
