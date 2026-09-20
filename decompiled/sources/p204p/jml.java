package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jml implements lml {

    /* JADX INFO: renamed from: a */
    public final dil f113902a;

    /* JADX INFO: renamed from: b */
    public final dil f113903b;

    public jml(dil dilVar, dil dilVar2) {
        this.f113902a = dilVar;
        this.f113903b = dilVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jml)) {
            return false;
        }
        jml jmlVar = (jml) obj;
        return wj50.m88271j(this.f113902a, jmlVar.f113902a) && wj50.m88271j(this.f113903b, jmlVar.f113903b);
    }

    public final int hashCode() {
        return this.f113903b.hashCode() + (this.f113902a.hashCode() * 31);
    }
}
