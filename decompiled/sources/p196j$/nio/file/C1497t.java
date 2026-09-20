package p196j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.t */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1497t implements OpenOption {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1498u f10592a;

    public /* synthetic */ C1497t(InterfaceC1498u interfaceC1498u) {
        this.f10592a = interfaceC1498u;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ OpenOption m23930a(InterfaceC1498u interfaceC1498u) {
        if (interfaceC1498u == null) {
            return null;
        }
        if (interfaceC1498u instanceof C1493s) {
            return ((C1493s) interfaceC1498u).f10586a;
        }
        if (!(interfaceC1498u instanceof LinkOption)) {
            return interfaceC1498u instanceof EnumC1472f0 ? AbstractC1419g.m23819b((EnumC1472f0) interfaceC1498u) : new C1497t(interfaceC1498u);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1498u interfaceC1498u = this.f10592a;
        if (obj instanceof C1497t) {
            obj = ((C1497t) obj).f10592a;
        }
        return interfaceC1498u.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10592a.hashCode();
    }
}
