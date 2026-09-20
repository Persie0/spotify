package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h2s implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final h2s f87054a = new h2s();

    /* JADX INFO: renamed from: b */
    public static final eer0 f87055b = new eer0("kotlin.Double", ydr0.f271811C0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Double.valueOf(froVar.mo39215H());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f87055b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35823h(((Number) obj).doubleValue());
    }
}
