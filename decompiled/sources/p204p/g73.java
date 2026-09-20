package p204p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;
import java.util.List;
import p000.C1398e;

/* JADX INFO: loaded from: classes5.dex */
public final class g73 extends dtx0 {

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ int f77164S0;

    /* JADX INFO: renamed from: T0 */
    public final ovf f77165T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g73(ovf ovfVar, int i) {
        super(ovfVar.getView());
        this.f77164S0 = i;
        switch (i) {
            case 1:
                super(ovfVar.getView());
                this.f77165T0 = ovfVar;
                break;
            case 2:
                super(ovfVar.getView());
                this.f77165T0 = ovfVar;
                break;
            case 3:
            default:
                this.f77165T0 = ovfVar;
                break;
            case 4:
                super(ovfVar.getView());
                this.f77165T0 = ovfVar;
                break;
        }
    }

    @Override // p204p.dtx0
    /* JADX INFO: renamed from: D */
    public final void mo25392D(arx0 arx0Var, List list, C2580xm c2580xm) {
        switch (this.f77164S0) {
            case 0:
                vpx0 vpx0Var = (vpx0) arx0Var;
                cq50 cq50Var = vpx0Var.f243801a;
                String str = cq50Var.f40737b;
                boolean z = vpx0Var.f243803c;
                boolean z2 = vpx0Var.f243804d;
                boolean z3 = !z2;
                String str2 = z2 ? null : cq50Var.f40738c;
                ovf ovfVar = this.f77165T0;
                ovfVar.mo2820d(new j53(str, zfg1.m96022k(ovfVar.getView().getContext(), cq50Var), str2, z, z3));
                ovfVar.mo2821c(new n62(9, c2580xm, cq50Var));
                break;
            case 1:
                wpx0 wpx0Var = (wpx0) arx0Var;
                dq50 dq50Var = wpx0Var.f253856a;
                String str3 = dq50Var.f51822b;
                boolean z4 = wpx0Var.f253858c;
                boolean z5 = !z4;
                String str4 = z4 ? null : dq50Var.f51823c;
                ovf ovfVar2 = this.f77165T0;
                ovfVar2.mo2820d(new n26(str3, zfg1.m96022k(ovfVar2.getView().getContext(), dq50Var), str4, z5));
                ovfVar2.mo2821c(new ys5(8, c2580xm, dq50Var));
                break;
            case 2:
                lq50 lq50Var = ((hqx0) arx0Var).f94266a;
                String str5 = lq50Var.f135952b;
                String str6 = lq50Var.f135953c;
                ovf ovfVar3 = this.f77165T0;
                ovfVar3.mo2820d(new j53(str5, zfg1.m96022k(ovfVar3.getView().getContext(), lq50Var), str6, false, true));
                ovfVar3.mo2821c(new sqo0(11, c2580xm, lq50Var));
                break;
            case 3:
                this.f77165T0.mo2820d(new q7z0(((oqx0) arx0Var).f168398a));
                break;
            default:
                qq50 qq50Var = ((qqx0) arx0Var).f191672a;
                String str7 = qq50Var.f191492b;
                String str8 = qq50Var.f191493c;
                ovf ovfVar4 = this.f77165T0;
                ovfVar4.mo2820d(new fr11(str7, zfg1.m96022k(ovfVar4.getView().getContext(), qq50Var), str8));
                ovfVar4.mo2821c(new C1398e(22, c2580xm, qq50Var));
                break;
        }
    }

    public g73(Context context, ovf ovfVar) {
        this.f77164S0 = 3;
        View view = ovfVar.getView();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(view);
        frameLayout.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.assisted_curation_search_section_top_padding), 0, 0);
        super(frameLayout);
        this.f77165T0 = ovfVar;
    }
}
