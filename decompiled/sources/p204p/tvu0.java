package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tvu0 {

    /* JADX INFO: renamed from: a */
    public final long f224242a;

    /* JADX INFO: renamed from: b */
    public final sgz f224243b;

    /* JADX INFO: renamed from: c */
    public final svu0 f224244c;

    public tvu0(long j, sgz sgzVar) {
        this.f224242a = j;
        this.f224243b = sgzVar;
        this.f224244c = new svu0(this, j);
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
    /* JADX INFO: renamed from: a */
    public final void m81618a(pge0 pge0Var, p340 p340Var, Map map, long j) {
        svu0 svu0Var = this.f224244c;
        long j2 = svu0Var.f214512b;
        LinkedHashMap linkedHashMap = svu0Var.f214511a;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(pge0Var);
            if (objRemove != null) {
                svu0Var.f214513c = svu0Var.m79497b() - svu0Var.m79498c(pge0Var, objRemove);
                svu0Var.m79496a(pge0Var, objRemove, null);
            }
            this.f224243b.m78121i(pge0Var, p340Var, map, j);
            return;
        }
        rvu0 rvu0Var = new rvu0(p340Var, map, j);
        Object objPut = linkedHashMap.put(pge0Var, rvu0Var);
        svu0Var.f214513c = svu0Var.m79498c(pge0Var, rvu0Var) + svu0Var.m79497b();
        if (objPut != null) {
            svu0Var.f214513c = svu0Var.m79497b() - svu0Var.m79498c(pge0Var, objPut);
            svu0Var.m79496a(pge0Var, objPut, rvu0Var);
        }
        svu0Var.m79499d(svu0Var.f214512b);
    }
}
