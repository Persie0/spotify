package p204p;

/* JADX INFO: renamed from: p.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2599y3 {

    /* JADX INFO: renamed from: a */
    public final String f268700a;

    /* JADX INFO: renamed from: b */
    public final String f268701b;

    /* JADX INFO: renamed from: c */
    public final String f268702c;

    public C2599y3(String str, String str2, String str3) {
        this.f268700a = str;
        this.f268701b = str2;
        this.f268702c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2599y3)) {
            return false;
        }
        C2599y3 c2599y3 = (C2599y3) obj;
        return wj50.m88271j(this.f268700a, c2599y3.f268700a) && wj50.m88271j(this.f268701b, c2599y3.f268701b) && wj50.m88271j(this.f268702c, c2599y3.f268702c);
    }

    public final int hashCode() {
        return this.f268702c.hashCode() + s571.m77243b(this.f268700a.hashCode() * 31, 31, this.f268701b);
    }
}
