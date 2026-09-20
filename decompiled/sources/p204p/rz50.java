package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rz50 {

    /* JADX INFO: renamed from: a */
    public static final rz50 f204069a;

    /* JADX INFO: renamed from: b */
    public static final rz50 f204070b;

    /* JADX INFO: renamed from: c */
    public static final rz50 f204071c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rz50[] f204072d;

    static {
        rz50 rz50Var = new rz50("ToggleVolumeControl", 0);
        f204069a = rz50Var;
        rz50 rz50Var2 = new rz50("TogglePlaybackControl", 1);
        f204070b = rz50Var2;
        rz50 rz50Var3 = new rz50("NavigateBack", 2);
        f204071c = rz50Var3;
        f204072d = new rz50[]{rz50Var, rz50Var2, rz50Var3};
    }

    public static rz50 valueOf(String str) {
        return (rz50) Enum.valueOf(rz50.class, str);
    }

    public static rz50[] values() {
        return (rz50[]) f204072d.clone();
    }
}
