package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f175249a;

    /* JADX INFO: renamed from: b */
    public final z650 f175250b;

    /* JADX INFO: renamed from: c */
    public final long f175251c;

    public p9i(String str, z650 z650Var, long j) {
        this.f175249a = str;
        this.f175250b = z650Var;
        this.f175251c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9i)) {
            return false;
        }
        p9i p9iVar = (p9i) obj;
        return wj50.m88271j(this.f175249a, p9iVar.f175249a) && wj50.m88271j(this.f175250b, p9iVar.f175250b) && this.f175251c == p9iVar.f175251c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f175251c) + s571.m77243b(this.f175249a.hashCode() * 31, 31, this.f175250b.f279709a);
    }
}
