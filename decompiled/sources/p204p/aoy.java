package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aoy implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f17790a;

    public aoy(String str) {
        this.f17790a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aoy) && wj50.m88271j(this.f17790a, ((aoy) obj).f17790a);
    }

    public final int hashCode() {
        return this.f17790a.hashCode();
    }
}
