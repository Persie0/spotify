package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u8t {

    /* JADX INFO: renamed from: a */
    public final String f228013a;

    /* JADX INFO: renamed from: b */
    public final String f228014b;

    public u8t(String str, String str2) {
        this.f228013a = str;
        this.f228014b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8t)) {
            return false;
        }
        u8t u8tVar = (u8t) obj;
        return wj50.m88271j(this.f228013a, u8tVar.f228013a) && wj50.m88271j(this.f228014b, u8tVar.f228014b);
    }

    public final int hashCode() {
        return this.f228014b.hashCode() + (this.f228013a.hashCode() * 31);
    }
}
