package p204p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lag1 extends dag1 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f131342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lag1(gz8 gz8Var, int i) {
        super(gz8Var);
        this.f131342m = i;
    }

    @Override // p204p.e6f1, p204p.k0g1
    /* JADX INFO: renamed from: C0 */
    public void mo37935C0(DataHolder dataHolder) {
        switch (this.f131342m) {
            case 4:
                m35481c2(new rfo(dataHolder));
                break;
            default:
                super.mo37935C0(dataHolder);
                break;
        }
    }

    @Override // p204p.e6f1, p204p.k0g1
    /* JADX INFO: renamed from: D */
    public void mo37936D(cxf1 cxf1Var) {
        switch (this.f131342m) {
            case 2:
                m35481c2(new c6g1(jjf1.m53570v(cxf1Var.f43025a), cxf1Var.f43026b));
                break;
            default:
                super.mo37936D(cxf1Var);
                break;
        }
    }

    @Override // p204p.e6f1, p204p.k0g1
    /* JADX INFO: renamed from: Z1 */
    public void mo37938Z1(yxf1 yxf1Var) {
        switch (this.f131342m) {
            case 3:
                ArrayList arrayList = new ArrayList();
                List list = yxf1Var.f277246b;
                if (list != null) {
                    arrayList.addAll(list);
                }
                m35481c2(new d5g1(jjf1.m53570v(yxf1Var.f277245a), arrayList));
                break;
            default:
                super.mo37938Z1(yxf1Var);
                break;
        }
    }

    @Override // p204p.e6f1, p204p.k0g1
    /* JADX INFO: renamed from: a1 */
    public void mo37939a1(utf1 utf1Var) {
        switch (this.f131342m) {
            case 0:
                m35481c2(new eqf1(jjf1.m53570v(utf1Var.f233911a), utf1Var.f233912b));
                break;
            default:
                super.mo37939a1(utf1Var);
                break;
        }
    }

    @Override // p204p.e6f1, p204p.k0g1
    /* JADX INFO: renamed from: n */
    public void mo37940n(euf1 euf1Var) {
        switch (this.f131342m) {
            case 1:
                Status statusM53570v = jjf1.m53570v(euf1Var.f62973a);
                List<sgf1> list = euf1Var.f62974b;
                HashMap map = new HashMap();
                if (list != null) {
                    for (sgf1 sgf1Var : list) {
                        map.put(sgf1Var.f208864b, new h8f1(sgf1Var));
                    }
                }
                m35481c2(new x8f1(statusM53570v, map));
                break;
            default:
                super.mo37940n(euf1Var);
                break;
        }
    }
}
