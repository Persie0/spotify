package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ylf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f274006a;

    public ylf(String str) {
        this.f274006a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ylf) && wj50.m88271j(this.f274006a, ((ylf) obj).f274006a);
    }

    public final int hashCode() {
        return this.f274006a.hashCode();
    }
}
