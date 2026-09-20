package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yfe {

    /* JADX INFO: renamed from: a */
    public final vfe f272211a;

    /* JADX INFO: renamed from: b */
    public final int f272212b;

    public yfe(vfe vfeVar, int i) {
        this.f272211a = vfeVar;
        this.f272212b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfe)) {
            return false;
        }
        yfe yfeVar = (yfe) obj;
        return wj50.m88271j(this.f272211a, yfeVar.f272211a) && this.f272212b == yfeVar.f272212b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272212b) + (this.f272211a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.f272212b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.f272211a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
