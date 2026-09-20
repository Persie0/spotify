package p204p;

/* JADX INFO: renamed from: p.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2437u2 {

    /* JADX INFO: renamed from: a */
    public final String f225940a;

    /* JADX INFO: renamed from: b */
    public final String f225941b;

    public C2437u2(String str, String str2) {
        this.f225940a = str;
        this.f225941b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2437u2)) {
            return false;
        }
        C2437u2 c2437u2 = (C2437u2) obj;
        return wj50.m88271j(this.f225940a, c2437u2.f225940a) && wj50.m88271j(this.f225941b, c2437u2.f225941b);
    }

    public final int hashCode() {
        return this.f225941b.hashCode() + (this.f225940a.hashCode() * 31);
    }
}
