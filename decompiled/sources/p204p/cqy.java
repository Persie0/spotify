package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class cqy {

    /* JADX INFO: renamed from: a */
    public static final cqy f41020a;

    /* JADX INFO: renamed from: b */
    public static final cqy f41021b;

    /* JADX INFO: renamed from: c */
    public static final cqy f41022c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cqy[] f41023d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f41024e;

    static {
        cqy cqyVar = new cqy("ExternalFeedback", 0);
        f41020a = cqyVar;
        cqy cqyVar2 = new cqy("InternalBug", 1);
        f41021b = cqyVar2;
        cqy cqyVar3 = new cqy("FeatureSpecific", 2);
        f41022c = cqyVar3;
        cqy[] cqyVarArr = {cqyVar, cqyVar2, cqyVar3};
        f41023d = cqyVarArr;
        f41024e = new nzv(cqyVarArr);
    }

    public static cqy valueOf(String str) {
        return (cqy) Enum.valueOf(cqy.class, str);
    }

    public static cqy[] values() {
        return (cqy[]) f41023d.clone();
    }
}
