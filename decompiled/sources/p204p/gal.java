package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gal implements hal {

    /* JADX INFO: renamed from: a */
    public final String f78067a;

    public gal(String str) {
        this.f78067a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gal) && wj50.m88271j(this.f78067a, ((gal) obj).f78067a);
    }

    public final int hashCode() {
        return this.f78067a.hashCode();
    }
}
