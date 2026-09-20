package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class mk60 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final mk60 f144507a = new mk60();

    /* JADX INFO: renamed from: b */
    public static final lk60 f144508b = lk60.f134271b;

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        eng1.m39504k(froVar);
        return new jk60((List) new mj5(bl60.f28100a, 0).m74832e(froVar, null));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f144508b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        jk60 jk60Var = (jk60) obj;
        eng1.m39503i(deuVar);
        bl60 bl60Var = bl60.f28100a;
        kj5 kj5Var = new kj5(bl60Var.getDescriptor(), 0);
        int size = jk60Var.size();
        hrh hrhVarMo35822g0 = deuVar.mo35822g0(kj5Var, size);
        Iterator<yk60> it = jk60Var.iterator();
        for (int i = 0; i < size; i++) {
            hrhVarMo35822g0.mo44941k(kj5Var, i, bl60Var, it.next());
        }
        hrhVarMo35822g0.mo44937a(kj5Var);
    }
}
