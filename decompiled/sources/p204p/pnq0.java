package p204p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pnq0 implements Function, Predicate, BiFunction, Function3, t6l0, sq31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179511a;

    /* JADX INFO: renamed from: b */
    public static final pnq0 f179501b = new pnq0(0);

    /* JADX INFO: renamed from: c */
    public static final pnq0 f179503c = new pnq0(1);

    /* JADX INFO: renamed from: d */
    public static final pnq0 f179504d = new pnq0(2);

    /* JADX INFO: renamed from: e */
    public static final pnq0 f179505e = new pnq0(3);

    /* JADX INFO: renamed from: f */
    public static final pnq0 f179506f = new pnq0(4);

    /* JADX INFO: renamed from: g */
    public static final pnq0 f179507g = new pnq0(5);

    /* JADX INFO: renamed from: h */
    public static final pnq0 f179508h = new pnq0(6);

    /* JADX INFO: renamed from: i */
    public static final pnq0 f179509i = new pnq0(7);

    /* JADX INFO: renamed from: t */
    public static final pnq0 f179510t = new pnq0(8);

    /* JADX INFO: renamed from: X */
    public static final pnq0 f179494X = new pnq0(9);

    /* JADX INFO: renamed from: Y */
    public static final pnq0 f179496Y = new pnq0(10);

    /* JADX INFO: renamed from: Z */
    public static final pnq0 f179498Z = new pnq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final pnq0 f179482L0 = new pnq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final pnq0 f179483M0 = new pnq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final pnq0 f179484N0 = new pnq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final pnq0 f179485O0 = new pnq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final pnq0 f179486P0 = new pnq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final pnq0 f179487Q0 = new pnq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final pnq0 f179488R0 = new pnq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final gx31 f179489S0 = new gx31(9);

    /* JADX INFO: renamed from: T0 */
    public static final gx31 f179490T0 = new gx31(10);

    /* JADX INFO: renamed from: U0 */
    public static final pnq0 f179491U0 = new pnq0(20);

    /* JADX INFO: renamed from: V0 */
    public static final pnq0 f179492V0 = new pnq0(21);

    /* JADX INFO: renamed from: W0 */
    public static final pnq0 f179493W0 = new pnq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final pnq0 f179495X0 = new pnq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final pnq0 f179497Y0 = new pnq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final pnq0 f179499Z0 = new pnq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final pnq0 f179500a1 = new pnq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final pnq0 f179502b1 = new pnq0(28);

    public /* synthetic */ pnq0(int i) {
        this.f179511a = i;
    }

    /* JADX INFO: renamed from: a */
    public static sfa1 m70448a(String str) {
        if (str.equals("Pdf")) {
            return rfa1.f198560a;
        }
        if (str.equals("Image")) {
            return qfa1.f188160a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m70449b(Context context, int i) {
        Intent intent = new Intent();
        intent.setClass(context, AccountPickerActivity.class);
        intent.setFlags(i);
        return intent;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj3;
        return new c5x0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), dxf1.m37244s("obfuscate-restricted-tracks", map), dxf1.m37224M(map));
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((PlayerState) obj, (Boolean) obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (p204p.njg1.m64619l(500, r0) == r5) goto L26;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Enum m70450c(y3o0 y3o0Var, ibk ibkVar) {
        i8s0 i8s0Var;
        gh00 gh00Var;
        gh00 gh00Var2;
        if (ibkVar instanceof i8s0) {
            i8s0Var = (i8s0) ibkVar;
            int i = i8s0Var.f99837d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8s0Var.f99837d = i - Integer.MIN_VALUE;
            } else {
                i8s0Var = new i8s0(this, ibkVar);
            }
        } else {
            i8s0Var = new i8s0(this, ibkVar);
        }
        Object obj = i8s0Var.f99835b;
        int i2 = i8s0Var.f99837d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            y3o0Var.invoke(h8s0.f88781b);
            i8s0Var.f99834a = y3o0Var;
            i8s0Var.f99837d = 1;
            if (njg1.m64619l(200L, i8s0Var) != yukVar) {
            }
            gh00Var = y3o0Var;
            return yukVar;
        }
        if (i2 == 1) {
            gh00 gh00Var3 = i8s0Var.f99834a;
            bga.m29073P(obj);
            gh00Var = gh00Var3;
        } else if (i2 == 2) {
            gh00 gh00Var4 = i8s0Var.f99834a;
            bga.m29073P(obj);
            gh00Var2 = gh00Var4;
            gh00Var2.invoke(h8s0.f88783d);
            i8s0Var.f99834a = null;
            i8s0Var.f99837d = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return h8s0.f88784e;
        gh00Var = y3o0Var;
        gh00Var.invoke(h8s0.f88782c);
        i8s0Var.f99834a = gh00Var;
        i8s0Var.f99837d = 2;
        gh00Var2 = gh00Var;
        if (njg1.m64619l(250L, i8s0Var) != yukVar) {
            gh00Var2.invoke(h8s0.f88783d);
            i8s0Var.f99834a = null;
            i8s0Var.f99837d = 3;
        }
        gh00Var = y3o0Var;
        return yukVar;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean z;
        switch (this.f179511a) {
            case 3:
                z = ((iqx) ((gqx) obj)).f104863f;
                break;
            case 12:
                return ((gv31) obj).f84603b == 1;
            default:
                z = ((iqx) ((gqx) obj)).f104863f;
                break;
        }
        return !z;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        view.setPadding(view.getPaddingLeft(), swd1Var.f214650a.mo51806g(519).f53849b, view.getPaddingRight(), view.getPaddingBottom());
        return swd1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v27 java.lang.Object, still in use, count: 2, list:
          (r0v27 java.lang.Object) from 0x0098: PHI (r0 I:??) = (r0v24 java.lang.Object), (r0v27 java.lang.Object) binds: [B:34:0x0097, B:97:0x0098] A[DONT_GENERATE, DONT_INLINE]
          (r0v27 java.lang.Object) from 0x008e: CHECK_CAST (spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity) (r0v27 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.pnq0.mo98394apply(java.lang.Object):java.lang.Object");
    }
}
