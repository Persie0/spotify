package p204p;

import com.google.protobuf.Empty;
import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$EofResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes7.dex */
public final class oet implements Function, jv1, vja1, yh00, BiFunction, a4a, a250, ckv, Function6, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164557a;

    /* JADX INFO: renamed from: b */
    public static final oet f164546b = new oet(0);

    /* JADX INFO: renamed from: c */
    public static final oet f164548c = new oet(1);

    /* JADX INFO: renamed from: d */
    public static final oet f164550d = new oet(2);

    /* JADX INFO: renamed from: e */
    public static final oet f164551e = new oet(3);

    /* JADX INFO: renamed from: f */
    public static final oet f164552f = new oet(4);

    /* JADX INFO: renamed from: g */
    public static final oet f164553g = new oet(5);

    /* JADX INFO: renamed from: h */
    public static final oet f164554h = new oet(6);

    /* JADX INFO: renamed from: i */
    public static final oet f164555i = new oet(7);

    /* JADX INFO: renamed from: t */
    public static final oet f164556t = new oet(8);

    /* JADX INFO: renamed from: X */
    public static final oet f164539X = new oet(9);

    /* JADX INFO: renamed from: Y */
    public static final oet f164541Y = new oet(10);

    /* JADX INFO: renamed from: Z */
    public static final oet f164543Z = new oet(11);

    /* JADX INFO: renamed from: L0 */
    public static final oet f164527L0 = new oet(12);

    /* JADX INFO: renamed from: M0 */
    public static final oet f164528M0 = new oet(13);

    /* JADX INFO: renamed from: N0 */
    public static final oet f164529N0 = new oet(14);

    /* JADX INFO: renamed from: O0 */
    public static final oet f164530O0 = new oet(15);

    /* JADX INFO: renamed from: P0 */
    public static final oet f164531P0 = new oet(16);

    /* JADX INFO: renamed from: Q0 */
    public static final oet f164532Q0 = new oet(17);

    /* JADX INFO: renamed from: R0 */
    public static final oet f164533R0 = new oet(18);

    /* JADX INFO: renamed from: S0 */
    public static final oet f164534S0 = new oet(19);

    /* JADX INFO: renamed from: T0 */
    public static final oet f164535T0 = new oet(20);

    /* JADX INFO: renamed from: U0 */
    public static final oet f164536U0 = new oet(21);

    /* JADX INFO: renamed from: V0 */
    public static final oet f164537V0 = new oet(22);

    /* JADX INFO: renamed from: W0 */
    public static final oet f164538W0 = new oet(23);

    /* JADX INFO: renamed from: X0 */
    public static final oet f164540X0 = new oet(24);

    /* JADX INFO: renamed from: Y0 */
    public static final oet f164542Y0 = new oet(25);

    /* JADX INFO: renamed from: Z0 */
    public static final oet f164544Z0 = new oet(26);

    /* JADX INFO: renamed from: a1 */
    public static final oet f164545a1 = new oet(27);

    /* JADX INFO: renamed from: b1 */
    public static final oet f164547b1 = new oet(28);

    /* JADX INFO: renamed from: c1 */
    public static final oet f164549c1 = new oet(29);

    public /* synthetic */ oet(int i) {
        this.f164557a = i;
    }

    @Override // p204p.jv1
    /* JADX INFO: renamed from: a */
    public Collection mo54356a(nfe nfeVar) {
        return lau.f131415a;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Object next;
        switch (this.f164557a) {
            case 11:
                return new jj9((ty80) obj2, ((Boolean) obj).booleanValue());
            case 19:
                return new pqm0((usk) obj, (Boolean) obj2);
            default:
                xul0 xul0Var = (xul0) obj;
                List list = (List) obj2;
                if (xul0Var.mo49279c()) {
                    return xul0Var;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (((api) next).mo26697m()) {
                        return xul0.m92200a(next);
                    }
                }
                next = null;
                return xul0.m92200a(next);
        }
    }

    @Override // p204p.jv1
    /* JADX INFO: renamed from: b */
    public Collection mo54357b(qti0 qti0Var, nfe nfeVar) {
        return lau.f131415a;
    }

    @Override // io.reactivex.rxjava3.functions.Function6
    /* JADX INFO: renamed from: c */
    public Object mo23411c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        PlayerState playerState = (PlayerState) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        Map map = (Map) obj5;
        x72 x72Var = (x72) obj6;
        boolean zM37224M = dxf1.m37224M(map);
        String str = (String) map.get("should-assure-age-content-playback");
        return new z1y(playerState, zBooleanValue, zBooleanValue2, zBooleanValue3, new c92(zM37224M, str != null ? Integer.parseInt(str) : 0), x72Var.f258790a, x72Var.f258791b);
    }

    @Override // p204p.jv1
    /* JADX INFO: renamed from: d */
    public Collection mo54358d(nfe nfeVar) {
        return lau.f131415a;
    }

    @Override // p204p.jv1
    /* JADX INFO: renamed from: e */
    public Collection mo54359e(nfe nfeVar) {
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: f */
    public void m66802f(feu feuVar) {
        pr7 pr7Var = pr7.f180515a;
        uk60 uk60Var = (uk60) feuVar;
        uk60Var.mo40967a(n59.class, pr7Var);
        uk60Var.mo40967a(hy7.class, pr7Var);
        wr7 wr7Var = wr7.f254277a;
        uk60Var.mo40967a(gqa0.class, wr7Var);
        uk60Var.mo40967a(k18.class, wr7Var);
        qr7 qr7Var = qr7.f191750a;
        uk60Var.mo40967a(gke.class, qr7Var);
        uk60Var.mo40967a(oy7.class, qr7Var);
        or7 or7Var = or7.f168475a;
        uk60Var.mo40967a(sy3.class, or7Var);
        uk60Var.mo40967a(dy7.class, or7Var);
        vr7 vr7Var = vr7.f244083a;
        uk60Var.mo40967a(tpa0.class, vr7Var);
        uk60Var.mo40967a(j18.class, vr7Var);
        rr7 rr7Var = rr7.f201970a;
        uk60Var.mo40967a(zuf.class, rr7Var);
        uk60Var.mo40967a(ry7.class, rr7Var);
        ur7 ur7Var = ur7.f233248a;
        uk60Var.mo40967a(z0y.class, ur7Var);
        uk60Var.mo40967a(x08.class, ur7Var);
        tr7 tr7Var = tr7.f222992a;
        uk60Var.mo40967a(y0y.class, tr7Var);
        uk60Var.mo40967a(w08.class, tr7Var);
        xr7 xr7Var = xr7.f265276a;
        uk60Var.mo40967a(wgj0.class, xr7Var);
        uk60Var.mo40967a(n18.class, xr7Var);
        sr7 sr7Var = sr7.f213248a;
        uk60Var.mo40967a(llx.class, sr7Var);
        uk60Var.mo40967a(v08.class, sr7Var);
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        return new pr2(mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return !((Boolean) obj).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f164557a) {
            case 1:
                InterfaceC2415th accessory = ((AccessoryStateManager$Event) obj).getAccessory();
                wj50.m88279p(accessory);
                return accessory;
            case 2:
                return Boolean.valueOf(((x02) obj).f256763Z instanceof kdl);
            case 3:
            case 4:
            case 9:
            case 11:
            case 12:
            case 19:
            case 20:
            case 24:
            default:
                return ((v5t) obj).f237634n;
            case 5:
                return ((qq3) obj).f191440a;
            case 6:
                return Boolean.valueOf(((fp4) obj).f71727a);
            case 7:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof tq50) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return AudioSinkChainWrapperEsperanto$EofResponse.m3385o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto.EofResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 10:
                return new p48(((Boolean) obj).booleanValue());
            case 13:
                return Boolean.valueOf(dxf1.m37244s("offline", (Map) obj));
            case 14:
                return p1j0.f173119a;
            case 15:
                return Boolean.valueOf(((pe01) obj).f176598o);
            case 16:
                return new s5k0((String) ((pqm0) obj).f180351b);
            case 17:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 18:
                return Single.just(C2244p5.f174033a);
            case 21:
                d7i d7iVar = (d7i) obj;
                return new ji41(d7iVar.f46219t == null, d7iVar.f46206g);
            case 22:
                xul0 xul0Var = (xul0) obj;
                return Boolean.valueOf(!xul0Var.mo49279c() || ((api) xul0Var.mo49278b()).mo26697m());
            case 23:
                return (lnr0) obj;
            case 25:
                return new m0s((PlayerState) obj);
        }
    }
}
