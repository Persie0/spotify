package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class bmc {

    /* JADX INFO: renamed from: a */
    public static final bmc f28497a;

    /* JADX INFO: renamed from: b */
    public static final bmc f28498b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bmc[] f28499c;

    static {
        bmc bmcVar = new bmc("Clicked", 0);
        f28497a = bmcVar;
        bmc bmcVar2 = new bmc("LongClicked", 1);
        f28498b = bmcVar2;
        f28499c = new bmc[]{bmcVar, bmcVar2};
    }

    public static bmc valueOf(String str) {
        return (bmc) Enum.valueOf(bmc.class, str);
    }

    public static bmc[] values() {
        return (bmc[]) f28499c.clone();
    }
}
