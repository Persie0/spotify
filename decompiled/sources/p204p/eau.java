package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class eau implements lho {

    /* JADX INFO: renamed from: a */
    public static final oho f57727a = new oho(w2a1.f247311a, null);

    @Override // p204p.lho
    /* JADX INFO: renamed from: a */
    public final qho mo25349a(Map map) {
        return f57727a;
    }

    public final boolean equals(Object obj) {
        List items;
        if (this == obj) {
            return true;
        }
        return (obj instanceof lho) && (items = ((lho) obj).getItems()) != null && items.isEmpty();
    }

    @Override // p204p.lho
    public final List getItems() {
        return lau.f131415a;
    }

    public final int hashCode() {
        return 1;
    }
}
