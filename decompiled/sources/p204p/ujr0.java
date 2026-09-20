package p204p;

import com.google.protobuf.Empty;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.show_esperanto.proto.MarkShowAsPlayedResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class ujr0 implements Function, Predicate, v2v0, BiFunction, com.spotify.mobius.functions.Function, Init, ojn0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231111a;

    /* JADX INFO: renamed from: b */
    public static final ujr0 f231101b = new ujr0(0);

    /* JADX INFO: renamed from: c */
    public static final ujr0 f231103c = new ujr0(1);

    /* JADX INFO: renamed from: d */
    public static final ujr0 f231104d = new ujr0(2);

    /* JADX INFO: renamed from: e */
    public static final ujr0 f231105e = new ujr0(3);

    /* JADX INFO: renamed from: f */
    public static final ujr0 f231106f = new ujr0(4);

    /* JADX INFO: renamed from: g */
    public static final ujr0 f231107g = new ujr0(5);

    /* JADX INFO: renamed from: h */
    public static final ujr0 f231108h = new ujr0(6);

    /* JADX INFO: renamed from: i */
    public static final ujr0 f231109i = new ujr0(7);

    /* JADX INFO: renamed from: t */
    public static final ujr0 f231110t = new ujr0(8);

    /* JADX INFO: renamed from: X */
    public static final ujr0 f231094X = new ujr0(9);

    /* JADX INFO: renamed from: Y */
    public static final ujr0 f231096Y = new ujr0(10);

    /* JADX INFO: renamed from: Z */
    public static final ujr0 f231098Z = new ujr0(11);

    /* JADX INFO: renamed from: L0 */
    public static final ujr0 f231082L0 = new ujr0(12);

    /* JADX INFO: renamed from: M0 */
    public static final ujr0 f231083M0 = new ujr0(13);

    /* JADX INFO: renamed from: N0 */
    public static final ujr0 f231084N0 = new ujr0(14);

    /* JADX INFO: renamed from: O0 */
    public static final ujr0 f231085O0 = new ujr0(15);

    /* JADX INFO: renamed from: P0 */
    public static final ujr0 f231086P0 = new ujr0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final ujr0 f231087Q0 = new ujr0(17);

    /* JADX INFO: renamed from: R0 */
    public static final ujr0 f231088R0 = new ujr0(18);

    /* JADX INFO: renamed from: S0 */
    public static final ujr0 f231089S0 = new ujr0(19);

    /* JADX INFO: renamed from: T0 */
    public static final ujr0 f231090T0 = new ujr0(20);

    /* JADX INFO: renamed from: U0 */
    public static final ujr0 f231091U0 = new ujr0(21);

    /* JADX INFO: renamed from: V0 */
    public static final ujr0 f231092V0 = new ujr0(22);

    /* JADX INFO: renamed from: W0 */
    public static final ujr0 f231093W0 = new ujr0(23);

    /* JADX INFO: renamed from: X0 */
    public static final ujr0 f231095X0 = new ujr0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final txd1 f231097Y0 = new txd1();

    /* JADX INFO: renamed from: Z0 */
    public static final /* synthetic */ ujr0 f231099Z0 = new ujr0(26);

    /* JADX INFO: renamed from: a1 */
    public static final ujr0 f231100a1 = new ujr0(27);

    /* JADX INFO: renamed from: b1 */
    public static final ujr0 f231102b1 = new ujr0(28);

    public /* synthetic */ ujr0(int i) {
        this.f231111a = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:45|25|(0)(1:28)) */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        r13 = r1;
        r12 = r3;
        r1 = r9;
        r3 = r11;
        r9 = 0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b2 -> B:35:0x00b6). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m83292a(gh00 gh00Var, ibk ibkVar) {
        yx1 yx1Var;
        yx1 yx1Var2;
        int i;
        int i2;
        gh00 gh00Var2;
        qlv0 qlv0Var;
        gh00 gh00Var3;
        qlv0 qlv0Var2;
        int i3;
        int i4;
        Exception e;
        int i5;
        long j;
        if (ibkVar instanceof yx1) {
            yx1Var = (yx1) ibkVar;
            int i6 = yx1Var.f277110i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                yx1Var.f277110i = i6 - Integer.MIN_VALUE;
            } else {
                yx1Var = new yx1(this, ibkVar);
            }
        } else {
            yx1Var = new yx1(this, ibkVar);
        }
        Object obj = yx1Var.f277108g;
        int i7 = yx1Var.f277110i;
        yuk yukVar = yuk.f276404a;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = yx1Var.f277107f;
                int i9 = yx1Var.f277106e;
                int i10 = yx1Var.f277105d;
                int i11 = yx1Var.f277104c;
                qlv0Var2 = yx1Var.f277103b;
                gh00Var3 = yx1Var.f277102a;
                try {
                    bga.m29073P(obj);
                    return obj;
                } catch (Exception e2) {
                    e = e2;
                    i3 = i8;
                    i4 = i10;
                    i = i11;
                    i2 = i9;
                }
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                int i12 = yx1Var.f277105d;
                int i13 = yx1Var.f277104c;
                qlv0 qlv0Var3 = yx1Var.f277103b;
                gh00 gh00Var4 = yx1Var.f277102a;
                bga.m29073P(obj);
                i5 = i12;
                qlv0Var = qlv0Var3;
                i = i13;
                yx1Var2 = yx1Var;
                gh00Var2 = gh00Var4;
                j = qlv0Var.f189932a * ((long) 2);
                if (j > 30000) {
                    j = 30000;
                }
                qlv0Var.f189932a = j;
                i2 = i5 + 1;
            }
            e.getMessage();
            long j2 = qlv0Var2.f189932a;
            yx1Var.f277102a = gh00Var3;
            yx1Var.f277103b = qlv0Var2;
            yx1Var.f277104c = i;
            yx1Var.f277105d = i4;
            yx1Var.f277106e = i2;
            yx1Var.f277107f = i3;
            yx1Var.f277110i = 2;
            if (njg1.m64619l(j2, yx1Var) != yukVar) {
                yx1Var2 = yx1Var;
                i5 = i4;
                qlv0Var = qlv0Var2;
                gh00Var2 = gh00Var3;
                j = qlv0Var.f189932a * ((long) 2);
                if (j > 30000) {
                    j = 30000;
                }
                qlv0Var.f189932a = j;
                i2 = i5 + 1;
            }
            return yukVar;
        }
        bga.m29073P(obj);
        qlv0 qlv0Var4 = new qlv0();
        qlv0Var4.f189932a = 1000L;
        yx1Var2 = yx1Var;
        i = 4;
        i2 = 0;
        gh00Var2 = gh00Var;
        qlv0Var = qlv0Var4;
        if (i2 < i) {
            yx1Var2.f277102a = gh00Var2;
            yx1Var2.f277103b = qlv0Var;
            yx1Var2.f277104c = i;
            yx1Var2.f277105d = i2;
            yx1Var2.f277106e = i2;
            yx1Var2.f277107f = 0;
            yx1Var2.f277110i = 1;
            Object objInvoke = gh00Var2.invoke(yx1Var2);
            if (objInvoke != yukVar) {
                return objInvoke;
            }
        } else {
            yx1Var2.f277102a = null;
            yx1Var2.f277103b = null;
            yx1Var2.f277110i = 3;
            Object objInvoke2 = gh00Var2.invoke(yx1Var2);
            if (objInvoke2 != yukVar) {
                return objInvoke2;
            }
        }
        return yukVar;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f231111a) {
            case 9:
                return new pqm0((xul0) obj, (am81) obj2);
            default:
                return new pqm0((String) obj, (Boolean) obj2);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f231111a) {
            case 22:
                return First.m15574b((lab1) obj);
            default:
                return First.m15574b((j8c1) obj);
        }
    }

    @Override // p204p.ojn0
    /* JADX INFO: renamed from: i */
    public Object mo24963i(d7x0 d7x0Var) {
        return Integer.valueOf(((eqf1) d7x0Var).f61883b);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean zIsEmpty;
        switch (this.f231111a) {
            case 3:
                zIsEmpty = ((List) obj).isEmpty();
                break;
            case 7:
                zIsEmpty = ((iqx) ((gqx) obj)).f104863f;
                break;
            case 11:
                zIsEmpty = ((iqx) ((gqx) obj)).f104863f;
                break;
            case 21:
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((ozw0) it.next()) instanceof mzw0) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                d601 d601Var = (d601) obj;
                return (d601Var instanceof c601) || (d601Var instanceof z501) || (d601Var instanceof y501);
        }
        return !zIsEmpty;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f231111a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                try {
                    return GetValuesResponse.m7521p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 1:
                return new vzr0((qxr0) obj);
            case 2:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 3:
            case 4:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                return new r1j0((dd41) obj);
            case 5:
                return ((Boolean) obj).equals(Boolean.TRUE) ? fw90.f74034a : ew90.f63455a;
            case 6:
                return ((lji) ((chy0) ((ehy0) obj)).f38149a).mo56607k();
            case 8:
                return new g6y0(false);
            case 10:
                return new pqm0((bxz0) obj, null);
            case 12:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return MarkShowAsPlayedResponse.m21236q(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.show_esperanto.proto.MarkShowAsPlayedResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 13:
                return new i421((mz00) obj);
            case 15:
                return ((ubp0) obj).f228853a;
            case 16:
                return new jh31(((g0j) obj) != g0j.f75376f);
            case 17:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new qdv0(message);
            case 18:
                return ((acv0) obj).f14467a;
            case 19:
                pqm0 pqm0Var = (pqm0) obj;
                return new gc81((PlayerState) pqm0Var.f180350a, ((Boolean) pqm0Var.f180351b).booleanValue(), false);
        }
    }
}
