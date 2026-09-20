package p204p;

import java.util.Map;

/* JADX INFO: renamed from: p.ox */
/* JADX INFO: loaded from: classes7.dex */
public final class C2231ox implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2401t5 f170815b;

    public /* synthetic */ C2231ox(C2401t5 c2401t5, int i) {
        this.f170814a = i;
        this.f170815b = c2401t5;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f170814a) {
            case 0:
                Map map = (Map) obj;
                if (!map.isEmpty()) {
                    this.f170815b.invoke(map);
                }
                break;
            default:
                Map map2 = (Map) obj;
                if (!map2.isEmpty()) {
                    this.f170815b.invoke(map2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
