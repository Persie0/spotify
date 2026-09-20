package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mak {

    /* JADX INFO: renamed from: a */
    public final String f141608a;

    /* JADX INFO: renamed from: b */
    public final String f141609b;

    public /* synthetic */ mak() {
        this("", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mak)) {
            return false;
        }
        mak makVar = (mak) obj;
        return wj50.m88271j(this.f141608a, makVar.f141608a) && wj50.m88271j(this.f141609b, makVar.f141609b);
    }

    public final int hashCode() {
        return this.f141609b.hashCode() + (this.f141608a.hashCode() * 31);
    }

    public mak(String str, String str2) {
        this.f141608a = str;
        this.f141609b = str2;
    }
}
