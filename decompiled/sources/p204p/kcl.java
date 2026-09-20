package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kcl {

    /* JADX INFO: renamed from: a */
    public final String f121506a;

    /* JADX INFO: renamed from: b */
    public final String f121507b;

    public kcl(String str, String str2) {
        this.f121506a = str;
        this.f121507b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcl)) {
            return false;
        }
        kcl kclVar = (kcl) obj;
        return wj50.m88271j(this.f121506a, kclVar.f121506a) && wj50.m88271j(this.f121507b, kclVar.f121507b);
    }

    public final int hashCode() {
        return this.f121507b.hashCode() + (this.f121506a.hashCode() * 31);
    }
}
