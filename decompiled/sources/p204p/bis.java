package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bis implements dis {

    /* JADX INFO: renamed from: a */
    public final String f27536a;

    public bis(String str) {
        this.f27536a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bis) && wj50.m88271j(this.f27536a, ((bis) obj).f27536a);
    }

    public final int hashCode() {
        return this.f27536a.hashCode();
    }
}
