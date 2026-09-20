package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yt2 implements fu2 {

    /* JADX INFO: renamed from: a */
    public final String f275927a;

    public yt2(String str) {
        this.f275927a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt2) && wj50.m88271j(this.f275927a, ((yt2) obj).f275927a);
    }

    public final int hashCode() {
        return this.f275927a.hashCode() * 31;
    }
}
