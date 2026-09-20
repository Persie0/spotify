package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mlf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final String f144834a;

    public mlf0(String str) {
        this.f144834a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlf0) && wj50.m88271j(this.f144834a, ((mlf0) obj).f144834a);
    }

    public final int hashCode() {
        return this.f144834a.hashCode();
    }
}
