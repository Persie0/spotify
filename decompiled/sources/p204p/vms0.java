package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vms0 implements xms0 {

    /* JADX INFO: renamed from: a */
    public final String f242927a;

    public vms0(String str) {
        this.f242927a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vms0) && wj50.m88271j(this.f242927a, ((vms0) obj).f242927a);
    }

    public final int hashCode() {
        return this.f242927a.hashCode();
    }
}
