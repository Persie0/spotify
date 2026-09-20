package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t410 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final t410 f216875a;
    private static final ktz0 descriptor;

    static {
        t410 t410Var = new t410();
        f216875a = t410Var;
        vwp0 vwp0Var = new vwp0("com.spotify.assistedcuration.content.model.GenreResponse", t410Var, 1);
        vwp0Var.m86594k("genres", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{w410.f247674b[0].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = w410.f247674b;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new w410(i, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) w410.f247674b[0].getValue(), ((w410) obj).f247675a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
