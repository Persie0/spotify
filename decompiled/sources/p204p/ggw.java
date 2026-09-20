package p204p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class ggw implements bfe0 {

    /* JADX INFO: renamed from: b */
    public final String f79761b;

    public ggw(int i, String... strArr) {
        String str;
        switch (i) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f79761b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Collection mo27568a(qti0 qti0Var, pkj0 pkj0Var) {
        return mo44703i(qti0Var);
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: b */
    public Set mo25810b() {
        return gbu.f78413a;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ Collection mo27569c(qti0 qti0Var, pkj0 pkj0Var) {
        return mo44702h(qti0Var);
    }

    @Override // p204p.oyw0
    /* JADX INFO: renamed from: d */
    public Collection mo27570d(exq exqVar, gh00 gh00Var) {
        return lau.f131415a;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: e */
    public Set mo25811e() {
        return gbu.f78413a;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: f */
    public Set mo25812f() {
        return gbu.f78413a;
    }

    @Override // p204p.oyw0
    /* JADX INFO: renamed from: g */
    public qge mo27571g(qti0 qti0Var, pkj0 pkj0Var) {
        return new ydw(qti0.m73843g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{qti0Var}, 1))));
    }

    /* JADX INFO: renamed from: h */
    public Set mo44702h(qti0 qti0Var) {
        xew xewVar = new xew(ehw.f59684c, null, e370.f55667h, qti0.m73843g("<Error function>"), 1, du31.f52959o0);
        zgw zgwVarM39006b = ehw.m39006b(chw.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        uxq uxqVar = vxq.f245810e;
        lau lauVar = lau.f131415a;
        xewVar.mo70062M1(null, null, lauVar, lauVar, lauVar, zgwVarM39006b, 3, uxqVar);
        return Collections.singleton(xewVar);
    }

    /* JADX INFO: renamed from: i */
    public Set mo44703i(qti0 qti0Var) {
        return ehw.f59687f;
    }

    public String toString() {
        return dq60.m36617q(new StringBuilder("ErrorScope{"), this.f79761b, '}');
    }
}
