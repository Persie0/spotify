package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class olp0 extends plp0 {

    /* JADX INFO: renamed from: a */
    public final String f166872a;

    public olp0(String str) {
        this.f166872a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olp0) && wj50.m88271j(this.f166872a, ((olp0) obj).f166872a);
    }

    public final int hashCode() {
        return this.f166872a.hashCode();
    }
}
