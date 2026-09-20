package p204p;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o73 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162453a = 0;

    /* JADX INFO: renamed from: b */
    public Object f162454b;

    public /* synthetic */ o73() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        switch (this.f162453a) {
            case 0:
                int i2 = message.what;
                if (i2 == -3 || i2 == -2 || i2 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f162454b).get(), message.what);
                    break;
                } else if (i2 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                Bundle data = message.getData();
                yid1 yid1Var = (yid1) this.f162454b;
                boolean zM93727i = yid1Var.m93727i();
                Objects.toString(data);
                int i3 = message.what;
                if (i3 != 502) {
                    if (i3 != 702) {
                        if (i3 != 709) {
                            if (i3 != 710) {
                                switch (i3) {
                                    case 704:
                                        if (zM93727i) {
                                            yid1Var.m93731m(data.getInt("exitNumber"));
                                        }
                                        break;
                                    case 705:
                                        if (zM93727i) {
                                            yid1Var.m93728j(data.getInt("distanceMeters"), data.getString("distanceString"));
                                        }
                                        break;
                                    case 706:
                                        if (zM93727i) {
                                            yid1Var.m93733o(data.getBoolean("isLeftHandTraffic"));
                                        }
                                        break;
                                }
                            } else {
                                if (zM93727i) {
                                    yid1Var.m93730l(data.getBoolean("isNavigating"));
                                }
                                break;
                            }
                        } else {
                            if (zM93727i) {
                                data.getString("streetName");
                                yid1Var.m93732n();
                            }
                            break;
                        }
                    } else if (zM93727i && (i = data.getInt("instruction")) >= 0 && i < t3d1._values().length) {
                        yid1Var.m93729k(t3d1._values()[i]);
                        break;
                    }
                } else {
                    yid1Var.m93725f(data == null ? 0 : data.getInt("reason"));
                    break;
                }
                break;
        }
    }

    public o73(yid1 yid1Var) {
        this.f162454b = yid1Var;
    }
}
