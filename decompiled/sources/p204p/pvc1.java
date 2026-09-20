package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pvc1 {

    /* JADX INFO: renamed from: a */
    public final String f181688a;

    /* JADX INFO: renamed from: b */
    public final String f181689b;

    public pvc1(String str, String str2) {
        this.f181688a = str;
        this.f181689b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvc1)) {
            return false;
        }
        pvc1 pvc1Var = (pvc1) obj;
        return wj50.m88271j(this.f181688a, pvc1Var.f181688a) && wj50.m88271j(this.f181689b, pvc1Var.f181689b);
    }

    public final int hashCode() {
        return this.f181689b.hashCode() + (this.f181688a.hashCode() * 31);
    }
}
