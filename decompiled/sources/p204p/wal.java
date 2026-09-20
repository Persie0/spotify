package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wal {

    /* JADX INFO: renamed from: a */
    public static final wal f249547a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ wal[] f249548b;

    static {
        wal walVar = new wal("TRY_AGAIN", 0);
        f249547a = walVar;
        f249548b = new wal[]{walVar};
    }

    public static wal valueOf(String str) {
        return (wal) Enum.valueOf(wal.class, str);
    }

    public static wal[] values() {
        return (wal[]) f249548b.clone();
    }
}
