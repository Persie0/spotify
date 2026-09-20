package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fbv {

    /* JADX INFO: renamed from: a */
    public static final fbv f67903a;

    /* JADX INFO: renamed from: b */
    public static final fbv f67904b;

    /* JADX INFO: renamed from: c */
    public static final fbv f67905c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fbv[] f67906d;

    static {
        fbv fbvVar = new fbv("PreEnter", 0);
        f67903a = fbvVar;
        fbv fbvVar2 = new fbv("Visible", 1);
        f67904b = fbvVar2;
        fbv fbvVar3 = new fbv("PostExit", 2);
        f67905c = fbvVar3;
        f67906d = new fbv[]{fbvVar, fbvVar2, fbvVar3};
    }

    public static fbv valueOf(String str) {
        return (fbv) Enum.valueOf(fbv.class, str);
    }

    public static fbv[] values() {
        return (fbv[]) f67906d.clone();
    }
}
