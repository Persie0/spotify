package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class tjx extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ in71 f221026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ujx f221027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjx(in71 in71Var, ujx ujxVar, int i) {
        super(1);
        this.f221025a = i;
        this.f221026b = in71Var;
        this.f221027c = ujxVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f221025a) {
            case 0:
                ArrayList arrayList = this.f221026b.f103887a;
                ujx ujxVar = this.f221027c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jap0 jap0Var = (jap0) ujxVar.f231172c.remove((String) it.next());
                    if (jap0Var != null) {
                        synchronized (jap0Var) {
                            c95.m31855u(jap0Var.f110513j);
                            jap0Var.f110514k = true;
                            jap0Var.m52847a(false);
                        }
                    }
                }
                return w2a1.f247311a;
            default:
                in71 in71Var = this.f221026b;
                if (in71Var != null) {
                    this.f221027c.m83298c(in71Var);
                }
                return w2a1.f247311a;
        }
    }
}
