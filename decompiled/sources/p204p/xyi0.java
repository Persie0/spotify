package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xyi0 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rv41 f267317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ elh f267318b;

    public xyi0(rv41 rv41Var, elh elhVar) {
        this.f267317a = rv41Var;
        this.f267318b = elhVar;
    }

    @Override // p204p.ewr
    public final void dispose() {
        Iterator it = ((List) this.f267317a.getValue()).iterator();
        while (it.hasNext()) {
            this.f267318b.m39390m((uxi0) it.next());
        }
    }
}
