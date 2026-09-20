package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum yzs0 implements pd50 {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: a */
    public final int f277892a;

    yzs0(int i) {
        this.f277892a = i;
    }

    @Override // p204p.pd50
    public final int getNumber() {
        return this.f277892a;
    }
}
