package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f286984a;

    public zwh(String str) {
        this.f286984a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zwh) && wj50.m88271j(this.f286984a, ((zwh) obj).f286984a);
    }

    public final int hashCode() {
        return this.f286984a.hashCode();
    }
}
