package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uwv {

    /* JADX INFO: renamed from: a */
    public static final uwv f234737a;

    /* JADX INFO: renamed from: b */
    public static final uwv f234738b;

    /* JADX INFO: renamed from: c */
    public static final uwv f234739c;

    /* JADX INFO: renamed from: d */
    public static final uwv f234740d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ uwv[] f234741e;

    static {
        uwv uwvVar = new uwv("Playing", 0);
        f234737a = uwvVar;
        uwv uwvVar2 = new uwv("Played", 1);
        f234738b = uwvVar2;
        uwv uwvVar3 = new uwv("Paused", 2);
        f234739c = uwvVar3;
        uwv uwvVar4 = new uwv("None", 3);
        f234740d = uwvVar4;
        f234741e = new uwv[]{uwvVar, uwvVar2, uwvVar3, uwvVar4};
    }

    public static uwv valueOf(String str) {
        return (uwv) Enum.valueOf(uwv.class, str);
    }

    public static uwv[] values() {
        return (uwv[]) f234741e.clone();
    }
}
