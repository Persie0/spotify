package p204p;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.car.app.C0023j;
import androidx.car.app.C0024k;
import androidx.car.app.CarAppMetadataHolderService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iyb implements mbc0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106922a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f106923b;

    public /* synthetic */ iyb(C0023j c0023j) {
        this.f106923b = c0023j;
    }

    @Override // p204p.mbc0
    public final lbc0 create() {
        int i = this.f106922a;
        Object obj = this.f106923b;
        switch (i) {
            case 0:
                C0023j c0023j = (C0023j) obj;
                try {
                    int i2 = CarAppMetadataHolderService.f400a;
                    Bundle bundle = c0023j.getPackageManager().getServiceInfo(new ComponentName(c0023j, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                    String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
                    if (string == null) {
                        throw new ClassNotFoundException("ResultManager metadata could not be found");
                    }
                    if (Class.forName(string).getConstructor(null).newInstance(null) == null) {
                        return null;
                    }
                    throw new ClassCastException();
                } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                    throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
                }
            default:
                oc80 oc80Var = (oc80) obj;
                s161 s161Var = new s161();
                oc80Var.mo31986a(new ikd0(oc80Var, 2));
                return s161Var;
        }
    }

    public /* synthetic */ iyb(C0023j c0023j, C0024k c0024k, oc80 oc80Var) {
        this.f106923b = oc80Var;
    }
}
