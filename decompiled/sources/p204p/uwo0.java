package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class uwo0 {

    /* JADX INFO: renamed from: a */
    public static final uwo0 f234705a;

    /* JADX INFO: renamed from: b */
    public static final uwo0 f234706b;

    /* JADX INFO: renamed from: c */
    public static final uwo0 f234707c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uwo0[] f234708d;

    static {
        uwo0 uwo0Var = new uwo0("ChapteredTrack", 0);
        f234705a = uwo0Var;
        uwo0 uwo0Var2 = new uwo0("SingleTrack", 1);
        f234706b = uwo0Var2;
        uwo0 uwo0Var3 = new uwo0("Undefined", 2);
        f234707c = uwo0Var3;
        f234708d = new uwo0[]{uwo0Var, uwo0Var2, uwo0Var3};
    }

    public static uwo0 valueOf(String str) {
        return (uwo0) Enum.valueOf(uwo0.class, str);
    }

    public static uwo0[] values() {
        return (uwo0[]) f234708d.clone();
    }
}
