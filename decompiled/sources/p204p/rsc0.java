package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rsc0 implements usc0 {

    /* JADX INFO: renamed from: a */
    public final String f202284a;

    public rsc0(String str) {
        this.f202284a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsc0) && wj50.m88271j(this.f202284a, ((rsc0) obj).f202284a);
    }

    public final int hashCode() {
        String str = this.f202284a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
