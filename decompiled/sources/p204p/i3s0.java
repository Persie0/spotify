package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum i3s0 implements od50 {
    PROFILE_EDITABLE_FEATURE_UNSPECIFIED(0),
    PROFILE_EDITABLE_FEATURE_BIO(1),
    PROFILE_EDITABLE_FEATURE_SOCIAL_HANDLE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f98267a;

    i3s0(int i) {
        this.f98267a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f98267a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
