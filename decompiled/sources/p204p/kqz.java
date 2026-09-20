package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kqz {

    /* JADX INFO: renamed from: a */
    public static final kqz f125474a;

    /* JADX INFO: renamed from: b */
    public static final kqz f125475b;

    /* JADX INFO: renamed from: c */
    public static final kqz f125476c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kqz[] f125477d;

    static {
        kqz kqzVar = new kqz("Active", 0);
        f125474a = kqzVar;
        kqz kqzVar2 = new kqz("ActiveParent", 1);
        f125475b = kqzVar2;
        kqz kqzVar3 = new kqz("Captured", 2);
        kqz kqzVar4 = new kqz("Inactive", 3);
        f125476c = kqzVar4;
        f125477d = new kqz[]{kqzVar, kqzVar2, kqzVar3, kqzVar4};
    }

    public static kqz valueOf(String str) {
        return (kqz) Enum.valueOf(kqz.class, str);
    }

    public static kqz[] values() {
        return (kqz[]) f125477d.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57128a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57129b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
