package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final String f193618a;

    public qxc1(String str) {
        this.f193618a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxc1) && wj50.m88271j(this.f193618a, ((qxc1) obj).f193618a);
    }

    public final int hashCode() {
        return this.f193618a.hashCode();
    }
}
