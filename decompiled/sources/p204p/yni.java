package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yni {

    /* JADX INFO: renamed from: a */
    public final String f274461a;

    public yni(String str) {
        this.f274461a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yni) && wj50.m88271j(this.f274461a, ((yni) obj).f274461a);
    }

    public final int hashCode() {
        String str = this.f274461a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
