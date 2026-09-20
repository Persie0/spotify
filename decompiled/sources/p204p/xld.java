package p204p;

import com.spotify.player.model.PlayerError;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class xld implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f263104b;

    public /* synthetic */ xld(Object obj, int i) {
        this.f263103a = i;
        this.f263104b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public Object m91420b(PlayerError playerError, fbk fbkVar) {
        zuv0 zuv0Var;
        fvv0 fvv0Var = (fvv0) this.f263104b;
        if (fbkVar instanceof zuv0) {
            zuv0Var = (zuv0) fbkVar;
            int i = zuv0Var.f286549d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zuv0Var.f286549d = i - Integer.MIN_VALUE;
            } else {
                zuv0Var = new zuv0(this, fbkVar);
            }
        } else {
            zuv0Var = new zuv0(this, fbkVar);
        }
        Object objM86755t = zuv0Var.f286547b;
        int i2 = zuv0Var.f286549d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            yab yabVarM60029b = fvv0Var.f73879b.m60029b();
            zuv0Var.f286546a = playerError;
            zuv0Var.f286549d = 1;
            objM86755t = vyf1.m86755t(yabVarM60029b, zuv0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return w2a1Var;
        }
        playerError = zuv0Var.f286546a;
        bga.m29073P(objM86755t);
        if (((Boolean) objM86755t).booleanValue()) {
            clq0 clq0Var = fvv0Var.f73877X;
            if (clq0Var == null) {
                wj50.m88260d0("handler");
                throw null;
            }
            wj50.m88279p(playerError);
            zuv0Var.f286546a = null;
            zuv0Var.f286549d = 2;
            if (clq0Var.m33304B(playerError, zuv0Var) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        Object objMo24818M;
        switch (this.f263103a) {
            case 0:
                vkb vkbVar = (vkb) obj;
                if (vkbVar == null) {
                    throw new NoWhenBranchMatchedException();
                }
                ((gh00) this.f263104b).invoke(new s9d(vkbVar.m85818a()));
                return w2a1.f247311a;
            case 1:
                ykk0 ykk0Var = (ykk0) obj;
                LinkedHashMap linkedHashMap = ((mve) this.f263104b).f147565b;
                xkk0 xkk0Var = (xkk0) linkedHashMap.get("fingerprint emitter");
                m5p m5pVar = xkk0Var != null ? xkk0Var.f262389c : null;
                xkk0 xkk0Var2 = (xkk0) linkedHashMap.get("fingerprint emitter");
                boolean zM92160c = xue.m92160c(xkk0Var2 != null ? qyg1.m74178H(xkk0Var2.f262390d) : null);
                xkk0 xkk0Var3 = (xkk0) linkedHashMap.get("fingerprint emitter");
                return (xkk0Var3 == null || (objMo24818M = xkk0Var3.f262388b.mo24818M(qyg1.m74178H(zM92160c), m5pVar, ykk0Var.f273746a, fbkVar)) != yuk.f276404a) ? w2a1.f247311a : objMo24818M;
            case 2:
                ((nxi) this.f263104b).f159488g.add(((fh0) obj).f69506a);
                return w2a1.f247311a;
            case 3:
                List list = (List) obj;
                ((avo) this.f263104b).f20229f.m97090l(list);
                list.size();
                list.toString();
                return w2a1.f247311a;
            case 4:
                long jCurrentTimeMillis = System.currentTimeMillis();
                m0p m0pVar = (m0p) this.f263104b;
                if (jCurrentTimeMillis - m0pVar.f138718h >= 5000) {
                    m0pVar.f138718h = jCurrentTimeMillis;
                    m0p.m60471a(m0pVar, (List) ((xv41) m0pVar.f138711a.f256633a.f38533h.getValue()).getValue(), 2);
                }
                return w2a1.f247311a;
            case 5:
                wab wabVar = (wab) obj;
                Objects.toString(wabVar);
                ((u2q) this.f263104b).f226138j.mo46962a(wabVar);
                return w2a1.f247311a;
            case 6:
                ((ufx) this.f263104b).f229915g.mo40803g(h630.f87966L0);
                return w2a1.f247311a;
            case 7:
                ((pir0) this.f263104b).setValue(obj);
                return w2a1.f247311a;
            case 8:
                Object objMo30229d = ((sir0) this.f263104b).mo30229d(obj, fbkVar);
                return objMo30229d == yuk.f276404a ? objMo30229d : w2a1.f247311a;
            case 9:
                rlv0 rlv0Var = (rlv0) this.f263104b;
                if (rlv0Var.f200373a != qkf1.f189548a) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                rlv0Var.f200373a = obj;
                return w2a1.f247311a;
            case 10:
                ipz ipzVar = (ipz) obj;
                cpz cpzVar = (cpz) this.f263104b;
                gb31 gb31Var = cpzVar.f40685R0;
                boolean z = !gb31Var.isEmpty();
                if (ipzVar instanceof gpz) {
                    gb31Var.add(ipzVar);
                } else if (ipzVar instanceof hpz) {
                    gb31Var.remove(((hpz) ipzVar).m48189a());
                }
                if ((!gb31Var.isEmpty()) != z) {
                    hvg1.m48859l(cpzVar);
                }
                return w2a1.f247311a;
            case 11:
                ru10 ru10Var = (ru10) obj;
                et10 et10Var = (et10) this.f263104b;
                if (et10Var.f62578h != ru10Var) {
                    et10Var.f62578h = ru10Var;
                    wj50.m88279p(ru10Var);
                    et10.m39925a(et10Var, ru10Var);
                }
                return w2a1.f247311a;
            case 12:
                sh50 sh50Var = (sh50) obj;
                ph50 ph50Var = (ph50) this.f263104b;
                if (ddg1.m35740k(sh50Var)) {
                    k7i0 k7i0VarM78127b = sh50Var.m78127b();
                    if (k7i0VarM78127b != null && k7i0VarM78127b.m55662a() && wcg1.m87741f(sh50Var.m78127b()) && !ph50Var.f177486n) {
                        ph50Var.m69959l(sh50Var.m78127b(), true, ph50Var.f177489q, ph50Var.f177488p, null, ph50Var.f177487o, true);
                        ph50Var.f177486n = true;
                    }
                } else {
                    ph50Var.f177486n = false;
                }
                return w2a1.f247311a;
            case 13:
                ((jqa0) this.f263104b).f114861c = (String) obj;
                return w2a1.f247311a;
            case 14:
                rra0 rra0Var = (rra0) this.f263104b;
                rra0Var.f201993h = (m7b) obj;
                rra0Var.m70120c();
                return w2a1.f247311a;
            case 15:
                ((xxi0) this.f263104b).m92337a(new mem0(kaz.m55913d(((Boolean) obj).booleanValue())));
                return w2a1.f247311a;
            case 16:
                tam0 tam0Var = (tam0) obj;
                tam0Var.getClass();
                boolean z2 = tam0Var == tam0.f218634b;
                pmm0 pmm0Var = (pmm0) this.f263104b;
                pmm0Var.f179110a.m78106b().mo46732b(new wbm0(z2));
                if (z2) {
                    bmm0 bmm0Var = pmm0Var.f179119t.f50562Y;
                    x0h1.m89578u(n5h1.m63737m(bmm0Var.f28583h.f50567d), null, 0, new l2i0(bmm0Var, null, 29), 3);
                }
                return w2a1.f247311a;
            case 17:
                udd1 udd1Var = (udd1) obj;
                kqi0 kqi0Var = (kqi0) this.f263104b;
                if (!(udd1Var instanceof sdd1) && !wj50.m88271j(udd1Var, tdd1.f219290a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kqi0Var.setValue(false);
                return w2a1.f247311a;
            case 18:
                ((tyt0) this.f263104b).f225034f = qyg1.m74178H(((Boolean) obj).booleanValue());
                return w2a1.f247311a;
            case 19:
                return m91420b((PlayerError) obj, fbkVar);
            case 20:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                sx11 sx11Var = (sx11) this.f263104b;
                sx11.m79565u(sx11Var);
                if (zBooleanValue) {
                    ((c7a1) sx11Var.f214767j1.m37314a()).m31704G();
                }
                return w2a1.f247311a;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ox11) this.f263104b).m39516c(px11.f182181c[0], null, bool);
                return w2a1.f247311a;
            default:
                Map map = (Map) obj;
                if (!map.isEmpty()) {
                    ((C2401t5) this.f263104b).invoke(map);
                }
                return w2a1.f247311a;
        }
    }
}
