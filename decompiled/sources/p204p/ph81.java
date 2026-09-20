package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ph81 {

    /* JADX INFO: renamed from: a */
    public final String f177512a;

    public ph81(String str) {
        this.f177512a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph81) && wj50.m88271j(this.f177512a, ((ph81) obj).f177512a);
    }

    public final int hashCode() {
        String str = this.f177512a;
        return Boolean.hashCode(false) + dq60.m36605e(dq60.m36605e(dq60.m36605e((str == null ? 0 : str.hashCode()) * 31, 0L, 31), 0L, 31), 0L, 31);
    }
}
