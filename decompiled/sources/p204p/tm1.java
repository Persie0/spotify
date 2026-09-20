package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f221564a;

    public tm1(String str) {
        this.f221564a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm1) && wj50.m88271j(this.f221564a, ((tm1) obj).f221564a);
    }

    public final int hashCode() {
        return this.f221564a.hashCode();
    }
}
