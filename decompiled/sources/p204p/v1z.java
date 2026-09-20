package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class v1z {

    /* JADX INFO: renamed from: a */
    public final jyy f236493a;

    /* JADX INFO: renamed from: b */
    public final int f236494b;

    public v1z(jyy jyyVar, int i) {
        this.f236493a = jyyVar;
        this.f236494b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1z)) {
            return false;
        }
        v1z v1zVar = (v1z) obj;
        return wj50.m88271j(this.f236493a, v1zVar.f236493a) && this.f236494b == v1zVar.f236494b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f236494b) + (this.f236493a.hashCode() * 31);
    }
}
