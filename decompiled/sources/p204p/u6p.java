package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u6p {

    /* JADX INFO: renamed from: a */
    public final s7p f227394a;

    /* JADX INFO: renamed from: b */
    public final iri f227395b;

    /* JADX INFO: renamed from: c */
    public final xcp f227396c;

    public u6p(s7p s7pVar, iri iriVar, xcp xcpVar) {
        this.f227394a = s7pVar;
        this.f227395b = iriVar;
        this.f227396c = xcpVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m82453a(String str, boolean z) {
        if (!this.f227394a.m77387c()) {
            this.f227396c.m90397a(str, z);
            return;
        }
        iri iriVar = this.f227395b;
        cxb cxbVar = iriVar.f104998g;
        kv91 kv91Var = (kv91) cxbVar.f42972b;
        m500 m500Var = iriVar.f104992a;
        api apiVarM77296c = ((s5p) iriVar.f104996e).m77296c();
        if (apiVarM77296c == null || apiVarM77296c.mo26697m()) {
            ((gri) iriVar.f104993b.mo25006a()).mo63162p1(m500Var.mo15683g0(), "ConnectDisabledBluetoothDialogFragment");
            kv91Var.mo57449i(((bbg0) cxbVar.f42973c).mo24514e(), null);
        } else {
            ((mri) iriVar.f104994c.mo25006a()).mo63162p1(m500Var.mo15683g0(), "ConnectDisabledBluetoothDialogFragment");
            kv91Var.mo57449i(((bbg0) cxbVar.f42974d).mo24514e(), null);
        }
    }
}
