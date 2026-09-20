package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class krh implements t160 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125650a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f125651b;

    public krh(t160[] t160VarArr) {
        this.f125651b = t160VarArr;
    }

    @Override // p204p.t160
    public final void start() {
        switch (this.f125650a) {
            case 0:
                for (t160 t160Var : (t160[]) this.f125651b) {
                    t160Var.start();
                }
                break;
            default:
                ((krh) this.f125651b).start();
                break;
        }
    }

    @Override // p204p.t160
    public final void stop() {
        switch (this.f125650a) {
            case 0:
                ArrayList arrayList = new ArrayList(new cj5((t160[]) this.f125651b, false));
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((t160) it.next()).stop();
                }
                break;
            default:
                ((krh) this.f125651b).stop();
                break;
        }
    }

    public krh(mb80 mb80Var, bd31 bd31Var, t460 t460Var) {
        this.f125651b = new krh(new t160[]{mb80Var, bd31Var, t460Var});
    }
}
