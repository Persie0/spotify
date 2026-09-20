package p204p;

import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes7.dex */
public final class zfv0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kz5 f282425b;

    public /* synthetic */ zfv0(kz5 kz5Var, int i) {
        this.f282424a = i;
        this.f282425b = kz5Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f282424a) {
            case 0:
                bse1 bse1Var = (bse1) this.f282425b.f128012b;
                Integer numValueOf = Integer.valueOf(R.string.toast_removed_from_your_library);
                bse1Var.f30302a.m72300d();
                q831 q831Var = bse1Var.f30302a;
                if (q831Var.m72301f()) {
                    na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                    na6.m63963k(true, "Invalid resource ID provided: %s", null);
                    q831Var.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
                }
                break;
            default:
                bse1 bse1Var2 = (bse1) this.f282425b.f128012b;
                Integer numValueOf2 = Integer.valueOf(R.string.toast_added_to_your_library);
                bse1Var2.f30302a.m72300d();
                q831 q831Var2 = bse1Var2.f30302a;
                if (q831Var2.m72301f()) {
                    na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf2);
                    na6.m63963k(true, "Invalid resource ID provided: %s", null);
                    q831Var2.m72305j(new g631(null, "", numValueOf2, null, null, null, null, null, false));
                }
                break;
        }
    }
}
