package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hto {

    /* JADX INFO: renamed from: a */
    public static final hto f95094a;

    /* JADX INFO: renamed from: b */
    public static final hto f95095b;

    /* JADX INFO: renamed from: c */
    public static final hto f95096c;

    /* JADX INFO: renamed from: d */
    public static final hto f95097d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ hto[] f95098e;

    static {
        hto htoVar = new hto("SET_REMINDER", 0);
        f95094a = htoVar;
        hto htoVar2 = new hto("DECLINE_OFFER", 1);
        f95095b = htoVar2;
        hto htoVar3 = new hto("JOIN_WAITLIST", 2);
        f95096c = htoVar3;
        hto htoVar4 = new hto("NOT_INTERESTED", 3);
        f95097d = htoVar4;
        f95098e = new hto[]{htoVar, htoVar2, htoVar3, htoVar4};
    }

    public static hto valueOf(String str) {
        return (hto) Enum.valueOf(hto.class, str);
    }

    public static hto[] values() {
        return (hto[]) f95098e.clone();
    }
}
