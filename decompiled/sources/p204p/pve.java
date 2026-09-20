package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pve {

    /* JADX INFO: renamed from: a */
    public final Integer f181725a;

    /* JADX INFO: renamed from: b */
    public final String f181726b;

    /* JADX INFO: renamed from: c */
    public final String f181727c;

    /* JADX INFO: renamed from: d */
    public final Long f181728d;

    public pve(Integer num, String str, String str2, Long l) {
        this.f181725a = num;
        this.f181726b = str;
        this.f181727c = str2;
        this.f181728d = l;
    }

    /* JADX INFO: renamed from: a */
    public final String m71139a() {
        return this.f181726b;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m71140b() {
        return this.f181725a;
    }

    /* JADX INFO: renamed from: c */
    public final String m71141c() {
        return this.f181727c;
    }

    /* JADX INFO: renamed from: d */
    public final Long m71142d() {
        return this.f181728d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pve)) {
            return false;
        }
        pve pveVar = (pve) obj;
        return wj50.m88271j(this.f181725a, pveVar.f181725a) && wj50.m88271j(this.f181726b, pveVar.f181726b) && wj50.m88271j(this.f181727c, pveVar.f181727c) && wj50.m88271j(this.f181728d, pveVar.f181728d);
    }

    public final int hashCode() {
        Integer num = this.f181725a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f181726b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f181727c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f181728d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "Broadcasts(id=" + this.f181725a + ", from=" + this.f181726b + ", deviceId=" + this.f181727c + ", createdAt=" + this.f181728d + ")";
    }
}
