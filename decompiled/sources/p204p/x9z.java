package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class x9z {

    /* JADX INFO: renamed from: a */
    public static final x9z f259476a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ x9z[] f259477b;

    static {
        x9z x9zVar = new x9z("GRANTED", 0);
        f259476a = x9zVar;
        f259477b = new x9z[]{x9zVar, new x9z("DENIED", 1)};
    }

    public static x9z valueOf(String str) {
        return (x9z) Enum.valueOf(x9z.class, str);
    }

    public static x9z[] values() {
        return (x9z[]) f259477b.clone();
    }
}
