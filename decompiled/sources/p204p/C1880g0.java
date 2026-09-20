package p204p;

import io.ably.lib.types.ChannelOptions;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: p.g0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C1880g0 implements Function, InterfaceC1917h0, vg30 {

    /* JADX INFO: renamed from: a */
    public Object f75226a;

    public /* synthetic */ C1880g0(Object obj) {
        this.f75226a = obj;
    }

    @Override // p204p.vg30
    /* JADX INFO: renamed from: a */
    public String mo43248a() {
        return "application/x-msgpack";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.ri00] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objInvoke = ((ri00) this.f75226a).invoke((C2478v0) obj);
        return objInvoke != null ? Maybe.m23363f(objInvoke) : MaybeEmpty.f8264a;
    }

    /* JADX INFO: renamed from: b */
    public m6n0 m43249b() {
        C1761d0 c1761d0 = new C1761d0();
        qre0 qre0VarMo42552r = ((n6n0) this.f75226a).mo42552r();
        jg31.m53271i(qre0VarMo42552r);
        return new C2435u0(c1761d0, qre0VarMo42552r);
    }

    /* JADX INFO: renamed from: c */
    public C1797e0 m43250c(String str, String[] strArr, Map map, gh00 gh00Var, gh00 gh00Var2) {
        C2632z c2632z = ((C2596y0) this.f75226a).f267828t;
        ChannelOptions channelOptions = new ChannelOptions();
        channelOptions.params = map;
        mmc mmcVarM94998a = c2632z.m94998a(str, channelOptions);
        C1840f0 c1840f0 = new C1840f0(gh00Var, gh00Var2);
        synchronized (mmcVarM94998a) {
            try {
                tx8.m81897l(bnc.f28783x, "subscribe(); channel = " + mmcVarM94998a.f28784c + "; (multiple events)");
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    String str2 = strArr[i];
                    HashMap map2 = mmcVarM94998a.f28796o;
                    anc ancVar = (anc) map2.get(str2);
                    if (ancVar == null) {
                        ancVar = new anc();
                        map2.put(str2, ancVar);
                    }
                    synchronized (ancVar) {
                        ((ArrayList) ancVar.f89665a).add(c1840f0);
                    }
                }
                mmcVarM94998a.m29942e(false, null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new C1797e0(mmcVarM94998a, c1840f0);
    }

    @Override // p204p.vg30
    public byte[] getEncoded() {
        return (byte[]) this.f75226a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1880g0(gh00 gh00Var) {
        this.f75226a = (ri00) gh00Var;
    }
}
