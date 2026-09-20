package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class udp0 extends bep0 {

    /* JADX INFO: renamed from: a */
    public final String f229291a;

    public udp0(String str) {
        this.f229291a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udp0) && wj50.m88271j(this.f229291a, ((udp0) obj).f229291a);
    }

    public final int hashCode() {
        String str = this.f229291a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
