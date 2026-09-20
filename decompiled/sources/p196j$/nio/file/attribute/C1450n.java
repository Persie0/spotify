package p196j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.n */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1450n implements FileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1451o f10532a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1451o interfaceC1451o = this.f10532a;
        if (obj instanceof C1450n) {
            obj = ((C1450n) obj).f10532a;
        }
        return interfaceC1451o.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10532a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f10532a.name();
    }
}
