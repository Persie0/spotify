package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y2i {

    /* JADX INFO: renamed from: a */
    public final String f268620a;

    public y2i(String str) {
        this.f268620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2i) && wj50.m88271j(this.f268620a, ((y2i) obj).f268620a);
    }

    public final int hashCode() {
        return this.f268620a.hashCode();
    }
}
