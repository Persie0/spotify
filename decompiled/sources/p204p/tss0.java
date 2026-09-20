package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tss0 implements wss0 {

    /* JADX INFO: renamed from: a */
    public final String f223428a;

    public tss0(String str) {
        this.f223428a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tss0) && wj50.m88271j(this.f223428a, ((tss0) obj).f223428a);
    }

    public final int hashCode() {
        return this.f223428a.hashCode();
    }
}
