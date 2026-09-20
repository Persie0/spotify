package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class pro {

    /* JADX INFO: renamed from: a */
    public final ezk0 f180649a;

    /* JADX INFO: renamed from: b */
    public final emx f180650b;

    /* JADX INFO: renamed from: c */
    public final nc2 f180651c;

    /* JADX INFO: renamed from: d */
    public final b2q0 f180652d;

    public pro(ezk0 ezk0Var, emx emxVar, nc2 nc2Var, b2q0 b2q0Var, hc80 hc80Var) {
        this.f180649a = ezk0Var;
        this.f180650b = emxVar;
        this.f180651c = nc2Var;
        this.f180652d = b2q0Var;
        hc80Var.getLifecycle().mo31986a(new e16(this, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70731a(String str, fbk fbkVar) {
        oro oroVar;
        pro proVar;
        Object obj;
        if (fbkVar instanceof oro) {
            oroVar = (oro) fbkVar;
            int i = oroVar.f168634d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oroVar.f168634d = i - Integer.MIN_VALUE;
            } else {
                oroVar = new oro(this, fbkVar);
            }
        } else {
            oroVar = new oro(this, fbkVar);
        }
        Object objM48221p = oroVar.f168632b;
        int i2 = oroVar.f168634d;
        if (i2 == 0) {
            bga.m29073P(objM48221p);
            Single map = this.f180649a.m40369i(Collections.singletonList(str)).firstOrError().map(t0o0.f215926T0);
            oroVar.f168631a = this;
            oroVar.f168634d = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(oroVar));
            hqbVar.m48222q();
            hqbVar.mo42415l(new g5a(1, map.subscribe(new nro(hqbVar, 0))));
            objM48221p = hqbVar.m48221p();
            yuk yukVar = yuk.f276404a;
            if (objM48221p == yukVar) {
                return yukVar;
            }
            proVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            proVar = oroVar.f168631a;
            bga.m29073P(objM48221p);
        }
        d0w d0wVar = (d0w) objM48221p;
        proVar.getClass();
        s0o0 s0o0Var = s0o0.f204445S0;
        e370 e370Var = e370.f55648T0;
        wqb0 wqb0Var = wqb0.f253971V0;
        int i3 = d0wVar.f44068E;
        String str2 = d0wVar.f44069a;
        if (i3 == 3) {
            obj = wqb0Var;
        } else if (i3 == 4) {
            obj = e370Var;
        } else {
            b5q0 b5q0Var = (b5q0) d0wVar.f44067D.mo30169a(b5q0.class);
            obj = (b5q0Var == null || !b5q0Var.f23644d) ? k8f0.f120332S0 : s0o0Var;
        }
        if (obj.equals(wqb0Var)) {
            proVar.f180650b.m39465a(str2);
        } else if (obj.equals(e370Var)) {
            proVar.f180651c.m64107b(str2, d0wVar.m34563b(4));
        } else if (obj.equals(s0o0Var)) {
            proVar.f180652d.m27966a(str2, null);
        }
        return w2a1.f247311a;
    }
}
