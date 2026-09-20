package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gyw implements z1x {

    /* JADX INFO: renamed from: a */
    public final String f85753a;

    public gyw(String str) {
        this.f85753a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyw) && wj50.m88271j(this.f85753a, ((gyw) obj).f85753a);
    }

    public final int hashCode() {
        return this.f85753a.hashCode();
    }
}
