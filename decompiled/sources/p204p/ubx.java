package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ubx extends gcx {

    /* JADX INFO: renamed from: a */
    public final String f228897a;

    /* JADX INFO: renamed from: b */
    public final z650 f228898b;

    public ubx(String str, z650 z650Var) {
        this.f228897a = str;
        this.f228898b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubx)) {
            return false;
        }
        ubx ubxVar = (ubx) obj;
        return wj50.m88271j(this.f228897a, ubxVar.f228897a) && wj50.m88271j(this.f228898b, ubxVar.f228898b);
    }

    public final int hashCode() {
        String str = this.f228897a;
        return this.f228898b.f279709a.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
