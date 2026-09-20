package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m8d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f141023a;

    /* JADX INFO: renamed from: b */
    public final sfx0 f141024b;

    public m8d(String str, sfx0 sfx0Var) {
        this.f141023a = str;
        this.f141024b = sfx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8d)) {
            return false;
        }
        m8d m8dVar = (m8d) obj;
        return wj50.m88271j(this.f141023a, m8dVar.f141023a) && wj50.m88271j(this.f141024b, m8dVar.f141024b);
    }

    public final int hashCode() {
        return this.f141024b.hashCode() + (this.f141023a.hashCode() * 31);
    }
}
