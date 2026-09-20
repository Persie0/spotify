package p196j$.time.chrono;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import p196j$.time.C1512b;
import p196j$.time.C1583l;
import p196j$.time.Instant;
import p196j$.time.ZoneId;
import p196j$.time.format.EnumC1575w;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;

/* JADX INFO: renamed from: j$.time.chrono.l */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC1535l extends Comparable {
    /* JADX INFO: renamed from: of */
    static InterfaceC1535l m24038of(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC1514a.f10633a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC1514a.f10633a;
            InterfaceC1535l interfaceC1535l = (InterfaceC1535l) concurrentHashMap2.get(str);
            if (interfaceC1535l == null) {
                interfaceC1535l = (InterfaceC1535l) AbstractC1514a.f10634b.get(str);
            }
            if (interfaceC1535l != null) {
                return interfaceC1535l;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (InterfaceC1535l interfaceC1535l2 : ServiceLoader.load(InterfaceC1535l.class)) {
                    if (str.equals(interfaceC1535l2.mo24008o()) || str.equals(interfaceC1535l2.mo24009w())) {
                        return interfaceC1535l2;
                    }
                }
                throw new C1512b("Unknown chronology: ".concat(str));
            }
            C1538o c1538o = C1538o.f10662l;
            c1538o.getClass();
            AbstractC1514a.m23992E(c1538o, "Hijrah-umalqura");
            C1545v c1545v = C1545v.f10683c;
            c1545v.getClass();
            AbstractC1514a.m23992E(c1545v, "Japanese");
            C1515a0 c1515a0 = C1515a0.f10635c;
            c1515a0.getClass();
            AbstractC1514a.m23992E(c1515a0, "Minguo");
            C1527g0 c1527g0 = C1527g0.f10651c;
            c1527g0.getClass();
            AbstractC1514a.m23992E(c1527g0, "ThaiBuddhist");
            try {
                for (AbstractC1514a abstractC1514a : Arrays.asList(new AbstractC1514a[0])) {
                    if (!abstractC1514a.mo24008o().equals("ISO")) {
                        AbstractC1514a.m23992E(abstractC1514a, abstractC1514a.mo24008o());
                    }
                }
                C1542s c1542s = C1542s.f10679c;
                c1542s.getClass();
                AbstractC1514a.m23992E(c1542s, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    static InterfaceC1535l m24039q(InterfaceC1603l interfaceC1603l) {
        Objects.requireNonNull(interfaceC1603l, "temporal");
        InterfaceC1535l interfaceC1535l = (InterfaceC1535l) interfaceC1603l.mo23841b(AbstractC1608q.f10835b);
        C1542s c1542s = C1542s.f10679c;
        if (interfaceC1535l != null) {
            return interfaceC1535l;
        }
        Objects.requireNonNull(c1542s, "defaultObj");
        return c1542s;
    }

    /* JADX INFO: renamed from: C */
    C1610s mo23999C(EnumC1592a enumC1592a);

    /* JADX INFO: renamed from: D */
    List mo24000D();

    /* JADX INFO: renamed from: F */
    InterfaceC1536m mo24001F(int i);

    /* JADX INFO: renamed from: H */
    int mo24002H(InterfaceC1536m interfaceC1536m, int i);

    /* JADX INFO: renamed from: L */
    InterfaceC1516b mo24003L(InterfaceC1603l interfaceC1603l);

    /* JADX INFO: renamed from: O */
    InterfaceC1516b mo24004O();

    /* JADX INFO: renamed from: P */
    default ChronoLocalDateTime mo24040P(InterfaceC1603l interfaceC1603l) {
        try {
            return mo24003L(interfaceC1603l).mo24012N(C1583l.m24136K(interfaceC1603l));
        } catch (C1512b e) {
            throw new C1512b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC1603l.getClass(), e);
        }
    }

    /* JADX INFO: renamed from: U */
    InterfaceC1516b mo24005U(int i, int i2, int i3);

    /* JADX INFO: renamed from: W */
    InterfaceC1516b mo23996W(Map map, EnumC1575w enumC1575w);

    /* JADX INFO: renamed from: X */
    InterfaceC1530i mo24006X(Instant instant, ZoneId zoneId);

    boolean equals(Object obj);

    int hashCode();

    /* JADX INFO: renamed from: n */
    InterfaceC1516b mo24007n(long j);

    /* JADX INFO: renamed from: o */
    String mo24008o();

    String toString();

    /* JADX INFO: renamed from: w */
    String mo24009w();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.i] */
    /* JADX INFO: renamed from: y */
    default InterfaceC1530i mo24041y(InterfaceC1603l interfaceC1603l) {
        try {
            ZoneId zoneIdM23972r = ZoneId.m23972r(interfaceC1603l);
            try {
                interfaceC1603l = mo24006X(Instant.m23941E(interfaceC1603l), zoneIdM23972r);
                return interfaceC1603l;
            } catch (C1512b unused) {
                return C1534k.m24034E(zoneIdM23972r, null, C1524f.m24025r(this, mo24040P(interfaceC1603l)));
            }
        } catch (C1512b e) {
            throw new C1512b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC1603l.getClass(), e);
        }
    }

    /* JADX INFO: renamed from: z */
    InterfaceC1516b mo24010z(int i, int i2);
}
