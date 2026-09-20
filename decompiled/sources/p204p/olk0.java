package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class olk0 implements rr60 {

    /* JADX INFO: renamed from: a */
    public final rr60 f166855a;

    /* JADX INFO: renamed from: b */
    public final ltz0 f166856b;

    public olk0(rr60 rr60Var) {
        this.f166855a = rr60Var;
        this.f166856b = new ltz0(rr60Var.getDescriptor());
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        if (froVar.mo29812X()) {
            return froVar.mo42504Y(this.f166855a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && olk0.class == obj.getClass() && wj50.m88271j(this.f166855a, ((olk0) obj).f166855a);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.f166856b;
    }

    public final int hashCode() {
        return this.f166855a.hashCode();
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        if (obj != null) {
            deuVar.mo35825i(this.f166855a, obj);
        } else {
            deuVar.mo35813J();
        }
    }
}
