package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum t7l implements od50 {
    CREATE_ITEM_KIND_UNSPECIFIED(0),
    CREATE_ITEM_KIND_PLAYLIST(1),
    CREATE_ITEM_KIND_FOLDER(2);


    /* JADX INFO: renamed from: a */
    public final int f217849a;

    t7l(int i) {
        this.f217849a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f217849a;
    }
}
