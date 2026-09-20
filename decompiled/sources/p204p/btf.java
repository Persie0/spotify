package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class btf implements ctf {

    /* JADX INFO: renamed from: a */
    public final pvf f30562a;

    public btf(pvf pvfVar) {
        this.f30562a = pvfVar;
    }

    /* JADX INFO: renamed from: a */
    public final pvf m30464a() {
        return this.f30562a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btf) && wj50.m88271j(this.f30562a, ((btf) obj).f30562a);
    }

    public final int hashCode() {
        return this.f30562a.hashCode();
    }
}
