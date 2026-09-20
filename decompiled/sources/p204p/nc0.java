package p204p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class nc0 implements y8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152382a;

    /* JADX INFO: renamed from: b */
    public Object f152383b;

    @Override // p204p.y8j
    public final void accept(Object obj) {
        Object c6x0Var;
        switch (this.f152382a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sc0 sc0Var = (sc0) this.f152383b;
                sc0Var.f207619g.m39516c(sc0.f207612i[1], sc0Var, bool);
                return;
            case 1:
                ih41 ih41Var = (ih41) this.f152383b;
                voc1 voc1Var = x92.f259259b;
                if (y0h1.m92580r((Intent) obj)) {
                    f92 f92Var = new f92(xoc1.f263917J6.f243453a, null);
                    if (ih41Var.f102170d.m47500b(f92Var, vb91.f239444a)) {
                        return;
                    }
                    hh41.m47498d(ih41Var.f102170d, f92Var);
                    return;
                }
                return;
            case 2:
                ((y8j) this.f152383b).accept(obj);
                return;
            case 3:
                ((gh00) this.f152383b).invoke(((e9u) obj).f57534a);
                return;
            case 4:
                uzz uzzVar = (uzz) obj;
                if (uzzVar == null) {
                    uzzVar = new uzz(-3);
                }
                ((nt7) this.f152383b).m65608k(uzzVar);
                return;
            case 5:
                uzz uzzVar2 = (uzz) obj;
                synchronized (vzz.f246596c) {
                    try {
                        ab21 ab21Var = vzz.f246597d;
                        ArrayList arrayList = (ArrayList) ab21Var.get((String) this.f152383b);
                        if (arrayList == null) {
                            return;
                        }
                        ab21Var.remove((String) this.f152383b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((y8j) arrayList.get(i)).accept(uzzVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                Intent intent = (Intent) obj;
                wmv0 wmv0Var = (wmv0) this.f152383b;
                Activity activity = wmv0Var.f252992a;
                if (intent.getBooleanExtra("is_internal_navigation", false)) {
                    return;
                }
                activity.setIntent(intent);
                try {
                    c6x0Var = ze0.m95952r0(activity);
                    break;
                } catch (Throwable th2) {
                    c6x0Var = new c6x0(th2);
                }
                wmv0Var.f252993b = (Uri) (c6x0Var instanceof c6x0 ? null : c6x0Var);
                return;
        }
    }

    public /* synthetic */ nc0(Object obj, int i) {
        this.f152382a = i;
        this.f152383b = obj;
    }
}
