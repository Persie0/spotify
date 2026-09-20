package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hnv0 {

    /* JADX INFO: renamed from: a */
    public final qho f93396a;

    /* JADX INFO: renamed from: b */
    public final qho f93397b;

    public hnv0(qho qhoVar, qho qhoVar2) {
        this.f93396a = qhoVar;
        this.f93397b = qhoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnv0)) {
            return false;
        }
        hnv0 hnv0Var = (hnv0) obj;
        return wj50.m88271j(this.f93396a, hnv0Var.f93396a) && wj50.m88271j(this.f93397b, hnv0Var.f93397b);
    }

    public final int hashCode() {
        return this.f93397b.hashCode() + (this.f93396a.hashCode() * 31);
    }
}
