package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b850 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final b850 f24493a;
    private static final ktz0 descriptor;

    static {
        b850 b850Var = new b850();
        f24493a = b850Var;
        vwp0 vwp0Var = new vwp0("com.spotify.ubi.logger.InteractionLoggingResult", b850Var, 10);
        vwp0Var.m86594k("interactionId", false);
        vwp0Var.m86594k("pageInstanceId", false);
        vwp0Var.m86594k("authenticated", true);
        vwp0Var.m86594k("eventCreationTimestamp", true);
        vwp0Var.m86594k("eventLoggedTimestamp", true);
        vwp0Var.m86594k("pagePresentationId", true);
        vwp0Var.m86594k("contextualSources", true);
        vwp0Var.m86594k("pageId", true);
        vwp0Var.m86594k("rootSpecificationId", true);
        vwp0Var.m86594k("leafSpecificationId", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        rr60 rr60VarM39700t = epv0.m39700t(ibm0.f100610a);
        rr60 rr60VarM39700t2 = epv0.m39700t(e450.f55982a);
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t3 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t4 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t5 = epv0.m39700t(ql51Var);
        u2b0 u2b0Var = u2b0.f226058a;
        return new rr60[]{x650.f258595a, rr60VarM39700t, l8a.f130828a, u2b0Var, u2b0Var, rr60VarM39700t2, et91.f62670a, rr60VarM39700t3, rr60VarM39700t4, rr60VarM39700t5};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        Integer num = null;
        String str = null;
        String str2 = null;
        z650 z650Var = null;
        kbm0 kbm0Var = null;
        long jMo39227i0 = 0;
        long jMo39227i1 = 0;
        int i = 0;
        boolean z = true;
        boolean zMo39217M = false;
        gt91 gt91Var = null;
        String str3 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z650Var = (z650) frhVarMo29814b.mo39210A(ktz0Var, 0, x650.f258595a, z650Var);
                    i |= 1;
                    break;
                case 1:
                    kbm0Var = (kbm0) frhVarMo29814b.mo39211B(ktz0Var, 1, ibm0.f100610a, kbm0Var);
                    i |= 2;
                    break;
                case 2:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 2);
                    i |= 4;
                    continue;
                case 3:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 3);
                    i |= 8;
                    continue;
                case 4:
                    jMo39227i1 = frhVarMo29814b.mo39227i0(ktz0Var, 4);
                    i |= 16;
                    continue;
                case 5:
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 5, e450.f55982a, num);
                    i |= 32;
                    break;
                case 6:
                    gt91Var = (gt91) frhVarMo29814b.mo39210A(ktz0Var, 6, et91.f62670a, gt91Var);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 7, ql51.f189738a, str3);
                    i |= 128;
                    break;
                case 8:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 8, ql51.f189738a, str);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 9, ql51.f189738a, str2);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
            z = z;
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new d850(i, z650Var, kbm0Var, zMo39217M, jMo39227i0, jMo39227i1, num, gt91Var, str3, str, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        d850 d850Var = (d850) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        x650 x650Var = x650.f258595a;
        z650 z650Var = d850Var.f46380a;
        String str = d850Var.f46389t;
        String str2 = d850Var.f46388i;
        String str3 = d850Var.f46387h;
        gt91 gt91Var = d850Var.f46386g;
        Integer num = d850Var.f46385f;
        long j = d850Var.f46384e;
        long j2 = d850Var.f46383d;
        boolean z = d850Var.f46382c;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, x650Var, z650Var);
        hrhVarMo35820b.mo44943s(ktz0Var, 1, ibm0.f100610a, d850Var.f46381b);
        if (hrhVarMo35820b.mo48399d0() || !z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 2, z);
        }
        if (hrhVarMo35820b.mo48399d0() || j2 != 0) {
            hrhVarMo35820b.mo44942l(ktz0Var, 3, j2);
        }
        if (hrhVarMo35820b.mo48399d0() || j != 0) {
            hrhVarMo35820b.mo44942l(ktz0Var, 4, j);
        }
        if (hrhVarMo35820b.mo48399d0() || num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, e450.f55982a, num);
        }
        if (hrhVarMo35820b.mo48399d0()) {
            hrhVarMo35820b.mo44941k(ktz0Var, 6, et91.f62670a, gt91Var);
        } else {
            gt91.Companion.getClass();
            if (!wj50.m88271j(gt91Var, gt91.f84115e)) {
                hrhVarMo35820b.mo44941k(ktz0Var, 6, et91.f62670a, gt91Var);
            }
        }
        if (hrhVarMo35820b.mo48399d0() || str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, ql51.f189738a, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 9, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
