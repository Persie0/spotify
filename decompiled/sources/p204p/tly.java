package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tly implements hmy {

    /* JADX INFO: renamed from: a */
    public final String f221537a;

    public tly(String str) {
        this.f221537a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tly) && wj50.m88271j(this.f221537a, ((tly) obj).f221537a);
    }

    public final int hashCode() {
        return this.f221537a.hashCode();
    }
}
