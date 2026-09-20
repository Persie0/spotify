package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y331 extends z331 {

    /* JADX INFO: renamed from: a */
    public final String f268746a;

    public y331(String str) {
        this.f268746a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y331) && wj50.m88271j(this.f268746a, ((y331) obj).f268746a);
    }

    public final int hashCode() {
        return this.f268746a.hashCode();
    }
}
