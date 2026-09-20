package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class voq {

    /* JADX INFO: renamed from: a */
    public final int f243519a;

    /* JADX INFO: renamed from: b */
    public final cpq f243520b;

    public voq(int i, cpq cpqVar) {
        this.f243519a = i;
        this.f243520b = cpqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voq)) {
            return false;
        }
        voq voqVar = (voq) obj;
        return this.f243519a == voqVar.f243519a && wj50.m88271j(this.f243520b, voqVar.f243520b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f243519a) * 31;
        cpq cpqVar = this.f243520b;
        return iM38547C + (cpqVar == null ? 0 : cpqVar.hashCode());
    }
}
