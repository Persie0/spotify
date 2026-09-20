package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class u2b0 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final u2b0 f226058a = new u2b0();

    /* JADX INFO: renamed from: b */
    public static final eer0 f226059b = new eer0("kotlin.Long", ydr0.f271813E0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Long.valueOf(froVar.mo39232u());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f226059b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35829z(((Number) obj).longValue());
    }
}
