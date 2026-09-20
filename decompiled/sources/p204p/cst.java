package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cst extends dst {

    /* JADX INFO: renamed from: a */
    public final String f41690a;

    public cst(String str) {
        this.f41690a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cst) && wj50.m88271j(this.f41690a, ((cst) obj).f41690a);
    }

    public final int hashCode() {
        return this.f41690a.hashCode();
    }
}
