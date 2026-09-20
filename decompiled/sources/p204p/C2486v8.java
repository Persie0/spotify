package p204p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: p.v8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2486v8 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Collection f238348b;

    public /* synthetic */ C2486v8(int i, Collection collection) {
        this.f238347a = i;
        this.f238348b = collection;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f238347a) {
            case 0:
                zContains = this.f238348b.contains(obj);
                break;
            case 1:
                zContains = this.f238348b.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f238348b);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
