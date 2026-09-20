package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class yxv {

    /* JADX INFO: renamed from: a */
    public static final yxv f277329a;

    /* JADX INFO: renamed from: b */
    public static final yxv f277330b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yxv[] f277331c;

    static {
        yxv yxvVar = new yxv("PLAYLIST", 0);
        f277329a = yxvVar;
        yxv yxvVar2 = new yxv("ALBUM", 1);
        f277330b = yxvVar2;
        f277331c = new yxv[]{yxvVar, yxvVar2};
    }

    public static yxv valueOf(String str) {
        return (yxv) Enum.valueOf(yxv.class, str);
    }

    public static yxv[] values() {
        return (yxv[]) f277331c.clone();
    }
}
