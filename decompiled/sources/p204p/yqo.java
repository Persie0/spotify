package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yqo {

    /* JADX INFO: renamed from: a */
    public final String f275267a;

    /* JADX INFO: renamed from: b */
    public final String f275268b;

    public yqo(String str, String str2) {
        this.f275267a = str;
        this.f275268b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqo)) {
            return false;
        }
        yqo yqoVar = (yqo) obj;
        return wj50.m88271j(this.f275267a, yqoVar.f275267a) && wj50.m88271j(this.f275268b, yqoVar.f275268b);
    }

    public final int hashCode() {
        return this.f275268b.hashCode() + (this.f275267a.hashCode() * 31);
    }
}
