package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qhl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final String f188805a;

    public qhl0(String str) {
        this.f188805a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhl0) && wj50.m88271j(this.f188805a, ((qhl0) obj).f188805a);
    }

    public final int hashCode() {
        return this.f188805a.hashCode();
    }
}
