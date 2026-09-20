package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f87516a;

    /* JADX INFO: renamed from: b */
    public final pcu0 f87517b;

    /* JADX INFO: renamed from: c */
    public final boolean f87518c;

    public h4d(String str, pcu0 pcu0Var, boolean z) {
        this.f87516a = str;
        this.f87517b = pcu0Var;
        this.f87518c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4d)) {
            return false;
        }
        h4d h4dVar = (h4d) obj;
        return wj50.m88271j(this.f87516a, h4dVar.f87516a) && wj50.m88271j(this.f87517b, h4dVar.f87517b) && this.f87518c == h4dVar.f87518c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87518c) + ((this.f87517b.hashCode() + (this.f87516a.hashCode() * 31)) * 31);
    }
}
