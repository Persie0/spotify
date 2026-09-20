package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ug11 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final ug11 f229951a = new ug11();

    /* JADX INFO: renamed from: b */
    public static final eer0 f229952b = new eer0("kotlin.Short", ydr0.f271814F0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Short.valueOf(froVar.mo39212C());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f229952b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35814O(((Number) obj).shortValue());
    }
}
