package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y2y0 implements sjx0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f268695a;

    public y2y0(ezm ezmVar) {
        this.f268695a = ezmVar;
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: a */
    public final boolean mo48695a(roa roaVar) {
        String strM76033c = roaVar.m76033c();
        return "com.samsung.android.honeyboard".equals(strM76033c) || "com.samsung.android.icecone".equals(strM76033c);
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: b */
    public final l8d0 mo48696b() {
        return (l8d0) this.f268695a.get();
    }
}
