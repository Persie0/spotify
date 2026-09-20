package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cq1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final String f40698a;

    public cq1(String str) {
        this.f40698a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq1) && wj50.m88271j(this.f40698a, ((cq1) obj).f40698a);
    }

    public final int hashCode() {
        return this.f40698a.hashCode();
    }
}
