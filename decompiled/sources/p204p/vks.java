package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vks implements yks {

    /* JADX INFO: renamed from: a */
    public final String f242282a;

    public vks(String str) {
        this.f242282a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vks) && wj50.m88271j(this.f242282a, ((vks) obj).f242282a);
    }

    public final int hashCode() {
        return this.f242282a.hashCode();
    }
}
