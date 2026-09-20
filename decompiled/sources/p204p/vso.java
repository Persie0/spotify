package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vso {

    /* JADX INFO: renamed from: a */
    public final Integer f244473a;

    public vso(Integer num) {
        this.f244473a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vso) && wj50.m88271j(this.f244473a, ((vso) obj).f244473a);
    }

    public final int hashCode() {
        Integer num = this.f244473a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
