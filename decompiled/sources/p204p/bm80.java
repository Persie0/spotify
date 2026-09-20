package p204p;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class bm80 {
    public static final am80 Companion = new am80();

    /* JADX INFO: renamed from: a */
    public final String f28465a;

    /* JADX INFO: renamed from: b */
    public final String f28466b;

    public /* synthetic */ bm80(int i, String str, String str2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, zl80.f283945a.getDescriptor());
            throw null;
        }
        this.f28465a = str;
        this.f28466b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm80)) {
            return false;
        }
        bm80 bm80Var = (bm80) obj;
        return wj50.m88271j(this.f28465a, bm80Var.f28465a) && wj50.m88271j(this.f28466b, bm80Var.f28466b);
    }

    public final int hashCode() {
        return this.f28466b.hashCode() + (this.f28465a.hashCode() * 31);
    }

    public bm80(String str, String str2) {
        this.f28465a = str;
        this.f28466b = str2;
    }
}
