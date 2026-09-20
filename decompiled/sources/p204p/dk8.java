package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dk8 implements mk8 {

    /* JADX INFO: renamed from: a */
    public final String f49922a;

    public dk8(String str) {
        this.f49922a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk8) && wj50.m88271j(this.f49922a, ((dk8) obj).f49922a);
    }

    public final int hashCode() {
        return this.f49922a.hashCode();
    }
}
