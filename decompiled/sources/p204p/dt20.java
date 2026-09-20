package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dt20 implements gt20 {

    /* JADX INFO: renamed from: a */
    public final String f52704a;

    public dt20(String str) {
        this.f52704a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt20) && wj50.m88271j(this.f52704a, ((dt20) obj).f52704a);
    }

    public final int hashCode() {
        return this.f52704a.hashCode();
    }
}
