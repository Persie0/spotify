package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q0s {

    /* JADX INFO: renamed from: a */
    public final String f184065a;

    /* JADX INFO: renamed from: b */
    public final jsi f184066b;

    /* JADX INFO: renamed from: c */
    public final zzo0 f184067c;

    /* JADX INFO: renamed from: d */
    public final dxz0 f184068d;

    /* JADX INFO: renamed from: e */
    public final dxz0 f184069e;

    public q0s(String str, jsi jsiVar, zzo0 zzo0Var, dxz0 dxz0Var, dxz0 dxz0Var2) {
        this.f184065a = str;
        this.f184066b = jsiVar;
        this.f184067c = zzo0Var;
        this.f184068d = dxz0Var;
        this.f184069e = dxz0Var2;
    }

    /* JADX INFO: renamed from: a */
    public static q0s m71862a(q0s q0sVar, String str, jsi jsiVar, zzo0 zzo0Var, dxz0 dxz0Var, dxz0 dxz0Var2, int i) {
        if ((i & 1) != 0) {
            str = q0sVar.f184065a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            jsiVar = q0sVar.f184066b;
        }
        jsi jsiVar2 = jsiVar;
        if ((i & 4) != 0) {
            zzo0Var = q0sVar.f184067c;
        }
        zzo0 zzo0Var2 = zzo0Var;
        if ((i & 8) != 0) {
            dxz0Var = q0sVar.f184068d;
        }
        dxz0 dxz0Var3 = dxz0Var;
        if ((i & 16) != 0) {
            dxz0Var2 = q0sVar.f184069e;
        }
        q0sVar.getClass();
        return new q0s(str2, jsiVar2, zzo0Var2, dxz0Var3, dxz0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0s)) {
            return false;
        }
        q0s q0sVar = (q0s) obj;
        return wj50.m88271j(this.f184065a, q0sVar.f184065a) && wj50.m88271j(this.f184066b, q0sVar.f184066b) && wj50.m88271j(this.f184067c, q0sVar.f184067c) && wj50.m88271j(this.f184068d, q0sVar.f184068d) && wj50.m88271j(this.f184069e, q0sVar.f184069e);
    }

    public final int hashCode() {
        String str = this.f184065a;
        return this.f184069e.hashCode() + ((this.f184068d.hashCode() + ((this.f184067c.hashCode() + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f184066b.f115502a)) * 31)) * 31);
    }
}
