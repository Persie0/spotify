package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dli implements sli {

    /* JADX INFO: renamed from: a */
    public final String f50211a;

    public dli(String str) {
        this.f50211a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dli) && wj50.m88271j(this.f50211a, ((dli) obj).f50211a);
    }

    public final int hashCode() {
        String str = this.f50211a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
