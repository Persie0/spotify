package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lu41 implements hv41 {

    /* JADX INFO: renamed from: a */
    public final String f136998a;

    public lu41(String str) {
        this.f136998a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu41) && wj50.m88271j(this.f136998a, ((lu41) obj).f136998a);
    }

    public final int hashCode() {
        return this.f136998a.hashCode();
    }
}
