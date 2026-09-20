package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cp9 extends vtg1 {

    /* JADX INFO: renamed from: b */
    public final String f40500b;

    public cp9(String str) {
        this.f40500b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp9) && wj50.m88271j(this.f40500b, ((cp9) obj).f40500b);
    }

    public final int hashCode() {
        return this.f40500b.hashCode();
    }
}
