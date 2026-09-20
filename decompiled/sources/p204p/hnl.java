package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hnl implements knl {

    /* JADX INFO: renamed from: a */
    public final String f93359a;

    /* JADX INFO: renamed from: b */
    public final String f93360b;

    public hnl(String str, String str2) {
        this.f93359a = str;
        this.f93360b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnl)) {
            return false;
        }
        hnl hnlVar = (hnl) obj;
        return wj50.m88271j(this.f93359a, hnlVar.f93359a) && wj50.m88271j(this.f93360b, hnlVar.f93360b);
    }

    public final int hashCode() {
        int iHashCode = this.f93359a.hashCode() * 31;
        String str = this.f93360b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
