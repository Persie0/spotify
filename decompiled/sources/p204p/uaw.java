package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uaw {

    /* JADX INFO: renamed from: a */
    public static final uaw f228561a;

    /* JADX INFO: renamed from: b */
    public static final uaw f228562b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ uaw[] f228563c;

    static {
        uaw uawVar = new uaw("Audio", 0);
        f228561a = uawVar;
        uaw uawVar2 = new uaw("Video", 1);
        f228562b = uawVar2;
        f228563c = new uaw[]{uawVar, uawVar2};
    }

    public static uaw valueOf(String str) {
        return (uaw) Enum.valueOf(uaw.class, str);
    }

    public static uaw[] values() {
        return (uaw[]) f228563c.clone();
    }
}
