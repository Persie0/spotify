package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tji {

    /* JADX INFO: renamed from: a */
    public final String f220916a;

    public tji(String str) {
        this.f220916a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tji) && wj50.m88271j(this.f220916a, ((tji) obj).f220916a);
    }

    public final int hashCode() {
        return this.f220916a.hashCode();
    }
}
