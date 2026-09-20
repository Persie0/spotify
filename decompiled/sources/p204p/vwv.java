package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vwv {

    /* JADX INFO: renamed from: a */
    public static final vwv f245557a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ vwv[] f245558b;

    static {
        vwv vwvVar = new vwv("Default", 0);
        f245557a = vwvVar;
        f245558b = new vwv[]{vwvVar, new vwv("Small", 1)};
    }

    public static vwv valueOf(String str) {
        return (vwv) Enum.valueOf(vwv.class, str);
    }

    public static vwv[] values() {
        return (vwv[]) f245558b.clone();
    }
}
