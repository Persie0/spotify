package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o8e implements c9e {

    /* JADX INFO: renamed from: a */
    public final String f162792a;

    public o8e(String str) {
        this.f162792a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8e) && wj50.m88271j(this.f162792a, ((o8e) obj).f162792a);
    }

    public final int hashCode() {
        return this.f162792a.hashCode();
    }
}
