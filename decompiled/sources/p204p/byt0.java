package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class byt0 {

    /* JADX INFO: renamed from: a */
    public final String f32320a;

    public byt0(String str) {
        this.f32320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byt0) && wj50.m88271j(this.f32320a, ((byt0) obj).f32320a);
    }

    public final int hashCode() {
        String str = this.f32320a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
