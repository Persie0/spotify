package p204p;

import android.os.Bundle;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Observable;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class gc01 extends bc01 implements w3x0 {

    /* JADX INFO: renamed from: i */
    public static final b450 f78448i;

    /* JADX INFO: renamed from: d */
    public final ac01 f78449d;

    /* JADX INFO: renamed from: e */
    public final ib01 f78450e;

    /* JADX INFO: renamed from: f */
    public cc01 f78451f;

    /* JADX INFO: renamed from: g */
    public final iwr f78452g = new iwr();

    /* JADX INFO: renamed from: h */
    public MobiusLoop.Controller f78453h;

    static {
        ob01.f163507a.getClass();
        f78448i = new b450(0, nb01.f152161b.f150622a, 1);
    }

    public gc01(ac01 ac01Var, ib01 ib01Var) {
        this.f78449d = ac01Var;
        this.f78450e = ib01Var;
    }

    @Override // p204p.w3x0
    /* JADX INFO: renamed from: a */
    public final void mo31963a(Bundle bundle) {
        this.f78451f = (cc01) bundle.getParcelable("SettingsPageLoadableResourceImpl.savedState");
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        if (this.f78453h != null) {
            m35107j();
            m35106i();
            return;
        }
        cc01 cc01Var = this.f78451f;
        b450 b450Var = cc01Var != null ? new b450(cc01Var.f36278a, cc01Var.f36279b, 1) : f78448i;
        ib01 ib01Var = this.f78450e;
        ot7 ot7Var = ib01Var.f100408a;
        Observable observableM67771c = ot7Var.m67771c();
        mt7 mt7Var = ot7Var.f168989a;
        odu oduVarM97410p = EnabledShowsCountRequest.m97410p();
        oduVarM97410p.m66776m();
        this.f78452g.m51848b(Observable.combineLatest(observableM67771c, mt7Var.m62812a((EnabledShowsCountRequest) oduVarM97410p.build()).map(mc40.f142056t), ot7Var.m67770b(b450Var), Observable.combineLatest(ib01Var.f100411d, ib01Var.f100409b.distinctUntilChanged(), ib01Var.f100410c.distinctUntilChanged(), kxq0.f127567Z).distinctUntilChanged(), oyq0.f171858Z).firstOrError().map(new dc01(this)).doOnSubscribe(new ec01(this, 0)).subscribe(new fc01(this), new ec01(this, 1)));
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        this.f78452g.m51847a();
    }

    @Override // p204p.w3x0
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        MobiusLoop.Controller controller = this.f78453h;
        if (controller == null) {
            return bundle;
        }
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        b450 b450Var = ((hb01) controller.mo15602a()).f89348d.f228321c;
        bundle.putParcelable("SettingsPageLoadableResourceImpl.savedState", new cc01(b450Var.f278778a, b450Var.f278779b));
        return bundle;
    }
}
