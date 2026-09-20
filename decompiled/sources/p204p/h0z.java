package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h0z {

    /* JADX INFO: renamed from: a */
    public final String f86385a;

    /* JADX INFO: renamed from: b */
    public final kyy f86386b;

    /* JADX INFO: renamed from: c */
    public final boolean f86387c;

    /* JADX INFO: renamed from: d */
    public final boolean f86388d;

    /* JADX INFO: renamed from: e */
    public final boolean f86389e;

    public h0z(String str, kyy kyyVar, boolean z, boolean z2, boolean z3) {
        this.f86385a = str;
        this.f86386b = kyyVar;
        this.f86387c = z;
        this.f86388d = z2;
        this.f86389e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0z)) {
            return false;
        }
        h0z h0zVar = (h0z) obj;
        return this.f86385a.equals(h0zVar.f86385a) && this.f86386b == h0zVar.f86386b && this.f86387c == h0zVar.f86387c && this.f86388d == h0zVar.f86388d && this.f86389e == h0zVar.f86389e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86389e) + s571.m77245d(s571.m77245d((this.f86386b.hashCode() + (this.f86385a.hashCode() * 31)) * 31, 31, this.f86387c), 31, this.f86388d);
    }
}
