package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q6y {

    /* JADX INFO: renamed from: a */
    public static final q6y f185956a;

    /* JADX INFO: renamed from: b */
    public static final q6y f185957b;

    /* JADX INFO: renamed from: c */
    public static final q6y f185958c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ q6y[] f185959d;

    static {
        q6y q6yVar = new q6y("ImageClicked", 0);
        f185956a = q6yVar;
        q6y q6yVar2 = new q6y("BackButtonClicked", 1);
        f185957b = q6yVar2;
        q6y q6yVar3 = new q6y("TitleClicked", 2);
        f185958c = q6yVar3;
        f185959d = new q6y[]{q6yVar, q6yVar2, q6yVar3};
    }

    public static q6y valueOf(String str) {
        return (q6y) Enum.valueOf(q6y.class, str);
    }

    public static q6y[] values() {
        return (q6y[]) f185959d.clone();
    }
}
