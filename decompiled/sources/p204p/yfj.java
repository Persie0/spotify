package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yfj implements ktx {

    /* JADX INFO: renamed from: a */
    public final wfj f272266a;

    /* JADX INFO: renamed from: b */
    public final wfj f272267b;

    /* JADX INFO: renamed from: c */
    public final wfj f272268c;

    /* JADX INFO: renamed from: d */
    public final wfj f272269d;

    /* JADX INFO: renamed from: e */
    public final wfj f272270e;

    public yfj(wfj wfjVar, wfj wfjVar2, wfj wfjVar3, wfj wfjVar4, wfj wfjVar5) {
        this.f272266a = wfjVar;
        this.f272267b = wfjVar2;
        this.f272268c = wfjVar3;
        this.f272269d = wfjVar4;
        this.f272270e = wfjVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfj)) {
            return false;
        }
        yfj yfjVar = (yfj) obj;
        return wj50.m88271j(this.f272266a, yfjVar.f272266a) && wj50.m88271j(this.f272267b, yfjVar.f272267b) && wj50.m88271j(this.f272268c, yfjVar.f272268c) && wj50.m88271j(this.f272269d, yfjVar.f272269d) && wj50.m88271j(this.f272270e, yfjVar.f272270e);
    }

    public final int hashCode() {
        return this.f272270e.hashCode() + ((this.f272269d.hashCode() + ((this.f272268c.hashCode() + ((this.f272267b.hashCode() + (this.f272266a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
