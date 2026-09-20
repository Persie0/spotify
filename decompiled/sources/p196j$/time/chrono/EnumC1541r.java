package p196j$.time.chrono;

import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.chrono.r */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1541r implements InterfaceC1536m {

    /* JADX INFO: renamed from: AH */
    public static final EnumC1541r f10677AH;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1541r[] f10678a;

    static {
        EnumC1541r enumC1541r = new EnumC1541r("AH", 0);
        f10677AH = enumC1541r;
        f10678a = new EnumC1541r[]{enumC1541r};
    }

    public static EnumC1541r valueOf(String str) {
        return (EnumC1541r) Enum.valueOf(EnumC1541r.class, str);
    }

    public static EnumC1541r[] values() {
        return (EnumC1541r[]) f10678a.clone();
    }

    @Override // p196j$.time.chrono.InterfaceC1536m
    public final int getValue() {
        return 1;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        return interfaceC1607p == EnumC1592a.ERA ? C1610s.m24173f(1L, 1L) : super.mo23920j(interfaceC1607p);
    }
}
