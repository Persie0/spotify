package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zp1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final String f284898a;

    public zp1(String str) {
        this.f284898a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp1) && wj50.m88271j(this.f284898a, ((zp1) obj).f284898a);
    }

    public final int hashCode() {
        return this.f284898a.hashCode();
    }
}
