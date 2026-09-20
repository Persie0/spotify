package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d8c implements h8c {

    /* JADX INFO: renamed from: a */
    public final String f46423a;

    public d8c(String str) {
        this.f46423a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8c) && wj50.m88271j(this.f46423a, ((d8c) obj).f46423a);
    }

    public final int hashCode() {
        return this.f46423a.hashCode();
    }
}
