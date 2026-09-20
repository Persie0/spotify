package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gmy implements hmy {

    /* JADX INFO: renamed from: a */
    public final String f81497a;

    /* JADX INFO: renamed from: b */
    public final String f81498b;

    /* JADX INFO: renamed from: c */
    public final String f81499c;

    /* JADX INFO: renamed from: d */
    public final String f81500d;

    public gmy(String str, String str2, String str3, String str4) {
        this.f81497a = str;
        this.f81498b = str2;
        this.f81499c = str3;
        this.f81500d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmy)) {
            return false;
        }
        gmy gmyVar = (gmy) obj;
        return wj50.m88271j(this.f81497a, gmyVar.f81497a) && wj50.m88271j(this.f81498b, gmyVar.f81498b) && wj50.m88271j(this.f81499c, gmyVar.f81499c) && wj50.m88271j(this.f81500d, gmyVar.f81500d);
    }

    public final int hashCode() {
        return this.f81500d.hashCode() + s571.m77243b(s571.m77243b(this.f81497a.hashCode() * 31, 31, this.f81498b), 31, this.f81499c);
    }
}
