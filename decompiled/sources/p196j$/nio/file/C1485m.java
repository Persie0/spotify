package p196j$.nio.file;

import java.io.IOException;
import p196j$.nio.file.attribute.BasicFileAttributes;
import p196j$.time.C1580i;
import p196j$.time.ZoneId;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.nio.file.m */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1485m implements InterfaceC1603l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10570a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f10571b;

    /* JADX INFO: renamed from: c */
    public final Object f10572c;

    /* JADX INFO: renamed from: d */
    public final Object f10573d;

    /* JADX INFO: renamed from: e */
    public final Object f10574e;

    public C1485m(EnumC1487n enumC1487n, Path path, BasicFileAttributes basicFileAttributes, IOException iOException) {
        this.f10571b = enumC1487n;
        this.f10572c = path;
        this.f10573d = basicFileAttributes;
        this.f10574e = iOException;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10835b) {
            return (InterfaceC1535l) this.f10573d;
        }
        if (c1580i == AbstractC1608q.f10834a) {
            return (ZoneId) this.f10574e;
        }
        return c1580i == AbstractC1608q.f10836c ? ((InterfaceC1603l) this.f10572c).mo23841b(c1580i) : c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        InterfaceC1516b interfaceC1516b = (InterfaceC1516b) this.f10571b;
        return (interfaceC1516b == null || !interfaceC1607p.isDateBased()) ? ((InterfaceC1603l) this.f10572c).mo23842h(interfaceC1607p) : interfaceC1516b.mo23842h(interfaceC1607p);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public long mo23843i(InterfaceC1607p interfaceC1607p) {
        InterfaceC1516b interfaceC1516b = (InterfaceC1516b) this.f10571b;
        return (interfaceC1516b == null || !interfaceC1607p.isDateBased()) ? ((InterfaceC1603l) this.f10572c).mo23843i(interfaceC1607p) : interfaceC1516b.mo23843i(interfaceC1607p);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        InterfaceC1516b interfaceC1516b = (InterfaceC1516b) this.f10571b;
        return (interfaceC1516b == null || !interfaceC1607p.isDateBased()) ? ((InterfaceC1603l) this.f10572c).mo23920j(interfaceC1607p) : interfaceC1516b.mo23920j(interfaceC1607p);
    }

    public String toString() {
        String str;
        switch (this.f10570a) {
            case 1:
                InterfaceC1603l interfaceC1603l = (InterfaceC1603l) this.f10572c;
                InterfaceC1535l interfaceC1535l = (InterfaceC1535l) this.f10573d;
                String str2 = "";
                if (interfaceC1535l != null) {
                    str = " with chronology " + interfaceC1535l;
                } else {
                    str = "";
                }
                ZoneId zoneId = (ZoneId) this.f10574e;
                if (zoneId != null) {
                    str2 = " with zone " + zoneId;
                }
                return interfaceC1603l + str + str2;
            default:
                return super.toString();
        }
    }

    public C1485m(InterfaceC1516b interfaceC1516b, InterfaceC1603l interfaceC1603l, InterfaceC1535l interfaceC1535l, ZoneId zoneId) {
        this.f10571b = interfaceC1516b;
        this.f10572c = interfaceC1603l;
        this.f10573d = interfaceC1535l;
        this.f10574e = zoneId;
    }
}
