package p204p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.jr */
/* JADX INFO: loaded from: classes18.dex */
public final class C2025jr implements Function, InterfaceC1988iq {

    /* JADX INFO: renamed from: a */
    public final Object f115030a;

    /* JADX INFO: renamed from: b */
    public final Object f115031b;

    /* JADX INFO: renamed from: c */
    public final Object f115032c;

    public C2025jr(C2585xr c2585xr, sh7 sh7Var, String str) {
        this.f115030a = c2585xr;
        this.f115031b = sh7Var;
        this.f115032c = str;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC1823eq m54127a() {
        return (InterfaceC1823eq) ((h4t0) this.f115032c).get();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        InterfaceC2627yv interfaceC2627yv = (InterfaceC2627yv) obj;
        C2585xr c2585xr = (C2585xr) this.f115030a;
        if (!(interfaceC2627yv instanceof C2549wv)) {
            if (interfaceC2627yv instanceof C2590xv) {
                return Single.just(Boolean.FALSE);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!((C2549wv) interfaceC2627yv).m89071a().f245102a.m92002a()) {
            return Single.just(Boolean.FALSE);
        }
        return c2585xr.mo54014b(null).flatMap(new C1952hr(0, c2585xr, (sh7) this.f115031b)).doOnSuccess(new C1989ir(c2585xr, (String) this.f115032c));
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC2024jq m54128b() {
        return (InterfaceC2024jq) ((h4t0) this.f115032c).get();
    }

    public C2025jr(InterfaceC2186nq interfaceC2186nq) {
        this.f115030a = interfaceC2186nq;
        this.f115031b = b2s.m27972b(new jgm(this, 1));
        this.f115032c = b2s.m27972b(new jgm(this, 0));
    }
}
