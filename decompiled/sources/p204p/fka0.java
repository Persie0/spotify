package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fka0 extends ika0 {

    /* JADX INFO: renamed from: a */
    public final String f70515a;

    public fka0(String str) {
        this.f70515a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fka0) && wj50.m88271j(this.f70515a, ((fka0) obj).f70515a);
    }

    public final int hashCode() {
        return this.f70515a.hashCode();
    }
}
