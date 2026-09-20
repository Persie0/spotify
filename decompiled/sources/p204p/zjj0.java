package p204p;

import android.webkit.PermissionRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class zjj0 implements tlm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ akj0 f283451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f283452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PermissionRequest f283453c;

    public zjj0(akj0 akj0Var, ArrayList arrayList, PermissionRequest permissionRequest) {
        this.f283451a = akj0Var;
        this.f283452b = arrayList;
        this.f283453c = permissionRequest;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        if (!(olm0Var instanceof apn0)) {
            return false;
        }
        this.f283451a.f16558h.remove(this);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f283452b.iterator();
        while (true) {
            boolean zBooleanValue = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (wj50.m88271j(str, "android.webkit.resource.AUDIO_CAPTURE")) {
                Map map = ((apn0) olm0Var).f17988a;
                Boolean bool = (Boolean) map.get("android.permission.MODIFY_AUDIO_SETTINGS");
                if (bool != null ? bool.booleanValue() : true) {
                    Boolean bool2 = (Boolean) map.get("android.permission.RECORD_AUDIO");
                    if (!(bool2 != null ? bool2.booleanValue() : true)) {
                        zBooleanValue = false;
                    }
                } else {
                    zBooleanValue = false;
                }
            } else if (wj50.m88271j(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                Boolean bool3 = (Boolean) ((apn0) olm0Var).f17988a.get("android.permission.CAMERA");
                if (bool3 != null) {
                    zBooleanValue = bool3.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                arrayList.add(next);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        PermissionRequest permissionRequest = this.f283453c;
        if (zIsEmpty) {
            permissionRequest.deny();
            return true;
        }
        permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
        return true;
    }
}
