package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ie4 implements uzv {
    NEVER("never"),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS("always"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_LAST_MODIFIED_DATE_CHANGED("onLastModifiedDateChanged");


    /* JADX INFO: renamed from: a */
    public final String f101314a;

    ie4(String str) {
        this.f101314a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f101314a;
    }
}
