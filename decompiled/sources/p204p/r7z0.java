package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r7z0 extends oj30 {

    /* JADX INFO: renamed from: b */
    public final ovf f196680b;

    public r7z0(ovf ovfVar) {
        super(ovfVar.getView());
        this.f196680b = ovfVar;
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: a */
    public final void mo32903a(fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        String strTitle = fk30Var.text().title();
        if (strTitle == null) {
            strTitle = "";
        }
        this.f196680b.mo2820d(new q7z0(strTitle));
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: b */
    public final void mo32904b(int... iArr) {
    }
}
