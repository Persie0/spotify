package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qtb {

    /* JADX INFO: renamed from: a */
    public final String f192355a;

    public qtb(String str) {
        this.f192355a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qtb) && wj50.m88271j(this.f192355a, ((qtb) obj).f192355a);
    }

    public final int hashCode() {
        return this.f192355a.hashCode();
    }
}
