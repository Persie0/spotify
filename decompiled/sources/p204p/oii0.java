package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oii0 {

    /* JADX INFO: renamed from: a */
    public final String f165822a;

    /* JADX INFO: renamed from: b */
    public final String f165823b;

    /* JADX INFO: renamed from: c */
    public final int f165824c;

    public oii0(String str, String str2, int i) {
        this.f165822a = str;
        this.f165823b = str2;
        this.f165824c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oii0)) {
            return false;
        }
        oii0 oii0Var = (oii0) obj;
        return wj50.m88271j(this.f165822a, oii0Var.f165822a) && this.f165823b.equals(oii0Var.f165823b) && this.f165824c == oii0Var.f165824c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f165824c) + s571.m77243b(this.f165822a.hashCode() * 31, 31, this.f165823b);
    }
}
