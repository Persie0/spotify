package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uyz0 implements vyz0 {

    /* JADX INFO: renamed from: a */
    public final String f235395a;

    public uyz0(String str) {
        this.f235395a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uyz0) && wj50.m88271j(this.f235395a, ((uyz0) obj).f235395a);
    }

    public final int hashCode() {
        return this.f235395a.hashCode();
    }
}
