package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum di4 implements uzv {
    NEVER("never"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_CAR("in_car"),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS("always");


    /* JADX INFO: renamed from: a */
    public final String f49231a;

    di4(String str) {
        this.f49231a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f49231a;
    }
}
