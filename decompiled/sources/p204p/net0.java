package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum net0 implements od50 {
    CONTENT_TYPE_UNSPECIFIED(0),
    CONTENT_TYPE_TEXT(1),
    CONTENT_TYPE_MEDIA(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f153109a;

    net0(int i) {
        this.f153109a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f153109a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
