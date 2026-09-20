package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uqj0 {

    /* JADX INFO: renamed from: a */
    public final String f233062a;

    /* JADX INFO: renamed from: b */
    public final String f233063b;

    public uqj0(String str, String str2) {
        this.f233062a = str;
        this.f233063b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqj0)) {
            return false;
        }
        uqj0 uqj0Var = (uqj0) obj;
        return wj50.m88271j(this.f233062a, uqj0Var.f233062a) && wj50.m88271j(this.f233063b, uqj0Var.f233063b);
    }

    public final int hashCode() {
        return this.f233063b.hashCode() + (this.f233062a.hashCode() * 31);
    }
}
