package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ovd {

    /* JADX INFO: renamed from: a */
    public static final ovd f170476a;

    /* JADX INFO: renamed from: b */
    public static final ovd f170477b;

    /* JADX INFO: renamed from: c */
    public static final ovd f170478c;

    /* JADX INFO: renamed from: d */
    public static final ovd f170479d;

    /* JADX INFO: renamed from: e */
    public static final ovd f170480e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ovd[] f170481f;

    static {
        ovd ovdVar = new ovd("Unknown", 0);
        f170476a = ovdVar;
        ovd ovdVar2 = new ovd("SideDrawer", 1);
        f170477b = ovdVar2;
        ovd ovdVar3 = new ovd("ChatList", 2);
        f170478c = ovdVar3;
        ovd ovdVar4 = new ovd("OffPlatformShare", 3);
        f170479d = ovdVar4;
        ovd ovdVar5 = new ovd("InviteLink", 4);
        f170480e = ovdVar5;
        f170481f = new ovd[]{ovdVar, ovdVar2, ovdVar3, ovdVar4, ovdVar5};
    }

    public static ovd valueOf(String str) {
        return (ovd) Enum.valueOf(ovd.class, str);
    }

    public static ovd[] values() {
        return (ovd[]) f170481f.clone();
    }
}
