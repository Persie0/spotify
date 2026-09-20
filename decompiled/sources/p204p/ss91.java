package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ss91 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final ss91 f213550a = new ss91();

    /* JADX INFO: renamed from: b */
    public static final it40 f213551b = bnf1.m29967c("kotlin.UShort", ug11.f229951a);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return new os91(froVar.mo39233w(f213551b).mo39212C());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f213551b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35828v(f213551b).mo35814O(((os91) obj).f168780a);
    }
}
