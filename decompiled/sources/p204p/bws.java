package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bws implements jws {

    /* JADX INFO: renamed from: a */
    public final Integer f31691a;

    public bws(Integer num) {
        this.f31691a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bws) && wj50.m88271j(this.f31691a, ((bws) obj).f31691a);
    }

    public final int hashCode() {
        Integer num = this.f31691a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
