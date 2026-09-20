package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ref implements sef {

    /* JADX INFO: renamed from: a */
    public final String f198360a;

    /* JADX INFO: renamed from: b */
    public final String f198361b;

    /* JADX INFO: renamed from: c */
    public final String f198362c;

    public ref(String str, String str2, String str3) {
        this.f198360a = str;
        this.f198361b = str2;
        this.f198362c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ref)) {
            return false;
        }
        ref refVar = (ref) obj;
        return wj50.m88271j(this.f198360a, refVar.f198360a) && wj50.m88271j(this.f198361b, refVar.f198361b) && wj50.m88271j(this.f198362c, refVar.f198362c);
    }

    public final int hashCode() {
        return this.f198362c.hashCode() + s571.m77243b(this.f198360a.hashCode() * 31, 31, this.f198361b);
    }
}
