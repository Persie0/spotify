package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class vdw {

    /* JADX INFO: renamed from: a */
    public static final vdw f240512a;

    /* JADX INFO: renamed from: b */
    public static final vdw f240513b;

    /* JADX INFO: renamed from: c */
    public static final vdw f240514c;

    /* JADX INFO: renamed from: d */
    public static final vdw f240515d;

    /* JADX INFO: renamed from: e */
    public static final vdw f240516e;

    /* JADX INFO: renamed from: f */
    public static final vdw f240517f;

    /* JADX INFO: renamed from: g */
    public static final vdw f240518g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ vdw[] f240519h;

    static {
        vdw vdwVar = new vdw("NO_SEARCH_RESULTS", 0);
        f240512a = vdwVar;
        vdw vdwVar2 = new vdw("NO_EVENTS_FOUND", 1);
        f240513b = vdwVar2;
        vdw vdwVar3 = new vdw("EMPTY_SECTION", 2);
        f240514c = vdwVar3;
        vdw vdwVar4 = new vdw("EMPTY_SECTION_FOR_LOCATION", 3);
        f240515d = vdwVar4;
        vdw vdwVar5 = new vdw("EMPTY_INTERESTED_SECTION", 4);
        f240516e = vdwVar5;
        vdw vdwVar6 = new vdw("EMPTY_PAST_EVENT", 5);
        f240517f = vdwVar6;
        vdw vdwVar7 = new vdw("EMPTY_CUSTOM", 6);
        f240518g = vdwVar7;
        f240519h = new vdw[]{vdwVar, vdwVar2, vdwVar3, vdwVar4, vdwVar5, vdwVar6, vdwVar7};
    }

    public static vdw valueOf(String str) {
        return (vdw) Enum.valueOf(vdw.class, str);
    }

    public static vdw[] values() {
        return (vdw[]) f240519h.clone();
    }
}
