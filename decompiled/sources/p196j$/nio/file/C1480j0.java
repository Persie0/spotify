package p196j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.j0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1480j0 implements WatchEvent.Kind {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1482k0 f10562a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1482k0 interfaceC1482k0 = this.f10562a;
        if (obj instanceof C1480j0) {
            obj = ((C1480j0) obj).f10562a;
        }
        return interfaceC1482k0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10562a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.f10562a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.f10562a.type();
    }
}
