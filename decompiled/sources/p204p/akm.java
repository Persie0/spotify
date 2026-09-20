package p204p;

import android.app.Activity;
import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class akm implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16602a;

    /* JADX INFO: renamed from: b */
    public final Object f16603b;

    public /* synthetic */ akm(Object obj, int i) {
        this.f16602a = i;
        this.f16603b = obj;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f16602a) {
            case 0:
                return new zjm(this, 0);
            case 1:
                return new xlm(this);
            case 2:
                return new ylm(this);
            case 3:
                wj7 wj7Var = (wj7) ((t7j) this.f16603b).f217839b;
                Context context = (Context) wj7Var.f251876h.get();
                jg31.m53271i(context);
                Activity activity = (Activity) wj7Var.f251869a.get();
                jg31.m53271i(activity);
                qya0 qya0Var = (qya0) wj7Var.f251878j.get();
                jg31.m53271i(qya0Var);
                ju91 ju91Var = (ju91) wj7Var.f251883o.get();
                jg31.m53271i(ju91Var);
                wrl wrlVar = new wrl(activity, qya0Var, ju91Var);
                luk lukVarM94576x = ysr.m94576x();
                ubq0 ubq0Var = (ubq0) wj7Var.f251877i.get();
                jg31.m53271i(ubq0Var);
                qrl qrlVar = new qrl(viy0.AUTHENTICATED, ubq0Var);
                qya0 qya0Var2 = (qya0) wj7Var.f251878j.get();
                jg31.m53271i(qya0Var2);
                u7n0 u7n0Var = (u7n0) wj7Var.f251884p.get();
                jg31.m53271i(u7n0Var);
                j6r j6rVar = (j6r) wj7Var.f251885q.get();
                jg31.m53271i(j6rVar);
                fk60 fk60Var = (fk60) wj7Var.f251886r.get();
                jg31.m53271i(fk60Var);
                return new prl(context, wrlVar, lukVarM94576x, qrlVar, new e6a0(qya0Var2, u7n0Var, j6rVar, new mab0(fk60Var, 14), 18));
            case 4:
                return new zlm(this);
            case 5:
                return hgi0.m47449B((dcm0) ((vpj) this.f16603b).f243701b);
            case 6:
                return hgi0.m47449B((dcm0) ((sti) this.f16603b).f213917a);
            case 7:
                return hgi0.m47449B((dcm0) ((ydi) this.f16603b).f271774b);
            case 8:
                return new nmm(this);
            case 9:
                z9j0 z9j0Var = (z9j0) ((mfn) ((ujh) this.f16603b).f231032b).f143099a.f169565X.get();
                jg31.m53271i(z9j0Var);
                return new k98(z9j0Var, 1);
            case 10:
                return new omm(this);
            case 11:
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((cn9) ((n6i) this.f16603b).f150891b).f39921a.get();
                jg31.m53271i(retrofitMaker);
                return (jo9) retrofitMaker.createWebgateService(jo9.class, "android-blend-socialprompting-network");
            case 12:
                return new pmm(this);
            case 13:
                return new qmm(this);
            case 14:
                return new smm(this);
            case 15:
                return ptl.m70983d((o6q) ((qca) ((ydi) this.f16603b).f271774b).f187288a.get());
            case 16:
                return ptl.m70983d((o6q) ((gpb) ((ujh) this.f16603b).f231032b).f83157c.get());
            case 17:
                return hgi0.m47449B((dcm0) ((t7j) this.f16603b).f217839b);
            case 18:
                hxj0 hxj0Var = (hxj0) ((vgd) ((n6i) this.f16603b).f150891b).f241226f.get();
                jg31.m53271i(hxj0Var);
                return hxj0Var;
            case 19:
                return hgi0.m47449B((dcm0) ((vpj) this.f16603b).f243701b);
            case 20:
                return hgi0.m47449B((dcm0) ((abk) this.f16603b).f14138c);
            case 21:
                return ((l3n) ((sti) this.f16603b).f213917a).m58013f();
            case 22:
                suj sujVar = (suj) this.f16603b;
                pgo pgoVar = ((mrq) sujVar.f214135a).f146588a;
                jg31.m53271i(pgoVar);
                String strM58011d = ((l3n) sujVar.f214136b).m58011d();
                bre breVar = new bre();
                breVar.f30082a = kkc0.m56695h0(new pqm0("unplayed", new are(0, R.string.clips_filter_chip_unplayed, "unplayed", lt80.f136724a)), new pqm0("inprogress", new are(1, R.string.clips_filter_chip_in_progress, "inprogress", ft80.f73135a)), new pqm0("finished", new are(2, R.string.clips_filter_chip_finished, "finished", et80.f62664a)));
                return new C2065kt(pgoVar, strM58011d, breVar);
            case 23:
                return new np0(((zfn) ((ydi) this.f16603b).f271774b).f282351a.m78693H1());
            case 24:
                return new rpm(this);
            case 25:
                return new lqm(this);
            case 26:
                return new pqm(this);
            case 27:
                return new qqm(this, 0);
            case 28:
                return new rqm(this, 0);
            default:
                return new sqm(this);
        }
    }
}
