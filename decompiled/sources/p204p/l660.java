package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l660 implements m660 {

    /* JADX INFO: renamed from: a */
    public final String f130239a;

    public l660(String str) {
        this.f130239a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l660) && wj50.m88271j(this.f130239a, ((l660) obj).f130239a);
    }

    public final int hashCode() {
        return this.f130239a.hashCode();
    }
}
