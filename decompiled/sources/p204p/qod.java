package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qod {

    /* JADX INFO: renamed from: a */
    public final String f190914a;

    /* JADX INFO: renamed from: b */
    public final int f190915b;

    public qod(String str, int i) {
        this.f190914a = str;
        this.f190915b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qod)) {
            return false;
        }
        qod qodVar = (qod) obj;
        return wj50.m88271j(this.f190914a, qodVar.f190914a) && this.f190915b == qodVar.f190915b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f190915b) + (this.f190914a.hashCode() * 31);
    }
}
