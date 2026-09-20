package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum j44 implements uzv {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct"),
    /* JADX INFO: Fake field, exist only in values array */
    ALERT("alert"),
    /* JADX INFO: Fake field, exist only in values array */
    ALERT_VIA_SETTINGS("alertViaSettings");


    /* JADX INFO: renamed from: a */
    public final String f108581a;

    j44(String str) {
        this.f108581a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f108581a;
    }
}
