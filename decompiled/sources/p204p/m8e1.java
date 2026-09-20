package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m8e1 extends u8e1 {

    /* JADX INFO: renamed from: a */
    public final int f141036a;

    public m8e1(int i) {
        this.f141036a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8e1) && this.f141036a == ((m8e1) obj).f141036a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f141036a);
    }
}
