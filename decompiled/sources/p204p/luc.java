package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class luc implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final luc f137049a = new luc();

    /* JADX INFO: renamed from: b */
    public static final eer0 f137050b = new eer0("kotlin.Char", ydr0.f271810B0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Character.valueOf(froVar.mo39218N());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f137050b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35817U(((Character) obj).charValue());
    }
}
