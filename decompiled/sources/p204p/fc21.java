package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fc21 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67971a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67972b;

    public fc21(yfk yfkVar) {
        this.f67972b = yfkVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f67971a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                    break;
                } while (((gc21) this.f67972b).m44280j());
                return;
            default:
                ((yfk) this.f67972b).invoke();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc21(gc21 gc21Var) {
        super("ExoPlayer:SimpleDecoder");
        this.f67972b = gc21Var;
    }
}
