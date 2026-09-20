package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kop {

    /* JADX INFO: renamed from: a */
    public long f124839a;

    /* JADX INFO: renamed from: b */
    public float f124840b;

    /* JADX INFO: renamed from: c */
    public long f124841c;

    public kop(int i) {
        switch (i) {
            case 1:
                this.f124839a = -9223372036854775807L;
                this.f124840b = -3.4028235E38f;
                this.f124841c = -9223372036854775807L;
                break;
            default:
                this.f124839a = h0b1.m46295W(20L);
                this.f124841c = h0b1.m46295W(500L);
                this.f124840b = 0.999f;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public lop m57004a() {
        return new lop(this.f124840b, this.f124839a, this.f124841c);
    }
}
