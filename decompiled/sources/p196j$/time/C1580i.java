package p196j$.time;

import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.i */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1580i implements InterfaceC1604m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10784a;

    public /* synthetic */ C1580i(int i) {
        this.f10784a = i;
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public Temporal mo23951f(Temporal temporal) {
        EnumC1592a enumC1592a = EnumC1592a.DAY_OF_MONTH;
        return temporal.mo23948c(temporal.mo23920j(enumC1592a).f10844d, enumC1592a);
    }

    /* JADX INFO: renamed from: j */
    public Object m24134j(InterfaceC1603l interfaceC1603l) {
        switch (this.f10784a) {
            case 0:
                return LocalDateTime.m23954E(interfaceC1603l);
            case 1:
                ZoneId zoneId = (ZoneId) interfaceC1603l.mo23841b(AbstractC1608q.f10834a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 2:
            default:
                EnumC1592a enumC1592a = EnumC1592a.NANO_OF_DAY;
                if (interfaceC1603l.mo23842h(enumC1592a)) {
                    return C1583l.m24138a0(interfaceC1603l.mo23843i(enumC1592a));
                }
                return null;
            case 3:
                return (ZoneId) interfaceC1603l.mo23841b(AbstractC1608q.f10834a);
            case 4:
                return (InterfaceC1535l) interfaceC1603l.mo23841b(AbstractC1608q.f10835b);
            case 5:
                return (TemporalUnit) interfaceC1603l.mo23841b(AbstractC1608q.f10836c);
            case 6:
                EnumC1592a enumC1592a2 = EnumC1592a.OFFSET_SECONDS;
                if (interfaceC1603l.mo23842h(enumC1592a2)) {
                    return ZoneOffset.m23978d0(interfaceC1603l.mo23952g(enumC1592a2));
                }
                return null;
            case 7:
                ZoneId zoneId2 = (ZoneId) interfaceC1603l.mo23841b(AbstractC1608q.f10834a);
                return zoneId2 != null ? zoneId2 : (ZoneId) interfaceC1603l.mo23841b(AbstractC1608q.f10837d);
            case 8:
                EnumC1592a enumC1592a3 = EnumC1592a.EPOCH_DAY;
                if (interfaceC1603l.mo23842h(enumC1592a3)) {
                    return C1579h.m24114i0(interfaceC1603l.mo23843i(enumC1592a3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10784a) {
            case 3:
                return "ZoneId";
            case 4:
                return "Chronology";
            case 5:
                return "Precision";
            case 6:
                return "ZoneOffset";
            case 7:
                return "Zone";
            case 8:
                return "LocalDate";
            case 9:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
