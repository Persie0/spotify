package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final String f103212a;

    public iku0(String str) {
        this.f103212a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iku0) && wj50.m88271j(this.f103212a, ((iku0) obj).f103212a);
    }

    public final int hashCode() {
        return this.f103212a.hashCode();
    }
}
