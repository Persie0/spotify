package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class on1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f167135a;

    public on1(String str) {
        this.f167135a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on1) && wj50.m88271j(this.f167135a, ((on1) obj).f167135a);
    }

    public final int hashCode() {
        String str = this.f167135a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
