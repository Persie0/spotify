package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qkr implements hc80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189635a;

    /* JADX INFO: renamed from: b */
    public final oc80 f189636b;

    public qkr(int i) {
        this.f189635a = i;
        switch (i) {
            case 1:
                this.f189636b = new oc80(this, true);
                break;
            default:
                this.f189636b = new oc80(this, true);
                break;
        }
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        switch (this.f189635a) {
            case 0:
                break;
        }
        return this.f189636b;
    }
}
