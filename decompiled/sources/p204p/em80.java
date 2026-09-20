package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class em80 implements fm80 {

    /* JADX INFO: renamed from: a */
    public final String f60851a;

    public em80(String str) {
        this.f60851a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em80) && wj50.m88271j(this.f60851a, ((em80) obj).f60851a);
    }

    public final int hashCode() {
        return this.f60851a.hashCode();
    }
}
