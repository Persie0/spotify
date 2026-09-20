package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nms0 implements sms0 {

    /* JADX INFO: renamed from: a */
    public final String f156266a;

    public nms0(String str) {
        this.f156266a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nms0) && wj50.m88271j(this.f156266a, ((nms0) obj).f156266a);
    }

    public final int hashCode() {
        return this.f156266a.hashCode();
    }
}
