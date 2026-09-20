package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tyc implements uyc {

    /* JADX INFO: renamed from: a */
    public final String f224912a;

    public /* synthetic */ tyc() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyc) && wj50.m88271j(this.f224912a, ((tyc) obj).f224912a);
    }

    public final int hashCode() {
        String str = this.f224912a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public tyc(String str) {
        this.f224912a = str;
    }
}
