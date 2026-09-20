package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ztk implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final wtk f286205a;

    public ztk(xtk xtkVar) {
        this.f286205a = new wtk(xtkVar);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f286205a.f254956d.set(true);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
