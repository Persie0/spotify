package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tta {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ tta[] f223564a = {new tta("LARGE", 0), new tta("SMALL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    tta EF5;

    public static tta valueOf(String str) {
        return (tta) Enum.valueOf(tta.class, str);
    }

    public static tta[] values() {
        return (tta[]) f223564a.clone();
    }
}
