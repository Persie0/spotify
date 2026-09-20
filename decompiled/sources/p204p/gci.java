package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gci implements jci {

    /* JADX INFO: renamed from: a */
    public final j2d0 f78600a;

    public gci(j2d0 j2d0Var) {
        this.f78600a = j2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gci) && wj50.m88271j(this.f78600a, ((gci) obj).f78600a);
    }

    public final int hashCode() {
        return this.f78600a.hashCode();
    }
}
