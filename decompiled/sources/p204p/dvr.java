package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dvr implements g3u {

    /* JADX INFO: renamed from: a */
    public final int f53512a;

    /* JADX INFO: renamed from: b */
    public final v5u f53513b;

    public dvr(int i, v5u v5uVar) {
        this.f53512a = i;
        this.f53513b = v5uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvr)) {
            return false;
        }
        dvr dvrVar = (dvr) obj;
        return this.f53512a == dvrVar.f53512a && wj50.m88271j(this.f53513b, dvrVar.f53513b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f53512a) * 31;
        v5u v5uVar = this.f53513b;
        return iM38547C + (v5uVar == null ? 0 : Long.hashCode(v5uVar.f237647a));
    }
}
