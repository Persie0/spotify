package p204p;

import com.squareup.moshi.JsonDataException;

/* JADX INFO: loaded from: classes3.dex */
public final class u0i0 implements tpk {

    /* JADX INFO: renamed from: b */
    public static final iva f225516b = a7j0.m24943A("EFBBBF");

    /* JADX INFO: renamed from: a */
    public final hk60 f225517a;

    public u0i0(hk60 hk60Var) {
        this.f225517a = hk60Var;
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public final Object mo26363k(Object obj) {
        p3x0 p3x0Var = (p3x0) obj;
        gqa gqaVarMo28080C1 = p3x0Var.mo28080C1();
        try {
            iva ivaVar = f225516b;
            if (gqaVarMo28080C1.mo45430x0(0L, ivaVar)) {
                gqaVarMo28080C1.skip(ivaVar.f106178a.length);
            }
            xl60 xl60VarM91379z = xl60.m91379z(gqaVarMo28080C1);
            Object objFromJson = this.f225517a.fromJson(xl60VarM91379z);
            if (xl60VarM91379z.mo51068B() != xl60.EnumC2579c.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            p3x0Var.close();
            return objFromJson;
        } catch (Throwable th) {
            p3x0Var.close();
            throw th;
        }
    }
}
