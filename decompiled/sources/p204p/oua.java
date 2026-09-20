package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oua implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final oua f170236a = new oua();

    /* JADX INFO: renamed from: b */
    public static final eer0 f170237b = new eer0("kotlin.Byte", ydr0.f271809A0);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return Byte.valueOf(froVar.mo39224c0());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f170237b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35826j(((Number) obj).byteValue());
    }
}
