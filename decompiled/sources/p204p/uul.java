package p204p;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class uul {
    public static final tul Companion = new tul();

    /* JADX INFO: renamed from: a */
    public final String f234217a;

    /* JADX INFO: renamed from: b */
    public final String f234218b;

    /* JADX INFO: renamed from: c */
    public final String f234219c;

    public /* synthetic */ uul(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, sul.f214145a.getDescriptor());
            throw null;
        }
        this.f234217a = str;
        this.f234218b = str2;
        this.f234219c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uul)) {
            return false;
        }
        uul uulVar = (uul) obj;
        return wj50.m88271j(this.f234217a, uulVar.f234217a) && wj50.m88271j(this.f234218b, uulVar.f234218b) && wj50.m88271j(this.f234219c, uulVar.f234219c);
    }

    public final int hashCode() {
        return this.f234219c.hashCode() + s571.m77243b(this.f234217a.hashCode() * 31, 31, this.f234218b);
    }
}
