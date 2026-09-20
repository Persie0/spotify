package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fac implements iac {

    /* JADX INFO: renamed from: a */
    public final String f67508a;

    public fac(String str) {
        this.f67508a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fac) && wj50.m88271j(this.f67508a, ((fac) obj).f67508a);
    }

    public final int hashCode() {
        return this.f67508a.hashCode();
    }
}
