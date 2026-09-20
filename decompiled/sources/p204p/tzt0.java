package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tzt0 implements uzt0 {

    /* JADX INFO: renamed from: a */
    public final String f225311a;

    public tzt0(String str) {
        this.f225311a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzt0) && wj50.m88271j(this.f225311a, ((tzt0) obj).f225311a);
    }

    public final int hashCode() {
        return this.f225311a.hashCode();
    }
}
