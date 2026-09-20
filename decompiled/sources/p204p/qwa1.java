package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qwa1 implements rwa1 {

    /* JADX INFO: renamed from: a */
    public final String f193219a;

    public qwa1(String str) {
        this.f193219a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwa1) && wj50.m88271j(this.f193219a, ((qwa1) obj).f193219a);
    }

    public final int hashCode() {
        return this.f193219a.hashCode();
    }
}
