package p204p;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.engage.service.AppEngageException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.engage.zzp;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.functions.Function3;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class dvb1 implements Function3, iuk, gbk {
    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean z = !zBooleanValue3;
        return new v1k(true, false, false, true, zBooleanValue2, zBooleanValue3, z, z, false, false, zBooleanValue, z, z, 11782);
    }

    @Override // p204p.gbk
    /* JADX INFO: renamed from: b */
    public Object mo25397b(Task task) {
        C2617yl c2617yl = k8f1.f120355f;
        if (((y7h1) task).f270088d) {
            return bga.m29101w(new AppEngageException(3));
        }
        if (!task.mo1518j()) {
            Exception excMo1514f = task.mo1514f();
            if (excMo1514f != null) {
                return excMo1514f instanceof zzp ? bga.m29101w(new AppEngageException(2)) : bga.m29101w(excMo1514f);
            }
            return bga.m29101w(new AppEngageException(3));
        }
        Bundle bundle = (Bundle) task.mo1515g();
        int i = bundle.getInt("service_error_code", -1);
        String string = bundle.getString("service_error_message", "");
        if (i <= 0) {
            return bga.m29102x(bundle);
        }
        if (TextUtils.isEmpty(string)) {
            return bga.m29101w(new AppEngageException(i));
        }
        AppEngageException appEngageException = new AppEngageException(new Status(i, klh.m56834f(String.format(Locale.getDefault(), "App Engage Service Error: %d", Integer.valueOf(i)), "\n", string), null, null));
        if (i != 0) {
            return bga.m29101w(appEngageException);
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
