package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.pubsub.esperanto.proto.EsPushedMessage$PushedMessage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class cvx implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f42568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42569c;

    public /* synthetic */ cvx(niz nizVar, Object obj, int i) {
        this.f42567a = i;
        this.f42568b = nizVar;
        this.f42569c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:141:0x0227  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x018d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.niz] */
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
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        avx avxVar;
        bvx bvxVar;
        zqd0 zqd0Var;
        koj0 koj0Var;
        long jLongValue;
        f5t0 f5t0Var;
        xa11 xa11Var;
        Object obj2;
        int i = this.f42567a;
        ?? r1 = 0;
        ?? r2 = 0;
        Object obj3 = null;
        r1 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        ?? r3 = this.f42569c;
        ?? r4 = this.f42568b;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof avx) {
                    avxVar = (avx) fbkVar;
                    int i2 = avxVar.f20290b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        avxVar.f20290b = i2 - Integer.MIN_VALUE;
                    } else {
                        avxVar = new avx(this, fbkVar);
                    }
                } else {
                    avxVar = new avx(this, fbkVar);
                }
                Object obj4 = avxVar.f20289a;
                int i3 = avxVar.f20290b;
                if (i3 == 0) {
                    bga.m29073P(obj4);
                    avxVar.f20290b = 1;
                    return r4.emit(r3, avxVar) == yukVar ? yukVar : w2a1Var;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj4);
                return w2a1Var;
            case 1:
                if (fbkVar instanceof bvx) {
                    bvxVar = (bvx) fbkVar;
                    int i4 = bvxVar.f31459b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bvxVar.f31459b = i4 - Integer.MIN_VALUE;
                    } else {
                        bvxVar = new bvx(this, fbkVar);
                    }
                } else {
                    bvxVar = new bvx(this, fbkVar);
                }
                Object obj5 = bvxVar.f31458a;
                int i5 = bvxVar.f31459b;
                if (i5 == 0) {
                    bga.m29073P(obj5);
                    bvxVar.f31459b = 1;
                    return r4.emit(r3, bvxVar) == yukVar ? yukVar : w2a1Var;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj5);
                return w2a1Var;
            case 2:
                if (fbkVar instanceof zqd0) {
                    zqd0Var = (zqd0) fbkVar;
                    int i6 = zqd0Var.f285364b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        zqd0Var.f285364b = i6 - Integer.MIN_VALUE;
                    } else {
                        zqd0Var = new zqd0(this, fbkVar);
                    }
                } else {
                    zqd0Var = new zqd0(this, fbkVar);
                }
                Object obj6 = zqd0Var.f285363a;
                int i7 = zqd0Var.f285364b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                qho qhoVar2 = ohoVar != null ? (qho) ohoVar.f165512a : null;
                if (qhoVar2 != null && !(qhoVar2 instanceof pho)) {
                    if (qhoVar2 instanceof nho) {
                        r1 = r3;
                    } else {
                        if (!(qhoVar2 instanceof oho)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r1 = ((oho) qhoVar2).f165512a;
                    }
                }
                if (r1 == 0) {
                    return w2a1Var;
                }
                zqd0Var.f285364b = 1;
                return r4.emit(r1, zqd0Var) == yukVar ? yukVar : w2a1Var;
            case 3:
                if (fbkVar instanceof koj0) {
                    koj0Var = (koj0) fbkVar;
                    int i8 = koj0Var.f124805b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        koj0Var.f124805b = i8 - Integer.MIN_VALUE;
                    } else {
                        koj0Var = new koj0(this, fbkVar);
                    }
                } else {
                    koj0Var = new koj0(this, fbkVar);
                }
                Object obj7 = koj0Var.f124804a;
                int i9 = koj0Var.f124805b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                long jLongValue2 = ((Number) obj).longValue();
                int i10 = loj0.f135438A1;
                t2b0 t2b0Var = new t2b0(0L, jLongValue2);
                Long l = (Long) (r3 instanceof c6x0 ? 0 : r3);
                if (l == null) {
                    Logger.m3973i("Failed to calculate viewable threshold: ".concat("viewable_threshold_missing"), new Object[0]);
                    jLongValue = 3000;
                } else {
                    long jLongValue3 = l.longValue();
                    if (0 > jLongValue3 || jLongValue3 > t2b0Var.f195113b) {
                        long jM63440q = n0e1.m63440q(l.longValue(), t2b0Var);
                        Logger.m3973i("Failed to calculate viewable threshold: ".concat("viewable_threshold_out_of_bounds"), new Object[0]);
                        jLongValue = jM63440q;
                    } else {
                        jLongValue = l.longValue();
                    }
                }
                Long l2 = new Long(jLongValue);
                koj0Var.f124805b = 1;
                return r4.emit(l2, koj0Var) == yukVar ? yukVar : w2a1Var;
            case 4:
                if (fbkVar instanceof f5t0) {
                    f5t0Var = (f5t0) fbkVar;
                    int i11 = f5t0Var.f66169b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        f5t0Var.f66169b = i11 - Integer.MIN_VALUE;
                    } else {
                        f5t0Var = new f5t0(this, fbkVar);
                    }
                } else {
                    f5t0Var = new f5t0(this, fbkVar);
                }
                Object obj8 = f5t0Var.f66168a;
                int i12 = f5t0Var.f66169b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                EsPushedMessage$PushedMessage esPushedMessage$PushedMessage = (EsPushedMessage$PushedMessage) obj;
                String key = esPushedMessage$PushedMessage.m7543p().getKey();
                String strM7536o = esPushedMessage$PushedMessage.m7542o().m7536o();
                ae50 ae50VarM7544q = esPushedMessage$PushedMessage.m7544q();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM7544q, 10));
                Iterator it = ae50VarM7544q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gva) it.next()).m45891s());
                }
                woo wooVar = new woo(key, strM7536o, esPushedMessage$PushedMessage.m7541n(), arrayList);
                try {
                    Object objInvoke = r3.invoke(wooVar);
                    if (objInvoke == null) {
                        Logger.m3966b("Error while transforming pushed message with ident %s", strM7536o);
                    }
                    obj3 = objInvoke;
                    break;
                } catch (Exception e) {
                    Logger.m3967c(e, "Exception while transforming message for %s", wooVar.f253522b);
                }
                if (obj3 == null) {
                    return w2a1Var;
                }
                f5t0Var.f66169b = 1;
                return r4.emit(obj3, f5t0Var) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof xa11) {
                    xa11Var = (xa11) fbkVar;
                    int i13 = xa11Var.f259509b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        xa11Var.f259509b = i13 - Integer.MIN_VALUE;
                    } else {
                        xa11Var = new xa11(this, fbkVar);
                    }
                } else {
                    xa11Var = new xa11(this, fbkVar);
                }
                Object obj9 = xa11Var.f259508a;
                int i14 = xa11Var.f259509b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                qho qhoVar3 = (qho) obj;
                if (qhoVar3 instanceof oho) {
                    obj2 = ((oho) qhoVar3).f165512a;
                } else if (qhoVar3 instanceof nho) {
                    r2 = r3;
                }
                if (r2 == 0) {
                    r2 = obj2;
                    return w2a1Var;
                }
                xa11Var.f259509b = 1;
                if (r4.emit(r2, xa11Var) == yukVar) {
                    r2 = obj2;
                    return yukVar;
                }
                r2 = obj2;
                return w2a1Var;
        }
    }

    public /* synthetic */ cvx(niz nizVar, Object obj, Object obj2, int i) {
        this.f42567a = i;
        this.f42568b = nizVar;
        this.f42569c = obj2;
    }

    public cvx(niz nizVar, g5t0 g5t0Var, String str, gh00 gh00Var) {
        this.f42567a = 4;
        this.f42568b = nizVar;
        this.f42569c = gh00Var;
    }
}
