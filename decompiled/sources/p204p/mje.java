package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum mje implements od50 {
    CLIENT_CAPABILITY_UNSPECIFIED(0),
    CLIENT_CAPABILITY_EVENT_PAGE_HERO_V1(1),
    CLIENT_CAPABILITY_EVENT_PAGE_TICKETING_TIMELINE_V1(2),
    CLIENT_CAPABILITY_EVENT_PAGE_RESERVED_SHARE_V1(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f144242a;

    mje(int i) {
        this.f144242a = i;
    }

    /* JADX INFO: renamed from: a */
    public static mje m61981a(int i) {
        if (i == 0) {
            return CLIENT_CAPABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return CLIENT_CAPABILITY_EVENT_PAGE_HERO_V1;
        }
        if (i == 2) {
            return CLIENT_CAPABILITY_EVENT_PAGE_TICKETING_TIMELINE_V1;
        }
        if (i != 3) {
            return null;
        }
        return CLIENT_CAPABILITY_EVENT_PAGE_RESERVED_SHARE_V1;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f144242a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
