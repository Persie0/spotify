package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sbx extends gcx {

    /* JADX INFO: renamed from: a */
    public final Exception f207593a;

    public sbx(Exception exc) {
        this.f207593a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbx) && wj50.m88271j(this.f207593a, ((sbx) obj).f207593a);
    }

    public final int hashCode() {
        return this.f207593a.hashCode();
    }
}
