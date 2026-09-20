package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ik91 {

    /* JADX INFO: renamed from: a */
    public final String f103076a;

    public ik91(String str) {
        this.f103076a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik91) && wj50.m88271j(this.f103076a, ((ik91) obj).f103076a);
    }

    public final int hashCode() {
        return this.f103076a.hashCode();
    }
}
