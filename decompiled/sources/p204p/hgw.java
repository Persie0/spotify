package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hgw {

    /* JADX INFO: renamed from: a */
    public final ox8 f91231a;

    /* JADX INFO: renamed from: b */
    public final jgw f91232b;

    /* JADX INFO: renamed from: c */
    public final jgw f91233c;

    public hgw(ox8 ox8Var, jgw jgwVar, jgw jgwVar2) {
        this.f91231a = ox8Var;
        this.f91232b = jgwVar;
        this.f91233c = jgwVar2;
    }

    /* JADX INFO: renamed from: a */
    public final jgw m47477a() {
        return this.f91232b;
    }

    /* JADX INFO: renamed from: b */
    public final jgw m47478b() {
        return this.f91233c;
    }

    /* JADX INFO: renamed from: c */
    public final ox8 m47479c() {
        return this.f91231a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgw)) {
            return false;
        }
        hgw hgwVar = (hgw) obj;
        return wj50.m88271j(this.f91231a, hgwVar.f91231a) && wj50.m88271j(this.f91232b, hgwVar.f91232b) && wj50.m88271j(this.f91233c, hgwVar.f91233c);
    }

    public final int hashCode() {
        return this.f91233c.hashCode() + ((this.f91232b.hashCode() + (this.f91231a.hashCode() * 31)) * 31);
    }
}
