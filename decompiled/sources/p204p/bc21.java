package p204p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange$TokenExchangeResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.http.Section;
import com.spotify.externalintegration.http.SectionItem;
import com.spotify.externalintegration.http.UnauthenticatedExperienceItem;
import com.spotify.externalintegration.http.UnauthenticatedExperiencesResponse;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsSignalRequest$SignalRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class bc21 implements tio, Function, dn6, yb70, ObservableOnSubscribe, v4p0, BiFunction, kpb1, Function4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25758a;

    /* JADX INFO: renamed from: b */
    public final Object f25759b;

    public /* synthetic */ bc21(Object obj, int i) {
        this.f25758a = i;
        this.f25759b = obj;
    }

    @Override // p204p.kpb1
    /* JADX INFO: renamed from: a */
    public void mo28659a(String str) {
        cpb1 cpb1Var = (cpb1) this.f25759b;
        cpb1Var.f40526a.invoke(new tob1(cpb1.m33561b(cpb1Var, str), str));
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Set<Map.Entry> setEntrySet;
        switch (this.f25758a) {
            case 2:
                i431 i431Var = (i431) this.f25759b;
                r7k r7kVar = (r7k) i431Var.f98423q.getValue();
                tow towVarM17992q = EsSignalRequest$SignalRequest.m17992q();
                towVarM17992q.m81225r("minus");
                ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
                umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
                ((wy3) i431Var.f98407a).getClass();
                umwVarM17777q.m83492m(System.currentTimeMillis());
                ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
                towVarM17992q.m81223m((EsLoggingParams$LoggingParams) ilwVarM17768t.build());
                Completable completableIgnoreElement = r7kVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", (EsSignalRequest$SignalRequest) towVarM17992q.build()).map(njy0.f154680Q0).doOnSuccess(new kwr0(10, i431Var, (ubp0) obj)).doOnError(hyx0.f96720Z0).ignoreElement();
                completableIgnoreElement.getClass();
                return completableIgnoreElement.m23299p(Functions.f7232h);
            case 3:
                return ((qe70) this.f25759b).invoke(obj);
            case 8:
                return new yk91(Boolean.TRUE, (e301) obj, ((ns41) ((mv41) this.f25759b)).f157663c);
            case 9:
                return Boolean.valueOf(((Integer) obj).intValue() >= ((Integer) this.f25759b).intValue());
            case 14:
                acv0 acv0Var = (acv0) obj;
                sr4 sr4Var = acv0Var.f14468b;
                if (sr4Var != null && (setEntrySet = sr4Var.m79017g().entrySet()) != null) {
                    uy51 uy51Var = (uy51) this.f25759b;
                    for (Map.Entry entry : setEntrySet) {
                        Long l = (Long) ((a410) entry.getValue()).f12113c;
                        Long l2 = ((a410) entry.getValue()).f12114d;
                        if (l != null && l2 != null) {
                            uy51Var.f235163d.m91266a(((a410) entry.getValue()).f12111a, l.longValue(), l2.longValue(), uy51Var.f235168i.f204979a);
                        }
                    }
                }
                return acv0Var.f14467a;
            case 17:
                return oy71.m68409d((oy71) this.f25759b, (EsTokenExchange$TokenExchangeResponse) obj);
            case 21:
                b141 b141Var = (b141) this.f25759b;
                List list = ((UnauthenticatedExperiencesResponse) obj).unauthenticatedExperiences;
                ArrayList<Section> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((UnauthenticatedExperienceItem) it.next()).f4078a, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Section section : arrayList) {
                    String str = section.f4063a;
                    List listSingletonList = Collections.singletonList(new axx(str == null ? "" : str, null, str, "", null, null, null, null, null, null, 2, false, false, false, false, 0, 0, null, null, null, false, null, null, null, 0, null, str, null, null, null, null, null, null, -67109902, 3));
                    List list2 = section.f4064b;
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(bjf1.m29412t((SectionItem) it2.next(), (gd40) b141Var.f22212b, (czd0) b141Var.f22213c, section.f4063a));
                    }
                    j6f.m52564V(g6f.m43700N0(arrayList3, listSingletonList), arrayList2);
                }
                return new fxx(arrayList2, null, null, null);
            default:
                Set set = (Set) ((gv31) obj).f84602a;
                if (set == null) {
                    set = gbu.f78413a;
                }
                return Boolean.valueOf(set.contains(((hp20) this.f25759b).f93686a));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m28661d(long j, long j2) {
        ((r27) this.f25759b).m74505b(j, j2);
    }

    @Override // p204p.kpb1
    /* JADX INFO: renamed from: e */
    public void mo28662e(String str, String str2) {
        cpb1 cpb1Var = (cpb1) this.f25759b;
        cpb1Var.f40526a.invoke(new uob1(cpb1.m33561b(cpb1Var, str), str, str2));
    }

    @Override // p204p.yb70
    /* JADX INFO: renamed from: f */
    public wb70 mo28663f(vfe vfeVar, aov0 aov0Var) {
        if (!vfeVar.equals(en60.f61084b)) {
            return null;
        }
        ((nlv0) this.f25759b).f155174a = true;
        return null;
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        return e1q0.m37562b((e1q0) this.f25759b, intent);
    }

    @Override // p204p.tio
    public ck90 getState() {
        return (xoi0) this.f25759b;
    }

    @Override // p204p.kpb1
    /* JADX INFO: renamed from: h */
    public void mo28664h(String str, String str2, psj psjVar) {
        cpb1 cpb1Var = (cpb1) this.f25759b;
        cpb1Var.f40526a.invoke(new rob1(cpb1.m33561b(cpb1Var, str), str, str2, psjVar));
    }

    /* JADX INFO: renamed from: i */
    public long m28665i(long j) {
        r27 r27Var = (r27) this.f25759b;
        r27Var.getClass();
        if (m5b1.m60854d(j) <= 0.0f || m5b1.m60855e(j) <= 0.0f) {
            mt40.m62791c("maximumVelocity should be a positive value. You specified=" + ((Object) m5b1.m60859i(j)));
        }
        return pp91.m70524e(((o5b1) r27Var.f195073b).m66282b(m5b1.m60854d(j)), ((o5b1) r27Var.f195074c).m66282b(m5b1.m60855e(j)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public Object m28666j(y3v y3vVar, ibk ibkVar) {
        ns51 ns51Var;
        l921 j921Var;
        if (ibkVar instanceof ns51) {
            ns51Var = (ns51) ibkVar;
            int i = ns51Var.f157691c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ns51Var.f157691c = i - Integer.MIN_VALUE;
            } else {
                ns51Var = new ns51(this, ibkVar);
            }
        } else {
            ns51Var = new ns51(this, ibkVar);
        }
        Object objM75009d = ns51Var.f157689a;
        int i2 = ns51Var.f157691c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM75009d);
                r921 r921Var = (r921) this.f25759b;
                int i3 = y3vVar.f268988a;
                String str = y3vVar.f268989b;
                int iM38547C = edb.m38547C(i3);
                if (iM38547C == 0) {
                    throw new IllegalStateException("Cannot submit feedback when no option selected");
                }
                if (iM38547C == 1) {
                    j921Var = k921.f120506a;
                } else if (iM38547C == 2) {
                    j921Var = i921.f99891a;
                } else if (iM38547C == 3) {
                    j921Var = g921.f77651a;
                } else if (iM38547C == 4) {
                    j921Var = h921.f88862a;
                } else {
                    if (iM38547C != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j921Var = new j921(str);
                }
                ns51Var.f157691c = 1;
                objM75009d = r921Var.m75009d(j921Var, ns51Var);
                yuk yukVar = yuk.f276404a;
                if (objM75009d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM75009d);
            }
            return new d4v((String) objM75009d);
        } catch (Exception unused) {
            qlg1.m73220y(ns51Var.getContext());
            return f4v.f65844a;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m28667k(String str, String str2, int i, String str3, Throwable th) {
        Logger.m3967c(th, str3, new Object[0]);
        ((y0i0) this.f25759b).m92591i(new ur01(i, str2, str, str3, sxg1.m79617E(th)));
    }

    /* JADX INFO: renamed from: l */
    public void m28668l() {
        r27 r27Var = (r27) this.f25759b;
        o5b1 o5b1Var = (o5b1) r27Var.f195073b;
        bk5.m29581D0(o5b1Var.f161933d, null);
        o5b1Var.f161934e = 0;
        o5b1 o5b1Var2 = (o5b1) r27Var.f195074c;
        bk5.m29581D0(o5b1Var2.f161933d, null);
        o5b1Var2.f161934e = 0;
        r27Var.f195072a = 0L;
    }

    /* JADX INFO: renamed from: m */
    public void m28669m(xu00 xu00Var, boolean z) {
        k5m0 k5m0Var = (k5m0) this.f25759b;
        Bundle bundle = new Bundle();
        bundle.putParcelable("upsells_page_params", xu00Var);
        k5m0.m55541i(k5m0Var, "spotify:internal:upsells-sheet", null, bundle, z, 2);
    }

    /* JADX INFO: renamed from: n */
    public kaa0 m28670n(tu21 tu21Var, boolean z) {
        z430 z430Var = (z430) ((w430) this.f25759b);
        boolean zMo48713h = z430Var.f279107a.mo48713h(z430.f279106b, false);
        kaa0 kaa0Var = kaa0.f120853f;
        if (z) {
            return kaa0Var;
        }
        if (!zMo48713h || tu21Var != tu21.FEED) {
            return tu21Var == tu21.SHORTCUT ? kaa0.f120848a : kaa0.f120851d;
        }
        z430Var.m95312a(false);
        return kaa0Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        pi4 pi4Var = new pi4(observableEmitter, 4);
        hc41 hc41Var = (hc41) this.f25759b;
        hc41Var.f89693a.registerDefaultNetworkCallback(pi4Var);
        observableEmitter.setCancellable(new gr5(12, hc41Var, pi4Var));
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        r4c1 r4c1Var = (r4c1) obj;
        r4c1 r4c1Var2 = (r4c1) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Optional optional = (Optional) obj4;
        ((d5l0) this.f25759b).getClass();
        if (optional.isPresent()) {
            return (r4c1) optional.get();
        }
        return zBooleanValue ? r4c1Var : r4c1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bc21(gh00 gh00Var) {
        this.f25758a = 3;
        this.f25759b = (qe70) gh00Var;
    }

    public bc21(int i) {
        this.f25758a = i;
        switch (i) {
            case 26:
                this.f25759b = new r27(1);
                break;
            default:
                this.f25759b = new xoi0(qjo.f189275c);
                break;
        }
    }

    public bc21(hc80 hc80Var, ue71 ue71Var) {
        this.f25758a = 16;
        this.f25759b = bzf1.m31029u(new zux(ue71Var.f229454b, ue71Var.f229456d, new pnu0(3, 2, null), 1), n5h1.m63737m(hc80Var), hf11.m47320a(2, 5000L), new suc(0, 0));
    }

    @Override // p204p.yb70
    /* JADX INFO: renamed from: c */
    public void mo28660c() {
    }

    @Override // p204p.tio
    public void start() {
    }

    @Override // p204p.tio
    public void stop() {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return Single.fromCallable(new mc9((wk0) this.f25759b, (String) obj, (am81) obj2, 9));
    }

    @Override // p204p.v4p0
    public void apply(long j) {
        ij51 ij51Var = (ij51) this.f25759b;
        if (ij51Var.f102703N0 != null) {
            ij51Var.f102704O0 = j;
            ((wy3) ij51Var.f102715Y).getClass();
            ij51Var.m50776T(j, System.currentTimeMillis());
        }
    }
}
