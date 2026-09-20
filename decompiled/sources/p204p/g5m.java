package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g5m {

    /* JADX INFO: renamed from: a */
    public static final g5m f76698a;

    /* JADX INFO: renamed from: b */
    public static final g5m f76699b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ g5m[] f76700c;

    static {
        g5m g5mVar = new g5m("AddClicked", 0);
        f76698a = g5mVar;
        g5m g5mVar2 = new g5m("UnbanClicked", 1);
        f76699b = g5mVar2;
        f76700c = new g5m[]{g5mVar, g5mVar2};
    }

    public static g5m valueOf(String str) {
        return (g5m) Enum.valueOf(g5m.class, str);
    }

    public static g5m[] values() {
        return (g5m[]) f76700c.clone();
    }
}
