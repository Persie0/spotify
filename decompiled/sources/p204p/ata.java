package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ata {

    /* JADX INFO: renamed from: a */
    public final zsa f19623a;

    /* JADX INFO: renamed from: b */
    public final zsa f19624b;

    /* JADX INFO: renamed from: c */
    public final fiz f19625c;

    /* JADX INFO: renamed from: d */
    public final ysa f19626d;

    public ata(zsa zsaVar, zsa zsaVar2, fiz fizVar, ysa ysaVar) {
        this.f19623a = zsaVar;
        this.f19624b = zsaVar2;
        this.f19625c = fizVar;
        this.f19626d = ysaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ata)) {
            return false;
        }
        ata ataVar = (ata) obj;
        return wj50.m88271j(this.f19623a, ataVar.f19623a) && wj50.m88271j(this.f19624b, ataVar.f19624b) && wj50.m88271j(this.f19625c, ataVar.f19625c) && wj50.m88271j(this.f19626d, ataVar.f19626d);
    }

    public final int hashCode() {
        return this.f19626d.hashCode() + ((this.f19625c.hashCode() + ((this.f19624b.hashCode() + (this.f19623a.hashCode() * 31)) * 31)) * 31);
    }
}
