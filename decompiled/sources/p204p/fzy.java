package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fzy {

    /* JADX INFO: renamed from: a */
    public final String f75203a;

    public fzy(String str) {
        this.f75203a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzy) && wj50.m88271j(this.f75203a, ((fzy) obj).f75203a);
    }

    public final int hashCode() {
        return this.f75203a.hashCode();
    }
}
