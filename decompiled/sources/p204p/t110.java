package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t110 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public luy f216049b = luy.f137171c;

    /* JADX INFO: renamed from: c */
    public boolean f216050c;

    /* JADX INFO: renamed from: e */
    public final void m79857e(u110 u110Var) {
        ov21 ov21Var;
        if (!this.f216050c) {
            this.f216049b = this.f216049b.clone();
            this.f216050c = true;
        }
        luy luyVar = this.f216049b;
        luy luyVar2 = u110Var.f225643a;
        luyVar.getClass();
        int i = 0;
        while (true) {
            ov21Var = luyVar2.f137172a;
            if (i >= ov21Var.f170407b.size()) {
                break;
            }
            luyVar.m60042g((Map.Entry) ov21Var.f170407b.get(i));
            i++;
        }
        Iterator it = ov21Var.m68112c().iterator();
        while (it.hasNext()) {
            luyVar.m60042g((Map.Entry) it.next());
        }
    }
}
