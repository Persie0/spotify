package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class sue implements hc50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f214057a;

    @Override // p204p.hc50
    /* JADX INFO: renamed from: a */
    public final n2x0 mo47096a(kvu0 kvu0Var) {
        switch (this.f214057a) {
            case 0:
                return kvu0Var.m57489b(kvu0Var.f126959e);
            case 1:
                ztw0 ztw0VarM27219b = kvu0Var.f126959e.m27219b();
                ztw0VarM27219b.f286277c.m77929c("Content-Type", "application/json;charset=UTF-8");
                ztw0VarM27219b.f286277c.m77929c("Accept", "application/json;charset=UTF-8");
                return kvu0Var.m57489b(new auw0(ztw0VarM27219b));
            case 2:
                ztw0 ztw0VarM27219b2 = kvu0Var.f126959e.m27219b();
                ztw0VarM27219b2.m96948a(b3b.f22994n);
                return kvu0Var.m57489b(new auw0(ztw0VarM27219b2));
            default:
                String strM29801l0 = bm51.m29801l0(UUID.randomUUID().toString(), "-", "");
                ztw0 ztw0VarM27219b3 = kvu0Var.f126959e.m27219b();
                ztw0VarM27219b3.f286277c.m77929c("X-rid", strM29801l0);
                return kvu0Var.m57489b(new auw0(ztw0VarM27219b3));
        }
    }
}
