package p196j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class LinkOption implements InterfaceC1498u, CopyOption {
    public static final LinkOption NOFOLLOW_LINKS;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ LinkOption[] f10512a;

    static {
        LinkOption linkOption = new LinkOption("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = linkOption;
        f10512a = new LinkOption[]{linkOption};
    }

    public static LinkOption valueOf(String str) {
        return (LinkOption) Enum.valueOf(LinkOption.class, str);
    }

    public static LinkOption[] values() {
        return (LinkOption[]) f10512a.clone();
    }
}
