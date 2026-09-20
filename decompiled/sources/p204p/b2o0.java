package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class b2o0 extends o65 {

    /* JADX INFO: renamed from: Q1 */
    public final g4n0 f22652Q1;

    /* JADX INFO: renamed from: R1 */
    public uw00 f22653R1;

    /* JADX INFO: renamed from: S1 */
    public String f22654S1;

    /* JADX INFO: renamed from: T1 */
    public String f22655T1;

    /* JADX INFO: renamed from: U1 */
    public String f22656U1;

    /* JADX INFO: renamed from: V1 */
    public d850 f22657V1;

    /* JADX INFO: renamed from: W1 */
    public boolean f22658W1;

    public b2o0(g4n0 g4n0Var) {
        this.f22652Q1 = g4n0Var;
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        String string;
        String string2;
        String string3;
        this.f22652Q1.mo24367f(this);
        Bundle bundle = this.f98701f;
        String str = "";
        if (bundle == null || (string = bundle.getString("pageUri")) == null) {
            string = "";
        }
        this.f22654S1 = string;
        Bundle bundle2 = this.f98701f;
        if (bundle2 == null || (string2 = bundle2.getString(ContextTrack.Metadata.KEY_TITLE)) == null) {
            string2 = "";
        }
        this.f22655T1 = string2;
        Bundle bundle3 = this.f98701f;
        if (bundle3 != null && (string3 = bundle3.getString(ContextTrack.Metadata.KEY_SUBTITLE)) != null) {
            str = string3;
        }
        this.f22656U1 = str;
        Bundle bundle4 = this.f98701f;
        this.f22657V1 = bundle4 != null ? (d850) zn91.m96526N(bundle4, "interactionLoggingResult", d850.class) : null;
        super.mo875E0(context);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uw00 uw00Var = this.f22653R1;
        if (uw00Var == null) {
            wj50.m88260d0("callbacks");
            throw null;
        }
        String str = this.f22654S1;
        if (str == null) {
            wj50.m88260d0("pageUri");
            throw null;
        }
        uw00Var.f234539d.f216599b.add(str);
        ComposeView composeView = new ComposeView(m49702X0(), null, 0, 6, null);
        composeView.setFilterTouchesWhenObscured(true);
        composeView.setContent(rkk.m75763o(new a2o0(this, 2), true, -432622027));
        return composeView;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: H0 */
    public final void mo3093H0() {
        this.f98702f1 = true;
        uw00 uw00Var = this.f22653R1;
        if (uw00Var == null) {
            wj50.m88260d0("callbacks");
            throw null;
        }
        String str = this.f22654S1;
        if (str == null) {
            wj50.m88260d0("pageUri");
            throw null;
        }
        d850 d850Var = this.f22657V1;
        if (this.f22658W1) {
            uw00Var.f234538c.m48690l(str, d850Var);
        } else {
            uw00Var.m84080b(str, iz00.f107098a);
        }
    }
}
