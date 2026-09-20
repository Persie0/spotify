package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pte1 implements vte1 {

    /* JADX INFO: renamed from: a */
    public final String f181142a;

    public pte1(String str) {
        this.f181142a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pte1) && wj50.m88271j(this.f181142a, ((pte1) obj).f181142a);
    }

    public final int hashCode() {
        return this.f181142a.hashCode();
    }
}
