package p196j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: j$.time.zone.g */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1623g implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f10889a;

    public C1623g(List list) {
        this.f10889a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            C1624h.m24208b(new C1624h());
            return null;
        }
        try {
            C1624h c1624h = (C1624h) C1624h.class.cast(Class.forName(property, true, C1624h.class.getClassLoader()).newInstance());
            C1624h.m24208b(c1624h);
            ((ArrayList) this.f10889a).add(c1624h);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
