package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qvk implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final qvk f193032a = new qvk();

    /* JADX INFO: renamed from: b */
    public static final rr60 f193033b;

    /* JADX INFO: renamed from: c */
    public static final ktz0 f193034c;

    static {
        rr60 rr60VarSerializer = ztz0.Companion.serializer();
        f193033b = rr60VarSerializer;
        f193034c = rr60VarSerializer.getDescriptor();
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ztz0 ztz0Var = (ztz0) froVar.mo42504Y(f193033b);
        return new nvk(ztz0Var.f286291a, ztz0Var.f286292b);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f193034c;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        nvk nvkVar = (nvk) obj;
        deuVar.mo35825i(f193033b, new ztz0(nvkVar.f158914a, nvkVar.f158915b));
    }
}
