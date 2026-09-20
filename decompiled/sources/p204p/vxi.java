package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class vxi {

    /* JADX INFO: renamed from: a */
    public static final vxi f245751a;

    /* JADX INFO: renamed from: b */
    public static final vxi f245752b;

    /* JADX INFO: renamed from: c */
    public static final vxi f245753c;

    /* JADX INFO: renamed from: d */
    public static final vxi f245754d;

    /* JADX INFO: renamed from: e */
    public static final vxi f245755e;

    /* JADX INFO: renamed from: f */
    public static final vxi f245756f;

    /* JADX INFO: renamed from: g */
    public static final vxi f245757g;

    /* JADX INFO: renamed from: h */
    public static final vxi f245758h;

    /* JADX INFO: renamed from: i */
    public static final vxi f245759i;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ vxi[] f245760t;

    static {
        vxi vxiVar = new vxi("initialized", 0);
        f245751a = vxiVar;
        vxi vxiVar2 = new vxi("connecting", 1);
        f245752b = vxiVar2;
        vxi vxiVar3 = new vxi("connected", 2);
        f245753c = vxiVar3;
        vxi vxiVar4 = new vxi("disconnected", 3);
        f245754d = vxiVar4;
        vxi vxiVar5 = new vxi("suspended", 4);
        f245755e = vxiVar5;
        vxi vxiVar6 = new vxi("closing", 5);
        f245756f = vxiVar6;
        vxi vxiVar7 = new vxi("closed", 6);
        f245757g = vxiVar7;
        vxi vxiVar8 = new vxi("failed", 7);
        f245758h = vxiVar8;
        vxi vxiVar9 = new vxi("update", 8);
        f245759i = vxiVar9;
        f245760t = new vxi[]{vxiVar, vxiVar2, vxiVar3, vxiVar4, vxiVar5, vxiVar6, vxiVar7, vxiVar8, vxiVar9};
    }

    public static vxi valueOf(String str) {
        return (vxi) Enum.valueOf(vxi.class, str);
    }

    public static vxi[] values() {
        return (vxi[]) f245760t.clone();
    }
}
