package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class o1u {
    public static final n1u Companion = new n1u();

    /* JADX INFO: renamed from: a */
    public final String f160861a;

    /* JADX INFO: renamed from: b */
    public final r1u f160862b;

    public /* synthetic */ o1u(int i, String str, r1u r1uVar) {
        if ((i & 1) == 0) {
            this.f160861a = null;
        } else {
            this.f160861a = str;
        }
        if ((i & 2) == 0) {
            this.f160862b = null;
        } else {
            this.f160862b = r1uVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1u)) {
            return false;
        }
        o1u o1uVar = (o1u) obj;
        return wj50.m88271j(this.f160861a, o1uVar.f160861a) && wj50.m88271j(this.f160862b, o1uVar.f160862b);
    }

    public final int hashCode() {
        String str = this.f160861a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        r1u r1uVar = this.f160862b;
        return iHashCode + (r1uVar != null ? r1uVar.hashCode() : 0);
    }
}
