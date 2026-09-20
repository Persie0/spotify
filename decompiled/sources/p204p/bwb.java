package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bwb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xvb f31604b;

    public /* synthetic */ bwb(xvb xvbVar, int i) {
        this.f31603a = i;
        this.f31604b = xvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31603a) {
            case 0:
                this.f31604b.m92224m();
                break;
            case 1:
                xvb xvbVar = this.f31604b;
                if (xvbVar != null) {
                    xvbVar.m92224m();
                }
                break;
            default:
                this.f31604b.m92224m();
                break;
        }
    }
}
