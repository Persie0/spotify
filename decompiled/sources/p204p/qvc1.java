package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qvc1 implements uvc1 {

    /* JADX INFO: renamed from: a */
    public final String f192968a;

    public qvc1(String str) {
        this.f192968a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvc1) && wj50.m88271j(this.f192968a, ((qvc1) obj).f192968a);
    }

    public final int hashCode() {
        return this.f192968a.hashCode();
    }
}
