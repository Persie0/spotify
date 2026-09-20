package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f7r0 implements h7r0 {

    /* JADX INFO: renamed from: a */
    public final String f66770a;

    public f7r0(String str) {
        this.f66770a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7r0) && wj50.m88271j(this.f66770a, ((f7r0) obj).f66770a);
    }

    public final int hashCode() {
        return this.f66770a.hashCode();
    }
}
