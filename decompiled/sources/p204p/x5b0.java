package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x5b0 implements Update {
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        z5b0 z5b0Var = (z5b0) obj;
        v5b0 v5b0Var = (v5b0) obj2;
        qf40 qf40Var = z5b0Var.f279529c;
        int i = z5b0Var.f279527a;
        boolean z = v5b0Var instanceof t5b0;
        Object obj3 = h5b0.f87798g;
        if (z) {
            return Next.m15605a(Collections.singleton(obj3));
        }
        if (v5b0Var instanceof s5b0) {
            int i2 = i - 1;
            return i2 >= 0 ? Next.m15606h(z5b0.m95455a(z5b0Var, i2, (b251) qf40Var.get(i2))) : Next.m15605a(Collections.singleton(obj3));
        }
        if (!(v5b0Var instanceof u5b0)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = i + 1;
        if (i3 < ((AbstractC2282q6) qf40Var).mo33075a()) {
            return Next.m15606h(z5b0.m95455a(z5b0Var, i3, (b251) qf40Var.get(i3)));
        }
        int iM38547C = edb.m38547C(z5b0Var.f279530d);
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            obj3 = j5b0.f108929g;
        }
        return Next.m15605a(Collections.singleton(obj3));
    }
}
