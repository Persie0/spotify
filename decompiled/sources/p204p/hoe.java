package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hoe {

    /* JADX INFO: renamed from: a */
    public final String f93515a;

    public hoe(String str) {
        this.f93515a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hoe) && wj50.m88271j(this.f93515a, ((hoe) obj).f93515a);
    }

    public final int hashCode() {
        return this.f93515a.hashCode();
    }
}
