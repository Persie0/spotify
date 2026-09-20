package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l8a implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final l8a f130828a = new l8a();

    /* JADX INFO: renamed from: b */
    public static final eer0 f130829b = new eer0("kotlin.Boolean", ydr0.f271816z0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Boolean.valueOf(froVar.mo39216K());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f130829b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35815P(((Boolean) obj).booleanValue());
    }
}
