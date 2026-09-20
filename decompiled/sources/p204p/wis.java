package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class wis {
    public static final vis Companion = new vis();

    /* JADX INFO: renamed from: a */
    public final String f251739a;

    /* JADX INFO: renamed from: b */
    public final String f251740b;

    public /* synthetic */ wis(int i, String str, String str2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, uis.f230798a.getDescriptor());
            throw null;
        }
        this.f251739a = str;
        this.f251740b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wis)) {
            return false;
        }
        wis wisVar = (wis) obj;
        return wj50.m88271j(this.f251739a, wisVar.f251739a) && wj50.m88271j(this.f251740b, wisVar.f251740b);
    }

    public final int hashCode() {
        return this.f251740b.hashCode() + (this.f251739a.hashCode() * 31);
    }

    public wis(String str, String str2) {
        this.f251739a = str;
        this.f251740b = str2;
    }
}
