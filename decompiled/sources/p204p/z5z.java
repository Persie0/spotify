package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z5z {

    /* JADX INFO: renamed from: a */
    public final e4y f279660a;

    /* JADX INFO: renamed from: b */
    public final y3y f279661b;

    /* JADX INFO: renamed from: c */
    public final ay31 f279662c;

    /* JADX INFO: renamed from: d */
    public final rx31 f279663d;

    public z5z(e4y e4yVar, y3y y3yVar, ay31 ay31Var, rx31 rx31Var) {
        this.f279660a = e4yVar;
        this.f279661b = y3yVar;
        this.f279662c = ay31Var;
        this.f279663d = rx31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5z)) {
            return false;
        }
        z5z z5zVar = (z5z) obj;
        return wj50.m88271j(this.f279660a, z5zVar.f279660a) && wj50.m88271j(this.f279661b, z5zVar.f279661b) && wj50.m88271j(this.f279662c, z5zVar.f279662c) && wj50.m88271j(this.f279663d, z5zVar.f279663d);
    }

    public final int hashCode() {
        int iHashCode = (this.f279661b.hashCode() + (this.f279660a.hashCode() * 31)) * 31;
        ay31 ay31Var = this.f279662c;
        return this.f279663d.hashCode() + ((iHashCode + (ay31Var == null ? 0 : ay31Var.hashCode())) * 31);
    }
}
