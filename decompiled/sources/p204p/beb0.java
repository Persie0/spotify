package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class beb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final String f26321a;

    /* JADX INFO: renamed from: b */
    public final String f26322b;

    /* JADX INFO: renamed from: c */
    public final String f26323c;

    /* JADX INFO: renamed from: d */
    public final s7f f26324d;

    public beb0(String str, String str2, String str3, s7f s7fVar) {
        this.f26321a = str;
        this.f26322b = str2;
        this.f26323c = str3;
        this.f26324d = s7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beb0)) {
            return false;
        }
        beb0 beb0Var = (beb0) obj;
        return wj50.m88271j(this.f26321a, beb0Var.f26321a) && wj50.m88271j(this.f26322b, beb0Var.f26322b) && wj50.m88271j(this.f26323c, beb0Var.f26323c) && wj50.m88271j(this.f26324d, beb0Var.f26324d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((vdb0.FULLSCREEN.hashCode() + s571.m77243b(this.f26321a.hashCode() * 31, 31, this.f26322b)) * 31, 31, this.f26323c);
        s7f s7fVar = this.f26324d;
        return iM77243b + (s7fVar == null ? 0 : s7fVar.hashCode());
    }
}
