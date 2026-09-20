package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes10.dex */
public final class h331 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87120a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j331 f87121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87122c;

    public /* synthetic */ h331(j331 j331Var, String str, int i) {
        this.f87120a = i;
        this.f87121b = j331Var;
        this.f87122c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f87120a) {
            case 0:
                x231 x231Var = this.f87121b.f108280b;
                hv31 hv31VarMo35842b = x231Var.f257350b.mo35842b(x231Var.f257349a, this.f87122c);
                lv31 lv31VarEdit = hv31VarMo35842b.edit();
                fv31 fv31Var = x231.f257348c;
                lv31VarEdit.m60049b(fv31Var, hv31VarMo35842b.mo48717l(fv31Var, 0) + 1);
                lv31VarEdit.m60055h();
                break;
            case 1:
                w031 w031Var = this.f87121b.f108282d;
                hv31 hv31VarMo35842b2 = w031Var.f246633b.mo35842b(w031Var.f246632a, this.f87122c);
                lv31 lv31VarEdit2 = hv31VarMo35842b2.edit();
                fv31 fv31Var2 = w031.f246631c;
                lv31VarEdit2.m60049b(fv31Var2, hv31VarMo35842b2.mo48717l(fv31Var2, 0) + 1);
                lv31VarEdit2.m60055h();
                break;
            default:
                q331 q331Var = this.f87121b.f108283e;
                lv31 lv31VarEdit3 = q331Var.f184786b.mo35842b(q331Var.f184785a, this.f87122c).edit();
                lv31VarEdit3.m60048a(q331.f184784c, true);
                lv31VarEdit3.m60055h();
                break;
        }
    }
}
