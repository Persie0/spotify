package p204p;

import com.spotify.mainlayout.p106ui.view.MainLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class gyb0 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hyb0 f85542b;

    public /* synthetic */ gyb0(hyb0 hyb0Var, int i) {
        this.f85541a = i;
        this.f85542b = hyb0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        int i = this.f85541a;
        hyb0 hyb0Var = this.f85542b;
        switch (i) {
            case 0:
                s1m0 s1m0Var = (s1m0) obj;
                MainLayout mainLayout = hyb0Var.f96561x;
                if (mainLayout != null) {
                    if (!((Boolean) hyb0Var.f96546i.get()).booleanValue()) {
                        mainLayout.setOverlayTouchPassthroughActive(false);
                        mainLayout.setOverlayTouchDispatcher(null);
                    } else {
                        mainLayout.setOverlayTouchPassthroughActive((s1m0Var != null ? s1m0Var.f204746a : null) != null);
                        mainLayout.setOverlayTouchDispatcher(s1m0Var != null ? s1m0Var.f204746a : null);
                    }
                }
                break;
            case 1:
                tkm0 tkm0Var = (tkm0) obj;
                MainLayout mainLayout2 = hyb0Var.f96561x;
                if (mainLayout2 != null) {
                    mainLayout2.setPageSurroundingsProperty(tkm0Var);
                }
                break;
            default:
                a0r0 a0r0Var = (a0r0) obj;
                MainLayout mainLayout3 = hyb0Var.f96561x;
                if (mainLayout3 != null) {
                    zzq0 zzq0Var = a0r0Var != null ? a0r0Var.f11158a : null;
                    zxb0 zxb0Var = mainLayout3.f5360E1;
                    zxb0Var.f287273d.m39516c(zxb0.f287269i[1], zxb0Var, zzq0Var);
                    WeakHashMap weakHashMap = mec1.f142677a;
                    aec1.m25717c(mainLayout3);
                }
                break;
        }
    }
}
