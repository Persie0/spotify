package p204p;

import com.spotify.music.R;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimeout;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class tkr extends lg01 {

    /* JADX INFO: renamed from: a */
    public final q831 f221206a;

    /* JADX INFO: renamed from: b */
    public final cgm f221207b;

    /* JADX INFO: renamed from: c */
    public final k7p0 f221208c;

    /* JADX INFO: renamed from: d */
    public final vjz f221209d;

    public tkr(q831 q831Var, cgm cgmVar, k7p0 k7p0Var) {
        this.f221206a = q831Var;
        this.f221207b = cgmVar;
        this.f221208c = k7p0Var;
        this.f221209d = new vjz(new lcw0(new yqi(k0e1.m54985d(cgmVar.m32730a(true)), 29), 21), new far0(3, 6, null), 2);
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f221209d;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:13:0x003c, B:32:0x00a0, B:33:0x00c2, B:18:0x004d, B:24:0x007c, B:27:0x0094, B:21:0x0058), top: B:37:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object setValue(Boolean bool, boolean z, d850 d850Var, fbk fbkVar) throws Throwable {
        rkr rkrVar;
        ?? r2;
        Object objM89557A;
        w2a1 w2a1Var;
        Object obj;
        boolean z2;
        int i;
        boolean z3 = z;
        Integer numValueOf = Integer.valueOf(R.string.f5985xebc3e942);
        if (fbkVar instanceof rkr) {
            rkrVar = (rkr) fbkVar;
            int i2 = rkrVar.f200147e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rkrVar.f200147e = i2 - Integer.MIN_VALUE;
            } else {
                rkrVar = new rkr(this, (ibk) fbkVar);
            }
        } else {
            rkrVar = new rkr(this, (ibk) fbkVar);
        }
        Object obj2 = rkrVar.f200145c;
        int i3 = rkrVar.f200147e;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj2);
                boolean z4 = !z3;
                CompletablePeek completablePeekM32731b = this.f221207b.m32731b(z4);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                CompletableTimeout completableTimeoutM23304u = completablePeekM32731b.m23304u(30L, Completable.m23286j(new TimeoutException()));
                rkrVar.f200143a = z3;
                rkrVar.f200144b = z4 ? 1 : 0;
                rkrVar.f200147e = 1;
                r2 = z4;
                if (zn91.m96565n(completableTimeoutM23304u, rkrVar) == yukVar) {
                }
                obj = w2a1Var;
                obj = objM89557A;
                return yukVar;
            }
            if (i3 == 1) {
                int i4 = rkrVar.f200144b;
                boolean z5 = rkrVar.f200143a;
                bga.m29073P(obj2);
                r2 = i4;
                z3 = z5;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = rkrVar.f200144b;
                boolean z6 = rkrVar.f200143a;
                bga.m29073P(obj2);
                z2 = z6;
            }
            if (i != 0) {
                obj = objM89557A;
                q831 q831Var = this.f221206a;
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                q831Var.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
            }
            obj = objM89557A;
            return new ed01(Boolean.valueOf(z2));
            rkrVar.f200143a = z3;
            rkrVar.f200144b = r2;
            rkrVar.f200147e = 2;
            n5q n5qVar = xsr.f265651a;
            objM89557A = x0h1.m89557A(pvb0.f181680a, new fop(this, fbkVar2, 25), rkrVar);
            if (objM89557A != yukVar) {
                w2a1Var = w2a1.f247311a;
            }
            if (obj != yukVar) {
                obj = w2a1Var;
                ?? r16 = r2;
                z2 = z3;
                i = r16 == true ? 1 : 0;
                if (i != 0) {
                    obj = objM89557A;
                    q831 q831Var2 = this.f221206a;
                    na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                    na6.m63963k(true, "Invalid resource ID provided: %s", null);
                    q831Var2.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
                }
                obj = objM89557A;
                return new ed01(Boolean.valueOf(z2));
            }
            obj = w2a1Var;
            obj = objM89557A;
            return yukVar;
        } catch (Exception unused) {
            qlg1.m73220y(rkrVar.getContext());
            return new dd01(0, null);
        }
    }
}
