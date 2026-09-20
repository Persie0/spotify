package p204p;

import android.content.Context;
import com.spotify.ucs.proto.p168v0.C1306b;
import com.spotify.ucs.proto.p168v0.C1307c;
import com.spotify.ucs.proto.p168v0.UcsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class rh7 implements yaw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yty f199155a;

    /* JADX INFO: renamed from: b */
    public final y0x0 f199156b;

    /* JADX INFO: renamed from: c */
    public final si5 f199157c;

    /* JADX INFO: renamed from: d */
    public final C2529wd f199158d;

    /* JADX INFO: renamed from: e */
    public final y6q0 f199159e;

    /* JADX INFO: renamed from: f */
    public final nii f199160f;

    /* JADX INFO: renamed from: g */
    public final AtomicLong f199161g;

    /* JADX INFO: renamed from: h */
    public long f199162h;

    /* JADX INFO: renamed from: i */
    public final boolean f199163i;

    /* JADX INFO: renamed from: j */
    public final wg61 f199164j;

    /* JADX INFO: renamed from: k */
    public final fxc1 f199165k;

    public rh7(C2529wd c2529wd, b9a b9aVar, w8b w8bVar, w601 w601Var) {
        pc5 pc5Var = w601Var.f248225b;
        y0x0 y0x0VarM30851a = bxq0.m30851a(jhl0.m53425s(w8bVar));
        si5 si5Var = new si5(3);
        y6q0 y6q0Var = w601Var.f248226c;
        this.f199155a = uty.m83962a(c2529wd);
        this.f199156b = y0x0VarM30851a;
        this.f199157c = si5Var;
        this.f199158d = c2529wd;
        this.f199159e = y6q0Var;
        this.f199160f = new nii(c2529wd, new n250(b9aVar, pc5Var, y6q0Var, 0));
        this.f199161g = new AtomicLong(0L);
        this.f199163i = sjr0.f209925a.contains("com.spotify.music");
        this.f199164j = new wg61(new f30(this, 26));
        this.f199165k = new fxc1(this, 11);
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: a */
    public final Single mo28485a() {
        C2529wd c2529wd = this.f199158d;
        c2529wd.getClass();
        return Single.fromCallable(new i751(c2529wd, 0)).subscribeOn(Schedulers.f10370c);
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: b */
    public final Single mo28486b(int i) {
        long jM78178H = this.f199157c.m78178H();
        long millis = TimeUnit.SECONDS.toMillis(((xaw0) this.f199164j.getValue()).m90294a());
        if (i == 6 && jM78178H - this.f199162h < millis) {
            return Single.just(nsy.f157934a);
        }
        C1306b c1306bM21864q = UcsRequest.m21864q();
        C1307c c1307cM21869q = UcsRequest.CallerInfo.m21869q();
        c1307cM21869q.m21896r();
        c1307cM21869q.m21895q();
        c1307cM21869q.m21894m(klh.m56825A(i));
        c1306bM21864q.m21892q(c1307cM21869q);
        c1306bM21864q.m21893r(qii.m72871a(i, this.f199159e));
        if (this.f199163i) {
            c1306bM21864q.m21891m(UcsRequest.AccountAttributesRequest.m21865n());
        }
        UcsRequest ucsRequest = (UcsRequest) c1306bM21864q.build();
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H("RCS");
        utu0Var.m83952u(s571.m77251j("Fetching remote config data (", klh.m56825A(i), ")"), new Object[0]);
        utu0Var.m83940H("RCS");
        utu0Var.m83941I(String.valueOf(ucsRequest), new Object[0]);
        C2529wd c2529wd = this.f199158d;
        c2529wd.getClass();
        Single singleDoOnError = Single.create(new vr11(c2529wd, 10)).flatMap(new c97(1, this, ucsRequest)).doOnSubscribe(new C1666ag(this, 25)).doOnSuccess(this.f199165k).compose(new p4l0(5)).doOnSuccess(new oh7(this, i, 0)).doOnSuccess(new ph7(this, jM78178H)).doOnError(new qh7(this, i, 0));
        yty ytyVar = this.f199155a;
        ytyVar.getClass();
        return singleDoOnError.flatMap(new wty(ytyVar)).onErrorReturnItem(msy.f146877a).subscribeOn(Schedulers.f10370c);
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: c */
    public final void mo28487c(Context context) {
        tg1.m80729s(context.getApplicationContext());
    }

    @Override // p204p.yaw0
    /* JADX INFO: renamed from: d */
    public final Completable mo28488d() {
        return mo28486b(6).ignoreElement();
    }
}
