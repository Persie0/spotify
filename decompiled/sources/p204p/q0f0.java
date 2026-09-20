package p204p;

import android.os.Bundle;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class q0f0 {

    /* JADX INFO: renamed from: a */
    public final m500 f183991a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f183992b;

    /* JADX INFO: renamed from: c */
    public final fse0 f183993c;

    /* JADX INFO: renamed from: d */
    public final k5m0 f183994d;

    public q0f0(m500 m500Var, z9j0 z9j0Var, fse0 fse0Var, k5m0 k5m0Var) {
        this.f183991a = m500Var;
        this.f183992b = z9j0Var;
        this.f183993c = fse0Var;
        this.f183994d = k5m0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m71812a() {
        m500 m500Var = this.f183991a;
        if (m500Var.isDestroyed()) {
            return;
        }
        z9j0 z9j0Var = this.f183992b;
        if (z9j0Var.mo47349j(m500Var)) {
            z9j0Var.mo47345e();
            return;
        }
        k5m0 k5m0Var = this.f183994d;
        if (k5m0Var.mo55547g(m500Var)) {
            k5m0Var.mo55548j();
        }
    }

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
    /* JADX INFO: renamed from: b */
    public final Object m71813b(String str, d850 d850Var, Bundle bundle, p0f0 p0f0Var, ibk ibkVar) {
        z650 z650Var;
        z650 z650Var2;
        dse0 dse0Var;
        dse0 dse0Var2;
        z9j0 z9j0Var = this.f183992b;
        m500 m500Var = this.f183991a;
        str = null;
        String str2 = null;
        str = null;
        String str3 = null;
        if (!z9j0Var.mo47349j(m500Var)) {
            Set set = dd41.f47702f;
            if (r46.m74726U(str).f47709c != gn80.DUMMY) {
                k5m0 k5m0Var = this.f183994d;
                if (k5m0Var.mo55547g(m500Var)) {
                    if (d850Var != null && (z650Var2 = d850Var.f46380a) != null) {
                        str2 = z650Var2.f279709a;
                    }
                    k5m0Var.mo55543b(str, str2, bundle);
                } else {
                    if (d850Var != null && (z650Var = d850Var.f46380a) != null) {
                        str3 = z650Var.f279709a;
                    }
                    k5m0.m55541i(this.f183994d, str, str3, bundle, false, 8);
                }
            } else {
                n6j0 n6j0Var = d850Var != null ? new n6j0(d850Var) : null;
                if (str == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo47348i(new p6j0(str, "", false, false, 0, 0, false, null, null, n6j0Var), bundle);
            }
        } else {
            if (p0f0Var != null) {
                vre0 vre0Var = p0f0Var.f172667c;
                zre0 zre0Var = p0f0Var.f172666b;
                int i = p0f0Var.f172665a;
                boolean z = zre0Var instanceof wre0;
                cse0 cse0Var = cse0.f41527a;
                bse0 bse0Var = bse0.f30301a;
                fse0 fse0Var = this.f183993c;
                if (z) {
                    int iM38547C = edb.m38547C(i);
                    if (iM38547C == 0) {
                        dse0Var2 = cse0Var;
                    } else {
                        if (iM38547C != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dse0Var2 = bse0Var;
                    }
                    boolean z2 = ((wre0) zre0Var).f254346a;
                    fse0Var.getClass();
                    return fse0Var.m42557a(str, null, dse0Var2, new ase0(new wre0(z2), vre0Var), bundle, ibkVar);
                }
                if (d850Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int iM38547C2 = edb.m38547C(i);
                if (iM38547C2 == 0) {
                    dse0Var = cse0Var;
                } else {
                    if (iM38547C2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dse0Var = bse0Var;
                }
                boolean z3 = zre0Var instanceof yre0 ? ((yre0) zre0Var).f275464a : false;
                fse0Var.getClass();
                return fse0Var.m42557a(str, d850Var, dse0Var, new ase0(new yre0(z3), vre0Var), bundle, ibkVar);
            }
            n6j0 n6j0Var2 = d850Var != null ? new n6j0(d850Var) : null;
            if (str == null) {
                throw new IllegalStateException("uri was not set!");
            }
            z9j0Var.mo47348i(new p6j0(str, "", false, false, 0, 0, false, null, null, n6j0Var2), bundle);
        }
        return Boolean.TRUE;
    }
}
