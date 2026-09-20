package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ff30 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f68890a;

    public ff30(String str) {
        this.f68890a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff30) && wj50.m88271j(this.f68890a, ((ff30) obj).f68890a);
    }

    public final int hashCode() {
        return this.f68890a.hashCode();
    }
}
