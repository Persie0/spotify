package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qcd implements rcd {

    /* JADX INFO: renamed from: a */
    public final String f187307a;

    public qcd(String str) {
        this.f187307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcd) && wj50.m88271j(this.f187307a, ((qcd) obj).f187307a);
    }

    public final int hashCode() {
        return this.f187307a.hashCode();
    }
}
