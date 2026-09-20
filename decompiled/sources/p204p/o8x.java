package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class o8x implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162886a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f162887b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f162888c;

    public /* synthetic */ o8x(niz nizVar, boolean z, int i) {
        this.f162886a = i;
        this.f162887b = nizVar;
        this.f162888c = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
        n8x n8xVar;
        lb50 lb50Var;
        s121[] s121VarArr;
        qjy0 qjy0Var;
        int i = this.f162886a;
        w2a1 w2a1Var = w2a1.f247311a;
        boolean z = this.f162888c;
        niz nizVar = this.f162887b;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof n8x) {
                    n8xVar = (n8x) fbkVar;
                    int i2 = n8xVar.f151651b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        n8xVar.f151651b = i2 - Integer.MIN_VALUE;
                    } else {
                        n8xVar = new n8x(this, fbkVar);
                    }
                } else {
                    n8xVar = new n8x(this, fbkVar);
                }
                Object obj2 = n8xVar.f151650a;
                int i3 = n8xVar.f151651b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1Var;
                }
                bga.m29073P(obj2);
                ibb0 ibb0Var = new ibb0((String) obj, z);
                n8xVar.f151651b = 1;
                return nizVar.emit(ibb0Var, n8xVar) == yukVar ? yukVar : w2a1Var;
            case 1:
                if (fbkVar instanceof lb50) {
                    lb50Var = (lb50) fbkVar;
                    int i4 = lb50Var.f131566b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        lb50Var.f131566b = i4 - Integer.MIN_VALUE;
                    } else {
                        lb50Var = new lb50(this, fbkVar);
                    }
                } else {
                    lb50Var = new lb50(this, fbkVar);
                }
                Object obj3 = lb50Var.f131565a;
                int i5 = lb50Var.f131566b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                PlayerState playerState = (PlayerState) obj;
                wj50.m88279p(playerState);
                if (z) {
                    s121VarArr = hdi.m47214F(playerState) ? new s121[]{new o121("", null)} : new s121[0];
                } else {
                    boolean zM47214F = hdi.m47214F(playerState);
                    m121 m121Var = m121.f138801a;
                    s121VarArr = (!zM47214F || hdi.m47223O(playerState)) ? new s121[]{m121Var} : new s121[]{m121Var, n121.f149272a};
                }
                lb50Var.f131566b = 1;
                return nizVar.emit(s121VarArr, lb50Var) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof qjy0) {
                    qjy0Var = (qjy0) fbkVar;
                    int i6 = qjy0Var.f189382b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        qjy0Var.f189382b = i6 - Integer.MIN_VALUE;
                    } else {
                        qjy0Var = new qjy0(this, fbkVar);
                    }
                } else {
                    qjy0Var = new qjy0(this, fbkVar);
                }
                Object obj4 = qjy0Var.f189381a;
                int i7 = qjy0Var.f189382b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                pqm0 pqm0Var = new pqm0(Boolean.valueOf(z), (d850) obj);
                qjy0Var.f189382b = 1;
                return nizVar.emit(pqm0Var, qjy0Var) == yukVar ? yukVar : w2a1Var;
        }
    }
}
