package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tkm0 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final skm0 f221184a;

    /* JADX INFO: renamed from: b */
    public final int f221185b;

    public tkm0(skm0 skm0Var, int i) {
        this.f221184a = skm0Var;
        this.f221185b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkm0)) {
            return false;
        }
        tkm0 tkm0Var = (tkm0) obj;
        return wj50.m88271j(this.f221184a, tkm0Var.f221184a) && this.f221185b == tkm0Var.f221185b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f221185b) + (this.f221184a.hashCode() * 31);
    }

    public /* synthetic */ tkm0(skm0 skm0Var, int i, int i2) {
        this((i2 & 1) != 0 ? pkm0.f178491a : skm0Var, (i2 & 2) != 0 ? 1 : i);
    }
}
