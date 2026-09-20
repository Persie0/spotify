package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class loo {

    /* JADX INFO: renamed from: a */
    public final String f135484a;

    public loo(String str) {
        this.f135484a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loo) && wj50.m88271j(this.f135484a, ((loo) obj).f135484a);
    }

    public final int hashCode() {
        return this.f135484a.hashCode();
    }
}
