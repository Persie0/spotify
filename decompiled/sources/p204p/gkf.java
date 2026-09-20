package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gkf implements lkf {

    /* JADX INFO: renamed from: a */
    public final String f80795a;

    public gkf(String str) {
        this.f80795a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkf) && wj50.m88271j(this.f80795a, ((gkf) obj).f80795a);
    }

    public final int hashCode() {
        return this.f80795a.hashCode();
    }
}
