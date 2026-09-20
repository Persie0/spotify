package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hqe implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f94117a;

    /* JADX INFO: renamed from: b */
    public final String f94118b;

    /* JADX INFO: renamed from: c */
    public final String f94119c;

    public hqe(String str, String str2, String str3) {
        this.f94117a = str;
        this.f94118b = str2;
        this.f94119c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqe)) {
            return false;
        }
        hqe hqeVar = (hqe) obj;
        return wj50.m88271j(this.f94117a, hqeVar.f94117a) && wj50.m88271j(this.f94118b, hqeVar.f94118b) && wj50.m88271j(this.f94119c, hqeVar.f94119c);
    }

    public final int hashCode() {
        return this.f94119c.hashCode() + s571.m77243b(this.f94117a.hashCode() * 31, 31, this.f94118b);
    }
}
