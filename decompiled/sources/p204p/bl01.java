package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bl01 extends fl01 {

    /* JADX INFO: renamed from: a */
    public final String f28052a;

    public bl01(String str) {
        this.f28052a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl01) && wj50.m88271j(this.f28052a, ((bl01) obj).f28052a);
    }

    public final int hashCode() {
        return this.f28052a.hashCode();
    }
}
