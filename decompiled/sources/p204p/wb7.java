package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wb7 implements xb7 {

    /* JADX INFO: renamed from: a */
    public final String f249703a;

    public wb7(String str) {
        this.f249703a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb7) && wj50.m88271j(this.f249703a, ((wb7) obj).f249703a);
    }

    public final int hashCode() {
        return this.f249703a.hashCode();
    }
}
