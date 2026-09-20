package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e450 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final e450 f55982a = new e450();

    /* JADX INFO: renamed from: b */
    public static final eer0 f55983b = new eer0("kotlin.Int", zdr0.f281785z0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Integer.valueOf(froVar.mo39228n());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f55983b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35819a0(((Number) obj).intValue());
    }
}
