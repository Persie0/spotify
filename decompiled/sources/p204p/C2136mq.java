package p204p;

/* JADX INFO: renamed from: p.mq */
/* JADX INFO: loaded from: classes17.dex */
public final class C2136mq implements hgm {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1823eq f146123a;

    public C2136mq(InterfaceC1823eq interfaceC1823eq) {
        this.f146123a = interfaceC1823eq;
        interfaceC1823eq.start();
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f146123a.stop();
    }
}
