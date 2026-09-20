package p196j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p196j$.time.C1512b;
import p196j$.time.C1579h;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.chrono.y */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1548y implements InterfaceC1536m, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C1548y f10689d;

    /* JADX INFO: renamed from: e */
    public static final C1548y[] f10690e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a */
    public final transient int f10691a;

    /* JADX INFO: renamed from: b */
    public final transient C1579h f10692b;

    /* JADX INFO: renamed from: c */
    public final transient String f10693c;

    static {
        C1548y c1548y = new C1548y(-1, C1579h.m24113h0(1868, 1, 1), "Meiji");
        f10689d = c1548y;
        f10690e = new C1548y[]{c1548y, new C1548y(0, C1579h.m24113h0(1912, 7, 30), "Taisho"), new C1548y(1, C1579h.m24113h0(1926, 12, 25), "Showa"), new C1548y(2, C1579h.m24113h0(1989, 1, 8), "Heisei"), new C1548y(3, C1579h.m24113h0(2019, 5, 1), "Reiwa")};
    }

    public C1548y(int i, C1579h c1579h, String str) {
        this.f10691a = i;
        this.f10692b = c1579h;
        this.f10693c = str;
    }

    /* JADX INFO: renamed from: n */
    public static C1548y m24058n(C1579h c1579h) {
        if (c1579h.m24121c0(C1547x.f10685d)) {
            throw new C1512b("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f10690e.length - 1; length >= 0; length--) {
            C1548y c1548y = f10690e[length];
            if (c1579h.compareTo(c1548y.f10692b) >= 0) {
                return c1548y;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static C1548y m24059p(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            C1548y[] c1548yArr = f10690e;
            if (i2 < c1548yArr.length) {
                return c1548yArr[i2];
            }
        }
        throw new C1512b("Invalid era: " + i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1523e0((byte) 5, this);
    }

    @Override // p196j$.time.chrono.InterfaceC1536m
    public final int getValue() {
        return this.f10691a;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        EnumC1592a enumC1592a = EnumC1592a.ERA;
        return interfaceC1607p == enumC1592a ? C1545v.f10683c.mo23999C(enumC1592a) : super.mo23920j(interfaceC1607p);
    }

    /* JADX INFO: renamed from: o */
    public final C1548y m24060o() {
        C1548y[] c1548yArr = f10690e;
        if (this == c1548yArr[c1548yArr.length - 1]) {
            return null;
        }
        return m24059p(this.f10691a + 1);
    }

    public final String toString() {
        return this.f10693c;
    }
}
