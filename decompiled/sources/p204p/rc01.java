package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rc01 {

    /* JADX INFO: renamed from: a */
    public static final rc01 f197682a;

    /* JADX INFO: renamed from: b */
    public static final rc01 f197683b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ rc01[] f197684c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f197685d;

    static {
        rc01 rc01Var = new rc01("DURATION", 0);
        f197682a = rc01Var;
        rc01 rc01Var2 = new rc01("MUSIC", 1);
        rc01 rc01Var3 = new rc01("WORKOUT_TYPE", 2);
        rc01 rc01Var4 = new rc01("AUDIO_GUIDE", 3);
        f197683b = rc01Var4;
        rc01[] rc01VarArr = {rc01Var, rc01Var2, rc01Var3, rc01Var4, new rc01("BEAT_MATCHING", 4)};
        f197684c = rc01VarArr;
        f197685d = new nzv(rc01VarArr);
    }

    public static rc01 valueOf(String str) {
        return (rc01) Enum.valueOf(rc01.class, str);
    }

    public static rc01[] values() {
        return (rc01[]) f197684c.clone();
    }
}
