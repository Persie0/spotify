package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x391 {

    /* JADX INFO: renamed from: a */
    public final String f257718a;

    /* JADX INFO: renamed from: b */
    public final gh00 f257719b;

    public x391(String str, gh00 gh00Var) {
        this.f257718a = str;
        this.f257719b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x391)) {
            return false;
        }
        x391 x391Var = (x391) obj;
        return wj50.m88271j(this.f257718a, x391Var.f257718a) && wj50.m88271j(this.f257719b, x391Var.f257719b);
    }

    public final int hashCode() {
        int iHashCode = this.f257718a.hashCode() * 31;
        gh00 gh00Var = this.f257719b;
        return iHashCode + (gh00Var == null ? 0 : gh00Var.hashCode());
    }
}
