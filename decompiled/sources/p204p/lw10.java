package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lw10 {

    /* JADX INFO: renamed from: a */
    public final Integer f137432a;

    public lw10(Integer num) {
        this.f137432a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw10) && wj50.m88271j(this.f137432a, ((lw10) obj).f137432a);
    }

    public final int hashCode() {
        Integer num = this.f137432a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
