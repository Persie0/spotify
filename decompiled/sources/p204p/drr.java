package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class drr implements qh0 {

    /* JADX INFO: renamed from: a */
    public final String f52380a;

    public drr(String str) {
        this.f52380a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drr) && wj50.m88271j(this.f52380a, ((drr) obj).f52380a);
    }

    public final int hashCode() {
        return this.f52380a.hashCode();
    }
}
