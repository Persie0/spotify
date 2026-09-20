package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class irb1 {

    /* JADX INFO: renamed from: a */
    public static final irb1 f104943a;

    /* JADX INFO: renamed from: b */
    public static final irb1 f104944b;

    /* JADX INFO: renamed from: c */
    public static final irb1 f104945c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ irb1[] f104946d;

    static {
        irb1 irb1Var = new irb1("OnTurnOffMixClicked", 0);
        f104943a = irb1Var;
        irb1 irb1Var2 = new irb1("OnSwitchToVideoClicked", 1);
        f104944b = irb1Var2;
        irb1 irb1Var3 = new irb1("OnSwitchToAudioClicked", 2);
        f104945c = irb1Var3;
        f104946d = new irb1[]{irb1Var, irb1Var2, irb1Var3};
    }

    public static irb1 valueOf(String str) {
        return (irb1) Enum.valueOf(irb1.class, str);
    }

    public static irb1[] values() {
        return (irb1[]) f104946d.clone();
    }
}
