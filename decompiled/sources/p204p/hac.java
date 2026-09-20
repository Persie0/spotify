package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hac implements iac {

    /* JADX INFO: renamed from: a */
    public final vbc f89190a;

    public hac(vbc vbcVar) {
        this.f89190a = vbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hac) && wj50.m88271j(this.f89190a, ((hac) obj).f89190a);
    }

    public final int hashCode() {
        return this.f89190a.hashCode();
    }
}
