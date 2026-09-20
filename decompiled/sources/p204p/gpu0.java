package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gpu0 implements hpu0 {

    /* JADX INFO: renamed from: a */
    public final String f83250a;

    public gpu0(String str) {
        this.f83250a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpu0) && wj50.m88271j(this.f83250a, ((gpu0) obj).f83250a);
    }

    public final int hashCode() {
        return this.f83250a.hashCode();
    }
}
