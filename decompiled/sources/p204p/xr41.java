package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xr41 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final xr41 f265263a = new xr41();

    /* JADX INFO: renamed from: b */
    public static final ktz0 f265264b = wr41.Companion.serializer().getDescriptor();

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        wr41 wr41Var = (wr41) froVar.mo42504Y(wr41.Companion.serializer());
        return new tr41(wr41Var.f254268a, wr41Var.f254269b);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f265264b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        tr41 tr41Var = (tr41) obj;
        deuVar.mo35825i(wr41.Companion.serializer(), new wr41(tr41Var.f222966a, tr41Var.f222967b));
    }
}
