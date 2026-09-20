package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hp0 {

    /* JADX INFO: renamed from: a */
    public static final hp0 f93662a;

    /* JADX INFO: renamed from: b */
    public static final hp0 f93663b;

    /* JADX INFO: renamed from: c */
    public static final hp0 f93664c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hp0[] f93665d;

    static {
        hp0 hp0Var = new hp0("MuteClicked", 0);
        f93662a = hp0Var;
        hp0 hp0Var2 = new hp0("UnMuteClicked", 1);
        f93663b = hp0Var2;
        hp0 hp0Var3 = new hp0("AdvertiserInfoClicked", 2);
        f93664c = hp0Var3;
        f93665d = new hp0[]{hp0Var, hp0Var2, hp0Var3};
    }

    public static hp0 valueOf(String str) {
        return (hp0) Enum.valueOf(hp0.class, str);
    }

    public static hp0[] values() {
        return (hp0[]) f93665d.clone();
    }
}
