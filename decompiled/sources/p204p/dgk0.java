package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum dgk0 implements od50 {
    CONTROLS_MODE_OVERRIDE_UNSPECIFIED(0),
    CONTROLS_MODE_OVERRIDE_CHAPTER_SKIP_ENABLED(1),
    CONTROLS_MODE_OVERRIDE_NPV_CONTENT_LAYER_TAP_SKIP_15S(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f48827a;

    dgk0(int i) {
        this.f48827a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f48827a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
