package p196j$.time.chrono;

import p196j$.time.AbstractC1513c;
import p196j$.time.C1580i;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;

/* JADX INFO: renamed from: j$.time.chrono.m */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC1536m extends InterfaceC1603l, InterfaceC1604m {
    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    default Object mo23841b(C1580i c1580i) {
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.ERAS : super.mo23841b(c1580i);
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    default Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(getValue(), EnumC1592a.ERA);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    default int mo23952g(InterfaceC1607p interfaceC1607p) {
        return interfaceC1607p == EnumC1592a.ERA ? getValue() : super.mo23952g(interfaceC1607p);
    }

    int getValue();

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    default boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return interfaceC1607p == EnumC1592a.ERA;
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    default long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p == EnumC1592a.ERA) {
            return getValue();
        }
        if (interfaceC1607p instanceof EnumC1592a) {
            throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
        return interfaceC1607p.mo24163T(this);
    }
}
