package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f203345a;

    public rwh(String str) {
        this.f203345a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwh) && wj50.m88271j(this.f203345a, ((rwh) obj).f203345a);
    }

    public final int hashCode() {
        return this.f203345a.hashCode();
    }
}
