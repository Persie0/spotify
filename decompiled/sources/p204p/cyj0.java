package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes2.dex */
public final class cyj0 extends urk {

    /* JADX INFO: renamed from: f2 */
    public static final /* synthetic */ int f43298f2 = 0;

    /* JADX INFO: renamed from: W1 */
    public final a0i0 f43299W1;

    /* JADX INFO: renamed from: X1 */
    public kbz f43300X1;

    /* JADX INFO: renamed from: Y1 */
    public d2j0 f43301Y1;

    /* JADX INFO: renamed from: Z1 */
    public bvp f43302Z1;

    /* JADX INFO: renamed from: a2 */
    public xgq0 f43303a2;

    /* JADX INFO: renamed from: b2 */
    public i780 f43304b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f43305c2;

    /* JADX INFO: renamed from: d2 */
    public String f43306d2 = "";

    /* JADX INFO: renamed from: e2 */
    public boolean f43307e2;

    public cyj0(a0i0 a0i0Var) {
        this.f43299W1 = a0i0Var;
    }

    /* JADX INFO: renamed from: y1 */
    public static final Completable m34385y1(cyj0 cyj0Var, String str) {
        xgq0 xgq0Var = cyj0Var.f43303a2;
        if (xgq0Var == null) {
            wj50.m88260d0("preferencesOptInApi");
            throw null;
        }
        lmc lmcVar = lmc.f134854b;
        srl0 srl0Var = srl0.PODCAST_COMMENTS_REACTIONS;
        yrl0 yrl0Var = new yrl0(lmcVar, srl0Var, true);
        lmc lmcVar2 = lmc.f134853a;
        yrl0 yrl0Var2 = new yrl0(lmcVar2, srl0Var, true);
        srl0 srl0Var2 = srl0.PODCAST_COMMENTS_REPLIES;
        return xgq0Var.m90935d(new yrl0[]{yrl0Var, yrl0Var2, new yrl0(lmcVar, srl0Var2, true), new yrl0(lmcVar2, srl0Var2, true)}, 4, str);
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f43299W1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        if (bundle != null) {
            mo83051h1();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: H0 */
    public final void mo3093H0() {
        this.f98702f1 = true;
        if (this.f43307e2) {
            d2j0 d2j0Var = this.f43301Y1;
            if (d2j0Var == null) {
                wj50.m88260d0("notificationOptInFlowLogger");
                throw null;
            }
            d2j0Var.m34704k();
        } else {
            d2j0 d2j0Var2 = this.f43301Y1;
            if (d2j0Var2 == null) {
                wj50.m88260d0("notificationOptInFlowLogger");
                throw null;
            }
            d2j0Var2.m34705l();
        }
        kbz kbzVar = this.f43300X1;
        if (kbzVar != null) {
            kbzVar.m55976a().subscribe();
        } else {
            wj50.m88260d0("firstCommentFlowRepository");
            throw null;
        }
    }

    @Override // p204p.urk
    /* JADX INFO: renamed from: x1 */
    public final View mo34386x1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        i780 i780VarM49844h = i780.m49844h(layoutInflater, viewGroup);
        this.f43304b2 = i780VarM49844h;
        p3h1.m69032r(i780VarM49844h.m49846f(), x4g0.f258103Z);
        i780 i780Var = this.f43304b2;
        if (i780Var == null) {
            wj50.m88260d0("binding");
            throw null;
        }
        EncoreProgressIndicatorButton encoreProgressIndicatorButton = (EncoreProgressIndicatorButton) i780Var.f99466c;
        encoreProgressIndicatorButton.setOnClickListener(new dtz(19, this, encoreProgressIndicatorButton));
        i780 i780Var2 = this.f43304b2;
        if (i780Var2 != null) {
            return i780Var2.m49846f();
        }
        wj50.m88260d0("binding");
        throw null;
    }
}
