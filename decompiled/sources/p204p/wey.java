package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wey {

    /* JADX INFO: renamed from: a */
    public final slq0 f250642a;

    /* JADX INFO: renamed from: b */
    public final int f250643b;

    /* JADX INFO: renamed from: c */
    public final boolean f250644c;

    /* JADX INFO: renamed from: d */
    public final boolean f250645d;

    public wey(slq0 slq0Var, int i, boolean z, boolean z2) {
        this.f250642a = slq0Var;
        this.f250643b = i;
        this.f250644c = z;
        this.f250645d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static wey m87916a(wey weyVar, boolean z) {
        slq0 slq0Var = weyVar.f250642a;
        int i = weyVar.f250643b;
        boolean z2 = weyVar.f250645d;
        weyVar.getClass();
        return new wey(slq0Var, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wey)) {
            return false;
        }
        wey weyVar = (wey) obj;
        return wj50.m88271j(this.f250642a, weyVar.f250642a) && this.f250643b == weyVar.f250643b && this.f250644c == weyVar.f250644c && this.f250645d == weyVar.f250645d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250645d) + s571.m77245d(mt60.m62800g(this.f250643b, this.f250642a.hashCode() * 31, 31), 31, this.f250644c);
    }
}
