package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jpo implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final String f114698a;

    public jpo(String str) {
        this.f114698a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpo) && wj50.m88271j(this.f114698a, ((jpo) obj).f114698a);
    }

    public final int hashCode() {
        return this.f114698a.hashCode();
    }
}
