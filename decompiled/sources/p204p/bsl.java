package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class bsl {

    /* JADX INFO: renamed from: a */
    public static final bsl f30348a;

    /* JADX INFO: renamed from: b */
    public static final bsl f30349b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bsl[] f30350c;

    static {
        bsl bslVar = new bsl("ALL", 0);
        f30348a = bslVar;
        bsl bslVar2 = new bsl("PASSKEY_ONLY", 1);
        f30349b = bslVar2;
        f30350c = new bsl[]{bslVar, bslVar2};
    }

    public static bsl valueOf(String str) {
        return (bsl) Enum.valueOf(bsl.class, str);
    }

    public static bsl[] values() {
        return (bsl[]) f30350c.clone();
    }
}
