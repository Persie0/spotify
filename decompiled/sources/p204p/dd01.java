package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dd01 implements fd01 {

    /* JADX INFO: renamed from: a */
    public final Integer f47688a;

    public dd01(int i, Integer num) {
        this.f47688a = num;
    }

    @Override // p204p.fd01
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo35690a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd01) && wj50.m88271j(this.f47688a, ((dd01) obj).f47688a);
    }

    public final int hashCode() {
        Integer num = this.f47688a;
        return (num == null ? 0 : num.hashCode()) * 31;
    }
}
