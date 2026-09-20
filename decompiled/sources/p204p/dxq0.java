package p204p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange$TokenExchangeResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class dxq0 implements Function, w1j0, Predicate, Function3, BiFunction, com.spotify.mobius.functions.BiFunction, Init, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54073a;

    /* JADX INFO: renamed from: b */
    public static final dxq0 f54064b = new dxq0(0);

    /* JADX INFO: renamed from: c */
    public static final dxq0 f54065c = new dxq0(1);

    /* JADX INFO: renamed from: d */
    public static final dxq0 f54066d = new dxq0(2);

    /* JADX INFO: renamed from: e */
    public static final dxq0 f54067e = new dxq0(3);

    /* JADX INFO: renamed from: f */
    public static final dxq0 f54068f = new dxq0(4);

    /* JADX INFO: renamed from: g */
    public static final dxq0 f54069g = new dxq0(5);

    /* JADX INFO: renamed from: h */
    public static final dxq0 f54070h = new dxq0(6);

    /* JADX INFO: renamed from: i */
    public static final dxq0 f54071i = new dxq0(7);

    /* JADX INFO: renamed from: t */
    public static final dxq0 f54072t = new dxq0(8);

    /* JADX INFO: renamed from: X */
    public static final dxq0 f54057X = new dxq0(9);

    /* JADX INFO: renamed from: Y */
    public static final dxq0 f54059Y = new dxq0(11);

    /* JADX INFO: renamed from: Z */
    public static final dxq0 f54061Z = new dxq0(12);

    /* JADX INFO: renamed from: L0 */
    public static final dxq0 f54045L0 = new dxq0(13);

    /* JADX INFO: renamed from: M0 */
    public static final dxq0 f54046M0 = new dxq0(14);

    /* JADX INFO: renamed from: N0 */
    public static final dxq0 f54047N0 = new dxq0(15);

    /* JADX INFO: renamed from: O0 */
    public static final dxq0 f54048O0 = new dxq0(16);

    /* JADX INFO: renamed from: P0 */
    public static final dxq0 f54049P0 = new dxq0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final dxq0 f54050Q0 = new dxq0(18);

    /* JADX INFO: renamed from: R0 */
    public static final dxq0 f54051R0 = new dxq0(19);

    /* JADX INFO: renamed from: S0 */
    public static final dxq0 f54052S0 = new dxq0(20);

    /* JADX INFO: renamed from: T0 */
    public static final dxq0 f54053T0 = new dxq0(21);

    /* JADX INFO: renamed from: U0 */
    public static final dxq0 f54054U0 = new dxq0(22);

    /* JADX INFO: renamed from: V0 */
    public static final dxq0 f54055V0 = new dxq0(23);

    /* JADX INFO: renamed from: W0 */
    public static final dxq0 f54056W0 = new dxq0(24);

    /* JADX INFO: renamed from: X0 */
    public static final dxq0 f54058X0 = new dxq0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final dxq0 f54060Y0 = new dxq0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final dxq0 f54062Z0 = new dxq0(27);

    /* JADX INFO: renamed from: a1 */
    public static final dxq0 f54063a1 = new dxq0(28);

    public /* synthetic */ dxq0(int i) {
        this.f54073a = i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37270b(Intent intent) {
        return intent.getBooleanExtra("needs_foreground_start", false);
    }

    /* JADX INFO: renamed from: c */
    public static void m37271c(Intent intent) {
        intent.putExtra("needs_foreground_start", true);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        switch (this.f54073a) {
            case 3:
                return new pqm0((Map) obj, (Boolean) obj3);
            default:
                return new yk91((String) obj, (Restrictions) obj2, (am81) obj3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m37272a(qgy0 qgy0Var, ibk ibkVar) {
        lc91 lc91Var;
        if (ibkVar instanceof lc91) {
            lc91Var = (lc91) ibkVar;
            int i = lc91Var.f131881c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc91Var.f131881c = i - Integer.MIN_VALUE;
            } else {
                lc91Var = new lc91(this, ibkVar);
            }
        } else {
            lc91Var = new lc91(this, ibkVar);
        }
        Object objM86755t = lc91Var.f131879a;
        int i2 = lc91Var.f131881c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            in21 in21Var = new in21(upf.m83671O(qgy0Var), 6);
            lc91Var.f131881c = 1;
            objM86755t = vyf1.m86755t(in21Var, lc91Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return ((byz0) ((chy0) objM86755t).f38149a).mo30915H();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Boolean boolM88490n1;
        switch (this.f54073a) {
            case 0:
                gsq0 gsq0Var = (gsq0) obj;
                return gsq0Var instanceof fsq0 ? Maybe.m23363f(((fsq0) gsq0Var).f72921a) : MaybeEmpty.f8264a;
            case 4:
                qrw0 qrw0Var = (qrw0) obj;
                if (qrw0Var instanceof prw0) {
                    return new gpu0(((prw0) qrw0Var).f180691a);
                }
                if (qrw0Var.equals(orw0.f168669a)) {
                    return fpu0.f72004a;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                ContextTrack contextTrack = (ContextTrack) obj;
                wj50.m88279p(contextTrack);
                String str = (String) contextTrack.metadata().get("screen_recording_enabled");
                return Boolean.valueOf((str == null || (boolM88490n1 = wl51.m88490n1(str)) == null) ? true : boolM88490n1.booleanValue());
            case 6:
                return Boolean.TRUE;
            case 7:
                return new mwe1(((Boolean) obj).booleanValue());
            case 8:
                return Boolean.FALSE;
            case 11:
                return new t901((z901) obj);
            case 15:
                return new m331((List) obj);
            case 16:
                return new uh31(edo.m38606e((Throwable) obj));
            case 19:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsTokenExchange$TokenExchangeResponse.m3651q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange.TokenExchangeResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 23:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (List) obj) {
                    s4c1 s4c1VarM65337r = npg1.m65337r((j9c1) obj2);
                    Object arrayList = linkedHashMap.get(s4c1VarM65337r);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(s4c1VarM65337r, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), (j9c1) g6f.m43692F0((List) entry.getValue()));
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    arrayList2.add(new v4c1((s4c1) entry2.getKey(), (j9c1) entry2.getValue()));
                }
                return g6f.m43700N0(g6f.m43711Y0(arrayList2, new fd11(18)), Collections.singletonList(u4c1.f226646a));
            case 24:
                return new l5d1(new c6x0(new RuntimeException("Failure received during IDT exchange.")));
            case 26:
                dve1 dve1Var = (dve1) obj;
                if (dve1Var instanceof bve1) {
                    return new ewe1(((bve1) dve1Var).f31349a);
                }
                if (dve1Var instanceof cve1) {
                    return new cwe1(((cve1) dve1Var).f42416a);
                }
                if (dve1Var instanceof ave1) {
                    return new dwe1(((ave1) dve1Var).f20179a);
                }
                if (dve1Var instanceof yue1) {
                    return new yve1(((yue1) dve1Var).f276336a);
                }
                if (dve1Var instanceof zue1) {
                    return new zve1(((zue1) dve1Var).f286431a);
                }
                if (dve1Var instanceof xue1) {
                    return new xve1(((xue1) dve1Var).f266100a);
                }
                throw new NoWhenBranchMatchedException();
            default:
                xul0 xul0Var = (xul0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(15000L);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (xul0Var.mo49279c()) {
                    builder2.onlyForPlaybackId((String) xul0Var.mo49278b());
                }
                return new a8p0(builder.options(builder2.build()).relative(SeekToCommand.Relative.CURRENT).build());
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((y241) obj);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        int i = this.f54073a;
        uzq0 uzq0Var = uzq0.f235620a;
        switch (i) {
            case 1:
                Set set = dd41.f47702f;
                String strM35694A = r46.m74732a0(e301Var.f55571a, null).m35694A();
                wj50.m88279p(strM35694A);
                return new u1j0(qtr0.class, new rtr0(12, strM35694A, e301Var.f55571a, false, false), uzq0Var);
            default:
                String stringExtra = intent.getStringExtra("query");
                intent.setData(Uri.parse("spotify:search"));
                String str = e301Var.f55571a;
                Set set2 = dd41.f47702f;
                String strM35694A2 = r46.m74726U(intent.getDataString()).m35694A();
                wj50.m88279p(strM35694A2);
                return new u1j0(hyy0.class, new jyy0(str, strM35694A2, stringExtra, e301Var.f55578h, true, d5l0.m35003b(intent)), uzq0Var);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !igg1.m50541t(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new iya1(str4, str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f54073a) {
            case 2:
                return ((gv31) obj).f84603b == 1;
            case 18:
                return ((bla1) obj) instanceof zka1;
            case 20:
                gqx gqxVar = (gqx) obj;
                return gqxVar.mo45451c() || !((iqx) gqxVar).f104863f;
            default:
                return ((e301) obj).f55572b;
        }
    }

    public dxq0(yu0 yu0Var) {
        this.f54073a = 29;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        drj0 drj0VarM36733a;
        switch (this.f54073a) {
            case 12:
                ro11 ro11Var = (ro11) obj2;
                drj0 drj0Var = (drj0) ((xul0) obj).mo49283h();
                if (drj0Var != null) {
                    drj0VarM36733a = drj0.m36733a(drj0Var, ro11Var.f201041c || ro11Var.f201039a.f156645i);
                } else {
                    drj0VarM36733a = null;
                }
                return xul0.m92200a(drj0VarM36733a);
            default:
                return k621.m55575c((k621) obj, null, null, null, (ic2) obj2, null, null, false, null, null, 0, null, 16375);
        }
    }
}
