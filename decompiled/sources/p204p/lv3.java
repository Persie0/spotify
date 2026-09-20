package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum lv3 implements uzv {
    ONBOARD("onboard"),
    /* JADX INFO: Fake field, exist only in values array */
    BROWSE("browse"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBFEED("subfeed"),
    /* JADX INFO: Fake field, exist only in values array */
    RE_ONBOARD("re-onboard"),
    /* JADX INFO: Fake field, exist only in values array */
    RE_BROWSE("re-browse");


    /* JADX INFO: renamed from: a */
    public final String f137209a;

    lv3(String str) {
        this.f137209a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f137209a;
    }
}
