package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jeq0 implements peq0 {

    /* JADX INFO: renamed from: a */
    public final String f111645a;

    public jeq0(String str) {
        this.f111645a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m53107a() {
        return this.f111645a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jeq0) && wj50.m88271j(this.f111645a, ((jeq0) obj).f111645a);
    }

    public final int hashCode() {
        return this.f111645a.hashCode();
    }
}
