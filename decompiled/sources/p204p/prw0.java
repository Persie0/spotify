package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class prw0 implements qrw0 {

    /* JADX INFO: renamed from: a */
    public final String f180691a;

    public prw0(String str) {
        this.f180691a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prw0) && wj50.m88271j(this.f180691a, ((prw0) obj).f180691a);
    }

    public final int hashCode() {
        return this.f180691a.hashCode();
    }
}
