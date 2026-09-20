package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class of9 extends iy71 {

    /* JADX INFO: renamed from: c */
    public final short f164676c;

    /* JADX INFO: renamed from: d */
    public final short f164677d;

    public of9(iy71 iy71Var, int i, int i2) {
        super(iy71Var);
        this.f164676c = (short) i;
        this.f164677d = (short) i2;
    }

    @Override // p204p.iy71
    /* JADX INFO: renamed from: a */
    public final void mo38505a(dh9 dh9Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f164677d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                dh9Var.m36000c(31, 5);
                if (s > 62) {
                    dh9Var.m36000c(s - 31, 16);
                } else if (i == 0) {
                    dh9Var.m36000c(Math.min((int) s, 31), 5);
                } else {
                    dh9Var.m36000c(s - 31, 5);
                }
            }
            dh9Var.m36000c(bArr[this.f164676c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        short s = this.f164676c;
        sb.append((int) s);
        sb.append("::");
        sb.append((s + this.f164677d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
