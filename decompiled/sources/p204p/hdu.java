package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class hdu extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ idu f90226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hdu(idu iduVar, int i) {
        super(4);
        this.f90225a = i;
        this.f90226b = iduVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f90225a) {
            case 0:
                ((Number) obj3).intValue();
                return new xdg0(new geg0(this.f90226b.f101238d));
            default:
                xdg0 xdg0Var = (xdg0) obj;
                edu eduVar = (edu) obj4;
                if (!eduVar.equals(cdu.f36949a)) {
                    if (eduVar.equals(ddu.f47869a)) {
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), xdg0Var.f260488a, st91.f213865b, System.currentTimeMillis());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str = (String) this.f90226b.f101244t.getValue();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), xdg0Var.f260488a, st91.f213865b, System.currentTimeMillis());
        }
    }
}
