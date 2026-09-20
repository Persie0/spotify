package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ast extends dst {

    /* JADX INFO: renamed from: a */
    public final String f19497a;

    public ast(String str) {
        this.f19497a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ast) && wj50.m88271j(this.f19497a, ((ast) obj).f19497a);
    }

    public final int hashCode() {
        return this.f19497a.hashCode();
    }
}
