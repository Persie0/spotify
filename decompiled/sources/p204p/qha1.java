package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qha1 {

    /* JADX INFO: renamed from: a */
    public final String f188702a;

    public qha1(String str) {
        this.f188702a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qha1) && wj50.m88271j(this.f188702a, ((qha1) obj).f188702a);
    }

    public final int hashCode() {
        String str = this.f188702a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
