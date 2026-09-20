package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class s0x0 {

    /* JADX INFO: renamed from: a */
    public static final s0x0 f204550a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ s0x0[] f204551b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f204552c;

    static {
        s0x0 s0x0Var = new s0x0("UNKNOWN_DISCOVERY_METHOD", 0);
        f204550a = s0x0Var;
        s0x0[] s0x0VarArr = {s0x0Var, new s0x0("MDNS", 1), new s0x0("CONNECT", 2), new s0x0("SOCIAL_RADAR_NEARBY", 3), new s0x0("LISTENING_ACTIVITY", 4), new s0x0("LINK", 5)};
        f204551b = s0x0VarArr;
        f204552c = new nzv(s0x0VarArr);
    }

    public static s0x0 valueOf(String str) {
        return (s0x0) Enum.valueOf(s0x0.class, str);
    }

    public static s0x0[] values() {
        return (s0x0[]) f204551b.clone();
    }
}
