package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class iwv {

    /* JADX INFO: renamed from: a */
    public final String f106513a;

    /* JADX INFO: renamed from: b */
    public final String f106514b;

    /* JADX INFO: renamed from: c */
    public final kwv f106515c;

    /* JADX INFO: renamed from: d */
    public final mq8 f106516d;

    /* JADX INFO: renamed from: e */
    public final boolean f106517e;

    /* JADX INFO: renamed from: f */
    public final jwv f106518f;

    public iwv(String str, String str2, kwv kwvVar, mq8 mq8Var, boolean z, jwv jwvVar) {
        this.f106513a = str;
        this.f106514b = str2;
        this.f106515c = kwvVar;
        this.f106516d = mq8Var;
        this.f106517e = z;
        this.f106518f = jwvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwv)) {
            return false;
        }
        iwv iwvVar = (iwv) obj;
        return wj50.m88271j(this.f106513a, iwvVar.f106513a) && wj50.m88271j(this.f106514b, iwvVar.f106514b) && this.f106515c == iwvVar.f106515c && wj50.m88271j(this.f106516d, iwvVar.f106516d) && this.f106517e == iwvVar.f106517e && this.f106518f == iwvVar.f106518f;
    }

    public final int hashCode() {
        String str = this.f106513a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f106514b;
        int iHashCode2 = (this.f106515c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        mq8 mq8Var = this.f106516d;
        return this.f106518f.hashCode() + s571.m77245d((iHashCode2 + (mq8Var != null ? mq8Var.hashCode() : 0)) * 31, 31, this.f106517e);
    }
}
