package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f262341a;

    public xkd(String str) {
        this.f262341a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xkd) && wj50.m88271j(this.f262341a, ((xkd) obj).f262341a);
    }

    public final int hashCode() {
        return this.f262341a.hashCode();
    }
}
