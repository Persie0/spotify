package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f178446a;

    public pkd(String str) {
        this.f178446a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkd) && wj50.m88271j(this.f178446a, ((pkd) obj).f178446a);
    }

    public final int hashCode() {
        return this.f178446a.hashCode();
    }
}
