package androidx.car.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.C0014b;
import androidx.car.app.C0023j;
import androidx.car.app.C0024k;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.HostException;
import androidx.car.app.hardware.ProjectedCarHardwareManager;
import androidx.car.app.navigation.C0034b;
import java.util.HashMap;
import java.util.Objects;
import p204p.RunnableC2210od;
import p204p.b7l0;
import p204p.bmx;
import p204p.d6n0;
import p204p.iyb;
import p204p.jkd0;
import p204p.jyb;
import p204p.lbc0;
import p204p.mbc0;
import p204p.oc80;
import p204p.r7x0;
import p204p.s161;
import p204p.s6j;
import p204p.xiy0;
import p204p.zg71;

/* JADX INFO: renamed from: androidx.car.app.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C0023j extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public final b7l0 f432a;

    /* JADX INFO: renamed from: b */
    public final C0024k f433b;

    /* JADX INFO: renamed from: c */
    public final bmx f434c;

    /* JADX INFO: renamed from: d */
    public VirtualDisplay f435d;

    /* JADX INFO: renamed from: e */
    public int f436e;

    public C0023j(final oc80 oc80Var, final C0024k c0024k) {
        super(null);
        bmx bmxVar = new bmx();
        this.f434c = bmxVar;
        this.f435d = null;
        this.f436e = 0;
        this.f433b = c0024k;
        final int i = 0;
        bmxVar.m29905h(C0014b.class, "app", new mbc0(this) { // from class: p.gyb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0023j f85538b;

            {
                this.f85538b = this;
            }

            @Override // p204p.mbc0
            public final lbc0 create() {
                switch (i) {
                    case 0:
                        return new C0014b(this.f85538b, c0024k, oc80Var);
                    case 1:
                        return new C0034b(this.f85538b, c0024k, oc80Var);
                    default:
                        return new jkd0(this.f85538b, c0024k, oc80Var);
                }
            }
        });
        final int i2 = 1;
        bmxVar.m29905h(C0034b.class, d6n0.f45729b, new mbc0(this) { // from class: p.gyb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0023j f85538b;

            {
                this.f85538b = this;
            }

            @Override // p204p.mbc0
            public final lbc0 create() {
                switch (i2) {
                    case 0:
                        return new C0014b(this.f85538b, c0024k, oc80Var);
                    case 1:
                        return new C0034b(this.f85538b, c0024k, oc80Var);
                    default:
                        return new jkd0(this.f85538b, c0024k, oc80Var);
                }
            }
        });
        final int i3 = 2;
        bmxVar.m29905h(xiy0.class, "screen", new mbc0(this) { // from class: p.hyb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0023j f96536b;

            {
                this.f96536b = this;
            }

            @Override // p204p.mbc0
            public final lbc0 create() {
                int i4 = i3;
                Object obj = oc80Var;
                C0023j c0023j = this.f96536b;
                switch (i4) {
                    case 0:
                        return new s6j(c0023j, (C0024k) obj);
                    case 1:
                        C0024k c0024k2 = (C0024k) obj;
                        int i5 = c0023j.f436e;
                        if (i5 == 0) {
                            throw new IllegalStateException("Car App API level hasn't been established yet");
                        }
                        if (i5 < 3) {
                            throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i6 = CarAppMetadataHolderService.f400a;
                            Bundle bundle = c0023j.getPackageManager().getServiceInfo(new ComponentName(c0023j, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(C0023j.class, C0024k.class).newInstance(c0023j, c0024k2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                        }
                    default:
                        return new xiy0(c0023j, (oc80) obj);
                }
            }
        });
        final int i4 = 0;
        bmxVar.m29905h(s6j.class, "constraints", new mbc0(this) { // from class: p.hyb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0023j f96536b;

            {
                this.f96536b = this;
            }

            @Override // p204p.mbc0
            public final lbc0 create() {
                int i5 = i4;
                Object obj = c0024k;
                C0023j c0023j = this.f96536b;
                switch (i5) {
                    case 0:
                        return new s6j(c0023j, (C0024k) obj);
                    case 1:
                        C0024k c0024k2 = (C0024k) obj;
                        int i6 = c0023j.f436e;
                        if (i6 == 0) {
                            throw new IllegalStateException("Car App API level hasn't been established yet");
                        }
                        if (i6 < 3) {
                            throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i7 = CarAppMetadataHolderService.f400a;
                            Bundle bundle = c0023j.getPackageManager().getServiceInfo(new ComponentName(c0023j, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(C0023j.class, C0024k.class).newInstance(c0023j, c0024k2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                        }
                    default:
                        return new xiy0(c0023j, (oc80) obj);
                }
            }
        });
        final int i5 = 1;
        bmxVar.m29905h(ProjectedCarHardwareManager.class, "hardware", new mbc0(this) { // from class: p.hyb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0023j f96536b;

            {
                this.f96536b = this;
            }

            @Override // p204p.mbc0
            public final lbc0 create() {
                int i6 = i5;
                Object obj = c0024k;
                C0023j c0023j = this.f96536b;
                switch (i6) {
                    case 0:
                        return new s6j(c0023j, (C0024k) obj);
                    case 1:
                        C0024k c0024k2 = (C0024k) obj;
                        int i7 = c0023j.f436e;
                        if (i7 == 0) {
                            throw new IllegalStateException("Car App API level hasn't been established yet");
                        }
                        if (i7 < 3) {
                            throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i8 = CarAppMetadataHolderService.f400a;
                            Bundle bundle = c0023j.getPackageManager().getServiceInfo(new ComponentName(c0023j, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(C0023j.class, C0024k.class).newInstance(c0023j, c0024k2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                        }
                    default:
                        return new xiy0(c0023j, (oc80) obj);
                }
            }
        });
        bmxVar.m29905h(r7x0.class, null, new iyb(this));
        bmxVar.m29905h(s161.class, "suggestion", new iyb(this, c0024k, oc80Var));
        final int i6 = 2;
        bmxVar.m29905h(jkd0.class, "media_playback", new mbc0(this) { // from class: p.gyb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0023j f85538b;

            {
                this.f85538b = this;
            }

            @Override // p204p.mbc0
            public final lbc0 create() {
                switch (i6) {
                    case 0:
                        return new C0014b(this.f85538b, c0024k, oc80Var);
                    case 1:
                        return new C0034b(this.f85538b, c0024k, oc80Var);
                    default:
                        return new jkd0(this.f85538b, c0024k, oc80Var);
                }
            }
        });
        this.f432a = new b7l0(new RunnableC2210od(this, 22));
        oc80Var.mo31986a(new jyb(this, c0024k));
    }

    /* JADX INFO: renamed from: c */
    public final void m213c(Context context, Configuration configuration) {
        zg71.m96049a();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            Objects.requireNonNull(systemService);
            VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8);
            this.f435d = virtualDisplayCreateVirtualDisplay;
            attachBaseContext(context.createDisplayContext(virtualDisplayCreateVirtualDisplay.getDisplay()).createConfigurationContext(configuration));
        }
        m215e(configuration);
    }

    /* JADX INFO: renamed from: d */
    public final lbc0 m214d(Class cls) {
        bmx bmxVar = this.f434c;
        HashMap map = (HashMap) bmxVar.f28644b;
        HashMap map2 = (HashMap) bmxVar.f28645c;
        RuntimeException runtimeException = (RuntimeException) map2.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        lbc0 lbc0Var = (lbc0) map.get(cls);
        if (lbc0Var != null) {
            return lbc0Var;
        }
        mbc0 mbc0Var = (mbc0) ((HashMap) bmxVar.f28646d).get(cls);
        if (mbc0Var == null) {
            throw new IllegalArgumentException("The class '" + cls + "' does not correspond to a car service");
        }
        try {
            lbc0 lbc0VarCreate = mbc0Var.create();
            map.put(cls, lbc0VarCreate);
            return lbc0VarCreate;
        } catch (RuntimeException e) {
            map2.put(cls, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m215e(Configuration configuration) {
        zg71.m96049a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
            Objects.toString(getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        Objects.requireNonNull(configuration);
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }
}
