package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cai extends nai {

    /* JADX INFO: renamed from: a */
    public final String f35821a;

    public cai(String str) {
        this.f35821a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cai) && wj50.m88271j(this.f35821a, ((cai) obj).f35821a);
    }

    public final int hashCode() {
        return this.f35821a.hashCode();
    }
}
