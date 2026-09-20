package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cw2 extends fw2 {

    /* JADX INFO: renamed from: a */
    public final String f42605a;

    public cw2(String str) {
        this.f42605a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw2) && wj50.m88271j(this.f42605a, ((cw2) obj).f42605a);
    }

    public final int hashCode() {
        return this.f42605a.hashCode();
    }
}
