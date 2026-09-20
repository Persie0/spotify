package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tty0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f223700a;

    public tty0(String str) {
        this.f223700a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tty0) && wj50.m88271j(this.f223700a, ((tty0) obj).f223700a);
    }

    public final int hashCode() {
        return this.f223700a.hashCode();
    }
}
