package p204p;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class eet0 {

    /* JADX INFO: renamed from: a */
    public final Context f58848a;

    /* JADX INFO: renamed from: b */
    public final xre f58849b;

    /* JADX INFO: renamed from: c */
    public final wvy f58850c;

    /* JADX INFO: renamed from: d */
    public final lsi0 f58851d = msi0.m62770a();

    /* JADX INFO: renamed from: e */
    public final wg61 f58852e = new wg61(new cgr0(this, 27));

    public eet0(Context context, xre xreVar, wvy wvyVar) {
        this.f58848a = context;
        this.f58849b = xreVar;
        this.f58850c = wvyVar;
    }

    /* JADX INFO: renamed from: a */
    public static long m38709a(String str) {
        try {
            String str2 = (String) g6f.m43689C0(wl51.m88477a1(wl51.m88486j1(wl51.m88469S0(str, "push_media"), "."), new String[]{"_"}, 0, 6));
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return 0L;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:31:0x00cd, B:33:0x00db, B:52:0x0113, B:54:0x0122, B:56:0x0128, B:37:0x00e2, B:40:0x00e7, B:51:0x0110, B:43:0x00ef, B:45:0x00f9, B:49:0x010b), top: B:70:0x00cd, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:31:0x00cd, B:33:0x00db, B:52:0x0113, B:54:0x0122, B:56:0x0128, B:37:0x00e2, B:40:0x00e7, B:51:0x0110, B:43:0x00ef, B:45:0x00f9, B:49:0x010b), top: B:70:0x00cd, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.File] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final Comparable m38710b(String str, int i, String str2, gxy gxyVar, ibk ibkVar) {
        det0 det0Var;
        String str3;
        File file;
        lsi0 lsi0Var;
        String str4;
        ofe1 ofe1Var;
        File[] fileArrListFiles;
        File file2;
        Uri uriForFile;
        int i2 = i;
        Context context = this.f58848a;
        if (ibkVar instanceof det0) {
            det0Var = (det0) ibkVar;
            int i3 = det0Var.f48175h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                det0Var.f48175h = i3 - Integer.MIN_VALUE;
            } else {
                det0Var = new det0(this, ibkVar);
            }
        } else {
            det0Var = new det0(this, ibkVar);
        }
        Object obj = det0Var.f48173f;
        ?? r6 = det0Var.f48175h;
        wg61 wg61Var = this.f58852e;
        int i4 = 1;
        yuk yukVar = yuk.f276404a;
        try {
            if (r6 == 0) {
                bga.m29073P(obj);
                String strM29801l0 = bm51.m29801l0(str, "_", "");
                ((wy3) this.f58849b).getClass();
                String strM50938j = ikc0.m50938j(System.currentTimeMillis(), gxyVar.f85358a, edb.m38571t(i2, "push_media_", strM29801l0, "_", "_"));
                File file3 = new File((File) wg61Var.getValue(), "temp_" + UUID.randomUUID() + gxyVar.f85358a);
                wvy wvyVar = this.f58850c;
                det0Var.f48168a = strM50938j;
                det0Var.f48169b = file3;
                det0Var.f48172e = i2;
                det0Var.f48175h = 1;
                Object objM89166c = wvyVar.m89166c(str2, file3, det0Var);
                if (objM89166c != yukVar) {
                    obj = objM89166c;
                    str3 = strM50938j;
                    file = file3;
                }
                return yukVar;
            }
            if (r6 == 1) {
                i2 = det0Var.f48172e;
                File file4 = det0Var.f48169b;
                str3 = det0Var.f48168a;
                bga.m29073P(obj);
                file = file4;
            } else {
                if (r6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lsi0 lsi0Var2 = det0Var.f48171d;
                ofe1Var = det0Var.f48170c;
                File file5 = det0Var.f48169b;
                str4 = det0Var.f48168a;
                bga.m29073P(obj);
                lsi0Var = lsi0Var2;
                r6 = file5;
            }
            try {
                fileArrListFiles = ((File) wg61Var.getValue()).listFiles(cet0.f37176b);
                if (fileArrListFiles != null || fileArrListFiles.length >= 5) {
                    if (fileArrListFiles == null && fileArrListFiles.length != 0) {
                        file2 = fileArrListFiles[0];
                        int length = fileArrListFiles.length - 1;
                        if (length != 0) {
                            long jM38709a = m38709a(file2.getName());
                            if (1 <= length) {
                                while (true) {
                                    File file6 = fileArrListFiles[i4];
                                    long jM38709a2 = m38709a(file6.getName());
                                    if (jM38709a > jM38709a2) {
                                        file2 = file6;
                                        jM38709a = jM38709a2;
                                    }
                                    if (i4 == length) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                    } else {
                        file2 = null;
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                }
                File file7 = new File((File) wg61Var.getValue(), str4);
                if ((ofe1Var instanceof nfe1) || !r6.renameTo(file7)) {
                    uriForFile = null;
                } else {
                    uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".pushnotificationsv2", file7);
                }
                lsi0Var.mo54249c(null);
                r6.delete();
                return uriForFile;
            } catch (Throwable th) {
                lsi0Var.mo54249c(null);
                throw th;
            }
            ofe1 ofe1Var2 = (ofe1) obj;
            lsi0Var = this.f58851d;
            det0Var.f48168a = str3;
            det0Var.f48169b = file;
            det0Var.f48170c = ofe1Var2;
            det0Var.f48171d = lsi0Var;
            det0Var.f48172e = i2;
            det0Var.f48175h = 2;
            if (lsi0Var.mo54248a(det0Var) != yukVar) {
                str4 = str3;
                ofe1Var = ofe1Var2;
                r6 = file;
                fileArrListFiles = ((File) wg61Var.getValue()).listFiles(cet0.f37176b);
                if (fileArrListFiles != null) {
                    if (fileArrListFiles == null) {
                        file2 = null;
                    } else {
                        file2 = null;
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                } else {
                    if (fileArrListFiles == null) {
                        file2 = null;
                    } else {
                        file2 = null;
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                }
                File file8 = new File((File) wg61Var.getValue(), str4);
                if (ofe1Var instanceof nfe1) {
                    uriForFile = null;
                } else {
                    uriForFile = null;
                }
                lsi0Var.mo54249c(null);
                r6.delete();
                return uriForFile;
            }
            return yukVar;
        } catch (IllegalArgumentException unused) {
            r6.delete();
            return null;
        } catch (Throwable th2) {
            r6.delete();
            throw th2;
        }
    }
}
