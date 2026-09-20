package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wae0 implements xae0 {

    /* JADX INFO: renamed from: a */
    public final String f249460a;

    public wae0(String str) {
        this.f249460a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wae0) && wj50.m88271j(this.f249460a, ((wae0) obj).f249460a);
    }

    public final int hashCode() {
        return this.f249460a.hashCode();
    }
}
