package p204p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yp10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f274792b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v85 f274793c;

    public /* synthetic */ yp10(String str, v85 v85Var, int i) {
        this.f274791a = i;
        this.f274792b = str;
        this.f274793c = v85Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f274791a;
        v85 v85Var = this.f274793c;
        String str = this.f274792b;
        switch (i) {
            case 0:
                if (!p2l.f173365a.contains(aq10.class)) {
                    try {
                        aq10.f18053a.m26739c(str, v85Var);
                    } catch (Throwable th) {
                        p2l.m68953a(aq10.class, th);
                        return;
                    }
                    break;
                }
                break;
            default:
                Set set = p2l.f173365a;
                if (!set.contains(ial0.class)) {
                    try {
                        List listSingletonList = Collections.singletonList(v85Var);
                        new0 new0Var = new0.f153138b;
                        if (!set.contains(new0.class)) {
                            try {
                                new0.f153138b.m64310c(str, 2, listSingletonList);
                            } catch (Throwable th2) {
                                p2l.m68953a(new0.class, th2);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        p2l.m68953a(ial0.class, th3);
                    }
                }
                break;
        }
    }
}
