package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class vss {

    /* JADX INFO: renamed from: a */
    public static final vss f244487a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ vss[] f244488b;

    static {
        vss vssVar = new vss("ButtonClicked", 0);
        f244487a = vssVar;
        f244488b = new vss[]{vssVar};
    }

    public static vss valueOf(String str) {
        return (vss) Enum.valueOf(vss.class, str);
    }

    public static vss[] values() {
        return (vss[]) f244488b.clone();
    }
}
