package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class izk0 {

    /* JADX INFO: renamed from: a */
    public final String f107249a;

    /* JADX INFO: renamed from: b */
    public final String f107250b;

    public izk0(String str, String str2) {
        this.f107249a = str;
        this.f107250b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m52027a() {
        return this.f107249a;
    }

    /* JADX INFO: renamed from: b */
    public final String m52028b() {
        return this.f107250b;
    }

    /* JADX INFO: renamed from: c */
    public final String m52029c() {
        return this.f107250b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izk0)) {
            return false;
        }
        izk0 izk0Var = (izk0) obj;
        return wj50.m88271j(this.f107249a, izk0Var.f107249a) && wj50.m88271j(this.f107250b, izk0Var.f107250b);
    }

    public final int hashCode() {
        return this.f107250b.hashCode() + (this.f107249a.hashCode() * 31);
    }
}
