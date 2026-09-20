package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ope0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f167887a;

    public ope0(String str) {
        this.f167887a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ope0) && wj50.m88271j(this.f167887a, ((ope0) obj).f167887a);
    }

    public final int hashCode() {
        return this.f167887a.hashCode();
    }
}
