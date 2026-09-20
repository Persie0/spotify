package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class faf {

    /* JADX INFO: renamed from: a */
    public static final faf f67549a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ faf[] f67550b;

    /* JADX INFO: Fake field, exist only in values array */
    faf EF0;

    static {
        faf fafVar = new faf("DISABLED", 0);
        faf fafVar2 = new faf("FOREGROUND_AND_BACKGROUND", 1);
        f67549a = fafVar2;
        f67550b = new faf[]{fafVar, fafVar2, new faf("FOREGROUND_ONLY", 2)};
    }

    public static faf valueOf(String str) {
        return (faf) Enum.valueOf(faf.class, str);
    }

    public static faf[] values() {
        return (faf[]) f67550b.clone();
    }
}
