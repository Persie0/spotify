package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nif {

    /* JADX INFO: renamed from: a */
    public final String f154253a;

    /* JADX INFO: renamed from: b */
    public final String f154254b;

    /* JADX INFO: renamed from: c */
    public final String f154255c;

    /* JADX INFO: renamed from: d */
    public final Long f154256d;

    public nif(String str, String str2, String str3, Long l) {
        this.f154253a = str;
        this.f154254b = str2;
        this.f154255c = str3;
        this.f154256d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nif)) {
            return false;
        }
        nif nifVar = (nif) obj;
        return wj50.m88271j(this.f154253a, nifVar.f154253a) && wj50.m88271j(this.f154254b, nifVar.f154254b) && wj50.m88271j(this.f154255c, nifVar.f154255c) && wj50.m88271j(this.f154256d, nifVar.f154256d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f154253a.hashCode() * 31, 31, this.f154254b), 31, this.f154255c);
        Long l = this.f154256d;
        return iM77243b + (l == null ? 0 : l.hashCode());
    }
}
