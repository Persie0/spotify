package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gqk0 implements bwr {

    /* JADX INFO: renamed from: a */
    public final ram0 f83487a;

    /* JADX INFO: renamed from: b */
    public boolean f83488b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ojp f83489c;

    public gqk0(ojp ojpVar, ram0 ram0Var) {
        this.f83489c = ojpVar;
        this.f83487a = ram0Var;
    }

    @Override // p204p.bwr
    public final void dispose() {
        if (this.f83488b) {
            this.f83488b = false;
            ojp ojpVar = this.f83489c;
            if (ojpVar.f166108b == 0) {
                ((jpi0) ojpVar.f166109c).m53963j(this);
            } else {
                ojpVar.f166107a = true;
            }
        }
    }
}
