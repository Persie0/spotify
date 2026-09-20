package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rcl implements scl {

    /* JADX INFO: renamed from: a */
    public final String f197890a;

    public rcl(String str) {
        this.f197890a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcl) && wj50.m88271j(this.f197890a, ((rcl) obj).f197890a);
    }

    public final int hashCode() {
        return this.f197890a.hashCode();
    }
}
