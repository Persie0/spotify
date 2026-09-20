package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nyq0 {

    /* JADX INFO: renamed from: a */
    public final String f159889a;

    /* JADX INFO: renamed from: b */
    public final int f159890b;

    public nyq0(String str, int i) {
        this.f159889a = str;
        this.f159890b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyq0)) {
            return false;
        }
        nyq0 nyq0Var = (nyq0) obj;
        return wj50.m88271j(this.f159889a, nyq0Var.f159889a) && this.f159890b == nyq0Var.f159890b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f159890b) + (this.f159889a.hashCode() * 31);
    }
}
