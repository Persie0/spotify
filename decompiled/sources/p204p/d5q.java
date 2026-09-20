package p204p;

import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class d5q {

    /* JADX INFO: renamed from: a */
    public final ya3 f45471a;

    /* JADX INFO: renamed from: b */
    public final tw81 f45472b;

    public d5q(ya3 ya3Var, tw81 tw81Var) {
        this.f45471a = ya3Var;
        this.f45472b = tw81Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        if (r10 == r5) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.du1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v8 */
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m35032a(du1 du1Var, List list, n4m n4mVar, ibk ibkVar) {
        c5q c5qVar;
        String str;
        String str2;
        String str3;
        if (ibkVar instanceof c5q) {
            c5qVar = (c5q) ibkVar;
            int i = c5qVar.f34237d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5qVar.f34237d = i - Integer.MIN_VALUE;
            } else {
                c5qVar = new c5q(this, ibkVar);
            }
        } else {
            c5qVar = new c5q(this, ibkVar);
        }
        Object objM81662b = c5qVar.f34235b;
        int i2 = c5qVar.f34237d;
        gbu gbuVar = gbu.f78413a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM81662b);
                if ((du1Var instanceof bu1) && (str = (String) g6f.m43708V0(list)) != null) {
                    tw81 tw81Var = this.f45472b;
                    c5qVar.f34234a = str;
                    c5qVar.f34237d = 1;
                    objM81662b = tw81Var.m81662b(str, n4mVar, c5qVar);
                    if (objM81662b == yukVar) {
                        str2 = str;
                    }
                    du1Var = str2;
                    return yukVar;
                }
                return gbuVar;
            }
            if (i2 == 1) {
                String str4 = c5qVar.f34234a;
                bga.m29073P(objM81662b);
                str2 = str4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str5 = c5qVar.f34234a;
                bga.m29073P(objM81662b);
                du1Var = str5;
            }
            du1Var = str2;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (aa3 aa3Var : (Iterable) objM81662b) {
                if (aa3Var instanceof z93) {
                    str3 = ((z93) aa3Var).f280652a;
                } else {
                    if (!(aa3Var instanceof y93)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = yl1.f273875b;
                }
                linkedHashSet.add(str3);
            }
            return linkedHashSet;
            str2 = str;
            x93 x93Var = (x93) objM81662b;
            if (x93Var != null) {
                fiz fizVarM93179n = this.f45471a.m93179n(x93Var);
                c5qVar.f34234a = str2;
                c5qVar.f34237d = 2;
                objM81662b = vyf1.m86755t(fizVarM93179n, c5qVar);
            }
            return gbuVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3974j(e2, "Failed to resolve default save locations for %s", du1Var);
            return gbuVar;
        }
    }
}
