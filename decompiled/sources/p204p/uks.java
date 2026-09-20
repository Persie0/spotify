package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class uks {

    /* JADX INFO: renamed from: a */
    public static final uks f231357a;

    /* JADX INFO: renamed from: b */
    public static final uks f231358b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ uks[] f231359c;

    static {
        uks uksVar = new uks("TOTAL_DURATION", 0);
        f231357a = uksVar;
        uks uksVar2 = new uks("REMAINING_TIME", 1);
        f231358b = uksVar2;
        f231359c = new uks[]{uksVar, uksVar2};
    }

    public static uks valueOf(String str) {
        return (uks) Enum.valueOf(uks.class, str);
    }

    public static uks[] values() {
        return (uks[]) f231359c.clone();
    }
}
