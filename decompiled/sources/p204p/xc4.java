package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum xc4 implements uzv {
    DAILY_MIX("daily_mix"),
    /* JADX INFO: Fake field, exist only in values array */
    SEED_MIX_ARTIST("seed_mix_artist"),
    /* JADX INFO: Fake field, exist only in values array */
    SEED_MIX_GENRE("seed_mix_genre"),
    /* JADX INFO: Fake field, exist only in values array */
    SEED_MIX_DECADE("seed_mix_decade");


    /* JADX INFO: renamed from: a */
    public final String f260082a;

    xc4(String str) {
        this.f260082a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f260082a;
    }
}
