package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wul0 {

    /* JADX INFO: renamed from: a */
    public final Object f255227a;

    public wul0(Object obj) {
        this.f255227a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wul0) && wj50.m88271j(this.f255227a, ((wul0) obj).f255227a);
    }

    public final int hashCode() {
        Object obj = this.f255227a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
