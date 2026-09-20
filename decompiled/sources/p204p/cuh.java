package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cuh extends duh {

    /* JADX INFO: renamed from: a */
    public final tth f42120a;

    /* JADX INFO: renamed from: b */
    public final int f42121b;

    public cuh(tth tthVar, int i) {
        this.f42120a = tthVar;
        this.f42121b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuh)) {
            return false;
        }
        cuh cuhVar = (cuh) obj;
        return wj50.m88271j(this.f42120a, cuhVar.f42120a) && this.f42121b == cuhVar.f42121b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42121b) + (this.f42120a.hashCode() * 31);
    }
}
