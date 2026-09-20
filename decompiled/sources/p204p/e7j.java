package p204p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class e7j extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f7j f56945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7j(f7j f7jVar, int i) {
        super(1);
        this.f56944a = i;
        this.f56945b = f7jVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f56944a) {
            case 0:
                eh00 eh00Var = (eh00) obj;
                if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
                    eh00Var.invoke();
                } else {
                    f7j f7jVar = this.f56945b;
                    Handler handler = f7jVar.f66692b;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        f7jVar.f66692b = handler;
                    }
                    handler.post(new dz3(5, eh00Var));
                }
                break;
            default:
                this.f56945b.f66694d = true;
                break;
        }
        return w2a1.f247311a;
    }
}
