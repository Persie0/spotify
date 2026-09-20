package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a0w {

    /* JADX INFO: renamed from: a */
    public final String f11176a;

    /* JADX INFO: renamed from: b */
    public final String f11177b;

    /* JADX INFO: renamed from: c */
    public final String f11178c;

    /* JADX INFO: renamed from: d */
    public final uzk f11179d;

    public a0w(String str, String str2, String str3, uzk uzkVar) {
        this.f11176a = str;
        this.f11177b = str2;
        this.f11178c = str3;
        this.f11179d = uzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0w)) {
            return false;
        }
        a0w a0wVar = (a0w) obj;
        return wj50.m88271j(this.f11176a, a0wVar.f11176a) && wj50.m88271j(this.f11177b, a0wVar.f11177b) && wj50.m88271j(this.f11178c, a0wVar.f11178c) && wj50.m88271j(this.f11179d, a0wVar.f11179d);
    }

    public final int hashCode() {
        return this.f11179d.hashCode() + s571.m77243b(s571.m77243b(this.f11176a.hashCode() * 31, 31, this.f11177b), 31, this.f11178c);
    }
}
