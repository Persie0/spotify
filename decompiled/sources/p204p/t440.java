package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class t440 implements jla1, y940, bo50 {

    /* JADX INFO: renamed from: b */
    public static final sy7 f216896b;

    /* JADX INFO: renamed from: c */
    public static final sy7 f216897c;

    /* JADX INFO: renamed from: d */
    public static final sy7 f216898d;

    /* JADX INFO: renamed from: e */
    public static final sy7 f216899e;

    /* JADX INFO: renamed from: f */
    public static final sy7 f216900f;

    /* JADX INFO: renamed from: g */
    public static final sy7 f216901g;

    /* JADX INFO: renamed from: h */
    public static final sy7 f216902h;

    /* JADX INFO: renamed from: i */
    public static final sy7 f216903i;

    /* JADX INFO: renamed from: t */
    public static final sy7 f216904t;

    /* JADX INFO: renamed from: a */
    public final jvl0 f216905a;

    static {
        Class cls = Integer.TYPE;
        f216896b = new sy7("camerax.core.imageCapture.captureMode", cls, null);
        f216897c = new sy7("camerax.core.imageCapture.flashMode", cls, null);
        f216898d = new sy7("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f216899e = new sy7("camerax.core.imageCapture.outputFormat", Integer.class, null);
        f216900f = new sy7("camerax.core.imageCapture.imageReaderProxyProvider", ob40.class, null);
        f216901g = new sy7("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        f216902h = new sy7("camerax.core.imageCapture.flashType", cls, null);
        f216903i = new sy7("camerax.core.imageCapture.screenFlash", q440.class, null);
        f216904t = new sy7("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public t440(jvl0 jvl0Var) {
        this.f216905a = jvl0Var;
    }

    @Override // p204p.eru0
    /* JADX INFO: renamed from: k */
    public final phi mo39834k() {
        return this.f216905a;
    }

    @Override // p204p.t640
    /* JADX INFO: renamed from: l */
    public final int mo49780l() {
        return ((Integer) mo39828c(t640.f217444M)).intValue();
    }
}
