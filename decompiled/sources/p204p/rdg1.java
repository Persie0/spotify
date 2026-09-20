package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum rdg1 implements taf1 {
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);


    /* JADX INFO: renamed from: a */
    public final int f198147a;

    rdg1(int i) {
        this.f198147a = i;
    }

    @Override // p204p.taf1
    public final int zza() {
        return this.f198147a;
    }
}
