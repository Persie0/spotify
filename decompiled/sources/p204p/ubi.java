package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ubi {

    /* JADX INFO: renamed from: a */
    public final String f228771a;

    /* JADX INFO: renamed from: b */
    public final String f228772b;

    public ubi(String str, String str2) {
        this.f228771a = str;
        this.f228772b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubi)) {
            return false;
        }
        ubi ubiVar = (ubi) obj;
        return wj50.m88271j(this.f228771a, ubiVar.f228771a) && wj50.m88271j(this.f228772b, ubiVar.f228772b);
    }

    public final int hashCode() {
        return this.f228772b.hashCode() + (this.f228771a.hashCode() * 31);
    }
}
