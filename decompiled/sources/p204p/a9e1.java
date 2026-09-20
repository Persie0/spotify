package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class a9e1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b9e1 f13561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9e1(b9e1 b9e1Var, int i) {
        super(0);
        this.f13560a = i;
        this.f13561b = b9e1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f13560a) {
            case 0:
                b9e1 b9e1Var = this.f13561b;
                b9e1Var.f24888m.m69810a(fda.m41363a(b9e1Var.f24887l, null, null, 0, true, false, 1919));
                b9e1Var.f24877b.mo55546f();
                break;
            case 1:
                q831 q831Var = this.f13561b.f24879d;
                Integer numValueOf = Integer.valueOf(R.string.workout_settings_save_error);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                q831Var.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
                break;
            default:
                b9e1 b9e1Var2 = this.f13561b;
                xu00 xu00VarM92208a = b9e1Var2.f24880e.m92208a();
                if (xu00VarM92208a != null) {
                    b9e1Var2.f24881f.f134027b.m28669m(xu00VarM92208a, true);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
