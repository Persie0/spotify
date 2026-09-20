package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum db4 implements uzv {
    US_MARKET("us_market"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_US_MARKET("non_us_market"),
    /* JADX INFO: Fake field, exist only in values array */
    EMPLOYEE_DOGFOODING_MARKET("employee_dogfooding_market"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_AVAILABLE_IN_HEBREW("not_available_in_hebrew");


    /* JADX INFO: renamed from: a */
    public final String f47193a;

    db4(String str) {
        this.f47193a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f47193a;
    }
}
