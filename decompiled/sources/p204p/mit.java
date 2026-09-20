package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mit implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f144094a;

    /* JADX INFO: renamed from: b */
    public final String f144095b;

    public mit(String str, String str2) {
        this.f144094a = str;
        this.f144095b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mit)) {
            return false;
        }
        mit mitVar = (mit) obj;
        return wj50.m88271j(this.f144094a, mitVar.f144094a) && wj50.m88271j(this.f144095b, mitVar.f144095b);
    }

    public final int hashCode() {
        return this.f144095b.hashCode() + (this.f144094a.hashCode() * 31);
    }
}
