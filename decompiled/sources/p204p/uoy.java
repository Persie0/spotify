package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uoy {

    /* JADX INFO: renamed from: a */
    public final koy f232539a;

    /* JADX INFO: renamed from: b */
    public final koy f232540b;

    public uoy(koy koyVar, koy koyVar2) {
        this.f232539a = koyVar;
        this.f232540b = koyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoy)) {
            return false;
        }
        uoy uoyVar = (uoy) obj;
        return wj50.m88271j(this.f232539a, uoyVar.f232539a) && wj50.m88271j(this.f232540b, uoyVar.f232540b);
    }

    public final int hashCode() {
        return this.f232540b.hashCode() + (this.f232539a.hashCode() * 31);
    }
}
