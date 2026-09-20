package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r0q0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final r0q0 f194541a;
    private static final ktz0 descriptor;

    static {
        r0q0 r0q0Var = new r0q0();
        f194541a = r0q0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.podcast.endpoints.decorate.body.PodcastDecorateBody", r0q0Var, 2);
        vwp0Var.m86594k("items", false);
        vwp0Var.m86594k("policy", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{t0q0.f215957c[0].getValue(), epv0.m39700t(wro.f254395a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = t0q0.f215957c;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        eso esoVar = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                esoVar = (eso) frhVarMo29814b.mo39211B(ktz0Var, 1, wro.f254395a, esoVar);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new t0q0(i, list, esoVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        t0q0 t0q0Var = (t0q0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) t0q0.f215957c[0].getValue(), t0q0Var.f215958a);
        eso esoVar = t0q0Var.f215959b;
        if (esoVar != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, wro.f254395a, esoVar);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
