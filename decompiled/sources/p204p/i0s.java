package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i0s implements n0s {

    /* JADX INFO: renamed from: a */
    public final api f97312a;

    public i0s(api apiVar) {
        this.f97312a = apiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0s) && wj50.m88271j(this.f97312a, ((i0s) obj).f97312a);
    }

    public final int hashCode() {
        api apiVar = this.f97312a;
        if (apiVar == null) {
            return 0;
        }
        return apiVar.hashCode();
    }
}
