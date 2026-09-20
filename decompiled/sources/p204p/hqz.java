package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hqz {

    /* JADX INFO: renamed from: a */
    public final uqz f94271a;

    public hqz(uqz uqzVar) {
        this.f94271a = uqzVar;
    }

    /* JADX INFO: renamed from: a */
    public static hqz m48316a(uqz uqzVar) {
        return new hqz(uqzVar);
    }

    /* JADX INFO: renamed from: b */
    public final uqz m48317b() {
        return this.f94271a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqz) && wj50.m88271j(this.f94271a, ((hqz) obj).f94271a);
    }

    public final int hashCode() {
        uqz uqzVar = this.f94271a;
        if (uqzVar == null) {
            return 0;
        }
        return uqzVar.hashCode();
    }
}
