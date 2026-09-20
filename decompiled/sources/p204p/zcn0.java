package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zcn0 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f281549a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f281550b;

    /* JADX INFO: renamed from: c */
    public final o4x f281551c;

    public zcn0(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar) {
        this.f281549a = otd0Var;
        this.f281550b = ibp0Var;
        this.f281551c = o4xVar;
    }

    /* JADX INFO: renamed from: a */
    public final o4x m95910a() {
        return this.f281551c;
    }

    /* JADX INFO: renamed from: b */
    public final otd0 m95911b() {
        return this.f281549a;
    }

    /* JADX INFO: renamed from: c */
    public final ibp0 m95912c() {
        return this.f281550b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcn0)) {
            return false;
        }
        zcn0 zcn0Var = (zcn0) obj;
        return wj50.m88271j(this.f281549a, zcn0Var.f281549a) && wj50.m88271j(this.f281550b, zcn0Var.f281550b) && wj50.m88271j(this.f281551c, zcn0Var.f281551c);
    }

    public final int hashCode() {
        return this.f281551c.hashCode() + ((this.f281550b.hashCode() + (this.f281549a.hashCode() * 31)) * 31);
    }
}
