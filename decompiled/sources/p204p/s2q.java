package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s2q {

    /* JADX INFO: renamed from: a */
    public final String f205049a;

    /* JADX INFO: renamed from: b */
    public final String f205050b;

    public s2q(String str, String str2) {
        this.f205049a = str;
        this.f205050b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2q)) {
            return false;
        }
        s2q s2qVar = (s2q) obj;
        return wj50.m88271j(this.f205049a, s2qVar.f205049a) && wj50.m88271j(this.f205050b, s2qVar.f205050b);
    }

    public final int hashCode() {
        return this.f205050b.hashCode() + (this.f205049a.hashCode() * 31);
    }
}
