package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cad implements lad {

    /* JADX INFO: renamed from: a */
    public final String f35805a;

    public cad(String str) {
        this.f35805a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cad) && wj50.m88271j(this.f35805a, ((cad) obj).f35805a);
    }

    public final int hashCode() {
        return this.f35805a.hashCode();
    }
}
