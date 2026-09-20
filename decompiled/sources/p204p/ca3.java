package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ca3 implements ha3, ia3 {

    /* JADX INFO: renamed from: a */
    public final String f35710a;

    /* JADX INFO: renamed from: b */
    public final String f35711b;

    /* JADX INFO: renamed from: c */
    public final String f35712c;

    public ca3(String str, String str2, String str3) {
        this.f35710a = str;
        this.f35711b = str2;
        this.f35712c = str3;
    }

    @Override // p204p.ia3
    /* JADX INFO: renamed from: e */
    public final String mo28556e() {
        return this.f35712c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca3)) {
            return false;
        }
        ca3 ca3Var = (ca3) obj;
        return wj50.m88271j(this.f35710a, ca3Var.f35710a) && wj50.m88271j(this.f35711b, ca3Var.f35711b) && wj50.m88271j(this.f35712c, ca3Var.f35712c);
    }

    public final int hashCode() {
        return this.f35712c.hashCode() + s571.m77243b(this.f35710a.hashCode() * 31, 31, this.f35711b);
    }
}
