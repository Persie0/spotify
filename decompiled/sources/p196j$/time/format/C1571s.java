package p196j$.time.format;

import java.util.Objects;
import p196j$.nio.file.C1485m;
import p196j$.time.C1512b;
import p196j$.time.C1580i;
import p196j$.time.ZoneId;
import p196j$.time.chrono.C1542s;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.format.s */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1571s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1603l f10756a;

    /* JADX INFO: renamed from: b */
    public final DateTimeFormatter f10757b;

    /* JADX INFO: renamed from: c */
    public int f10758c;

    public C1571s(InterfaceC1603l interfaceC1603l, DateTimeFormatter dateTimeFormatter) {
        InterfaceC1535l interfaceC1535l = dateTimeFormatter.f10705e;
        if (interfaceC1535l != null) {
            InterfaceC1535l interfaceC1535l2 = (InterfaceC1535l) interfaceC1603l.mo23841b(AbstractC1608q.f10835b);
            ZoneId zoneId = (ZoneId) interfaceC1603l.mo23841b(AbstractC1608q.f10834a);
            InterfaceC1516b interfaceC1516bMo24003L = null;
            interfaceC1535l = Objects.equals(interfaceC1535l, interfaceC1535l2) ? null : interfaceC1535l;
            if (interfaceC1535l != null) {
                InterfaceC1535l interfaceC1535l3 = interfaceC1535l != null ? interfaceC1535l : interfaceC1535l2;
                if (interfaceC1535l != null) {
                    if (interfaceC1603l.mo23842h(EnumC1592a.EPOCH_DAY)) {
                        interfaceC1516bMo24003L = interfaceC1535l3.mo24003L(interfaceC1603l);
                    } else if (interfaceC1535l != C1542s.f10679c || interfaceC1535l2 != null) {
                        for (EnumC1592a enumC1592a : EnumC1592a.values()) {
                            if (enumC1592a.isDateBased() && interfaceC1603l.mo23842h(enumC1592a)) {
                                throw new C1512b("Unable to apply override chronology '" + interfaceC1535l + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC1603l);
                            }
                        }
                    }
                }
                interfaceC1603l = new C1485m(interfaceC1516bMo24003L, interfaceC1603l, interfaceC1535l3, zoneId);
            }
        }
        this.f10756a = interfaceC1603l;
        this.f10757b = dateTimeFormatter;
    }

    /* JADX INFO: renamed from: a */
    public final Long m24100a(InterfaceC1607p interfaceC1607p) {
        int i = this.f10758c;
        InterfaceC1603l interfaceC1603l = this.f10756a;
        if (i <= 0 || interfaceC1603l.mo23842h(interfaceC1607p)) {
            return Long.valueOf(interfaceC1603l.mo23843i(interfaceC1607p));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m24101b(C1580i c1580i) {
        InterfaceC1603l interfaceC1603l = this.f10756a;
        Object objMo23841b = interfaceC1603l.mo23841b(c1580i);
        if (objMo23841b != null || this.f10758c != 0) {
            return objMo23841b;
        }
        throw new C1512b("Unable to extract " + c1580i + " from temporal " + interfaceC1603l);
    }

    public final String toString() {
        return this.f10756a.toString();
    }
}
