package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ytw implements k3x {

    /* JADX INFO: renamed from: a */
    public final Integer f276226a;

    public ytw(Integer num) {
        this.f276226a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytw) && wj50.m88271j(this.f276226a, ((ytw) obj).f276226a);
    }

    public final int hashCode() {
        Integer num = this.f276226a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
