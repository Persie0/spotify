package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kza extends mza {

    /* JADX INFO: renamed from: a */
    public final String f128052a;

    public kza(String str) {
        this.f128052a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kza) && wj50.m88271j(this.f128052a, ((kza) obj).f128052a);
    }

    public final int hashCode() {
        return this.f128052a.hashCode();
    }
}
