package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class zxd0 {

    /* JADX INFO: renamed from: a */
    public static final zxd0 f287289a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ zxd0[] f287290b;

    static {
        zxd0 zxd0Var = new zxd0("EpisodeAudio", 0);
        f287289a = zxd0Var;
        f287290b = new zxd0[]{zxd0Var, new zxd0("EpisodeVideo", 1)};
    }

    public static zxd0 valueOf(String str) {
        return (zxd0) Enum.valueOf(zxd0.class, str);
    }

    public static zxd0[] values() {
        return (zxd0[]) f287290b.clone();
    }
}
