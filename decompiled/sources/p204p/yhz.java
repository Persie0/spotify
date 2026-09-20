package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yhz implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final yhz f272997a = new yhz();

    /* JADX INFO: renamed from: b */
    public static final eer0 f272998b = new eer0("kotlin.Float", ydr0.f271812D0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Float.valueOf(froVar.mo39214F());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f272998b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35816S(((Number) obj).floatValue());
    }
}
