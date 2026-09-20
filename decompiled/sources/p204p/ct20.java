package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ct20 implements gt20 {

    /* JADX INFO: renamed from: a */
    public final String f41749a;

    public ct20(String str) {
        this.f41749a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct20) && wj50.m88271j(this.f41749a, ((ct20) obj).f41749a);
    }

    public final int hashCode() {
        return this.f41749a.hashCode();
    }
}
