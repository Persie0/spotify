package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i121 {

    /* JADX INFO: renamed from: a */
    public final Integer f97370a;

    public i121(Integer num) {
        this.f97370a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i121) && wj50.m88271j(this.f97370a, ((i121) obj).f97370a);
    }

    public final int hashCode() {
        Integer num = this.f97370a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
