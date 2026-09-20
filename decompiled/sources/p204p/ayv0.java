package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ayv0 implements byv0 {

    /* JADX INFO: renamed from: a */
    public final String f21367a;

    public ayv0(String str) {
        this.f21367a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayv0) && wj50.m88271j(this.f21367a, ((ayv0) obj).f21367a);
    }

    public final int hashCode() {
        return this.f21367a.hashCode();
    }
}
