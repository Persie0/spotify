package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kvh {

    /* JADX INFO: renamed from: a */
    public final String f126866a;

    public kvh(String str) {
        this.f126866a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvh) && wj50.m88271j(this.f126866a, ((kvh) obj).f126866a);
    }

    public final int hashCode() {
        return this.f126866a.hashCode();
    }
}
