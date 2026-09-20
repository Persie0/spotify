package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class el01 extends fl01 {

    /* JADX INFO: renamed from: a */
    public final String f60564a;

    public el01(String str) {
        this.f60564a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el01) && wj50.m88271j(this.f60564a, ((el01) obj).f60564a);
    }

    public final int hashCode() {
        return this.f60564a.hashCode();
    }
}
