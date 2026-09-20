package p204p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class rak implements z6f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197335a;

    public /* synthetic */ rak(int i) {
        this.f197335a = i;
    }

    @Override // p204p.z6f0
    public final Set create() {
        switch (this.f197335a) {
            case 0:
                return Collections.singleton(new omv(qpv0.f191387a.mo54112b(qak.class)));
            case 1:
                return Collections.singleton(new omv(qpv0.f191387a.mo54112b(omp0.class)));
            case 2:
                jqv0 jqv0Var = qpv0.f191387a;
                return bk5.m29624m1(new omv[]{new omv(jqv0Var.mo54112b(rer0.class)), new omv(jqv0Var.mo54112b(y511.class)), new omv(jqv0Var.mo54112b(skx0.class))});
            default:
                jqv0 jqv0Var2 = qpv0.f191387a;
                return bk5.m29624m1(new omv[]{new omv(jqv0Var2.mo54112b(pad1.class)), new omv(jqv0Var2.mo54112b(ved1.class))});
        }
    }
}
