package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pec {

    /* JADX INFO: renamed from: a */
    public final String f176699a;

    public pec(String str) {
        this.f176699a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pec) && wj50.m88271j(this.f176699a, ((pec) obj).f176699a);
    }

    public final int hashCode() {
        return this.f176699a.hashCode();
    }
}
