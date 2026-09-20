package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f541 {

    /* JADX INFO: renamed from: a */
    public static final f541 f65936a;

    /* JADX INFO: renamed from: b */
    public static final f541 f65937b;

    /* JADX INFO: renamed from: c */
    public static final f541 f65938c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ f541[] f65939d;

    static {
        f541 f541Var = new f541("FeatureDisabled", 0);
        f65936a = f541Var;
        f541 f541Var2 = new f541("Default", 1);
        f65937b = f541Var2;
        f541 f541Var3 = new f541("OptedIn", 2);
        f65938c = f541Var3;
        f65939d = new f541[]{f541Var, f541Var2, f541Var3};
    }

    public static f541 valueOf(String str) {
        return (f541) Enum.valueOf(f541.class, str);
    }

    public static f541[] values() {
        return (f541[]) f65939d.clone();
    }
}
