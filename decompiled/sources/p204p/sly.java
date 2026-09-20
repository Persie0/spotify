package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sly implements hmy {

    /* JADX INFO: renamed from: a */
    public final String f210514a;

    /* JADX INFO: renamed from: b */
    public final String f210515b;

    public sly(String str, String str2) {
        this.f210514a = str;
        this.f210515b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sly)) {
            return false;
        }
        sly slyVar = (sly) obj;
        return wj50.m88271j(this.f210514a, slyVar.f210514a) && wj50.m88271j(this.f210515b, slyVar.f210515b);
    }

    public final int hashCode() {
        return this.f210515b.hashCode() + (this.f210514a.hashCode() * 31);
    }
}
