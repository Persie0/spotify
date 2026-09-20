package p196j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.i0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1478i0 implements InterfaceC1482k0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchEvent.Kind f10560a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.f10560a;
        if (obj instanceof C1478i0) {
            obj = ((C1478i0) obj).f10560a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10560a.hashCode();
    }

    @Override // p196j$.nio.file.InterfaceC1482k0
    public final /* synthetic */ String name() {
        return this.f10560a.name();
    }

    @Override // p196j$.nio.file.InterfaceC1482k0
    public final /* synthetic */ Class type() {
        return this.f10560a.type();
    }
}
