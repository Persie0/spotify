package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class km91 implements dbv {

    /* JADX INFO: renamed from: a */
    public final String f124087a;

    /* JADX INFO: renamed from: b */
    public final String f124088b;

    /* JADX INFO: renamed from: c */
    public final cbv f124089c;

    public km91(String str, String str2, cbv cbvVar) {
        this.f124087a = str;
        this.f124088b = str2;
        this.f124089c = cbvVar;
    }

    @Override // p204p.dbv
    /* JADX INFO: renamed from: a */
    public final cbv mo35608a() {
        return this.f124089c;
    }

    @Override // p204p.dbv
    /* JADX INFO: renamed from: b */
    public final String mo35609b() {
        return this.f124088b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km91)) {
            return false;
        }
        km91 km91Var = (km91) obj;
        return wj50.m88271j(this.f124087a, km91Var.f124087a) && wj50.m88271j(this.f124088b, km91Var.f124088b) && wj50.m88271j(this.f124089c, km91Var.f124089c);
    }

    @Override // p204p.dbv
    public final String getFormat() {
        return this.f124087a;
    }

    public final int hashCode() {
        return this.f124089c.hashCode() + s571.m77243b(this.f124087a.hashCode() * 31, 31, this.f124088b);
    }
}
