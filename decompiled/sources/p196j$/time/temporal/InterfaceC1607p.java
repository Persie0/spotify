package p196j$.time.temporal;

import java.util.Map;
import p196j$.time.format.C1574v;
import p196j$.time.format.EnumC1575w;

/* JADX INFO: renamed from: j$.time.temporal.p */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC1607p {
    /* JADX INFO: renamed from: E */
    C1610s mo24162E(InterfaceC1603l interfaceC1603l);

    /* JADX INFO: renamed from: K */
    default InterfaceC1603l mo24168K(Map map, C1574v c1574v, EnumC1575w enumC1575w) {
        return null;
    }

    /* JADX INFO: renamed from: T */
    long mo24163T(InterfaceC1603l interfaceC1603l);

    /* JADX INFO: renamed from: Z */
    Temporal mo24164Z(Temporal temporal, long j);

    boolean isDateBased();

    /* JADX INFO: renamed from: r */
    boolean mo24167r(InterfaceC1603l interfaceC1603l);

    C1610s range();
}
