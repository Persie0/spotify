package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.R;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m24212d2 = {"Lp/tme1;", "Lp/f0n;", "Lp/e600;", "Lp/bbm0;", "<init>", "()V", "src_main_java_com_spotify_yourepisodes_settings-settings"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class tme1 extends f0n implements e600, bbm0 {

    /* JADX INFO: renamed from: B1 */
    public tw80 f221675B1;

    /* JADX INFO: renamed from: C1 */
    public oc41 f221676C1;

    /* JADX INFO: renamed from: D1 */
    public b7a1 f221677D1;

    /* JADX INFO: renamed from: E1 */
    public vv91 f221678E1;

    /* JADX INFO: renamed from: F1 */
    public final agy f221679F1 = dme1.f50505c;

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        oc41 oc41Var = this.f221676C1;
        if (oc41Var == null) {
            wj50.m88260d0("spotifyFragmentContainer");
            throw null;
        }
        String string = m49702X0().getString(R.string.your_episodes_settings_header_title);
        o7m o7mVar = ((SpotifyMainActivity) oc41Var).f6059h1;
        if (o7mVar == null) {
            wj50.m88260d0("currentFragmentAccessor");
            throw null;
        }
        o7mVar.mo31747a(string, this);
        int i = wkm0.f252262Q0;
        tw80 tw80Var = this.f221675B1;
        if (tw80Var == null) {
            wj50.m88260d0("pageManager");
            throw null;
        }
        Context contextM49702X0 = m49702X0();
        if (((zwp) tw80Var.f224373i) == null) {
            tw80Var.f224371g = ((qfi0) tw80Var.f224367c).m72719a(v3h1.m84576I((Single) tw80Var.f224366b));
            jfi0 jfi0Var = (jfi0) tw80Var.f224368d;
            voc1 voc1Var = dme1.f50507e;
            zam0 zam0Var = (zam0) tw80Var.f224369e;
            jfi0Var.getClass();
            xwp xwpVarMo53201a = jfi0Var.mo53201a(new lcm0(zam0Var), nug1.m65704p(voc1Var));
            xwpVarMo53201a.f266721a.f280844c = new up9(tw80Var, 9);
            tw80Var.f224373i = xwpVarMo53201a.m92299a(contextM49702X0);
        }
        zwp zwpVar = (zwp) tw80Var.f224373i;
        if (zwpVar != null) {
            return ujg1.m83280u(zwpVar);
        }
        wj50.m88260d0("pageLoaderView");
        throw null;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() {
        this.f98702f1 = true;
        tw80 tw80Var = this.f221675B1;
        if (tw80Var == null) {
            wj50.m88260d0("pageManager");
            throw null;
        }
        fne1 fne1Var = (fne1) tw80Var.f224372h;
        if (fne1Var == null) {
            wj50.m88260d0("pageElement");
            throw null;
        }
        MobiusLoop.Controller controller = fne1Var.f71277f;
        if (controller != null) {
            controller.disconnect();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        this.f98702f1 = true;
        tw80 tw80Var = this.f221675B1;
        if (tw80Var == null) {
            wj50.m88260d0("pageManager");
            throw null;
        }
        mwx0 mwx0Var = (mwx0) tw80Var.f224371g;
        if (mwx0Var == null) {
            wj50.m88260d0("pageLoader");
            throw null;
        }
        mwx0Var.m63070b();
        b7a1 b7a1Var = this.f221677D1;
        if (b7a1Var != null) {
            b7a1.m28369E(b7a1Var);
        } else {
            wj50.m88260d0("pageBoundUbiLogger");
            throw null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        this.f98702f1 = true;
        tw80 tw80Var = this.f221675B1;
        if (tw80Var == null) {
            wj50.m88260d0("pageManager");
            throw null;
        }
        zwp zwpVar = (zwp) tw80Var.f224373i;
        if (zwpVar == null) {
            wj50.m88260d0("pageLoaderView");
            throw null;
        }
        mwx0 mwx0Var = (mwx0) tw80Var.f224371g;
        if (mwx0Var == null) {
            wj50.m88260d0("pageLoader");
            throw null;
        }
        zwpVar.m97153F(this, mwx0Var);
        mwx0 mwx0Var2 = (mwx0) tw80Var.f224371g;
        if (mwx0Var2 == null) {
            wj50.m88260d0("pageLoader");
            throw null;
        }
        mwx0Var2.m63069a();
        vv91 vv91Var = this.f221678E1;
        if (vv91Var == null) {
            wj50.m88260d0("pageLocationChangeListener");
            throw null;
        }
        ((sfa0) vv91Var).m78000H(dme1.f50506d);
        b7a1 b7a1Var = this.f221677D1;
        if (b7a1Var != null) {
            ((c7a1) b7a1Var).m31703F();
        } else {
            wj50.m88260d0("pageBoundUbiLogger");
            throw null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: P0 */
    public final void mo3104P0() {
        this.f98702f1 = true;
        b7a1 b7a1Var = this.f221677D1;
        if (b7a1Var != null) {
            ((c7a1) b7a1Var).m31704G();
        } else {
            wj50.m88260d0("pageBoundUbiLogger");
            throw null;
        }
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        gn80 gn80Var = dme1.f50503a;
        return dme1.f50506d;
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        qu91 qu91Var = this.f221677D1;
        if (qu91Var != null) {
            return new bnm0(((zz8) qu91Var).mo24811c());
        }
        wj50.m88260d0("pageBoundUbiLogger");
        throw null;
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: j */
    public final String mo24331j() {
        return dme1.f50505c.getName();
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: k */
    public final String mo24332k(Context context) {
        return context.getString(R.string.your_episodes_settings_header_title);
    }

    @Override // p204p.zfy
    /* JADX INFO: renamed from: l, reason: from getter */
    public final agy getF221679F1() {
        return this.f221679F1;
    }
}
