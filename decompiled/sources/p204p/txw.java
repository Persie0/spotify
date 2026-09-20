package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class txw implements z1x {

    /* JADX INFO: renamed from: a */
    public final String f224773a;

    public txw(String str) {
        this.f224773a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txw) && wj50.m88271j(this.f224773a, ((txw) obj).f224773a);
    }

    public final int hashCode() {
        return this.f224773a.hashCode();
    }
}
