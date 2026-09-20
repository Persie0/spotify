package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tvc1 implements uvc1 {

    /* JADX INFO: renamed from: a */
    public final String f224144a;

    public tvc1(String str) {
        this.f224144a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvc1) && wj50.m88271j(this.f224144a, ((tvc1) obj).f224144a);
    }

    public final int hashCode() {
        return this.f224144a.hashCode();
    }
}
