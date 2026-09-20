package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class buh extends duh {

    /* JADX INFO: renamed from: a */
    public final tth f31136a;

    /* JADX INFO: renamed from: b */
    public final int f31137b;

    public buh(tth tthVar, int i) {
        this.f31136a = tthVar;
        this.f31137b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buh)) {
            return false;
        }
        buh buhVar = (buh) obj;
        return wj50.m88271j(this.f31136a, buhVar.f31136a) && this.f31137b == buhVar.f31137b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31137b) + (this.f31136a.hashCode() * 31);
    }
}
