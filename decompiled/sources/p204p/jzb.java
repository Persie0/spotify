package p204p;

import android.os.IInterface;
import android.util.Log;
import androidx.car.app.C0024k;
import androidx.car.app.HostException;
import androidx.car.app.ICarHost;
import androidx.car.app.hardware.ICarHardwareHost;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jzb {

    /* JADX INFO: renamed from: a */
    public final C0024k f117670a;

    /* JADX INFO: renamed from: b */
    public ICarHardwareHost f117671b;

    public jzb(C0024k c0024k) {
        Objects.requireNonNull(c0024k);
        this.f117670a = c0024k;
    }

    /* JADX INFO: renamed from: a */
    public final ICarHardwareHost m54878a() {
        ICarHardwareHost iCarHardwareHost = this.f117671b;
        if (iCarHardwareHost != null) {
            return iCarHardwareHost;
        }
        C0024k c0024k = this.f117670a;
        c0024k.getClass();
        try {
            Log.isLoggable("CarApp", 3);
            IInterface iInterfaceM217b = c0024k.m217b("car");
            ICarHardwareHost iCarHardwareHostAsInterface = iInterfaceM217b == null ? null : ICarHardwareHost.Stub.asInterface(((ICarHost) iInterfaceM217b).getHost("hardware"));
            Objects.requireNonNull(iCarHardwareHostAsInterface);
            this.f117671b = iCarHardwareHostAsInterface;
            return iCarHardwareHostAsInterface;
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new HostException("Remote getHost(CarHardware) call failed", e2);
        }
    }
}
