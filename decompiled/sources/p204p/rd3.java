package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rd3 extends s95 {

    /* JADX INFO: renamed from: j */
    public final String f198014j;

    public rd3(String str) {
        this.f198014j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd3) && wj50.m88271j(this.f198014j, ((rd3) obj).f198014j);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f198014j.hashCode() * 31);
    }
}
