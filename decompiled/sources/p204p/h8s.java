package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h8s {

    /* JADX INFO: renamed from: a */
    public final String f88778a;

    /* JADX INFO: renamed from: b */
    public final String f88779b;

    public h8s(String str, String str2) {
        this.f88778a = str;
        this.f88779b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8s)) {
            return false;
        }
        h8s h8sVar = (h8s) obj;
        return wj50.m88271j(this.f88778a, h8sVar.f88778a) && wj50.m88271j(this.f88779b, h8sVar.f88779b);
    }

    public final int hashCode() {
        return this.f88779b.hashCode() + (this.f88778a.hashCode() * 31);
    }
}
