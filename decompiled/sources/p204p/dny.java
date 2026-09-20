package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dny implements hoy {

    /* JADX INFO: renamed from: a */
    public final koy f50890a;

    public dny(koy koyVar) {
        this.f50890a = koyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dny) && wj50.m88271j(this.f50890a, ((dny) obj).f50890a);
    }

    public final int hashCode() {
        koy koyVar = this.f50890a;
        if (koyVar == null) {
            return 0;
        }
        return koyVar.hashCode();
    }
}
