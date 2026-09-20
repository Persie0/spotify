package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nhb1 implements xhb1 {

    /* JADX INFO: renamed from: a */
    public final String f153919a;

    public nhb1(String str) {
        this.f153919a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhb1) && wj50.m88271j(this.f153919a, ((nhb1) obj).f153919a);
    }

    public final int hashCode() {
        return this.f153919a.hashCode();
    }
}
