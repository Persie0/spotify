package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bmc0 extends cmc0 {

    /* JADX INFO: renamed from: a */
    public final String f28500a;

    public bmc0(String str) {
        this.f28500a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmc0) && wj50.m88271j(this.f28500a, ((bmc0) obj).f28500a);
    }

    public final int hashCode() {
        return this.f28500a.hashCode();
    }
}
