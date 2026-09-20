package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gfb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final String f79320a;

    public gfb0(String str) {
        this.f79320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfb0) && wj50.m88271j(this.f79320a, ((gfb0) obj).f79320a);
    }

    public final int hashCode() {
        return this.f79320a.hashCode();
    }
}
