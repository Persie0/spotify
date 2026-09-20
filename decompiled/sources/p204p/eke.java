package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class eke {

    /* JADX INFO: renamed from: a */
    public static final eke f60435a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ eke[] f60436b;

    /* JADX INFO: Fake field, exist only in values array */
    eke EF0;

    static {
        eke ekeVar = new eke("UNKNOWN", 0);
        eke ekeVar2 = new eke("ANDROID_FIREBASE", 1);
        f60435a = ekeVar2;
        f60436b = new eke[]{ekeVar, ekeVar2};
    }

    public static eke valueOf(String str) {
        return (eke) Enum.valueOf(eke.class, str);
    }

    public static eke[] values() {
        return (eke[]) f60436b.clone();
    }
}
