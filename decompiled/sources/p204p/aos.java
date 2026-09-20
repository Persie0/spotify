package p204p;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class aos {

    /* JADX INFO: renamed from: e */
    public static Boolean f17750e = null;

    /* JADX INFO: renamed from: f */
    public static String f17751f = null;

    /* JADX INFO: renamed from: g */
    public static boolean f17752g = false;

    /* JADX INFO: renamed from: h */
    public static int f17753h = -1;

    /* JADX INFO: renamed from: i */
    public static Boolean f17754i;

    /* JADX INFO: renamed from: m */
    public static ntg1 f17758m;

    /* JADX INFO: renamed from: n */
    public static ovg1 f17759n;

    /* JADX INFO: renamed from: a */
    public final Context f17760a;

    /* JADX INFO: renamed from: j */
    public static final ThreadLocal f17755j = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public static final q32 f17756k = new q32(20);

    /* JADX INFO: renamed from: l */
    public static final t5m0 f17757l = new t5m0();

    /* JADX INFO: renamed from: b */
    public static final jjd1 f17747b = new jjd1();

    /* JADX INFO: renamed from: c */
    public static final vud1 f17748c = new vud1();

    /* JADX INFO: renamed from: d */
    public static final sce1 f17749d = new sce1();

    public aos(Context context) {
        this.f17760a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m26613a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (mvl0.m62956s(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + String.valueOf(str).length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(String.valueOf(str).length() + 45);
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e4 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ec A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6 A[Catch: all -> 0x01f4, TRY_ENTER, TryCatch #3 {, blocks: (B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd), top: B:155:0x00c9, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x024d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0253  */
    /* JADX WARN: Code duplicated, block: B:129:0x025c  */
    /* JADX WARN: Code duplicated, block: B:134:0x026d A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:7:0x003a, B:11:0x008a, B:18:0x0096, B:22:0x009d, B:34:0x00c4, B:111:0x0200, B:112:0x020a, B:115:0x020d, B:116:0x020e, B:117:0x0215, B:134:0x026d, B:135:0x028b, B:118:0x0216, B:120:0x022d, B:122:0x023b, B:132:0x0265, B:133:0x026c, B:136:0x028c, B:137:0x02d7), top: B:153:0x003a, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x009d A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:7:0x003a, B:11:0x008a, B:18:0x0096, B:22:0x009d, B:34:0x00c4, B:111:0x0200, B:112:0x020a, B:115:0x020d, B:116:0x020e, B:117:0x0215, B:134:0x026d, B:135:0x028b, B:118:0x0216, B:120:0x022d, B:122:0x023b, B:132:0x0265, B:133:0x026c, B:136:0x028c, B:137:0x02d7), top: B:153:0x003a, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[Catch: all -> 0x01f4, TryCatch #3 {, blocks: (B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd), top: B:155:0x00c9, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0168 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0173 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0191 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0198 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a0 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01bb A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4 A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01dc A[Catch: all -> 0x012f, DynamiteModule$LoadingException -> 0x0132, RemoteException -> 0x0135, TryCatch #8 {RemoteException -> 0x0135, DynamiteModule$LoadingException -> 0x0132, all -> 0x012f, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f5, B:49:0x00fb, B:51:0x0103, B:53:0x0107, B:54:0x0115, B:61:0x0120, B:69:0x0146, B:71:0x014e, B:72:0x0155, B:73:0x015c, B:68:0x0138, B:76:0x015f, B:77:0x0160, B:78:0x0167, B:79:0x0168, B:80:0x016f, B:83:0x0172, B:84:0x0173, B:86:0x0191, B:88:0x0198, B:90:0x01a0, B:96:0x01ce, B:98:0x01d4, B:99:0x01dc, B:100:0x01e3, B:91:0x01b1, B:92:0x01b8, B:94:0x01bb, B:95:0x01c5, B:101:0x01e4, B:102:0x01eb, B:103:0x01ec, B:104:0x01f3, B:110:0x01ff, B:46:0x00f6, B:47:0x00f8, B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f6, B:108:0x01fd, B:55:0x0116, B:59:0x011d), top: B:160:0x00c8, inners: #0, #3, #7 }] */
    /* JADX INFO: renamed from: c */
    public static aos m26614c(Context context, zns znsVar, String str) throws Throwable {
        long j;
        aos aosVar;
        Cursor cursor;
        int i;
        Boolean bool;
        ntg1 ntg1VarM26619h;
        int iM65620n2;
        tv30 tv30VarM65616j2;
        Object objM51106d2;
        eqg1 eqg1Var;
        ovg1 ovg1Var;
        eqg1 eqg1Var2;
        boolean z;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = f17755j;
        eqg1 eqg1Var3 = (eqg1) threadLocal.get();
        eqg1 eqg1Var4 = new eqg1();
        threadLocal.set(eqg1Var4);
        q32 q32Var = f17756k;
        Long l = (Long) q32Var.get();
        long jLongValue = l.longValue();
        try {
            j = jLongValue;
            try {
                q32Var.set(Long.valueOf(SystemClock.uptimeMillis()));
                sa8 sa8VarMo53535c = znsVar.mo53535c(context, str, f17757l);
                new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(sa8VarMo53535c.f207154a).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(sa8VarMo53535c.f207155b).length());
                int i2 = sa8VarMo53535c.f207156c;
                if (i2 != 0) {
                    if (i2 != -1) {
                        if (i2 == 1 || sa8VarMo53535c.f207155b != 0) {
                            if (i2 == -1) {
                                "Selected local version of ".concat(String.valueOf(str));
                                aos aosVar2 = new aos(applicationContext);
                                if (j == 0) {
                                    q32Var.remove();
                                } else {
                                    q32Var.set(l);
                                }
                                cursor2 = eqg1Var4.f61886a;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                threadLocal.set(eqg1Var3);
                                return aosVar2;
                            }
                            if (i2 == 1) {
                                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 36);
                                sb.append("VersionPolicy returned invalid code:");
                                sb.append(i2);
                                throw new DynamiteModule$LoadingException(sb.toString());
                            }
                            try {
                                i = sa8VarMo53535c.f207155b;
                                try {
                                    synchronized (aos.class) {
                                        if (m26616e(context)) {
                                            throw new DynamiteModule$LoadingException("Remote loading disabled");
                                        }
                                        bool = f17750e;
                                    }
                                    if (bool != null) {
                                        throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i).length());
                                        synchronized (aos.class) {
                                            ovg1Var = f17759n;
                                        }
                                        if (ovg1Var != null) {
                                            throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                        eqg1Var2 = (eqg1) threadLocal.get();
                                        if (eqg1Var2 != null || eqg1Var2.f61886a == null) {
                                            throw new DynamiteModule$LoadingException("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = eqg1Var2.f61886a;
                                        new imk0(null);
                                        synchronized (aos.class) {
                                            z = f17753h >= 2;
                                        }
                                        Context context2 = (Context) imk0.m51106d2(z ? ovg1Var.m68130k2(new imk0(applicationContext2), str, i, new imk0(cursor3)) : ovg1Var.m68129j2(new imk0(applicationContext2), str, i, new imk0(cursor3)));
                                        if (context2 == null) {
                                            throw new DynamiteModule$LoadingException("Failed to get module context");
                                        }
                                        aosVar = new aos(context2);
                                    } else {
                                        new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i).length());
                                        ntg1VarM26619h = m26619h(context);
                                        if (ntg1VarM26619h != null) {
                                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                        iM65620n2 = ntg1VarM26619h.m65620n2();
                                        if (iM65620n2 >= 3) {
                                            eqg1Var = (eqg1) threadLocal.get();
                                            if (eqg1Var != null) {
                                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                            }
                                            tv30VarM65616j2 = ntg1VarM26619h.m65622p2(new imk0(context), str, i, new imk0(eqg1Var.f61886a));
                                        } else if (iM65620n2 == 2) {
                                            tv30VarM65616j2 = ntg1VarM26619h.m65618l2(new imk0(context), str, i);
                                        } else {
                                            tv30VarM65616j2 = ntg1VarM26619h.m65616j2(new imk0(context), str, i);
                                        }
                                        objM51106d2 = imk0.m51106d2(tv30VarM65616j2);
                                        if (objM51106d2 != null) {
                                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                                        }
                                        aosVar = new aos((Context) objM51106d2);
                                    }
                                    if (j == 0) {
                                        f17756k.remove();
                                    } else {
                                        f17756k.set(l);
                                    }
                                    cursor = eqg1Var4.f61886a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    f17755j.set(eqg1Var3);
                                    return aosVar;
                                } catch (RemoteException e) {
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                } catch (DynamiteModule$LoadingException e2) {
                                    throw e2;
                                } catch (Throwable th) {
                                    jhl0.m53413g(context, th);
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                }
                            } catch (DynamiteModule$LoadingException e3) {
                                new StringBuilder(String.valueOf(e3.getMessage()).length() + 30);
                                int i3 = sa8VarMo53535c.f207154a;
                                if (i3 == 0 || znsVar.mo53535c(context, str, new bpn0(i3)).f207156c != -1) {
                                    throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e3);
                                }
                                "Selected local version of ".concat(String.valueOf(str));
                                aosVar = new aos(applicationContext);
                            }
                        }
                    } else if (sa8VarMo53535c.f207154a != 0) {
                        i2 = -1;
                        if (i2 == 1) {
                        }
                        if (i2 == -1) {
                            "Selected local version of ".concat(String.valueOf(str));
                            aos aosVar3 = new aos(applicationContext);
                            if (j == 0) {
                                q32Var.remove();
                            } else {
                                q32Var.set(l);
                            }
                            cursor2 = eqg1Var4.f61886a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(eqg1Var3);
                            return aosVar3;
                        }
                        if (i2 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i2);
                            throw new DynamiteModule$LoadingException(sb2.toString());
                        }
                        i = sa8VarMo53535c.f207155b;
                        synchronized (aos.class) {
                            if (m26616e(context)) {
                                throw new DynamiteModule$LoadingException("Remote loading disabled");
                            }
                            bool = f17750e;
                            if (bool != null) {
                                throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i).length());
                                synchronized (aos.class) {
                                    ovg1Var = f17759n;
                                    if (ovg1Var != null) {
                                        throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                    }
                                    eqg1Var2 = (eqg1) threadLocal.get();
                                    if (eqg1Var2 != null) {
                                    }
                                    throw new DynamiteModule$LoadingException("No result cursor");
                                }
                            }
                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i).length());
                            ntg1VarM26619h = m26619h(context);
                            if (ntg1VarM26619h != null) {
                                throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                            }
                            iM65620n2 = ntg1VarM26619h.m65620n2();
                            if (iM65620n2 >= 3) {
                                eqg1Var = (eqg1) threadLocal.get();
                                if (eqg1Var != null) {
                                    throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                }
                                tv30VarM65616j2 = ntg1VarM26619h.m65622p2(new imk0(context), str, i, new imk0(eqg1Var.f61886a));
                            } else if (iM65620n2 == 2) {
                                tv30VarM65616j2 = ntg1VarM26619h.m65618l2(new imk0(context), str, i);
                            } else {
                                tv30VarM65616j2 = ntg1VarM26619h.m65616j2(new imk0(context), str, i);
                            }
                            objM51106d2 = imk0.m51106d2(tv30VarM65616j2);
                            if (objM51106d2 != null) {
                                throw new DynamiteModule$LoadingException("Failed to load remote module.");
                            }
                            aosVar = new aos((Context) objM51106d2);
                            if (j == 0) {
                                f17756k.remove();
                            } else {
                                f17756k.set(l);
                            }
                            cursor = eqg1Var4.f61886a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f17755j.set(eqg1Var3);
                            return aosVar;
                        }
                    }
                }
                int i4 = sa8VarMo53535c.f207154a;
                int i5 = sa8VarMo53535c.f207155b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i4).length() + 23 + String.valueOf(i5).length() + 1);
                sb3.append("No acceptable module ");
                sb3.append(str);
                sb3.append(" found. Local version is ");
                sb3.append(i4);
                sb3.append(" and remote version is ");
                sb3.append(i5);
                sb3.append(".");
                throw new DynamiteModule$LoadingException(sb3.toString());
            } catch (Throwable th2) {
                th = th2;
                if (j == 0) {
                    f17756k.remove();
                } else {
                    f17756k.set(l);
                }
                Cursor cursor4 = eqg1Var4.f61886a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f17755j.set(eqg1Var3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:112:0x0175 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:3:0x0002, B:63:0x00d6, B:65:0x00dc, B:73:0x00fb, B:103:0x0164, B:112:0x0175, B:128:0x01b3, B:129:0x01b6, B:123:0x01aa, B:71:0x00e7, B:131:0x01b8, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00d3, B:21:0x004a, B:44:0x00a1, B:47:0x00a4, B:54:0x00bc, B:62:0x00d5, B:60:0x00c2), top: B:135:0x0002, inners: #6, #11 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #10 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:143:0x0027, inners: #12 }] */
    /* JADX INFO: renamed from: d */
    public static int m26615d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (aos.class) {
                Boolean bool = f17750e;
                boolean z2 = true;
                Cursor cursor2 = null;
                int iM65619m2 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m26618g(classLoader);
                                    } catch (DynamiteModule$LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m26616e(context)) {
                                        return 0;
                                    }
                                    if (f17752g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM26617f = m26617f(context, str, z, true);
                                                String str2 = f17751f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM61866S = mif1.m61866S();
                                                    if (classLoaderM61866S == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            xns.m91516b();
                                                            String str3 = f17751f;
                                                            ig31.m50506x(str3);
                                                            classLoaderM61866S = xns.m91515a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f17751f;
                                                            ig31.m50506x(str4);
                                                            classLoaderM61866S = new urf1(ClassLoader.getSystemClassLoader(), str4);
                                                        }
                                                    }
                                                    m26618g(classLoaderM61866S);
                                                    declaredField.set(null, classLoaderM61866S);
                                                    f17750e = bool2;
                                                    return iM26617f;
                                                }
                                                return iM26617f;
                                            } catch (DynamiteModule$LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f17750e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        new StringBuilder(e.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m26617f(context, str, z, false);
                    } catch (DynamiteModule$LoadingException e2) {
                        new StringBuilder(String.valueOf(e2.getMessage()).length() + 42);
                        return 0;
                    }
                }
                ntg1 ntg1VarM26619h = m26619h(context);
                if (ntg1VarM26619h != null) {
                    try {
                        try {
                            int iM65620n2 = ntg1VarM26619h.m65620n2();
                            if (iM65620n2 >= 3) {
                                ThreadLocal threadLocal = f17755j;
                                eqg1 eqg1Var = (eqg1) threadLocal.get();
                                if (eqg1Var == null || (cursor = eqg1Var.f61886a) == null) {
                                    Cursor cursor3 = (Cursor) imk0.m51106d2(ntg1VarM26619h.m65621o2(new imk0(context), str, z, ((Long) f17756k.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                if (i > 0) {
                                                    eqg1 eqg1Var2 = (eqg1) threadLocal.get();
                                                    if (eqg1Var2 == null || eqg1Var2.f61886a != null) {
                                                        z2 = false;
                                                    } else {
                                                        eqg1Var2.f61886a = cursor3;
                                                    }
                                                    cursor2 = z2 ? null : cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iM65619m2 = i;
                                            } else if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (RemoteException e3) {
                                            remoteException = e3;
                                            cursor2 = cursor3;
                                            new StringBuilder(String.valueOf(remoteException.getMessage()).length() + 42);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    iM65619m2 = cursor.getInt(0);
                                }
                            } else {
                                iM65619m2 = iM65620n2 == 2 ? ntg1VarM26619h.m65619m2(new imk0(context), str, z) : ntg1VarM26619h.m65617k2(new imk0(context), str, z);
                            }
                        } catch (RemoteException e4) {
                            remoteException = e4;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return iM65619m2;
            }
        } catch (Throwable th5) {
            jhl0.m53413g(context, th5);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m26616e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f17754i)) {
            return true;
        }
        boolean z = false;
        if (f17754i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != u1h1.m82226u() ? 0 : 268435456);
            if (vj10.f241854b.m85679c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f17754i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f17752g = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public static int m26617f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f17756k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (aos.class) {
                                    try {
                                        f17751f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f17753h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            f17752g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                eqg1 eqg1Var = (eqg1) f17755j.get();
                                if (eqg1Var == null || eqg1Var.f61886a != null) {
                                    z4 = false;
                                } else {
                                    eqg1Var.f61886a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof DynamiteModule$LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new DynamiteModule$LoadingException(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m26618g(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            ovg1 ovg1Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                ovg1Var = iInterfaceQueryLocalInterface instanceof ovg1 ? (ovg1) iInterfaceQueryLocalInterface : new ovg1(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            f17759n = ovg1Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static ntg1 m26619h(Context context) {
        ntg1 ntg1Var;
        synchronized (aos.class) {
            ntg1 ntg1Var2 = f17758m;
            if (ntg1Var2 != null) {
                return ntg1Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ntg1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    ntg1Var = iInterfaceQueryLocalInterface instanceof ntg1 ? (ntg1) iInterfaceQueryLocalInterface : new ntg1(iBinder);
                }
                if (ntg1Var != null) {
                    f17758m = ntg1Var;
                    return ntg1Var;
                }
            } catch (Exception e) {
                new StringBuilder(String.valueOf(e.getMessage()).length() + 45);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m26620b(String str) {
        try {
            return (IBinder) this.f17760a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
