package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t9r0 implements u9r0 {

    /* JADX INFO: renamed from: a */
    public final v9r0 f218350a;

    public /* synthetic */ t9r0() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public final v9r0 m80315a() {
        return this.f218350a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9r0) && wj50.m88271j(this.f218350a, ((t9r0) obj).f218350a);
    }

    public final int hashCode() {
        v9r0 v9r0Var = this.f218350a;
        if (v9r0Var == null) {
            return 0;
        }
        return v9r0Var.hashCode();
    }

    public t9r0(v9r0 v9r0Var) {
        this.f218350a = v9r0Var;
    }
}
