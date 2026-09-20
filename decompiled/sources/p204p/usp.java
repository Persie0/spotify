package p204p;

import android.os.Bundle;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: classes9.dex */
public final class usp implements ymh0 {

    /* JADX INFO: renamed from: a */
    public final uhp f233660a;

    /* JADX INFO: renamed from: b */
    public final boolean f233661b;

    /* JADX INFO: renamed from: c */
    public MobiusLoop.Controller f233662c;

    /* JADX INFO: renamed from: d */
    public final bmd0 f233663d;

    public usp(uhp uhpVar, drw drwVar, boolean z) {
        this.f233660a = uhpVar;
        this.f233661b = z;
        tsp tspVar = new tsp(this);
        u8z u8zVar = (u8z) ((zu0) ((jzm) drwVar.f52400b).f117755a.f64417c).f286300c;
        bmd0 bmd0Var = new bmd0();
        u8zVar.f98716q1.mo31986a(new zmh0(bmd0Var, u8zVar));
        u8zVar.f98721u1.m59915g().m41110c("find_in_show_mobius_controller_state", new C1982ik(tspVar, 10));
        this.f233663d = bmd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller m83911a() {
        MobiusLoop.Builder builderM15656a = RxMobius.m15656a(rsp.f202375a, this.f233660a.f230495c);
        bmd0 bmd0Var = this.f233663d;
        Bundle bundle = bmd0Var.f28509a;
        String string = bundle != null ? bundle.getString("search_query") : null;
        boolean z = bmd0Var.f28509a != null;
        MobiusLoop.Controller controllerM15580b = Mobius.m15580b(builderM15656a, new w8z(string, null, true ^ z, nau.f152117a, this.f233661b), ssp.f213689a, MainThreadWorkRunner.m15627a());
        this.f233662c = controllerM15580b;
        return controllerM15580b;
    }
}
