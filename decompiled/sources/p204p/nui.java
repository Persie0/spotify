package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nui extends qui {

    /* JADX INFO: renamed from: a */
    public final String f158655a;

    public nui(String str) {
        this.f158655a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nui) && wj50.m88271j(this.f158655a, ((nui) obj).f158655a);
    }

    public final int hashCode() {
        String str = this.f158655a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
