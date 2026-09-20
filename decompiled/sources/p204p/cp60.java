package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum cp60 implements pd50 {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* JADX INFO: renamed from: a */
    public final int f40472a;

    cp60(int i) {
        this.f40472a = i;
    }

    @Override // p204p.pd50
    public final int getNumber() {
        return this.f40472a;
    }
}
