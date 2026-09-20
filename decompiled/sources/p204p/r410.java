package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r410 {

    /* JADX INFO: renamed from: a */
    public final String f195629a;

    /* JADX INFO: renamed from: b */
    public final String f195630b;

    public r410(String str, String str2) {
        this.f195629a = str;
        this.f195630b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r410)) {
            return false;
        }
        r410 r410Var = (r410) obj;
        return wj50.m88271j(this.f195629a, r410Var.f195629a) && wj50.m88271j(this.f195630b, r410Var.f195630b);
    }

    public final int hashCode() {
        return this.f195630b.hashCode() + (this.f195629a.hashCode() * 31);
    }
}
