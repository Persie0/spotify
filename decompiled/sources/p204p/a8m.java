package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a8m {

    /* JADX INFO: renamed from: a */
    public static final a8m f13322a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ a8m[] f13323b;

    static {
        a8m a8mVar = new a8m("RowClicked", 0);
        f13322a = a8mVar;
        f13323b = new a8m[]{a8mVar, new a8m("ContextMenuClicked", 1)};
    }

    public static a8m valueOf(String str) {
        return (a8m) Enum.valueOf(a8m.class, str);
    }

    public static a8m[] values() {
        return (a8m[]) f13323b.clone();
    }
}
