package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class fkc0 extends r591 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f70524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fkc0(Iterator it, int i) {
        super(it, 0);
        this.f70524c = i;
    }

    @Override // p204p.r591
    /* JADX INFO: renamed from: a */
    public final Object mo41890a(Object obj) {
        switch (this.f70524c) {
            case 0:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
        }
    }
}
