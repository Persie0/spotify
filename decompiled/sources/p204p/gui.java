package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gui implements hui {

    /* JADX INFO: renamed from: a */
    public final api f84486a;

    public gui(api apiVar) {
        this.f84486a = apiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gui) && wj50.m88271j(this.f84486a, ((gui) obj).f84486a);
    }

    public final int hashCode() {
        return this.f84486a.hashCode();
    }
}
