package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f222816a;

    public tqh(String str) {
        this.f222816a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqh) && wj50.m88271j(this.f222816a, ((tqh) obj).f222816a);
    }

    public final int hashCode() {
        return this.f222816a.hashCode();
    }
}
