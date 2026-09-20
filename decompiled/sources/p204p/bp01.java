package p204p;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bp01 {
    /* JADX INFO: renamed from: a */
    public abstract fq01 mo30099a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC2524w8 mo30100b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bp01) {
            return wj50.m88271j(mo30099a(), ((bp01) obj).mo30099a());
        }
        return false;
    }

    public final int hashCode() {
        return mo30099a().hashCode();
    }
}
