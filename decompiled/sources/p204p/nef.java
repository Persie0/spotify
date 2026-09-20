package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nef implements pef {

    /* JADX INFO: renamed from: a */
    public final String f152981a;

    public nef(String str) {
        this.f152981a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nef) && wj50.m88271j(this.f152981a, ((nef) obj).f152981a);
    }

    public final int hashCode() {
        return this.f152981a.hashCode();
    }
}
