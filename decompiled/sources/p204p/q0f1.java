package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0f1 {

    /* JADX INFO: renamed from: X */
    public static final gey f183995X;

    /* JADX INFO: renamed from: Y */
    public static final gey[] f183996Y;

    /* JADX INFO: renamed from: a */
    public static i1f1 f183997a;

    /* JADX INFO: renamed from: b */
    public static final zsd1 f183998b = new zsd1(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: c */
    public static final zsd1 f183999c = new zsd1(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: d */
    public static final zsd1 f184000d = new zsd1(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: e */
    public static final zsd1 f184001e = new zsd1(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: f */
    public static final float[] f184002f = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: g */
    public static final gey f184003g;

    /* JADX INFO: renamed from: h */
    public static final gey f184004h;

    /* JADX INFO: renamed from: i */
    public static final gey f184005i;

    /* JADX INFO: renamed from: t */
    public static final gey f184006t;

    static {
        gey geyVar = new gey("client_side_logging", -1, 1L, true);
        gey geyVar2 = new gey("cxless_client_minimal", -1, 1L, true);
        f184003g = geyVar2;
        gey geyVar3 = new gey("cxless_caf_control", -1, 1L, true);
        gey geyVar4 = new gey("module_flag_control", -1, 1L, true);
        f184004h = geyVar4;
        gey geyVar5 = new gey("discovery_hint_supply", -1, 1L, true);
        gey geyVar6 = new gey("relay_casting_set_active_account", -1, 1L, true);
        gey geyVar7 = new gey("analytics_proto_enum_translation", -1, 1L, true);
        f184005i = geyVar7;
        gey geyVar8 = new gey("integer_to_integer_map", -1, 1L, true);
        f184006t = geyVar8;
        gey geyVar9 = new gey("relay_casting_set_remote_casting_mode", -1, 1L, true);
        gey geyVar10 = new gey("get_relay_access_token", -1, 1L, true);
        gey geyVar11 = new gey("get_cast_settings", -1, 1L, true);
        gey geyVar12 = new gey("set_bundle_setting", -1, 1L, true);
        gey geyVar13 = new gey("get_client_updated_info", -1, 1L, true);
        gey geyVar14 = new gey("device_suggestions", -1, 1L, true);
        f183995X = geyVar14;
        f183996Y = new gey[]{geyVar, geyVar2, geyVar3, geyVar4, geyVar5, geyVar6, geyVar7, geyVar8, geyVar9, geyVar10, geyVar11, geyVar12, geyVar13, geyVar14};
    }

    /* JADX INFO: renamed from: A */
    public static final Single m71814A(ljx0 ljx0Var, gh00 gh00Var) {
        return vjf1.m85770t(ljx0Var.m59187m().mo26596D(gk40.f80712X0), new vwx0(1, null, gh00Var, ljx0Var));
    }

    /* JADX INFO: renamed from: B */
    public static final File m71815B(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), wj50.m88258c0(str, "datastore/"));
    }

    /* JADX INFO: renamed from: C */
    public static final View m71816C(int i, ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Index: ", ", Size: ");
        sbM56838j.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: D */
    public static final String m71817D(String str) {
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            uri = null;
        }
        if (uri != null) {
            return uri.getQueryParameter("shortlink_session_id");
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static File m71818E(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final void m71819F(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                zn91.m96584x(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m71820H(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                zn91.m96584x(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(a0f1.m24351l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m71821I(String str) {
        return str.equals(Request.POST) || str.equals("PATCH") || str.equals(Request.PUT) || str.equals(Request.DELETE) || str.equals("MOVE");
    }

    /* JADX INFO: renamed from: J */
    public static MappedByteBuffer m71822J(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m71823O(String str) {
        return (str.equals(Request.GET) || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public static String m71824P(Intent intent) {
        aa11 aa11Var = aa11.f13733f;
        Uri data = intent.getData();
        if (data == null) {
            throw new IllegalArgumentException("Intent data is null, cannot add shortlink_session_id");
        }
        String str = (String) aa11Var.invoke();
        intent.setData(m71828U(data, str));
        return str;
    }

    /* JADX INFO: renamed from: R */
    public static final List m71825R(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(g6f.m43741q0(list));
        }
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: S */
    public static final Map m71826S(Map map) {
        int size = map.size();
        if (size == 0) {
            return nau.f152117a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) g6f.m43739p0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a7 -> B:28:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: T */
    public static final java.lang.Object m71827T(p204p.b9v r9, p204p.vb40 r10, p204p.ivl0 r11, p204p.v5x r12, p204p.ibk r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.q0f1.m71827T(p.b9v, p.vb40, p.ivl0, p.v5x, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: U */
    public static final Uri m71828U(Uri uri, String str) {
        String string = uri.toString();
        ph30 ph30VarM76382c = null;
        try {
            rth rthVar = new rth();
            rthVar.m76391l(null, string);
            ph30VarM76382c = rthVar.m76382c();
        } catch (IllegalArgumentException unused) {
        }
        if (ph30VarM76382c != null) {
            rth rthVarM69943g = ph30VarM76382c.m69943g();
            rthVarM69943g.m76394o("shortlink_session_id", str);
            return Uri.parse(rthVarM69943g.m76382c().f177464i);
        }
        if (!uri.isHierarchical()) {
            return uri;
        }
        rth rthVar2 = new rth();
        rthVar2.m76393n(pka1.f178421b);
        rthVar2.m76389j("localhost");
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            rthVar2.m76386g(encodedQuery);
        }
        rth rthVarM69943g2 = rthVar2.m76382c().m69943g();
        rthVarM69943g2.m76394o("shortlink_session_id", str);
        return uri.buildUpon().encodedQuery(rthVarM69943g2.m76382c().m69940d()).build();
    }

    /* JADX INFO: renamed from: b */
    public static final void m71829b(final zm6 zm6Var, final String str, fxh0 fxh0Var, final gh00 gh00Var, final gh00 gh00Var2, final ob3 ob3Var, final muj mujVar, final float f, final ColorFilter colorFilter, final int i, final boolean z, xq00 xq00Var, final int i2, final int i3) {
        int i4;
        String str2;
        gh00 gh00Var3;
        gh00 gh00Var4;
        ob3 ob3Var2;
        int i5;
        boolean z2;
        int i6;
        final fxh0 fxh0Var2;
        vb40 vb40Var;
        xq00Var.m91775k0(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (xq00Var.m91766g(zm6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= xq00Var.m91766g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            gh00Var3 = gh00Var;
            i4 |= xq00Var.m91770i(gh00Var3) ? 2048 : 1024;
        } else {
            gh00Var3 = gh00Var;
        }
        if ((i2 & 24576) == 0) {
            gh00Var4 = gh00Var2;
            i4 |= xq00Var.m91770i(gh00Var4) ? 16384 : 8192;
        } else {
            gh00Var4 = gh00Var2;
        }
        if ((196608 & i2) == 0) {
            ob3Var2 = ob3Var;
            i4 |= xq00Var.m91766g(ob3Var2) ? 131072 : 65536;
        } else {
            ob3Var2 = ob3Var;
        }
        if ((1572864 & i2) == 0) {
            i4 |= xq00Var.m91766g(mujVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= xq00Var.m91760d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= xq00Var.m91766g(colorFilter) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 = i;
            i4 |= xq00Var.m91762e(i5) ? 536870912 : 268435456;
        } else {
            i5 = i;
        }
        if ((i3 & 6) == 0) {
            z2 = z;
            i6 = i3 | (xq00Var.m91768h(z2) ? 4 : 2);
        } else {
            z2 = z;
            i6 = i3;
        }
        if (xq00Var.m91752Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            Object obj = zm6Var.f284165a;
            int i7 = e1b1.f55173b;
            Object obj2 = t6x0.f217647t;
            xq00Var.m91771i0(-329318062);
            if (obj instanceof vb40) {
                xq00Var.m91771i0(-1008895720);
                vb40Var = (vb40) obj;
                if (vb40Var.f239418t.f218749h != null) {
                    xq00Var.m91771i0(-1008855668);
                    xq00Var.m91788r(false);
                    xq00Var.m91788r(false);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-1008807494);
                    ri21 ri21VarM37542b = e1b1.m37542b(mujVar, xq00Var);
                    boolean zM91766g = xq00Var.m91766g(vb40Var) | xq00Var.m91766g(ri21VarM37542b);
                    Object objM91750T = xq00Var.m91750T();
                    if (zM91766g || objM91750T == obj2) {
                        rb40 rb40VarM85111a = vb40.m85111a(vb40Var);
                        rb40VarM85111a.f197455o = ri21VarM37542b;
                        objM91750T = rb40VarM85111a.m75137a();
                        xq00Var.m91793t0(objM91750T);
                    }
                    vb40Var = (vb40) objM91750T;
                    a831.m25018j(xq00Var, false, false, false);
                }
            } else {
                xq00Var.m91771i0(-1008549326);
                Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
                ri21 ri21VarM37542b2 = e1b1.m37542b(mujVar, xq00Var);
                boolean zM91766g2 = xq00Var.m91766g(context) | xq00Var.m91766g(obj) | xq00Var.m91766g(ri21VarM37542b2);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91766g2 || objM91750T2 == obj2) {
                    rb40 rb40Var = new rb40(context);
                    rb40Var.f197443c = obj;
                    rb40Var.f197455o = ri21VarM37542b2;
                    objM91750T2 = rb40Var.m75137a();
                    xq00Var.m91793t0(objM91750T2);
                }
                vb40Var = (vb40) objM91750T2;
                xq00Var.m91788r(false);
                xq00Var.m91788r(false);
            }
            vb40 vb40Var2 = vb40Var;
            e1b1.m37546f(vb40Var2);
            fxh0Var2 = fxh0Var;
            fxh0 fxh0VarMo34315F = fxh0Var2.mo34315F(new umj(vb40Var2, zm6Var.f284167c, zm6Var.f284166b, gh00Var3, gh00Var4, i5, ob3Var2, mujVar, f, colorFilter, z2, e1b1.m37541a(xq00Var), str2));
            m24 m24Var = m24.f139214l;
            int iM70356o = pmg1.m70356o(xq00Var);
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarMo34315F);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m24Var, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            yhh yhhVar = roh.f201265j;
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iM70356o))) {
                pi9.m70087l(iM70356o, xq00Var, iM70356o, yhhVar);
            }
            xq00Var.m91788r(true);
        } else {
            fxh0Var2 = fxh0Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.lm6
                @Override // p204p.th00
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    q0f1.m71829b(zm6Var, str, fxh0Var2, gh00Var, gh00Var2, ob3Var, mujVar, f, colorFilter, i, z, (xq00) obj3, fyg1.m43076B(i2 | 1), fyg1.m43076B(i3));
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m71830d(Object obj, String str, f940 f940Var, fxh0 fxh0Var, muj mujVar, xq00 xq00Var, int i, int i2, int i3) {
        wb9 wb9Var = d7f0.f46174i;
        int i4 = i >> 3;
        m71829b(new zm6(obj, (mm6) xq00Var.m91774k(raa0.f197244a), f940Var), str, fxh0Var, um6.f231748U0, null, wb9Var, mujVar, 1.0f, null, 1, true, xq00Var, (i & ContentType.LONG_FORM_ON_DEMAND) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024) | ((i2 << 27) & 1879048192), (i2 >> 3) & 14);
    }

    /* JADX INFO: renamed from: e */
    public static gl60 m71831e(gh00 gh00Var) {
        ek60 ek60Var = fk60.f70476d;
        nk60 nk60Var = new nk60();
        qk60 qk60Var = ek60Var.f70477a;
        nk60Var.f154800a = qk60Var.f189464a;
        nk60Var.f154801b = qk60Var.f189469f;
        nk60Var.f154802c = qk60Var.f189465b;
        nk60Var.f154803d = qk60Var.f189466c;
        nk60Var.f154804e = qk60Var.f189468e;
        String str = qk60Var.f189470g;
        nk60Var.f154805f = str;
        nk60Var.f154806g = qk60Var.f189471h;
        nk60Var.f154807h = qk60Var.f189472i;
        nk60Var.f154808i = qk60Var.f189475l;
        nk60Var.f154809j = qk60Var.f189474k;
        nk60Var.f154810k = qk60Var.f189473j;
        nk60Var.f154811l = qk60Var.f189467d;
        nk60Var.f154812m = ek60Var.f70478b;
        nk60Var.f154813n = qk60Var.f189476m;
        gh00Var.invoke(nk60Var);
        if (nk60Var.f154804e) {
            if (!wj50.m88271j(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!wj50.m88271j(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        qk60 qk60Var2 = new qk60(nk60Var.f154800a, nk60Var.f154802c, nk60Var.f154803d, nk60Var.f154811l, nk60Var.f154804e, nk60Var.f154801b, nk60Var.f154805f, nk60Var.f154806g, nk60Var.f154807h, nk60Var.f154810k, nk60Var.f154809j, nk60Var.f154808i, nk60Var.f154813n);
        i82 i82Var = nk60Var.f154812m;
        gl60 gl60Var = new gl60(qk60Var2, i82Var);
        ujg1.m83266g();
        if (wj50.m88271j(i82Var, muz0.f147459a)) {
            return gl60Var;
        }
        i82Var.m49920l(new nn40(qk60Var2));
        return gl60Var;
    }

    /* JADX INFO: renamed from: f */
    public static final void m71832f(sxa0 sxa0Var, eh00 eh00Var, int i, xq00 xq00Var, int i2) {
        int i3;
        int i4;
        xq00Var.m91775k0(-277648334);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91770i(sxa0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if (xq00Var.m91752Y(i5 & 1, (i5 & 147) != 146)) {
            y0v.m92603a(2, rkk.m75772x(118610214, new ca70(24, sxa0Var, eh00Var), xq00Var), xq00Var, ((i5 >> 6) & 14) | 384, 2);
            i4 = 2;
        } else {
            xq00Var.m91757b0();
            i4 = i;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a80(sxa0Var, eh00Var, i4, i2, 13);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Throwable, p.fbk] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: g */
    public static final void m71833g(hb11 hb11Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        Object tpf0Var;
        ?? r4;
        Object obj = hb11Var;
        xq00Var.m91775k0(1180146346);
        int i2 = i | (xq00Var.m91770i(obj) ? 4 : 2) | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj2 = t6x0.f217647t;
            if (objM91750T == obj2) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj2) {
                objM91750T2 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T2;
            boolean zM91770i = xq00Var.m91770i(obj) | xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(kqi0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj2) {
                fbk fbkVar = null;
                tpf0Var = new tpf0(obj, kqi0Var2, kqi0Var, fbkVar, 21);
                xq00Var.m91793t0(tpf0Var);
                r4 = fbkVar;
            } else {
                tpf0Var = objM91750T3;
                r4 = 0;
            }
            hz40.m49237i(obj, (th00) tpf0Var, xq00Var);
            boolean zM91768h = xq00Var.m91768h(((Boolean) kqi0Var.getValue()).booleanValue()) | xq00Var.m91768h(((Boolean) kqi0Var2.getValue()).booleanValue());
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91768h || objM91750T4 == obj2) {
                objM91750T4 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T4);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T4;
            Boolean bool = (Boolean) kqi0Var.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) kqi0Var2.getValue();
            bool2.getClass();
            boolean zM91770i2 = xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(kqi0Var3);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T5 == obj2) {
                objM91750T5 = new mpf(kqi0Var, kqi0Var3, r4, 3);
                xq00Var.m91793t0(objM91750T5);
            }
            hz40.m49236h(bool, bool2, (th00) objM91750T5, xq00Var);
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, fxh0Var2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61820d);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw r4;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            z96.m95630j(((Boolean) kqi0Var3.getValue()).booleanValue(), null, kbv.m55958d(jg31.m53286y(0.0f, 10000.0f, r4, 5), 2).m69539a(kbv.m55960f(jg31.m53286y(0.0f, 1500.0f, r4, 5), 0.5f, 0L, 4)), kbv.m55959e(jg31.m53286y(0.0f, 10000.0f, r4, 5), 2).m88177a(kbv.m55961g(jg31.m53286y(0.0f, 1500.0f, r4, 5), 0.5f, 0L, 4)), null, rkk.m75772x(-1998422776, new tqf(kqi0Var2, 3), xq00Var), xq00Var, 196608, 18);
            xq00Var.m91788r(true);
        } else {
            obj = obj;
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v4e0(obj, fxh0Var2, i, 26);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final tiv0 m71834h(long j, long j2) {
        return new tiv0(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: i */
    public static final tiv0 m71835i(long j, float f) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new tiv0(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    /* JADX INFO: renamed from: j */
    public static final tiv0 m71836j(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new tiv0(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: k */
    public static final gku m71837k(rxa0 rxa0Var, eh00 eh00Var) {
        String strM76610a = rxa0Var.m76610a();
        String strM76610a2 = rxa0Var.m76610a();
        pr0 pr0Var = new pr0(16, eh00Var, rxa0Var);
        if (wl51.m88460J0(strM76610a2)) {
            throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
        }
        return new gku(strM76610a, new peu(new t40(strM76610a2), pr0Var));
    }

    /* JADX INFO: renamed from: m */
    public static final twt m71838m(xh00 xh00Var) {
        return new twt(xh00Var, false);
    }

    /* JADX INFO: renamed from: n */
    public static void m71839n(Appendable appendable, Object obj, gh00 gh00Var) {
        if (gh00Var != null) {
            appendable.append((CharSequence) gh00Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m71840o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m71841p(sep sepVar, String str, String str2) {
        ArrayList arrayList = sepVar.f208338a;
        arrayList.add(str);
        arrayList.add(wl51.m88491o1(str2).toString());
    }

    /* JADX INFO: renamed from: q */
    public static boolean m71842q(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM71843u = m71843u(file, inputStreamOpenRawResource);
                m71840o(inputStreamOpenRawResource);
                return zM71843u;
            } catch (Throwable th) {
                th = th;
                m71840o(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m71843u(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            m71840o(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    m71840o(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m71840o(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: v */
    public static final CompletableCreate m71844v(ljx0 ljx0Var, gh00 gh00Var) {
        return g0b1.m43282x(ljx0Var.m59187m().mo26596D(gk40.f80712X0), new vwx0(0, null, gh00Var, ljx0Var));
    }

    /* JADX INFO: renamed from: y */
    public static final MaybeCreate m71845y(ljx0 ljx0Var, gh00 gh00Var) {
        return n0e1.m63407O(ljx0Var.m59187m().mo26596D(gk40.f80712X0), new o8t0((fbk) null, gh00Var, ljx0Var));
    }

    /* JADX INFO: renamed from: z */
    public static final Observable m71846z(ljx0 ljx0Var, String[] strArr, gh00 gh00Var) {
        return k0e1.m54988g(b0g1.m27791m(epv0.m39692l(ljx0Var, false, strArr, gh00Var)), ljx0Var.m59187m());
    }

    /* JADX INFO: renamed from: L */
    public abstract View mo31451L(int i);

    /* JADX INFO: renamed from: M */
    public abstract boolean mo31452M();

    /* JADX INFO: renamed from: V */
    public abstract void mo71847V(int i, byte[] bArr, int i2);

    /* JADX INFO: renamed from: l */
    public abstract void mo1500l(njn0 njn0Var);
}
