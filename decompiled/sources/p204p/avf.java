package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class avf {

    /* JADX INFO: renamed from: a */
    public final String f20180a;

    public avf(String str) {
        this.f20180a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avf) && wj50.m88271j(this.f20180a, ((avf) obj).f20180a);
    }

    public final int hashCode() {
        return this.f20180a.hashCode();
    }
}
