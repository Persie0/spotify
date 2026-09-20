package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jwv {

    /* JADX INFO: renamed from: a */
    public static final jwv f116722a;

    /* JADX INFO: renamed from: b */
    public static final jwv f116723b;

    /* JADX INFO: renamed from: c */
    public static final jwv f116724c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jwv[] f116725d;

    static {
        jwv jwvVar = new jwv("None", 0);
        f116722a = jwvVar;
        jwv jwvVar2 = new jwv("Video", 1);
        f116723b = jwvVar2;
        jwv jwvVar3 = new jwv("VideoLabel", 2);
        f116724c = jwvVar3;
        f116725d = new jwv[]{jwvVar, jwvVar2, jwvVar3};
    }

    public static jwv valueOf(String str) {
        return (jwv) Enum.valueOf(jwv.class, str);
    }

    public static jwv[] values() {
        return (jwv[]) f116725d.clone();
    }
}
