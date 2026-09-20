package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final String f95584a;

    public hv5(String str) {
        this.f95584a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv5) && wj50.m88271j(this.f95584a, ((hv5) obj).f95584a);
    }

    public final int hashCode() {
        String str = this.f95584a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
