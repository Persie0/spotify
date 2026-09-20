package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hw61 implements mw61 {

    /* JADX INFO: renamed from: a */
    public final String f95870a;

    public hw61(String str) {
        this.f95870a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw61) && wj50.m88271j(this.f95870a, ((hw61) obj).f95870a);
    }

    public final int hashCode() {
        return this.f95870a.hashCode();
    }
}
