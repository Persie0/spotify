package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class mbr {
    public static final lbr Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f141957a;

    /* JADX INFO: renamed from: b */
    public static final mbr f141958b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ mbr[] f141959c;

    static {
        mbr mbrVar = new mbr("AMBIGUOUS_DEVICE", 0);
        f141958b = mbrVar;
        f141959c = new mbr[]{mbrVar, new mbr("NON_AMBIGUOUS_DEVICE", 1)};
        Companion = new lbr();
        f141957a = q3d0.m72078I(2, ajq.f16320Y);
    }

    public static mbr valueOf(String str) {
        return (mbr) Enum.valueOf(mbr.class, str);
    }

    public static mbr[] values() {
        return (mbr[]) f141959c.clone();
    }
}
