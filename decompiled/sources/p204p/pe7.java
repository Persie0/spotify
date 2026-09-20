package p204p;

import com.spotify.music.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class pe7 extends dtx0 {

    /* JADX INFO: renamed from: S0 */
    public final ovf f176645S0;

    /* JADX INFO: renamed from: T0 */
    public final iyp f176646T0;

    public pe7(ovf ovfVar, iyp iypVar) {
        super(ovfVar.getView());
        this.f176645S0 = ovfVar;
        this.f176646T0 = iypVar;
    }

    @Override // p204p.dtx0
    /* JADX INFO: renamed from: D */
    public final void mo25392D(arx0 arx0Var, List list, C2580xm c2580xm) {
        xpx0 xpx0Var = (xpx0) arx0Var;
        fq50 fq50Var = xpx0Var.f264753a;
        float f = fq50Var.f72065e;
        String str = fq50Var.f72064d;
        boolean z = f > 0.0f;
        String str2 = fq50Var.f72062b;
        String str3 = fq50Var.f72063c;
        String str4 = fq50Var.f72069i;
        String str5 = fq50Var.f72067g;
        StringBuilder sb = new StringBuilder();
        ovf ovfVar = this.f176645S0;
        if (z) {
            sb.append(String.format(new Locale(ihf1.m50634r(ovfVar.getView().getContext(), "_")), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
            sb.append(" • ");
        }
        if (!wl51.m88460J0(str)) {
            sb.append(str);
            sb.append(" • ");
        }
        hyp hypVarM51952a = this.f176646T0.m51952a(fq50Var.f72062b, (int) fq50Var.f72060Z, (int) fq50Var.f72058X, null, false, false);
        hypVarM51952a.f96635i = false;
        hypVarM51952a.f96634h = true;
        hypVarM51952a.f96633g = true;
        hypVarM51952a.m49198g("d MMM yyyy");
        hypVarM51952a.f96632f = 2;
        sb.append(hypVarM51952a.m49192a());
        String string = sb.toString();
        qsj qsjVar = fq50Var.f72068h ? qsj.f192128b : qsj.f192130d;
        String strM96022k = zfg1.m96022k(this.f50039a.getContext(), fq50Var);
        String str6 = fq50Var.f72062b;
        ovfVar.mo2820d(new ad7(str2, strM96022k, string, str4, str3, str5, z, qsjVar, new pi1(xpx0Var.f264757e == 1 ? qi1.f188893b : qi1.f188892a, list.contains("addStateChanged"), str6, ovfVar.getView().getContext().getString(R.string.assisted_curation_search_add_button_context_content_description), ti1.f220528b)));
        ovfVar.mo2821c(new ys5(21, c2580xm, fq50Var));
    }
}
