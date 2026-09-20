package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tyz0 implements vyz0 {

    /* JADX INFO: renamed from: a */
    public final String f225077a;

    public tyz0(String str) {
        this.f225077a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyz0) && wj50.m88271j(this.f225077a, ((tyz0) obj).f225077a);
    }

    public final int hashCode() {
        return this.f225077a.hashCode();
    }
}
