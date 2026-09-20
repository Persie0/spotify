package p204p;

import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes11.dex */
public final class vl60 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final vl60 f242388a = new vl60();

    /* JADX INFO: renamed from: b */
    public static final mtz0 f242389b = gjg1.m44909K("kotlinx.serialization.json.JsonPrimitive", ydr0.f271815G0, new ktz0[0]);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        vk60 vk60VarM39504k = eng1.m39504k(froVar);
        yk60 yk60VarMo43785m = vk60VarM39504k.mo43785m();
        if (yk60VarMo43785m instanceof sl60) {
            return (sl60) yk60VarMo43785m;
        }
        throw new JsonDecodingException(fpg1.m42364t(-1, stz0.m79354h(qpv0.f191387a, yk60VarMo43785m.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), null, null, vk60VarM39504k.mo43778d().f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo43785m.toString()).toString() : null));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f242389b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        sl60 sl60Var = (sl60) obj;
        eng1.m39503i(deuVar);
        if (sl60Var instanceof kl60) {
            deuVar.mo35825i(ll60.f134538a, kl60.INSTANCE);
        } else {
            deuVar.mo35825i(il60.f103298a, (hl60) sl60Var);
        }
    }
}
