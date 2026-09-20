package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class apv {

    /* JADX INFO: renamed from: a */
    public static final apv f18016a;

    /* JADX INFO: renamed from: b */
    public static final apv f18017b;

    /* JADX INFO: renamed from: c */
    public static final apv f18018c;

    /* JADX INFO: renamed from: d */
    public static final apv f18019d;

    /* JADX INFO: renamed from: e */
    public static final apv f18020e;

    /* JADX INFO: renamed from: f */
    public static final apv f18021f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ apv[] f18022g;

    static {
        apv apvVar = new apv("Swiped", 0);
        f18016a = apvVar;
        apv apvVar2 = new apv("RowClicked", 1);
        f18017b = apvVar2;
        apv apvVar3 = new apv("PinClicked", 2);
        apv apvVar4 = new apv("RowLongClicked", 3);
        f18018c = apvVar4;
        apv apvVar5 = new apv("DismissClicked", 4);
        f18019d = apvVar5;
        apv apvVar6 = new apv("ContextMenuClicked", 5);
        f18020e = apvVar6;
        apv apvVar7 = new apv("FollowClicked", 6);
        f18021f = apvVar7;
        f18022g = new apv[]{apvVar, apvVar2, apvVar3, apvVar4, apvVar5, apvVar6, apvVar7};
    }

    public static apv valueOf(String str) {
        return (apv) Enum.valueOf(apv.class, str);
    }

    public static apv[] values() {
        return (apv[]) f18022g.clone();
    }
}
