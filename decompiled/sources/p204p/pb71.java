package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pb71 {

    /* JADX INFO: renamed from: a */
    public final String f175731a;

    /* JADX INFO: renamed from: b */
    public final String f175732b;

    public pb71(String str, String str2) {
        this.f175731a = str;
        this.f175732b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb71)) {
            return false;
        }
        pb71 pb71Var = (pb71) obj;
        return wj50.m88271j(this.f175731a, pb71Var.f175731a) && wj50.m88271j(this.f175732b, pb71Var.f175732b);
    }

    public final int hashCode() {
        return this.f175732b.hashCode() + (this.f175731a.hashCode() * 31);
    }
}
