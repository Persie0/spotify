package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f210537a;

    public sm1(String str) {
        this.f210537a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm1) && wj50.m88271j(this.f210537a, ((sm1) obj).f210537a);
    }

    public final int hashCode() {
        return this.f210537a.hashCode();
    }
}
