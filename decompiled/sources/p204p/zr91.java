package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zr91 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final zr91 f285592a = new zr91();

    /* JADX INFO: renamed from: b */
    public static final it40 f285593b = bnf1.m29967c("kotlin.UInt", e450.f55982a);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return new vr91(froVar.mo39233w(f285593b).mo39228n());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f285593b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35828v(f285593b).mo35819a0(((vr91) obj).f244116a);
    }
}
