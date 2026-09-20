package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class spe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f212831a;

    public spe0(String str) {
        this.f212831a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spe0) && wj50.m88271j(this.f212831a, ((spe0) obj).f212831a);
    }

    public final int hashCode() {
        return this.f212831a.hashCode();
    }
}
