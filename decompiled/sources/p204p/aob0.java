package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aob0 implements eob0 {

    /* JADX INFO: renamed from: a */
    public final int f17640a;

    public final boolean equals(Object obj) {
        if (obj instanceof aob0) {
            return this.f17640a == ((aob0) obj).f17640a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17640a);
    }

    public final String toString() {
        return s571.m77251j("OnLineClicked(lineIndex=", edb.m38563l("LineIndex(value=", this.f17640a, ")"), ")");
    }
}
