package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cf70 implements gs20 {

    /* JADX INFO: renamed from: a */
    public final String f37281a;

    public cf70(String str) {
        this.f37281a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf70) && wj50.m88271j(this.f37281a, ((cf70) obj).f37281a);
    }

    public final int hashCode() {
        return this.f37281a.hashCode();
    }
}
