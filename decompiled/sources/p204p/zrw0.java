package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zrw0 {

    /* JADX INFO: renamed from: a */
    public final String f285770a;

    /* JADX INFO: renamed from: b */
    public final String f285771b;

    public zrw0(String str, String str2) {
        this.f285770a = str;
        this.f285771b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrw0)) {
            return false;
        }
        zrw0 zrw0Var = (zrw0) obj;
        return wj50.m88271j(this.f285770a, zrw0Var.f285770a) && wj50.m88271j(this.f285771b, zrw0Var.f285771b);
    }

    public final int hashCode() {
        return this.f285771b.hashCode() + (this.f285770a.hashCode() * 31);
    }
}
