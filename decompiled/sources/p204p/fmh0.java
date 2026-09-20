package p204p;

import android.os.Build;
import android.os.Handler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes5.dex */
public final class fmh0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gmh0 f71053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fmh0(gmh0 gmh0Var, int i) {
        super(0);
        this.f71052a = i;
        this.f71053b = gmh0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int iM71695f;
        switch (this.f71052a) {
            case 0:
                i26 i26Var = this.f71053b.f81405d;
                gx6 gx6Var = (gx6) i26Var.f97754d;
                hz6 hz6Var = (hz6) i26Var.f97752b;
                Object objM23798h = ((BehaviorSubject) i26Var.f97753c).m23798h();
                qx6 qx6Var = qx6.f193523a;
                if (objM23798h != qx6Var) {
                    if (Build.VERSION.SDK_INT < 26) {
                        iM71695f = ((pz6) hz6Var).m71694e(gx6Var, 3, 1, 5);
                    } else {
                        int i = 29;
                        pz6 pz6Var = (pz6) hz6Var;
                        iM71695f = pz6Var.m71695f(new dy0(1, (Boolean) null, new pgq0(i, (Object) 2, (Object) 1), gx6Var, (Handler) null, (Boolean) null), 5);
                    }
                    if (iM71695f == 1) {
                        i26Var.m49468o(qx6Var);
                    }
                }
                break;
            default:
                i26 i26Var2 = this.f71053b.f81405d;
                BehaviorSubject behaviorSubject = (BehaviorSubject) i26Var2.f97753c;
                if (behaviorSubject.m23798h() == qx6.f193523a) {
                    ((pz6) ((hz6) i26Var2.f97752b)).m71690a(5, (gx6) i26Var2.f97754d);
                    behaviorSubject.onNext(qx6.f193524b);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
