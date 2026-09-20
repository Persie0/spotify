package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zyl {

    /* JADX INFO: renamed from: a */
    public static final zyl f287619a;

    /* JADX INFO: renamed from: b */
    public static final zyl f287620b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zyl[] f287621c;

    static {
        zyl zylVar = new zyl("CardClicked", 0);
        f287619a = zylVar;
        zyl zylVar2 = new zyl("CTAButtonClicked", 1);
        f287620b = zylVar2;
        f287621c = new zyl[]{zylVar, zylVar2};
    }

    public static zyl valueOf(String str) {
        return (zyl) Enum.valueOf(zyl.class, str);
    }

    public static zyl[] values() {
        return (zyl[]) f287621c.clone();
    }
}
