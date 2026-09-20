package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jvi {

    /* JADX INFO: renamed from: a */
    public final mvi f116358a;

    /* JADX INFO: renamed from: b */
    public final int f116359b;

    public jvi(mvi mviVar, int i) {
        this.f116358a = mviVar;
        this.f116359b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvi)) {
            return false;
        }
        jvi jviVar = (jvi) obj;
        return wj50.m88271j(this.f116358a, jviVar.f116358a) && this.f116359b == jviVar.f116359b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f116359b) + (this.f116358a.hashCode() * 31);
    }
}
