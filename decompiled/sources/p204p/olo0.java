package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class olo0 implements rlo0 {

    /* JADX INFO: renamed from: a */
    public final String f166868a;

    /* JADX INFO: renamed from: b */
    public final String f166869b;

    /* JADX INFO: renamed from: c */
    public final String f166870c;

    public olo0(String str, String str2, String str3) {
        this.f166868a = str;
        this.f166869b = str2;
        this.f166870c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olo0)) {
            return false;
        }
        olo0 olo0Var = (olo0) obj;
        return wj50.m88271j(this.f166868a, olo0Var.f166868a) && wj50.m88271j(this.f166869b, olo0Var.f166869b) && wj50.m88271j(this.f166870c, olo0Var.f166870c);
    }

    public final int hashCode() {
        return this.f166870c.hashCode() + s571.m77243b(this.f166868a.hashCode() * 31, 31, this.f166869b);
    }
}
