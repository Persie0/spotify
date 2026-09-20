package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f127094a;

    public kwh(String str) {
        this.f127094a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwh) && wj50.m88271j(this.f127094a, ((kwh) obj).f127094a);
    }

    public final int hashCode() {
        return this.f127094a.hashCode();
    }
}
