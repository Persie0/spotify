package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class klb implements mlb {

    /* JADX INFO: renamed from: a */
    public final String f123851a;

    public klb(String str) {
        this.f123851a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m56821a() {
        return this.f123851a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klb) && wj50.m88271j(this.f123851a, ((klb) obj).f123851a);
    }

    public final int hashCode() {
        return this.f123851a.hashCode();
    }
}
