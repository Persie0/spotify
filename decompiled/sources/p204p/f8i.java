package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final sfi f66994a;

    public f8i(sfi sfiVar) {
        this.f66994a = sfiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8i) && wj50.m88271j(this.f66994a, ((f8i) obj).f66994a);
    }

    public final int hashCode() {
        return this.f66994a.hashCode();
    }
}
