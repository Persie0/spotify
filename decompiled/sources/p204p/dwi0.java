package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum dwi0 implements od50 {
    NONE(0),
    CANVAS_DISABLED(1),
    LOW_DISTRACTION(2),
    DATA_SAVER(3),
    TRAIT_NOT_RESOLVED(4);


    /* JADX INFO: renamed from: a */
    public final int f53712a;

    dwi0(int i) {
        this.f53712a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f53712a;
    }
}
