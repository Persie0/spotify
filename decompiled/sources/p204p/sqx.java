package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sqx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f213182a;

    public sqx(String str) {
        this.f213182a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqx) && wj50.m88271j(this.f213182a, ((sqx) obj).f213182a);
    }

    public final int hashCode() {
        return this.f213182a.hashCode();
    }
}
