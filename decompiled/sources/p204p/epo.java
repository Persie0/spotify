package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum epo implements uzv {
    /* JADX INFO: Fake field, exist only in values array */
    GREEN("green"),
    /* JADX INFO: Fake field, exist only in values array */
    WHITE("white"),
    /* JADX INFO: Fake field, exist only in values array */
    RED("red"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE("blue"),
    DEFAULT("default");


    /* JADX INFO: renamed from: a */
    public final String f61681a;

    epo(String str) {
        this.f61681a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f61681a;
    }
}
