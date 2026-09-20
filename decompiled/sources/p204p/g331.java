package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g331 {

    /* JADX INFO: renamed from: a */
    public final Boolean f76084a;

    public g331(Boolean bool) {
        this.f76084a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g331) && wj50.m88271j(this.f76084a, ((g331) obj).f76084a);
    }

    public final int hashCode() {
        Boolean bool = this.f76084a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
