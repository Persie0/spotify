package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r541 implements t541 {

    /* JADX INFO: renamed from: a */
    public final String f195965a;

    public r541(String str) {
        this.f195965a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r541) && wj50.m88271j(this.f195965a, ((r541) obj).f195965a);
    }

    public final int hashCode() {
        return this.f195965a.hashCode();
    }
}
