package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class soc {

    /* JADX INFO: renamed from: a */
    public final String f211160a;

    public soc(String str) {
        this.f211160a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof soc) && wj50.m88271j(this.f211160a, ((soc) obj).f211160a);
    }

    public final int hashCode() {
        return this.f211160a.hashCode();
    }
}
