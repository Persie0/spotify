package p204p;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class f831 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66847b;

    public /* synthetic */ f831(Object obj, int i) {
        this.f66846a = i;
        this.f66847b = obj;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66846a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    va71.m85018c(((y631) this.f66847b).f269600a.m24884a(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, xq00Var, 0, 0, 262142);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                qp4 qp4Var = (qp4) this.f66847b;
                x0h1.m89578u((xuk) qp4Var.f191125c, null, 0, new djz(qp4Var, (String) obj, MotionEvent.obtain((MotionEvent) obj2), null, 5), 3);
                break;
        }
        return w2a1.f247311a;
    }
}
