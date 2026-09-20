package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final api f96191a;

    public hxc1(api apiVar) {
        this.f96191a = apiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxc1) && wj50.m88271j(this.f96191a, ((hxc1) obj).f96191a);
    }

    public final int hashCode() {
        api apiVar = this.f96191a;
        if (apiVar == null) {
            return 0;
        }
        return apiVar.hashCode();
    }
}
