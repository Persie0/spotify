package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum i0t0 implements pd50 {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* JADX INFO: renamed from: a */
    public final int f97321a;

    i0t0(int i) {
        this.f97321a = i;
    }

    @Override // p204p.pd50
    public final int getNumber() {
        return this.f97321a;
    }
}
