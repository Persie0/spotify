package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class qpj0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191333a;

    /* JADX INFO: renamed from: b */
    public final da80 f191334b;

    public /* synthetic */ qpj0(da80 da80Var, int i) {
        this.f191333a = i;
        this.f191334b = da80Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f191333a) {
            case 0:
                return new tau((mxh0) this.f191334b.f46997c, (y400) obj, false);
            default:
                rpj0 rpj0Var = (rpj0) obj;
                vfe vfeVar = rpj0Var.f201598a;
                List list = rpj0Var.f201599b;
                if (vfeVar.f240968c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + vfeVar);
                }
                vfe vfeVarM85357e = vfeVar.m85357e();
                da80 da80Var = this.f191334b;
                age ageVarM35411g = vfeVarM85357e != null ? da80Var.m35411g(vfeVarM85357e, g6f.m43729k0(list, 1)) : (age) ((vma0) da80Var.f46998d).invoke(vfeVar.f240966a);
                boolean zM85359g = vfeVar.m85359g();
                y751 y751Var = (y751) da80Var.f46996b;
                qti0 qti0VarM85358f = vfeVar.m85358f();
                Integer num = (Integer) g6f.m43745s0(list);
                return new spj0(y751Var, ageVarM35411g, qti0VarM85358f, zM85359g, num != null ? num.intValue() : 0);
        }
    }
}
