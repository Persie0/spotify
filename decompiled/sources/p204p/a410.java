package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a410 {

    /* JADX INFO: renamed from: a */
    public final String f12111a;

    /* JADX INFO: renamed from: b */
    public final String f12112b;

    /* JADX INFO: renamed from: c */
    public final Object f12113c;

    /* JADX INFO: renamed from: d */
    public final Long f12114d;

    public a410(String str, String str2, Long l, Long l2) {
        this.f12111a = str;
        this.f12112b = str2;
        this.f12113c = l;
        this.f12114d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a410)) {
            return false;
        }
        a410 a410Var = (a410) obj;
        return wj50.m88271j(this.f12111a, a410Var.f12111a) && wj50.m88271j(this.f12112b, a410Var.f12112b) && wj50.m88271j(this.f12113c, a410Var.f12113c) && wj50.m88271j(this.f12114d, a410Var.f12114d);
    }

    public final int hashCode() {
        int iHashCode = this.f12111a.hashCode() * 31;
        String str = this.f12112b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.f12113c;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l = this.f12114d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }
}
