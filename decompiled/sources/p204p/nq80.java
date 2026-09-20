package p204p;

import com.spotify.listuxplatform.datasourceimpl.ListDataSourceImpl$UnknownErrorException;

/* JADX INFO: loaded from: classes7.dex */
public final class nq80 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tq80 f157193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq80(tq80 tq80Var, int i) {
        super(1);
        this.f157192a = i;
        this.f157193b = tq80Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f157192a) {
            case 0:
                j2x0 j2x0Var = (j2x0) obj;
                if (tq80.m81303a(this.f157193b, j2x0Var)) {
                    return new ysk(new eyd1(), 27);
                }
                throw new ListDataSourceImpl$UnknownErrorException(j2x0Var.mo27977b());
            case 1:
                j2x0 j2x0Var2 = (j2x0) obj;
                tq80 tq80Var = this.f157193b;
                if (tq80.m81303a(tq80Var, j2x0Var2)) {
                    return new ysk(tq80Var.f222774y, 27);
                }
                throw new ListDataSourceImpl$UnknownErrorException(j2x0Var2.mo27977b());
            case 2:
                j2x0 j2x0Var3 = (j2x0) obj;
                tq80 tq80Var2 = this.f157193b;
                if (tq80.m81303a(tq80Var2, j2x0Var3)) {
                    return new ysk(tq80Var2.f222774y, 27);
                }
                throw new ListDataSourceImpl$UnknownErrorException(j2x0Var3.mo27977b());
            default:
                j2x0 j2x0Var4 = (j2x0) obj;
                tq80 tq80Var3 = this.f157193b;
                if (tq80.m81303a(tq80Var3, j2x0Var4)) {
                    return new ysk(tq80Var3.f222774y, 27);
                }
                throw new ListDataSourceImpl$UnknownErrorException(j2x0Var4.mo27977b());
        }
    }
}
