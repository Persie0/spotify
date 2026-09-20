package p196j$.time.temporal;

import java.util.Objects;
import p196j$.time.AbstractC1513c;
import p196j$.time.C1512b;
import p196j$.time.C1580i;

/* JADX INFO: renamed from: j$.time.temporal.l */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC1603l {
    /* JADX INFO: renamed from: b */
    default Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10834a || c1580i == AbstractC1608q.f10835b || c1580i == AbstractC1608q.f10836c) {
            return null;
        }
        return c1580i.m24134j(this);
    }

    /* JADX INFO: renamed from: g */
    default int mo23952g(InterfaceC1607p interfaceC1607p) {
        C1610s c1610sMo23920j = mo23920j(interfaceC1607p);
        if (!c1610sMo23920j.m24178d()) {
            throw new C1609r("Invalid field " + interfaceC1607p + " for get() method, use getLong() instead");
        }
        long jMo23843i = mo23843i(interfaceC1607p);
        if (c1610sMo23920j.m24179e(jMo23843i)) {
            return (int) jMo23843i;
        }
        throw new C1512b("Invalid value for " + interfaceC1607p + " (valid values " + c1610sMo23920j + "): " + jMo23843i);
    }

    /* JADX INFO: renamed from: h */
    boolean mo23842h(InterfaceC1607p interfaceC1607p);

    /* JADX INFO: renamed from: i */
    long mo23843i(InterfaceC1607p interfaceC1607p);

    /* JADX INFO: renamed from: j */
    default C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            Objects.requireNonNull(interfaceC1607p, "field");
            return interfaceC1607p.mo24162E(this);
        }
        if (mo23842h(interfaceC1607p)) {
            return ((EnumC1592a) interfaceC1607p).f10817b;
        }
        throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
    }
}
