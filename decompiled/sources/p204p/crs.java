package p204p;

import com.spotify.authentication.login5esperanto.EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class crs implements Function, Predicate, BiFunction, vja1, fhl, yh00, oo21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41404a;

    /* JADX INFO: renamed from: b */
    public static final crs f41395b = new crs(1);

    /* JADX INFO: renamed from: c */
    public static final crs f41396c = new crs(2);

    /* JADX INFO: renamed from: d */
    public static final crs f41397d = new crs(3);

    /* JADX INFO: renamed from: e */
    public static final crs f41398e = new crs(4);

    /* JADX INFO: renamed from: f */
    public static final crs f41399f = new crs(5);

    /* JADX INFO: renamed from: g */
    public static final crs f41400g = new crs(6);

    /* JADX INFO: renamed from: h */
    public static final crs f41401h = new crs(7);

    /* JADX INFO: renamed from: i */
    public static final crs f41402i = new crs(8);

    /* JADX INFO: renamed from: t */
    public static final crs f41403t = new crs(9);

    /* JADX INFO: renamed from: X */
    public static final crs f41388X = new crs(10);

    /* JADX INFO: renamed from: Y */
    public static final crs f41390Y = new crs(11);

    /* JADX INFO: renamed from: Z */
    public static final crs f41392Z = new crs(12);

    /* JADX INFO: renamed from: L0 */
    public static final crs f41376L0 = new crs(13);

    /* JADX INFO: renamed from: M0 */
    public static final crs f41377M0 = new crs(14);

    /* JADX INFO: renamed from: N0 */
    public static final crs f41378N0 = new crs(15);

    /* JADX INFO: renamed from: O0 */
    public static final crs f41379O0 = new crs(17);

    /* JADX INFO: renamed from: P0 */
    public static final crs f41380P0 = new crs(18);

    /* JADX INFO: renamed from: Q0 */
    public static final crs f41381Q0 = new crs(19);

    /* JADX INFO: renamed from: R0 */
    public static final crs f41382R0 = new crs(20);

    /* JADX INFO: renamed from: S0 */
    public static final crs f41383S0 = new crs(21);

    /* JADX INFO: renamed from: T0 */
    public static final crs f41384T0 = new crs(22);

    /* JADX INFO: renamed from: U0 */
    public static final crs f41385U0 = new crs(23);

    /* JADX INFO: renamed from: V0 */
    public static final crs f41386V0 = new crs(24);

    /* JADX INFO: renamed from: W0 */
    public static final crs f41387W0 = new crs(25);

    /* JADX INFO: renamed from: X0 */
    public static final crs f41389X0 = new crs(26);

    /* JADX INFO: renamed from: Y0 */
    public static final crs f41391Y0 = new crs(27);

    /* JADX INFO: renamed from: Z0 */
    public static final crs f41393Z0 = new crs(28);

    /* JADX INFO: renamed from: a1 */
    public static final crs f41394a1 = new crs(29);

    public /* synthetic */ crs(int i) {
        this.f41404a = i;
    }

    /* JADX INFO: renamed from: b */
    public static wwf m33745b(th00 th00Var) {
        return new wwf(th00Var, jjf.f113005N0);
    }

    /* JADX INFO: renamed from: a */
    public void mo33746a(float f, float f2, float f3, wh01 wh01Var) {
        wh01Var.m88082c(f, 0.0f);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        ContextTrack contextTrack;
        switch (this.f41404a) {
            case 7:
                Map map = (Map) obj2;
                return new od6(((pd6) obj).f176358a, dxf1.m37244s("has-podcasts-available", map), dxf1.m37246v(map));
            case 17:
                rh20 rh20Var = (rh20) obj;
                return ((((c7a) obj2) instanceof b7a) && (rh20Var instanceof qh20)) ? new ph20(13, 0L, ((qh20) rh20Var).f188602a) : rh20Var;
            default:
                PlayerState playerState = (PlayerState) obj;
                boolean z = false;
                if (((Boolean) obj2).booleanValue() && playerState.isPlaying() && !playerState.isPaused() && (contextTrack = (ContextTrack) playerState.track().mo49283h()) != null && hc1.m47085n(contextTrack, false) && !Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_PIP_DISALLOWED))) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        return new iu9(mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f41404a) {
            case 3:
                return ((PlayerState) obj).track().mo49279c();
            case 8:
                return ((EsAuthnPlatformRequired$AuthnPlatformRequiredProceedResult) obj).m3593o();
            case 13:
                return ((Boolean) obj).booleanValue();
            case 23:
                return !((api) obj).mo26691g();
            case 27:
                return ((xul0) obj).mo49279c();
            default:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 ??, still in use, count: 1, list:
          (r2v4 ?? I:??[OBJECT, ARRAY]) from 0x00bc: RETURN (r2v4 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 ??, still in use, count: 1, list:
          (r2v4 ?? I:??[OBJECT, ARRAY]) from 0x00bc: RETURN (r2v4 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // p204p.oo21
    /* JADX INFO: renamed from: d */
    public void mo30790d() {
    }
}
