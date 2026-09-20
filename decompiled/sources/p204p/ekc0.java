package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ekc0 extends AbstractC1928h8 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map.Entry f60426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gkc0 f60427c;

    public ekc0(Map.Entry entry, gkc0 gkc0Var) {
        super(false, 0);
        this.f60426b = entry;
        this.f60427c = gkc0Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f60426b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.f60426b;
        return this.f60427c.mo24366b(entry.getKey(), entry.getValue());
    }
}
