package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class mbu {

    /* JADX INFO: renamed from: a */
    public static final mbu f141969a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ mbu[] f141970b;

    static {
        mbu mbuVar = new mbu("BUTTON_CLICKED", 0);
        f141969a = mbuVar;
        f141970b = new mbu[]{mbuVar};
    }

    public static mbu valueOf(String str) {
        return (mbu) Enum.valueOf(mbu.class, str);
    }

    public static mbu[] values() {
        return (mbu[]) f141970b.clone();
    }
}
