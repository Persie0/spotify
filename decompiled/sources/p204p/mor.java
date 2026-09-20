package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mor extends uor {

    /* JADX INFO: renamed from: a */
    public final String f145733a;

    public mor(String str) {
        this.f145733a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mor) && wj50.m88271j(this.f145733a, ((mor) obj).f145733a);
    }

    public final int hashCode() {
        return this.f145733a.hashCode();
    }
}
