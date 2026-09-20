package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jk20 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lk20 f113188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk20(lk20 lk20Var, int i) {
        super(1);
        this.f113187a = i;
        this.f113188b = lk20Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f113187a) {
            case 0:
                gk20 gk20Var = (gk20) obj;
                String str = gk20Var.f80684a;
                String str2 = gk20Var.f80685b;
                lj20 lj20Var = gk20Var.f80686c;
                String str3 = lj20Var != null ? lj20Var.f133941a : null;
                Integer num = lj20Var != null ? lj20Var.f133942b : null;
                lk20 lk20Var = this.f113188b;
                return new o640(str, str2, str3, num, (ry8) lk20Var.f134222g, (ry8) lk20Var.f134221f, (ry8) lk20Var.f134220e, (ry8) lk20Var.f134223h, gk20Var.f80687d, (ry8) lk20Var.f134224i, (List) lk20Var.f134214Y, (List) lk20Var.f134215Z, (ry8) lk20Var.f134225t, lk20Var.f134219d, lk20Var.f134217b, 16);
            default:
                return ((rfl) this.f113188b.f134210L0).mo26174a(null);
        }
    }
}
