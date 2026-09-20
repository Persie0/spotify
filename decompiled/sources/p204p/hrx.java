package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hrx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f94548a;

    public hrx(String str) {
        this.f94548a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrx) && wj50.m88271j(this.f94548a, ((hrx) obj).f94548a);
    }

    public final int hashCode() {
        return this.f94548a.hashCode();
    }
}
