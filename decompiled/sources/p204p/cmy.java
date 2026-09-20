package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cmy implements hmy {

    /* JADX INFO: renamed from: a */
    public final String f39812a;

    public cmy(String str) {
        this.f39812a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmy) && wj50.m88271j(this.f39812a, ((cmy) obj).f39812a);
    }

    public final int hashCode() {
        return this.f39812a.hashCode();
    }
}
