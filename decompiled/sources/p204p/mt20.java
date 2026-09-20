package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mt20 implements ot20 {

    /* JADX INFO: renamed from: a */
    public final String f146935a;

    public mt20(String str) {
        this.f146935a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt20) && wj50.m88271j(this.f146935a, ((mt20) obj).f146935a);
    }

    @Override // p204p.ot20
    public final String getImageUrl() {
        return this.f146935a;
    }

    public final int hashCode() {
        return this.f146935a.hashCode();
    }
}
