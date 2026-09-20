package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oxs implements wxs {

    /* JADX INFO: renamed from: a */
    public final String f171534a;

    /* JADX INFO: renamed from: b */
    public final String f171535b;

    /* JADX INFO: renamed from: c */
    public final d850 f171536c;

    public oxs(String str, String str2, d850 d850Var) {
        this.f171534a = str;
        this.f171535b = str2;
        this.f171536c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxs)) {
            return false;
        }
        oxs oxsVar = (oxs) obj;
        return wj50.m88271j(this.f171534a, oxsVar.f171534a) && wj50.m88271j(this.f171535b, oxsVar.f171535b) && wj50.m88271j(this.f171536c, oxsVar.f171536c);
    }

    public final int hashCode() {
        return this.f171536c.hashCode() + s571.m77243b(this.f171534a.hashCode() * 31, 31, this.f171535b);
    }
}
