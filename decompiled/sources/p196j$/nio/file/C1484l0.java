package p196j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: j$.nio.file.l0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1484l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchEvent.Modifier f10569a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.f10569a;
        if (obj instanceof C1484l0) {
            obj = ((C1484l0) obj).f10569a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10569a.hashCode();
    }
}
