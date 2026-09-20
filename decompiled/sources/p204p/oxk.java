package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oxk implements txk {

    /* JADX INFO: renamed from: a */
    public final String f171006a;

    /* JADX INFO: renamed from: b */
    public final String f171007b;

    public oxk(String str, String str2) {
        this.f171006a = str;
        this.f171007b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxk)) {
            return false;
        }
        oxk oxkVar = (oxk) obj;
        return wj50.m88271j(this.f171006a, oxkVar.f171006a) && wj50.m88271j(this.f171007b, oxkVar.f171007b);
    }

    public final int hashCode() {
        return this.f171007b.hashCode() + (this.f171006a.hashCode() * 31);
    }
}
