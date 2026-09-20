package p204p;

import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public final class gxk implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final gxk f85297a = new gxk();

    /* JADX INFO: renamed from: b */
    public static final rr60 f85298b;

    /* JADX INFO: renamed from: c */
    public static final ktz0 f85299c;

    static {
        rr60 rr60VarSerializer = cuz0.Companion.serializer();
        f85298b = rr60VarSerializer;
        f85299c = rr60VarSerializer.getDescriptor();
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        nvk[] nvkVarArr;
        if (!(froVar instanceof vk60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        vk60 vk60Var = (vk60) froVar;
        yk60 yk60VarMo43785m = vk60Var.mo43785m();
        if (yk60VarMo43785m instanceof jk60) {
            fk60 fk60VarMo43778d = vk60Var.mo43778d();
            mj5 mj5Var = new mj5(nvk.Companion.serializer(), 0);
            fk60VarMo43778d.getClass();
            nvkVarArr = (nvk[]) ((Collection) ex60.m40192z(fk60VarMo43778d, yk60VarMo43785m, mj5Var)).toArray(new nvk[0]);
        } else {
            fk60 fk60VarMo43778d2 = vk60Var.mo43778d();
            rr60 rr60Var = f85298b;
            fk60VarMo43778d2.getClass();
            nvkVarArr = ((cuz0) ex60.m40192z(fk60VarMo43778d2, yk60VarMo43785m, rr60Var)).f42257a;
        }
        fxk fxkVar = new fxk();
        fxkVar.f74386a = nvkVarArr;
        return fxkVar;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f85299c;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35825i(f85298b, new cuz0(((fxk) obj).f74386a));
    }
}
