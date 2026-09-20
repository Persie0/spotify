package p204p;

import android.content.Context;
import android.graphics.PorterDuff;
import android.media.ImageReader;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.spotify.music.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class y85 {

    /* JADX INFO: renamed from: X */
    public static Context f270200X;

    /* JADX INFO: renamed from: Y */
    public static jwf1 f270201Y;

    /* JADX INFO: renamed from: a */
    public static final float[] f270202a = new float[91];

    /* JADX INFO: renamed from: b */
    public static final aef0 f270203b = new aef0(18);

    /* JADX INFO: renamed from: c */
    public static Field f270204c;

    /* JADX INFO: renamed from: d */
    public static boolean f270205d;

    /* JADX INFO: renamed from: e */
    public static Class f270206e;

    /* JADX INFO: renamed from: f */
    public static boolean f270207f;

    /* JADX INFO: renamed from: g */
    public static Field f270208g;

    /* JADX INFO: renamed from: h */
    public static boolean f270209h;

    /* JADX INFO: renamed from: i */
    public static Field f270210i;

    /* JADX INFO: renamed from: t */
    public static boolean f270211t;

    /* JADX INFO: renamed from: A */
    public static final boolean m93044A(cqi0 cqi0Var, Object obj, Object obj2) {
        Object objM33623g = cqi0Var.m33623g(obj);
        if (objM33623g == null) {
            return false;
        }
        if (!(objM33623g instanceof dqi0)) {
            if (!objM33623g.equals(obj2)) {
                return false;
            }
            cqi0Var.m33627k(obj);
            return true;
        }
        dqi0 dqi0Var = (dqi0) objM33623g;
        boolean zM36653l = dqi0Var.m36653l(obj2);
        if (zM36653l && dqi0Var.m36648g()) {
            cqi0Var.m33627k(obj);
        }
        return zM36653l;
    }

    /* JADX INFO: renamed from: B */
    public static final void m93045B(cqi0 cqi0Var, Object obj) {
        boolean zM36648g;
        long[] jArr = cqi0Var.f40896a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = cqi0Var.f40897b[i4];
                        Object obj3 = cqi0Var.f40898c[i4];
                        if (obj3 instanceof dqi0) {
                            dqi0 dqi0Var = (dqi0) obj3;
                            dqi0Var.m36653l(obj);
                            zM36648g = dqi0Var.m36648g();
                        } else {
                            zM36648g = obj3 == obj;
                        }
                        if (zM36648g) {
                            cqi0Var.m33628l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m93046C(dpn0 dpn0Var) {
        Context contextM69343a = p8y.m69343a();
        try {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextM69343a.openFileOutput("AppEventsLogger.persistedevents", 0)));
                try {
                    objectOutputStream.writeObject(dpn0Var);
                    objectOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n0e1.m63430g(objectOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            contextM69343a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m93047D(View view, h9y0 h9y0Var) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, h9y0Var);
    }

    /* JADX INFO: renamed from: E */
    public static final qe10 m93048E(qe10 qe10Var, float f) {
        return m93071r(m93053J(qe10Var, f), f);
    }

    /* JADX INFO: renamed from: F */
    public static String m93049F(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: G */
    public static final void m93050G(View view, Object obj) {
        view.setTag(R.id.library_view_tag, obj);
    }

    /* JADX INFO: renamed from: H */
    public static String m93051H(Map map) {
        StringBuilder sbM95942w = zdg1.m95942w(map.size());
        sbM95942w.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sbM95942w.append(", ");
            }
            sbM95942w.append(entry.getKey());
            sbM95942w.append('=');
            sbM95942w.append(entry.getValue());
            z = false;
        }
        sbM95942w.append('}');
        return sbM95942w.toString();
    }

    /* JADX INFO: renamed from: I */
    public static z2l0 m93052I(int i, int i2) {
        return i == 100 ? j2l0.f108101a : ahf1.m25947s(i2, i);
    }

    /* JADX INFO: renamed from: J */
    public static final qe10 m93053J(qe10 qe10Var, float f) {
        return qe10Var.mo66783d(new tud1(new kjr(f)));
    }

    /* JADX INFO: renamed from: K */
    public static jwf1 m93054K(Context context) throws GooglePlayServicesNotAvailableException {
        jwf1 jwf1Var;
        ig31.m50506x(context);
        "preferredRenderer: ".concat("null");
        jwf1 jwf1Var2 = f270201Y;
        if (jwf1Var2 != null) {
            return jwf1Var2;
        }
        int i = wo10.f253339e;
        int iM88620f = wo10.m88620f(context, 13400000);
        if (iM88620f != 0) {
            throw new GooglePlayServicesNotAvailableException(iM88620f);
        }
        ClassLoader classLoader = m93055L(context).getClassLoader();
        try {
            ig31.m50506x(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                    if (iBinder == null) {
                        jwf1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        jwf1Var = iInterfaceQueryLocalInterface instanceof jwf1 ? (jwf1) iInterfaceQueryLocalInterface : new jwf1(iBinder);
                    }
                    f270201Y = jwf1Var;
                    try {
                        Context contextM93055L = m93055L(context);
                        contextM93055L.getClass();
                        jwf1Var.m54445m2(new imk0(contextM93055L.getResources()));
                        return f270201Y;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (InstantiationException unused) {
                    throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()));
                }
            } catch (IllegalAccessException unused2) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()));
            }
        } catch (ClassNotFoundException unused3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    /* JADX INFO: renamed from: L */
    public static Context m93055L(Context context) {
        Context contextM88618d;
        Context context2 = f270200X;
        if (context2 != null) {
            return context2;
        }
        context.getApplicationContext();
        try {
            contextM88618d = aos.m26614c(context, aos.f17747b, "com.google.android.gms.maps_dynamite").f17760a;
        } catch (Exception unused) {
            if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                int i = wo10.f253339e;
                contextM88618d = wo10.m88618d(context);
            } else {
                try {
                    contextM88618d = aos.m26614c(context, aos.f17747b, "com.google.android.gms.maps_dynamite").f17760a;
                } catch (Exception unused2) {
                    int i2 = wo10.f253339e;
                    contextM88618d = wo10.m88618d(context);
                }
            }
        }
        f270200X = contextM88618d;
        return contextM88618d;
    }

    /* JADX INFO: renamed from: a */
    public static zqq m93056a(float f) {
        return new zqq(f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x008c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce A[PHI: r2 r5 r6 r8
      0x00ce: PHI (r2v18 int) = (r2v13 int), (r2v19 int), (r2v20 int) binds: [B:87:0x00e7, B:76:0x00cb, B:77:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r5v6 p.fxh0) = (r5v3 p.fxh0), (r5v2 p.fxh0), (r5v2 p.fxh0) binds: [B:87:0x00e7, B:76:0x00cb, B:77:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r6v13 long) = (r6v9 long), (r6v6 long), (r6v6 long) binds: [B:87:0x00e7, B:76:0x00cb, B:77:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r8v9 long) = (r8v5 long), (r8v2 long), (r8v2 long) binds: [B:87:0x00e7, B:76:0x00cb, B:77:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m93057b(wwu wwuVar, sgj sgjVar, fxh0 fxh0Var, long j, long j2, boolean z, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        long jM60224n;
        long j3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        fxh0 fxh0Var3;
        long j4;
        long j5;
        boolean z4;
        pgv0 pgv0VarM91796v;
        boolean z5;
        xq00Var.m91775k0(1008685861);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(wwuVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(sgjVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91770i(fxh0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    jM60224n = j;
                    int i7 = xq00Var.m91764f(jM60224n) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    jM60224n = j;
                }
                i3 |= i7;
            } else {
                jM60224n = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i8 = xq00Var.m91764f(j3) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    j3 = j2;
                }
                i3 |= i8;
            } else {
                j3 = j2;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (xq00Var.m91768h(z2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z3)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0 || xq00Var.m91735E()) {
                        if (i6 != 0) {
                            fxh0Var2 = cxh0.f43038a;
                        }
                        if ((i2 & 8) != 0) {
                            int i9 = n6f.f150872l;
                            jM60224n = ly5.m60224n();
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j3 = jM60224n;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        }
                        xq00Var.m91790s();
                        m93058c(wwuVar.f255837a, wwuVar.f255838b, sgjVar, fxh0Var2, jM60224n, j3, z5, xq00Var, (i3 << 3) & 4194176);
                        fxh0Var3 = fxh0Var2;
                        j4 = jM60224n;
                        j5 = j3;
                        z4 = z5;
                    } else {
                        xq00Var.m91757b0();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    z5 = z2;
                    xq00Var.m91790s();
                    m93058c(wwuVar.f255837a, wwuVar.f255838b, sgjVar, fxh0Var2, jM60224n, j3, z5, xq00Var, (i3 << 3) & 4194176);
                    fxh0Var3 = fxh0Var2;
                    j4 = jM60224n;
                    j5 = j3;
                    z4 = z5;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    j4 = jM60224n;
                    j5 = j3;
                    z4 = z2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new mmu(wwuVar, sgjVar, fxh0Var3, j4, j5, z4, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z3)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        fxh0Var2 = cxh0.f43038a;
                    }
                    if ((i2 & 8) != 0) {
                        int i10 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jM60224n;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i6 != 0) {
                        fxh0Var2 = cxh0.f43038a;
                    }
                    if ((i2 & 8) != 0) {
                        int i11 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jM60224n;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                }
                xq00Var.m91790s();
                m93058c(wwuVar.f255837a, wwuVar.f255838b, sgjVar, fxh0Var2, jM60224n, j3, z5, xq00Var, (i3 << 3) & 4194176);
                fxh0Var3 = fxh0Var2;
                j4 = jM60224n;
                j5 = j3;
                z4 = z5;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                j4 = jM60224n;
                j5 = j3;
                z4 = z2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new mmu(wwuVar, sgjVar, fxh0Var3, j4, j5, z4, i, i2);
            }
        }
        i3 |= 384;
        fxh0Var2 = fxh0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM60224n = j;
                if (xq00Var.m91764f(jM60224n)) {
                }
                i3 |= i7;
            } else {
                jM60224n = j;
            }
            i3 |= i7;
        } else {
            jM60224n = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j3 = j2;
                if (xq00Var.m91764f(j3)) {
                }
                i3 |= i8;
            } else {
                j3 = j2;
            }
            i3 |= i8;
        } else {
            j3 = j2;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (xq00Var.m91768h(z2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z3)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        fxh0Var2 = cxh0.f43038a;
                    }
                    if ((i2 & 8) != 0) {
                        int i12 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jM60224n;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i6 != 0) {
                        fxh0Var2 = cxh0.f43038a;
                    }
                    if ((i2 & 8) != 0) {
                        int i13 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jM60224n;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                }
                xq00Var.m91790s();
                m93058c(wwuVar.f255837a, wwuVar.f255838b, sgjVar, fxh0Var2, jM60224n, j3, z5, xq00Var, (i3 << 3) & 4194176);
                fxh0Var3 = fxh0Var2;
                j4 = jM60224n;
                j5 = j3;
                z4 = z5;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                j4 = jM60224n;
                j5 = j3;
                z4 = z2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new mmu(wwuVar, sgjVar, fxh0Var3, j4, j5, z4, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z3)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    fxh0Var2 = cxh0.f43038a;
                }
                if ((i2 & 8) != 0) {
                    int i14 = n6f.f150872l;
                    jM60224n = ly5.m60224n();
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j3 = jM60224n;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
            } else {
                if (i6 != 0) {
                    fxh0Var2 = cxh0.f43038a;
                }
                if ((i2 & 8) != 0) {
                    int i15 = n6f.f150872l;
                    jM60224n = ly5.m60224n();
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j3 = jM60224n;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
            }
            xq00Var.m91790s();
            m93058c(wwuVar.f255837a, wwuVar.f255838b, sgjVar, fxh0Var2, jM60224n, j3, z5, xq00Var, (i3 << 3) & 4194176);
            fxh0Var3 = fxh0Var2;
            j4 = jM60224n;
            j5 = j3;
            z4 = z5;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            j4 = jM60224n;
            j5 = j3;
            z4 = z2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mmu(wwuVar, sgjVar, fxh0Var3, j4, j5, z4, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m93058c(suu suuVar, suu suuVar2, sgj sgjVar, fxh0 fxh0Var, long j, long j2, boolean z, xq00 xq00Var, int i) {
        int i2;
        sd40 sd40Var;
        xq00Var.m91775k0(1940588459);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(suuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(suuVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(sgjVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91764f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91764f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91768h(z) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            xq00Var.m91771i0(889712249);
            long j3 = j != 16 ? j : ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
            xq00Var.m91788r(false);
            long j4 = j2 != 16 ? j2 : j3;
            if (z) {
                j3 = j4;
            }
            xq00Var.m91771i0(889718949);
            float fMo35989Z0 = ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35989Z0(mjx0.m62001E(xq00Var));
            xq00Var.m91788r(false);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            if (!z || suuVar2 == null) {
                sd40Var = ((Boolean) kqi0Var.getValue()).booleanValue() ? suuVar.f214218a : suuVar.f214219b;
            } else {
                sd40Var = ((Boolean) kqi0Var.getValue()).booleanValue() ? suuVar2.f214218a : suuVar2.f214219b;
            }
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | xq00Var.m91760d(fMo35989Z0);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new nmu(fMo35989Z0, kqi0Var);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM45144n = glf1.m45144n(fxh0Var, (gh00) objM91750T2);
            e5b1 e5b1VarM32720r = cgg1.m32720r(sd40Var, xq00Var);
            rgj rgjVar = sgjVar instanceof rgj ? (rgj) sgjVar : null;
            gz30.m46187c(e5b1VarM32720r, rgjVar != null ? rgjVar.f198967a : null, fxh0VarM45144n, j3, xq00Var, 8, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new omu(suuVar, suuVar2, sgjVar, fxh0Var, j, j2, z, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m93059d(rns rnsVar, fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1977781714);
        if (((i | 2) & 19) == 18 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
        } else {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                rnsVar = (rns) xq00Var.m91774k(tsh.m81440a());
            } else {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            qqg1.m73533c(new c4t0[]{tsh.m81440a().mo30068a(rnsVar)}, fyfVar, xq00Var, 48);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gq3(rnsVar, fyfVar, i, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m93060e(cqi0 cqi0Var, Object obj, Object obj2) {
        int iM33622f = cqi0Var.m33622f(obj);
        boolean z = iM33622f < 0;
        Object obj3 = z ? null : cqi0Var.f40898c[iM33622f];
        if (obj3 != null) {
            if (obj3 instanceof dqi0) {
                ((dqi0) obj3).m36642a(obj2);
            } else if (obj3 != obj2) {
                dqi0 dqi0Var = new dqi0();
                dqi0Var.m36642a(obj3);
                dqi0Var.m36642a(obj2);
                obj2 = dqi0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            cqi0Var.f40898c[iM33622f] = obj2;
            return;
        }
        int i = ~iM33622f;
        cqi0Var.f40897b[i] = obj;
        cqi0Var.f40898c[i] = obj2;
    }

    /* JADX INFO: renamed from: f */
    public static void m93061f(Throwable th, Throwable th2) {
        if (th != th2) {
            xtf1.f265861a.m82745i(th, th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m93062g(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        ddg1.m35736g(i, "expectedSize");
        return i + 1;
    }

    /* JADX INFO: renamed from: h */
    public static cqi0 m93063h() {
        long[] jArr = rdy0.f198228a;
        return new cqi0();
    }

    /* JADX INFO: renamed from: i */
    public static C1668ai m93064i(int i, int i2, int i3, int i4) {
        return new C1668ai(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m93065j(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final qe10 m93066k(qe10 qe10Var) {
        return m93067l(qe10Var).mo66783d(new dq20(mjr.f144315a));
    }

    /* JADX INFO: renamed from: l */
    public static final qe10 m93067l(qe10 qe10Var) {
        return qe10Var.mo66783d(new tud1(mjr.f144315a));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX INFO: renamed from: m */
    public static Method m93068m(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r11;
        boolean z;
        int length = methodArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            method = methodArr[i];
            if (str.equals(method.getName()) || bm51.m29803n0(method.getName(), str.concat("-"), z2)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z3 = z2;
                    ?? r12 = z3;
                    while (r11 < length2) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        jqv0 jqv0Var = qpv0.f191387a;
                        if (jqv0Var.mo54112b(cls).equals(jqv0Var.mo54112b(cls2)) || cls.isAssignableFrom(cls2)) {
                            r11 = z3;
                            r11 = z3;
                            z = true;
                        } else {
                            r11 = z3;
                            z = false;
                        }
                        arrayList.add(Boolean.valueOf(z));
                        r12 = i2;
                        r11++;
                    }
                    r11 = z3;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i++;
            z2 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    /* JADX INFO: renamed from: n */
    public static final h9y0 m93069n(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            h9y0 h9y0Var = tag instanceof h9y0 ? (h9y0) tag : null;
            if (h9y0Var != null) {
                return h9y0Var;
            }
            Object objM83709z = upf.m83709z(view);
            view = objM83709z instanceof View ? (View) objM83709z : null;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: o */
    public static final z2l0 m93070o(int i, String str) {
        t2l0 t2l0Var = t2l0.f216587a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1309235419:
                    if (str.equals("expired")) {
                        return r2l0.f195167a;
                    }
                    break;
                case -1211129254:
                    if (str.equals("downloading")) {
                        return ahf1.m25938j(i);
                    }
                    break;
                case -934422706:
                    if (str.equals("resync")) {
                        return v2l0.f236696a;
                    }
                    break;
                case 3521:
                    str.equals("no");
                    return t2l0Var;
                case 119527:
                    if (str.equals("yes")) {
                        return j2l0.f108101a;
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        return n2l0.f149784a;
                    }
                    break;
                case 111293437:
                    if (str.equals("waitingSyncNotAllowed")) {
                        return m93052I(i, 4);
                    }
                    break;
                case 119284121:
                    if (str.equals("waitingOfflineMode")) {
                        return m93052I(i, 2);
                    }
                    break;
                case 1116313165:
                    if (str.equals("waiting")) {
                        return m93052I(i, 1);
                    }
                    break;
                case 1881262700:
                    if (str.equals("waitingNoConnection")) {
                        return m93052I(i, 3);
                    }
                    break;
                case 1987113811:
                    if (str.equals("exceeded")) {
                        return p2l0.f173367a;
                    }
                    break;
            }
        }
        return t2l0Var;
    }

    /* JADX INFO: renamed from: r */
    public static final qe10 m93071r(qe10 qe10Var, float f) {
        return qe10Var.mo66783d(new dq20(new kjr(f)));
    }

    /* JADX INFO: renamed from: s */
    public static void m93072s(String str, String str2, xq00 xq00Var, Object... objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Method methodM93068m;
        Method method;
        Class<?> cls = Class.forName(str);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = objArrCopyOf.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArrCopyOf[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                b450 b450VarM63417Y = n0e1.m63417Y(0, iCeil);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(b450VarM63417Y, 10));
                Iterator it = b450VarM63417Y.iterator();
                while (((a450) it).f12141c) {
                    ((t350) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                mbq mbqVar = new mbq(3);
                mbqVar.m61422c(clsArr);
                mbqVar.m61421b(xq00.class);
                mbqVar.m61422c(clsArr2);
                methodM93068m = m93068m(declaredMethods, str2, (Class[]) mbqVar.m61424e(new Class[mbqVar.m61423d()]));
            } catch (ReflectiveOperationException unused) {
                Method[] declaredMethods2 = cls.getDeclaredMethods();
                int length3 = declaredMethods2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        method = null;
                        break;
                    }
                    method = declaredMethods2[i2];
                    if (wj50.m88271j(method.getName(), str2)) {
                        break;
                    }
                    if (bm51.m29803n0(method.getName(), str2 + '-', false)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                methodM93068m = method;
            }
        } catch (ReflectiveOperationException unused2) {
            methodM93068m = null;
        }
        if (methodM93068m != null) {
            methodM93068m.setAccessible(true);
            if (Modifier.isStatic(methodM93068m.getModifiers())) {
                m93073t(methodM93068m, null, xq00Var, Arrays.copyOf(objArr, objArr.length));
                return;
            } else {
                m93073t(methodM93068m, cls.getConstructor(null).newInstance(null), xq00Var, Arrays.copyOf(objArr, objArr.length));
                return;
            }
        }
        throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX INFO: renamed from: t */
    public static void m93073t(Method method, Object obj, xq00 xq00Var, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (wj50.m88271j(parameterTypes[length], xq00.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int iCeil = (i != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i)) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i) / 31.0d) : 0) + iCeil != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    objValueOf = xq00Var;
                } else if (i3 <= i4 && i4 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i4 || i4 >= length2) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    objValueOf = 2097151;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                switch (method.getParameterTypes()[i4].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i4];
            }
            objArr2[i4] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m93074u(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m93075v(sr60 sr60Var, sr60 sr60Var2) {
        if (ci61.m32883c()) {
            return tw41.m81642p(((zwq) sr60Var).m97155S(), ((zwq) sr60Var2).m97155S());
        }
        return ket.m56239k(ket.f121967c, new kqp(false, false, false, oyq0.f171867g, C1890ga.f77932d, C1930ha.f89079c), (AbstractC1969i7) sr60Var, (AbstractC1969i7) sr60Var2);
    }

    /* JADX INFO: renamed from: x */
    public static PorterDuff.Mode m93076x(int i) {
        if (i == 0) {
            return null;
        }
        switch (edb.m38547C(i)) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.ADD;
            case 13:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case 16:
                return PorterDuff.Mode.DARKEN;
            case 17:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final cva m93077y(String str) {
        byte[] bArrM89349a = wy8.f256230b.m89349a(str.toUpperCase(Locale.US));
        return gva.m45886d(0, bArrM89349a, bArrM89349a.length);
    }

    /* JADX INFO: renamed from: z */
    public static final synchronized dpn0 m93078z() {
        File fileStreamPath;
        dpn0 dpn0Var;
        Context contextM69343a = p8y.m69343a();
        dpn0 dpn0Var2 = null;
        try {
            try {
                try {
                    x85 x85Var = new x85(new BufferedInputStream(contextM69343a.openFileInput("AppEventsLogger.persistedevents")));
                    try {
                        dpn0Var = (dpn0) x85Var.readObject();
                        try {
                            x85Var.close();
                            try {
                                contextM69343a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                            } catch (Exception unused) {
                            }
                        } catch (FileNotFoundException unused2) {
                            dpn0Var2 = dpn0Var;
                            fileStreamPath = contextM69343a.getFileStreamPath("AppEventsLogger.persistedevents");
                            fileStreamPath.delete();
                            dpn0Var = dpn0Var2;
                        } catch (IOException unused3) {
                            dpn0Var2 = dpn0Var;
                            fileStreamPath = contextM69343a.getFileStreamPath("AppEventsLogger.persistedevents");
                            fileStreamPath.delete();
                            dpn0Var = dpn0Var2;
                        } catch (ClassNotFoundException unused4) {
                            dpn0Var2 = dpn0Var;
                            fileStreamPath = contextM69343a.getFileStreamPath("AppEventsLogger.persistedevents");
                            fileStreamPath.delete();
                            dpn0Var = dpn0Var2;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            n0e1.m63430g(x85Var, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused5) {
                    dpn0Var = dpn0Var2;
                }
            } catch (Throwable th3) {
                try {
                    contextM69343a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused6) {
                }
                throw th3;
            }
        } catch (FileNotFoundException unused7) {
        } catch (IOException unused8) {
        } catch (ClassNotFoundException unused9) {
        }
        if (dpn0Var == null) {
            dpn0Var = new dpn0();
        }
        return dpn0Var;
    }

    /* JADX INFO: renamed from: p */
    public nd20 m93079p(CharSequence charSequence, Charset charset) {
        return mo28837w().mo31863R(charSequence.toString().getBytes(charset)).mo25555F();
    }

    /* JADX INFO: renamed from: q */
    public nd20 m93080q(String str) {
        int length = str.length() * 2;
        c95.m31842h("expectedInputSize must be >= 0 but was %s", length, length >= 0);
        c95 c95VarMo28837w = mo28837w();
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            c95VarMo28837w.mo25557T(str.charAt(i));
        }
        return c95VarMo28837w.mo25555F();
    }

    /* JADX INFO: renamed from: w */
    public abstract c95 mo28837w();
}
