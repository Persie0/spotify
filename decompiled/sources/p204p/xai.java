package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xai implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f259695a;

    public xai(String str) {
        this.f259695a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xai) && wj50.m88271j(this.f259695a, ((xai) obj).f259695a);
    }

    public final int hashCode() {
        return this.f259695a.hashCode();
    }
}
