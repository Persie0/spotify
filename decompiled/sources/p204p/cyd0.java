package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cyd0 {

    /* JADX INFO: renamed from: b */
    public static final cyd0 f43220b = new cyd0("text/*");

    /* JADX INFO: renamed from: c */
    public static final cyd0 f43221c = new cyd0("*/*");

    /* JADX INFO: renamed from: a */
    public final String f43222a;

    public cyd0(String str) {
        this.f43222a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyd0)) {
            return false;
        }
        return wj50.m88271j(this.f43222a, ((cyd0) obj).f43222a);
    }

    public final int hashCode() {
        return this.f43222a.hashCode();
    }

    public final String toString() {
        return dq60.m36616p(this.f43222a, "')", new StringBuilder("MediaType(representation='"));
    }
}
