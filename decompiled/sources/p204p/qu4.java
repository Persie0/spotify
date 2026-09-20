package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum qu4 implements uzv {
    DEFAULT("default"),
    /* JADX INFO: Fake field, exist only in values array */
    COOLDOWN("cooldown"),
    /* JADX INFO: Fake field, exist only in values array */
    GLOBAL_COOLDOWN("global_cooldown");


    /* JADX INFO: renamed from: a */
    public final String f192558a;

    qu4(String str) {
        this.f192558a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f192558a;
    }
}
