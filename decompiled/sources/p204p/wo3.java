package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class wo3 implements lho {

    /* JADX INFO: renamed from: b */
    public static final oho f253362b = new oho(w2a1.f247311a, null);

    /* JADX INFO: renamed from: a */
    public final lho f253363a;

    public wo3(lho lhoVar) {
        this.f253363a = lhoVar;
    }

    @Override // p204p.lho
    /* JADX INFO: renamed from: a */
    public final qho mo25349a(Map map) {
        return f253362b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lho) {
            return wj50.m88271j(this.f253363a.getItems(), ((lho) obj).getItems());
        }
        return false;
    }

    @Override // p204p.lho
    public final List getItems() {
        return this.f253363a.getItems();
    }

    public final int hashCode() {
        return this.f253363a.getItems().hashCode();
    }
}
