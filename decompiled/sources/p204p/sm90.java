package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class sm90 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f210589b;

    public /* synthetic */ sm90(int i, gh00 gh00Var) {
        this.f210588a = i;
        this.f210589b = gh00Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f210588a) {
            case 0:
                this.f210589b.invoke(obj);
                break;
            case 1:
                this.f210589b.invoke(obj);
                break;
            case 2:
                gh00 gh00Var = this.f210589b;
                if (gh00Var != null) {
                    gh00Var.invoke(sly0.f210518c);
                }
                break;
            case 3:
                Throwable th = (Throwable) obj;
                gh00 gh00Var2 = this.f210589b;
                if (gh00Var2 != null) {
                    gh00Var2.invoke(th instanceof TimeoutException ? sly0.f210519d : sly0.f210517b);
                }
                break;
            case 4:
                this.f210589b.invoke(obj);
                break;
            default:
                this.f210589b.invoke((d291) obj);
                break;
        }
    }
}
