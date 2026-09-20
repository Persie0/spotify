package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class euj {

    /* JADX INFO: renamed from: a */
    public final String f62987a;

    /* JADX INFO: renamed from: b */
    public final String f62988b;

    public euj(String str, String str2) {
        this.f62987a = str;
        this.f62988b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euj)) {
            return false;
        }
        euj eujVar = (euj) obj;
        return wj50.m88271j(this.f62987a, eujVar.f62987a) && wj50.m88271j(this.f62988b, eujVar.f62988b);
    }

    public final int hashCode() {
        return this.f62988b.hashCode() + (this.f62987a.hashCode() * 31);
    }
}
