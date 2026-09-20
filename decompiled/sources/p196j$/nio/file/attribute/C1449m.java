package p196j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.m */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1449m implements InterfaceC1451o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileAttributeView f10531a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.f10531a;
        if (obj instanceof C1449m) {
            obj = ((C1449m) obj).f10531a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10531a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final /* synthetic */ String name() {
        return this.f10531a.name();
    }
}
