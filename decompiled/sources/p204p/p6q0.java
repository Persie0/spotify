package p204p;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class p6q0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q6q0 f174454b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6q0(q6q0 q6q0Var, int i) {
        super(1);
        this.f174453a = i;
        this.f174454b = q6q0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f174453a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                gh00 gh00Var = this.f174454b.f185904a;
                if (gh00Var != null) {
                    gh00Var.invoke(motionEvent);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                gh00 gh00Var2 = this.f174454b.f185904a;
                if (gh00Var2 != null) {
                    gh00Var2.invoke(motionEvent2);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("onTouchEvent");
                throw null;
        }
    }
}
