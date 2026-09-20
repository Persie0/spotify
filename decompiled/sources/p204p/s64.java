package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum s64 implements uzv {
    PROMPTED_BY_YOU("prompted_by_you"),
    /* JADX INFO: Fake field, exist only in values array */
    MADE_FROM_SEARCH("made_from_search"),
    /* JADX INFO: Fake field, exist only in values array */
    GENERATED_PLAYLIST("generated_playlist");


    /* JADX INFO: renamed from: a */
    public final String f205997a;

    s64(String str) {
        this.f205997a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f205997a;
    }
}
