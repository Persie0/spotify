package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ojv {

    /* JADX INFO: renamed from: a */
    public final String f166146a;

    public ojv(String str) {
        this.f166146a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojv) && wj50.m88271j(this.f166146a, ((ojv) obj).f166146a);
    }

    public final int hashCode() {
        return this.f166146a.hashCode();
    }
}
