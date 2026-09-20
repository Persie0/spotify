package p204p;

import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItem;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p196j$.util.Base64;
import spotify.party.orchestra.p209v1.Rsvp$GetRsvpStatusResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class blr0 implements Function, tn61, Predicate, Function3, BiFunction, i600, lir, InterfaceC2207oa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28275a;

    /* JADX INFO: renamed from: b */
    public static final blr0 f28265b = new blr0(0);

    /* JADX INFO: renamed from: c */
    public static final blr0 f28267c = new blr0(1);

    /* JADX INFO: renamed from: d */
    public static final blr0 f28268d = new blr0(2);

    /* JADX INFO: renamed from: e */
    public static final blr0 f28269e = new blr0(3);

    /* JADX INFO: renamed from: f */
    public static final blr0 f28270f = new blr0(4);

    /* JADX INFO: renamed from: g */
    public static final blr0 f28271g = new blr0(5);

    /* JADX INFO: renamed from: h */
    public static final blr0 f28272h = new blr0(6);

    /* JADX INFO: renamed from: i */
    public static final blr0 f28273i = new blr0(7);

    /* JADX INFO: renamed from: t */
    public static final blr0 f28274t = new blr0(8);

    /* JADX INFO: renamed from: X */
    public static final blr0 f28258X = new blr0(9);

    /* JADX INFO: renamed from: Y */
    public static final blr0 f28260Y = new blr0(10);

    /* JADX INFO: renamed from: Z */
    public static final blr0 f28262Z = new blr0(11);

    /* JADX INFO: renamed from: L0 */
    public static final blr0 f28246L0 = new blr0(12);

    /* JADX INFO: renamed from: M0 */
    public static final blr0 f28247M0 = new blr0(13);

    /* JADX INFO: renamed from: N0 */
    public static final blr0 f28248N0 = new blr0(14);

    /* JADX INFO: renamed from: O0 */
    public static final blr0 f28249O0 = new blr0(15);

    /* JADX INFO: renamed from: P0 */
    public static final blr0 f28250P0 = new blr0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final blr0 f28251Q0 = new blr0(17);

    /* JADX INFO: renamed from: R0 */
    public static final blr0 f28252R0 = new blr0(18);

    /* JADX INFO: renamed from: S0 */
    public static final blr0 f28253S0 = new blr0(19);

    /* JADX INFO: renamed from: T0 */
    public static final blr0 f28254T0 = new blr0(20);

    /* JADX INFO: renamed from: U0 */
    public static final blr0 f28255U0 = new blr0(21);

    /* JADX INFO: renamed from: V0 */
    public static final blr0 f28256V0 = new blr0(22);

    /* JADX INFO: renamed from: W0 */
    public static final blr0 f28257W0 = new blr0(23);

    /* JADX INFO: renamed from: X0 */
    public static final blr0 f28259X0 = new blr0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final blr0 f28261Y0 = new blr0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final blr0 f28263Z0 = new blr0(26);

    /* JADX INFO: renamed from: a1 */
    public static final blr0 f28264a1 = new blr0(27);

    /* JADX INFO: renamed from: b1 */
    public static final blr0 f28266b1 = new blr0(28);

    public /* synthetic */ blr0(int i) {
        this.f28275a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        switch (this.f28275a) {
            case 12:
                return new zv11((xul0) obj, (xul0) obj2, (xul0) obj3);
            default:
                kb01 kb01Var = (kb01) obj2;
                kb01 kb01Var2 = (kb01) obj3;
                hne1 hne1Var = (hne1) ((Map) hne1.f93319f.getValue()).get((kb01) obj);
                if (hne1Var == null) {
                    hne1Var = hne1.f93322i;
                }
                kb01 kb01Var3 = hne1Var.f93326c;
                jne1 jne1Var = (jne1) ((Map) jne1.f114093f.getValue()).get(kb01Var);
                if (jne1Var == null) {
                    jne1Var = jne1.f114096i;
                }
                kb01 kb01Var4 = jne1Var.f114100c;
                String str = kb01Var2.f121029c;
                return new gne1(kb01Var3, kb01Var4, (kb01) (wj50.m88271j(str, x09.f256833e) ? eme1.f60898c : new fme1(Integer.parseInt(str))).f57320b);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:41|25|(1:46)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        r14 = r3;
        r3 = r13;
        r13 = r10;
        r9 = r8;
        r8 = r12;
        r1 = r11;
        r11 = r0;
        r27 = r7;
        r0 = r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cc -> B:18:0x004f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m29781a(int i, long j, long j2, double d, gh00 gh00Var, ibk ibkVar) {
        y9g1 y9g1Var;
        qlv0 qlv0Var;
        y9g1 y9g1Var2;
        int i2;
        int i3;
        long j3;
        double d2;
        gh00 gh00Var2;
        yuk yukVar;
        gh00 gh00Var3;
        qlv0 qlv0Var2;
        long j4;
        double d3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object objInvoke;
        if (ibkVar instanceof y9g1) {
            y9g1Var = (y9g1) ibkVar;
            int i8 = y9g1Var.f270597h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                y9g1Var.f270597h = i8 - Integer.MIN_VALUE;
            } else {
                y9g1Var = new y9g1(this, ibkVar);
            }
        } else {
            y9g1Var = new y9g1(this, ibkVar);
        }
        Object obj = y9g1Var.f270595f;
        int i9 = y9g1Var.f270597h;
        int i10 = 1;
        yuk yukVar2 = yuk.f276404a;
        if (i9 != 0) {
            if (i9 == 1) {
                i5 = y9g1Var.f270594e;
                i4 = y9g1Var.f270593d;
                d3 = y9g1Var.f270591b;
                j4 = y9g1Var.f270590a;
                qlv0Var2 = y9g1Var.f270598i;
                gh00Var3 = y9g1Var.f270592c;
                try {
                    bga.m29073P(obj);
                    return obj;
                } catch (Exception unused) {
                    i6 = 1;
                    yukVar = yukVar2;
                }
            } else {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                i5 = y9g1Var.f270594e;
                int i11 = y9g1Var.f270593d;
                double d4 = y9g1Var.f270591b;
                j4 = y9g1Var.f270590a;
                qlv0 qlv0Var3 = y9g1Var.f270598i;
                gh00Var3 = y9g1Var.f270592c;
                bga.m29073P(obj);
                i7 = i11;
                d2 = d4;
                qlv0Var = qlv0Var3;
                i6 = 1;
                y9g1 y9g1Var3 = y9g1Var;
                int i12 = i5;
                gh00Var2 = gh00Var3;
                i10 = i6;
                int i13 = i7;
                i3 = i12 + i6;
                j3 = j4;
                i2 = i13;
                y9g1Var2 = y9g1Var3;
            }
            long j5 = (long) (qlv0Var2.f189932a * d3);
            if (j5 > j4) {
                j5 = j4;
            }
            qlv0Var2.f189932a = j5;
            y9g1Var.f270592c = gh00Var3;
            y9g1Var.f270598i = qlv0Var2;
            y9g1Var.f270590a = j4;
            y9g1Var.f270591b = d3;
            y9g1Var.f270593d = i4;
            y9g1Var.f270594e = i5;
            y9g1Var.f270597h = 2;
            yukVar2 = yukVar;
            if (njg1.m64619l(j5, y9g1Var) == yukVar2) {
                return yukVar2;
            }
            qlv0 qlv0Var4 = qlv0Var2;
            i7 = i4;
            d2 = d3;
            qlv0Var = qlv0Var4;
            y9g1 y9g1Var4 = y9g1Var;
            int i14 = i5;
            gh00Var2 = gh00Var3;
            i10 = i6;
            int i15 = i7;
            i3 = i14 + i6;
            j3 = j4;
            i2 = i15;
            y9g1Var2 = y9g1Var4;
        } else {
            bga.m29073P(obj);
            qlv0 qlv0Var5 = new qlv0();
            qlv0Var5.f189932a = j;
            qlv0Var = qlv0Var5;
            y9g1Var2 = y9g1Var;
            i2 = i - 1;
            i3 = 0;
            j3 = j2;
            d2 = d;
            gh00Var2 = gh00Var;
        }
        if (i3 < i2) {
            y9g1Var2.f270592c = gh00Var2;
            y9g1Var2.f270598i = qlv0Var;
            y9g1Var2.f270590a = j3;
            y9g1Var2.f270591b = d2;
            y9g1Var2.f270593d = i2;
            y9g1Var2.f270594e = i3;
            y9g1Var2.f270597h = i10;
            objInvoke = gh00Var2.invoke(y9g1Var2);
            if (objInvoke == yukVar2) {
                return yukVar2;
            }
        } else {
            y9g1Var2.f270592c = null;
            y9g1Var2.f270598i = null;
            y9g1Var2.f270597h = 3;
            objInvoke = gh00Var2.invoke(y9g1Var2);
            if (objInvoke == yukVar2) {
                return yukVar2;
            }
        }
        return objInvoke;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.ALBUM;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f28275a) {
            case 0:
                return w2a1.f247311a;
            case 1:
                return new j9a0((gmr0) obj);
            case 2:
                return p1j0.f173119a;
            case 3:
                return new bcv0((Throwable) obj);
            case 4:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
            case 19:
            case 22:
            default:
                return new g7k0((oed1) obj);
            case 5:
                return Boolean.valueOf(e72.m37996b0((ContextTrack) obj));
            case 6:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49278b();
                wj50.m88279p(contextTrack);
                String strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_CONTEXT_URI);
                if (strM38000d0 == null || strM38000d0.length() == 0) {
                    strM38000d0 = null;
                }
                if (strM38000d0 == null) {
                    strM38000d0 = playerState.contextUri();
                }
                return new yk91(contextTrack, strM38000d0, contextTrack.uid());
            case 7:
                return stx0.f213961a[((Rsvp$GetRsvpStatusResponse) obj).m97642n().ordinal()] == 1 ? Single.just(Boolean.TRUE) : Single.create(alr0.f16973i);
            case 8:
                List itemsList = ((CollectionPlatformEsperantoItemsResponse) obj).getItemsList();
                ArrayList arrayList = new ArrayList(i6f.m49804T(itemsList, 10));
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CollectionPlatformItem) it.next()).getUri());
                }
                return arrayList;
            case 9:
                long j = ((Boolean) obj).booleanValue() ? 3000L : 0L;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int i = Flowable.f7192a;
                return Flowable.m23317a0(j, timeUnit, Schedulers.f10369b);
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 15:
                return new vua0((d0u) obj);
            case 16:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Assisted Curation Social Recommendations: failed to load recs: %s", th.getMessage());
                return nau.f152117a;
            case 18:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 20:
                return new v2y((x18) obj);
            case 21:
                lcf lcfVar = (lcf) obj;
                return lcfVar instanceof hcf ? new sot0(((hcf) lcfVar).f89783a) : tot0.f222319a;
            case 23:
                return (Float) n0e1.m63442s((Float) obj, new ete(0.0f, 1.0f));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(3:(1:(2:12|13)(2:14|15))(4:16|40|17|18)|28|(3:30|(1:32)|33)(1:37))(1:21)|38|22|(1:36)(1:25)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r15 = r13;
        r13 = r1;
        r1 = r15;
        r15 = r11;
        r11 = r9;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (p204p.njg1.m64619l(r7, r1) != r6) goto L13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a5 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m29782c(gh00 gh00Var, long j, long j2, double d, gh00 gh00Var2, ibk ibkVar) throws Exception {
        eag1 eag1Var;
        long j3;
        long j4;
        double d2;
        gh00 gh00Var3;
        eag1 eag1Var2;
        gh00 gh00Var4;
        gh00 gh00Var5;
        long j5;
        double d3;
        Exception e;
        if (ibkVar instanceof eag1) {
            eag1Var = (eag1) ibkVar;
            int i = eag1Var.f57676h;
            if ((i & Integer.MIN_VALUE) != 0) {
                eag1Var.f57676h = i - Integer.MIN_VALUE;
            } else {
                eag1Var = new eag1(this, ibkVar);
            }
        } else {
            eag1Var = new eag1(this, ibkVar);
        }
        Object obj = eag1Var.f57674f;
        int i2 = eag1Var.f57676h;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                j3 = eag1Var.f57672d;
                d3 = eag1Var.f57673e;
                j5 = eag1Var.f57671c;
                gh00Var3 = eag1Var.f57670b;
                gh00Var5 = eag1Var.f57669a;
                try {
                    bga.m29073P(obj);
                    return obj;
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = eag1Var.f57672d;
                d3 = eag1Var.f57673e;
                j5 = eag1Var.f57671c;
                gh00Var3 = eag1Var.f57670b;
                gh00Var5 = eag1Var.f57669a;
                bga.m29073P(obj);
                gh00 gh00Var6 = gh00Var5;
                eag1Var2 = eag1Var;
                gh00Var4 = gh00Var6;
                long j6 = j5;
                d2 = d3;
                j4 = j6;
            }
            if (!((Boolean) gh00Var5.invoke(e)).booleanValue()) {
                throw e;
            }
            j3 = (long) (j3 * d3);
            if (j3 > j5) {
                j3 = j5;
            }
            eag1Var.f57669a = gh00Var5;
            eag1Var.f57670b = gh00Var3;
            eag1Var.f57671c = j5;
            eag1Var.f57673e = d3;
            eag1Var.f57672d = j3;
            eag1Var.f57676h = 2;
        } else {
            bga.m29073P(obj);
            j3 = j;
            j4 = j2;
            d2 = d;
            gh00Var3 = gh00Var2;
            eag1Var2 = eag1Var;
            gh00Var4 = gh00Var;
        }
        eag1Var2.f57669a = gh00Var4;
        eag1Var2.f57670b = gh00Var3;
        eag1Var2.f57671c = j4;
        eag1Var2.f57673e = d2;
        eag1Var2.f57672d = j3;
        eag1Var2.f57676h = 1;
        Object objInvoke = gh00Var3.invoke(eag1Var2);
        return objInvoke == yukVar ? yukVar : objInvoke;
    }

    @Override // p204p.i600
    /* JADX INFO: renamed from: f */
    public void mo24367f(i500 i500Var) {
        jkc0.m53609u((if81) i500Var);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f28275a) {
            case 11:
                return ((gv31) obj).f84603b == 1;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    @Override // p204p.lir
    public boolean test(Object obj, Object obj2) {
        return !((n3c1) obj).f150003a.equals(((n3c1) obj2).f150003a);
    }

    @Override // com.spotify.mobius.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return k621.m55575c((k621) obj, null, null, (w9n0) obj2, null, null, null, false, null, null, 0, null, 16379);
    }
}
