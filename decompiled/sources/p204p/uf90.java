package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uf90 implements vf90 {

    /* JADX INFO: renamed from: a */
    public final String f229725a;

    public uf90(String str) {
        this.f229725a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf90) && wj50.m88271j(this.f229725a, ((uf90) obj).f229725a);
    }

    public final int hashCode() {
        return this.f229725a.hashCode();
    }
}
