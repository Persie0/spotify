package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hl01 implements tl01 {

    /* JADX INFO: renamed from: a */
    public final String f92575a;

    public hl01(String str) {
        this.f92575a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl01) && wj50.m88271j(this.f92575a, ((hl01) obj).f92575a);
    }

    public final int hashCode() {
        return this.f92575a.hashCode();
    }
}
