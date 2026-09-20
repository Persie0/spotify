package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tj31 {

    /* JADX INFO: renamed from: a */
    public final Long f220823a;

    public tj31(Long l) {
        this.f220823a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj31) && wj50.m88271j(this.f220823a, ((tj31) obj).f220823a);
    }

    public final int hashCode() {
        Long l = this.f220823a;
        return Boolean.hashCode(false) + ((l == null ? 0 : l.hashCode()) * 31);
    }
}
