package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m2p implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139436a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f139437b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f139438c;

    public /* synthetic */ m2p(niz nizVar, String str, int i) {
        this.f139436a = i;
        this.f139437b = nizVar;
        this.f139438c = str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
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
        l2p l2pVar;
        zn51 zn51Var;
        Object arrayList;
        List<dx80> list;
        switch (this.f139436a) {
            case 0:
                if (fbkVar instanceof l2p) {
                    l2pVar = (l2p) fbkVar;
                    int i = l2pVar.f129060b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        l2pVar.f129060b = i - Integer.MIN_VALUE;
                    } else {
                        l2pVar = new l2p(this, fbkVar);
                    }
                } else {
                    l2pVar = new l2p(this, fbkVar);
                }
                Object obj2 = l2pVar.f129059a;
                int i2 = l2pVar.f129060b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    s1p s1pVar = (s1p) obj;
                    if ((s1pVar instanceof q1p) || ((s1pVar instanceof r1p) && wj50.m88271j(((r1p) s1pVar).m74485a(), this.f139438c))) {
                        l2pVar.f129060b = 1;
                        Object objEmit = this.f139437b.emit(obj, l2pVar);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof zn51) {
                    zn51Var = (zn51) fbkVar;
                    int i3 = zn51Var.f284417b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zn51Var.f284417b = i3 - Integer.MIN_VALUE;
                    } else {
                        zn51Var = new zn51(this, fbkVar);
                    }
                } else {
                    zn51Var = new zn51(this, fbkVar);
                }
                Object obj3 = zn51Var.f284416a;
                int i4 = zn51Var.f284417b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    p2x0 p2x0Var = (p2x0) obj;
                    m2x0 m2x0Var = p2x0Var instanceof m2x0 ? (m2x0) p2x0Var : null;
                    if (m2x0Var == null || (list = (List) m2x0Var.f139474a) == null) {
                        arrayList = lau.f131415a;
                    } else {
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        for (dx80 dx80Var : list) {
                            arrayList.add(new v6w0(dx80Var.m37201b(), this.f139438c, null, dx80Var.m37200a(), null, null, 52));
                        }
                    }
                    zn51Var.f284417b = 1;
                    Object objEmit2 = this.f139437b.emit(arrayList, zn51Var);
                    Object obj4 = yuk.f276404a;
                    if (objEmit2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
