package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gv9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final String f84672a;

    public gv9(String str) {
        this.f84672a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gv9) && wj50.m88271j(this.f84672a, ((gv9) obj).f84672a);
    }

    public final int hashCode() {
        return this.f84672a.hashCode();
    }
}
