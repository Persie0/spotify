package p196j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.s */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1493s implements InterfaceC1498u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OpenOption f10586a;

    public /* synthetic */ C1493s(OpenOption openOption) {
        this.f10586a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.u, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.u, java.nio.file.LinkOption] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC1498u m23926a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof C1497t) {
            return ((C1497t) openOption).f10592a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof EnumC1472f0 ? AbstractC1419g.m23819b((EnumC1472f0) openOption) : new C1493s(openOption);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.f10586a;
        if (obj instanceof C1493s) {
            obj = ((C1493s) obj).f10586a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10586a.hashCode();
    }
}
