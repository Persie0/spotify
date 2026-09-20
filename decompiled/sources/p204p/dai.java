package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dai extends nai {

    /* JADX INFO: renamed from: a */
    public final String f47049a;

    public dai(String str) {
        this.f47049a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dai) && wj50.m88271j(this.f47049a, ((dai) obj).f47049a);
    }

    public final int hashCode() {
        return this.f47049a.hashCode();
    }
}
