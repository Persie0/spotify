package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oc21 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f163799a;

    /* JADX INFO: renamed from: b */
    public final String f163800b;

    public oc21(String str, String str2) {
        this.f163799a = str;
        this.f163800b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc21)) {
            return false;
        }
        oc21 oc21Var = (oc21) obj;
        return wj50.m88271j(this.f163799a, oc21Var.f163799a) && wj50.m88271j(this.f163800b, oc21Var.f163800b);
    }

    public final int hashCode() {
        return this.f163800b.hashCode() + (this.f163799a.hashCode() * 31);
    }
}
