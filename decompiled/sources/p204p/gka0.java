package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gka0 extends ika0 {

    /* JADX INFO: renamed from: a */
    public final String f80767a;

    public gka0(String str) {
        this.f80767a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gka0) && wj50.m88271j(this.f80767a, ((gka0) obj).f80767a);
    }

    public final int hashCode() {
        return this.f80767a.hashCode();
    }
}
