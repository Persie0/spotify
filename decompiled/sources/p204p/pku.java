package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pku {

    /* JADX INFO: renamed from: a */
    public final yzl f178550a;

    /* JADX INFO: renamed from: b */
    public final yzl f178551b;

    /* JADX INFO: renamed from: c */
    public final yzl f178552c;

    public pku(yzl yzlVar, yzl yzlVar2, yzl yzlVar3) {
        this.f178550a = yzlVar;
        this.f178551b = yzlVar2;
        this.f178552c = yzlVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pku)) {
            return false;
        }
        pku pkuVar = (pku) obj;
        return this.f178550a.equals(pkuVar.f178550a) && this.f178551b.equals(pkuVar.f178551b) && this.f178552c.equals(pkuVar.f178552c);
    }

    public final int hashCode() {
        return this.f178552c.hashCode() + ((this.f178551b.hashCode() + (this.f178550a.hashCode() * 31)) * 31);
    }
}
