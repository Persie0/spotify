package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class nod1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qod1 f156667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f156668b;

    public nod1(qod1 qod1Var, rlv0 rlv0Var) {
        this.f156667a = qod1Var;
        this.f156668b = rlv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        mod1 mod1Var;
        Uri uri;
        Uri uri2;
        if (ibkVar instanceof mod1) {
            mod1Var = (mod1) ibkVar;
            int i = mod1Var.f145654b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mod1Var.f145654b = i - Integer.MIN_VALUE;
            } else {
                mod1Var = new mod1(this, ibkVar);
            }
        } else {
            mod1Var = new mod1(this, ibkVar);
        }
        Object obj2 = mod1Var.f145653a;
        yuk yukVar = yuk.f276404a;
        int i2 = mod1Var.f145654b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        a4f0 a4f0Var = (a4f0) obj;
        hb11 hb11VarM52092t = j0g1.m52092t(0, 0, 0, 7);
        Uri uri3 = Uri.parse(a4f0Var.f12241e);
        epd1 epd1Var = this.f156667a.f190926g;
        synchronized (epd1Var) {
            try {
                dpd1 dpd1Var = epd1Var.f61632c;
                zod1 zod1Var = zod1.f284771a;
                if (dpd1Var.equals(zod1Var)) {
                    uri = uri3;
                } else {
                    apd1 apd1Var = apd1.f17918a;
                    if (!dpd1Var.equals(apd1Var)) {
                        if (dpd1Var instanceof yod1) {
                            uri2 = ((yod1) dpd1Var).f274642a.f95635a;
                        } else if (dpd1Var instanceof bpd1) {
                            uri2 = ((bpd1) dpd1Var).f29418a;
                        } else {
                            if (!dpd1Var.equals(cpd1.f40544a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!(pja1.m70136a(uri3) && !wl51.m88496t0(uri3.toString(), "notoken", false))) {
                                epd1Var.f61632c = zod1Var;
                            } else if (uri3.getQueryParameterNames().contains("ubi")) {
                                epd1Var.f61632c = apd1Var;
                            } else {
                                iv91 iv91Var = epd1Var.f61630a;
                                Uri uriM51739a = iv91Var.m51739a(uri3, epd1Var.f61631b.f222234a);
                                epd1Var.f61632c = new yod1(new hv91(uriM51739a, iv91Var));
                                uri = uriM51739a;
                            }
                        }
                        uri = uri2;
                    }
                    uri = uri3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f156668b.f200373a = x0h1.m89578u(l5h1.m58232p(this.f156667a.f190927h.mo29873e().getLifecycle()), opo.m67570t(this.f156667a.f190920a, qlg1.m73202g()), 0, new xt61(12, uri3, this.f156667a, uri, hb11VarM52092t, a4f0Var, null), 2);
        foa1 foa1Var = new foa1(bqz0Var, 7);
        mod1Var.f145654b = 1;
        hb11VarM52092t.collect(foa1Var, mod1Var);
        return yukVar;
    }
}
