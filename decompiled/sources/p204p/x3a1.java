package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class x3a1 {
    public static final w3a1 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f257725a;

    /* JADX INFO: renamed from: b */
    public static final x3a1 f257726b;

    /* JADX INFO: renamed from: c */
    public static final x3a1 f257727c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ x3a1[] f257728d;

    static {
        x3a1 x3a1Var = new x3a1("NOT_AVAILABLE", 0);
        f257726b = x3a1Var;
        x3a1 x3a1Var2 = new x3a1("NOT_AVAILABLE_OFFLINE", 1);
        x3a1 x3a1Var3 = new x3a1("NOT_AVAILABLE_IN_CURRENT_REGION", 2);
        x3a1 x3a1Var4 = new x3a1("NOT_AVAILABLE_IN_NON_PREMIUM", 3);
        x3a1 x3a1Var5 = new x3a1("NOT_AVAILABLE_BY_ARTIST_BAN", 4);
        x3a1 x3a1Var6 = new x3a1("LOCAL_FILE_NOT_FOUND", 5);
        x3a1 x3a1Var7 = new x3a1("LOCAL_FILE_BAD_FORMAT", 6);
        x3a1 x3a1Var8 = new x3a1("LOCAL_FILE_DRM_PROTECTED", 7);
        x3a1 x3a1Var9 = new x3a1("USER_STREAMING_DISALLOWED", 8);
        x3a1 x3a1Var10 = new x3a1("USER_CAPPING_REACHED", 9);
        x3a1 x3a1Var11 = new x3a1("APP_IN_BACKGROUND", 10);
        f257727c = x3a1Var11;
        f257728d = new x3a1[]{x3a1Var, x3a1Var2, x3a1Var3, x3a1Var4, x3a1Var5, x3a1Var6, x3a1Var7, x3a1Var8, x3a1Var9, x3a1Var10, x3a1Var11, new x3a1("DRIVER_DISTRACTED", 11), new x3a1("MISSING_MANIFEST_ID", 12)};
        Companion = new w3a1();
        f257725a = q3d0.m72078I(2, c781.f34797Q0);
    }

    public static x3a1 valueOf(String str) {
        return (x3a1) Enum.valueOf(x3a1.class, str);
    }

    public static x3a1[] values() {
        return (x3a1[]) f257728d.clone();
    }
}
