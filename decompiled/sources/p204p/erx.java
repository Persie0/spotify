package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class erx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f62214a;

    public erx(String str) {
        this.f62214a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erx) && wj50.m88271j(this.f62214a, ((erx) obj).f62214a);
    }

    public final int hashCode() {
        return this.f62214a.hashCode();
    }
}
