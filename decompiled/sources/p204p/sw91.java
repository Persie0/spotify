package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sw91 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f214629a;

    /* JADX INFO: renamed from: b */
    public final boolean f214630b;

    /* JADX INFO: renamed from: c */
    public final boolean f214631c;

    public sw91(int i, boolean z, boolean z2, boolean z3) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        this.f214629a = z;
        this.f214630b = z2;
        this.f214631c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw91)) {
            return false;
        }
        sw91 sw91Var = (sw91) obj;
        return this.f214629a == sw91Var.f214629a && this.f214630b == sw91Var.f214630b && this.f214631c == sw91Var.f214631c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214631c) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f214629a) * 31, 31, this.f214630b), 31, true);
    }
}
