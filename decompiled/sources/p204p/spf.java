package p204p;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class spf {

    /* JADX INFO: renamed from: a */
    public static final spf f212836a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f212837b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ spf[] f212838c;

    /* JADX INFO: Fake field, exist only in values array */
    spf EF0;

    static {
        spf spfVar = new spf("X86_32", 0);
        spf spfVar2 = new spf("X86_64", 1);
        spf spfVar3 = new spf("ARM_UNKNOWN", 2);
        spf spfVar4 = new spf("PPC", 3);
        spf spfVar5 = new spf("PPC64", 4);
        spf spfVar6 = new spf("ARMV6", 5);
        spf spfVar7 = new spf("ARMV7", 6);
        spf spfVar8 = new spf("UNKNOWN", 7);
        f212836a = spfVar8;
        spf spfVar9 = new spf("ARMV7S", 8);
        spf spfVar10 = new spf("ARM64", 9);
        f212838c = new spf[]{spfVar, spfVar2, spfVar3, spfVar4, spfVar5, spfVar6, spfVar7, spfVar8, spfVar9, spfVar10};
        HashMap map = new HashMap(4);
        f212837b = map;
        map.put("armeabi-v7a", spfVar7);
        map.put("armeabi", spfVar6);
        map.put("arm64-v8a", spfVar10);
        map.put("x86", spfVar);
    }

    public static spf valueOf(String str) {
        return (spf) Enum.valueOf(spf.class, str);
    }

    public static spf[] values() {
        return (spf[]) f212838c.clone();
    }
}
