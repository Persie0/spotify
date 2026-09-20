package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m801 implements q801 {

    /* JADX INFO: renamed from: a */
    public final String f140892a;

    public m801(String str) {
        this.f140892a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m801) && wj50.m88271j(this.f140892a, ((m801) obj).f140892a);
    }

    public final int hashCode() {
        return this.f140892a.hashCode();
    }
}
