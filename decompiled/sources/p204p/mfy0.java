package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mfy0 {

    /* JADX INFO: renamed from: a */
    public final String f143239a;

    /* JADX INFO: renamed from: b */
    public final yfy0 f143240b;

    /* JADX INFO: renamed from: c */
    public final boolean f143241c;

    public mfy0(String str, yfy0 yfy0Var, boolean z) {
        this.f143239a = str;
        this.f143240b = yfy0Var;
        this.f143241c = z;
    }

    /* JADX INFO: renamed from: a */
    public static mfy0 m61660a(mfy0 mfy0Var, yfy0 yfy0Var, boolean z, int i) {
        String str = mfy0Var.f143239a;
        if ((i & 2) != 0) {
            yfy0Var = mfy0Var.f143240b;
        }
        if ((i & 4) != 0) {
            z = mfy0Var.f143241c;
        }
        mfy0Var.getClass();
        return new mfy0(str, yfy0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfy0)) {
            return false;
        }
        mfy0 mfy0Var = (mfy0) obj;
        return wj50.m88271j(this.f143239a, mfy0Var.f143239a) && wj50.m88271j(this.f143240b, mfy0Var.f143240b) && this.f143241c == mfy0Var.f143241c;
    }

    public final int hashCode() {
        int iHashCode = this.f143239a.hashCode() * 31;
        yfy0 yfy0Var = this.f143240b;
        return Boolean.hashCode(this.f143241c) + ((iHashCode + (yfy0Var == null ? 0 : yfy0Var.hashCode())) * 31);
    }
}
