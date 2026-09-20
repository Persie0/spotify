package p204p;

import android.companion.virtual.VirtualDevice;
import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l9s0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m58519a(Context context) {
        int[] displayIds;
        try {
            VirtualDevice virtualDeviceM58522d = m58522d(m58520b(context));
            if (virtualDeviceM58522d == null || (displayIds = virtualDeviceM58522d.getDisplayIds()) == null) {
                displayIds = new int[0];
            }
            if (displayIds.length != 0) {
                for (Display display : ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplays()) {
                    if (wj50.m88271j(display.getName(), "ProjectionDisplay") && bk5.m29619k0(displayIds, display.getDisplayId())) {
                        return true;
                    }
                }
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final Context m58520b(Context context) {
        Object next;
        boolean zM29803n0;
        Iterator<T> it = wuk0.m89060d(context.getSystemService(wuk0.m89064j())).getVirtualDevices().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String name = wuk0.m89059c(next).getName();
            zM29803n0 = false;
            if (name != null) {
                zM29803n0 = bm51.m29803n0(name, "ProjectionDevice", false);
            }
        } while (!zM29803n0);
        VirtualDevice virtualDeviceM89059c = wuk0.m89059c(next);
        Integer numValueOf = virtualDeviceM89059c != null ? Integer.valueOf(virtualDeviceM89059c.getDeviceId()) : null;
        if (numValueOf != null) {
            return context.createDeviceContext(numValueOf.intValue());
        }
        throw new IllegalStateException("Projected device not found.");
    }

    /* JADX INFO: renamed from: c */
    public static final String m58521c(Context context) {
        if (!m58523e(context)) {
            throw new IllegalArgumentException("Provided context is not the Projected device context. Can't get the device name.");
        }
        VirtualDevice virtualDeviceM58522d = m58522d(context);
        if (virtualDeviceM58522d != null) {
            return virtualDeviceM58522d.getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static VirtualDevice m58522d(Context context) {
        Object next;
        Iterator<T> it = ((VirtualDeviceManager) context.getSystemService(VirtualDeviceManager.class)).getVirtualDevices().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((VirtualDevice) next).getDeviceId() == context.getDeviceId()) {
                return (VirtualDevice) next;
            }
        }
        next = null;
        return (VirtualDevice) next;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m58523e(Context context) {
        String name;
        VirtualDevice virtualDeviceM58522d = m58522d(context);
        return (virtualDeviceM58522d == null || (name = virtualDeviceM58522d.getName()) == null || !bm51.m29803n0(name, "ProjectionDevice", false)) ? false : true;
    }
}
