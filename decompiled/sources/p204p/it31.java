package p204p;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class it31 {

    /* JADX INFO: renamed from: a */
    public final Context f105411a;

    /* JADX INFO: renamed from: b */
    public final z4l0 f105412b;

    /* JADX INFO: renamed from: c */
    public final xre f105413c;

    /* JADX INFO: renamed from: d */
    public final fk60 f105414d;

    /* JADX INFO: renamed from: e */
    public final luk f105415e;

    /* JADX INFO: renamed from: f */
    public final lsi0 f105416f = msi0.m62770a();

    /* JADX INFO: renamed from: g */
    public final Object f105417g = q3d0.m72078I(1, new gt31(this, 1));

    /* JADX INFO: renamed from: h */
    public final Object f105418h = q3d0.m72078I(1, new gt31(this, 0));

    public it31(Context context, z4l0 z4l0Var, xre xreVar, fk60 fk60Var, luk lukVar) {
        this.f105411a = context;
        this.f105412b = z4l0Var;
        this.f105413c = xreVar;
        this.f105414d = fk60Var;
        this.f105415e = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public static final void m51598a(it31 it31Var, String str, File file) throws IOException {
        ztw0 ztw0Var = new ztw0();
        ztw0Var.m96954g(str);
        n2x0 n2x0VarM97071g = it31Var.f105412b.m95348b(new auw0(ztw0Var)).m97071g();
        p3x0 p3x0Var = n2x0VarM97071g.f149863g;
        if (!n2x0VarM97071g.f149852O0) {
            try {
                p3x0Var.close();
            } catch (Throwable unused) {
            }
            throw new IllegalStateException(s571.m77246e(n2x0VarM97071g.f149860d, "Download failed: "));
        }
        InputStream inputStreamM69091a = p3x0Var.m69091a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                kgg1.m56350m(inputStreamM69091a, fileOutputStream);
                fileOutputStream.close();
                inputStreamM69091a.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                n0e1.m63430g(inputStreamM69091a, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m51599b(it31 it31Var) {
        Map map = it31Var.m51603f().f268797a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (it31Var.m51604g((p3b) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : g6f.m43728j1(linkedHashMap.keySet())) {
            it31Var.m51603f().f268797a.remove(str);
            new File(it31Var.m51602e(), str).delete();
        }
        Iterator it = it31Var.m51603f().f268797a.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((p3b) it.next()).f173600a;
        }
        if (j > 52428800) {
            for (Map.Entry entry2 : g6f.m43711Y0(it31Var.m51603f().f268797a.entrySet(), new fd11(6))) {
                String str2 = (String) entry2.getKey();
                p3b p3bVar = (p3b) entry2.getValue();
                if (j <= 52428800) {
                    return;
                }
                it31Var.m51603f().f268797a.remove(str2);
                new File(it31Var.m51602e(), str2).delete();
                j -= p3bVar.f173600a;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m51600c(it31 it31Var) {
        try {
            File file = new File(it31Var.m51602e(), "metadata.json");
            String strM41881b = it31Var.f105414d.m41881b(y3b.Companion.serializer(), it31Var.m51603f());
            Charset charset = vuc.f244913a;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                pxy.m71567a0(fileOutputStream, strM41881b, charset);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m51601d(String str, ibk ibkVar) throws Throwable {
        ht31 ht31Var;
        if (ibkVar instanceof ht31) {
            ht31Var = (ht31) ibkVar;
            int i = ht31Var.f94918c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ht31Var.f94918c = i - Integer.MIN_VALUE;
            } else {
                ht31Var = new ht31(this, ibkVar);
            }
        } else {
            ht31Var = new ht31(this, ibkVar);
        }
        Object objM89557A = ht31Var.f94916a;
        int i2 = ht31Var.f94918c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            mm0 mm0Var = new mm0(this, str, (fbk) null);
            ht31Var.f94918c = 1;
            objM89557A = x0h1.m89557A(this.f105415e, mm0Var, ht31Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        return ((s6x0) objM89557A).f206218a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: e */
    public final File m51602e() {
        return (File) this.f105418h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: f */
    public final y3b m51603f() {
        return (y3b) this.f105417g.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m51604g(p3b p3bVar) {
        ((wy3) this.f105413c).getClass();
        return System.currentTimeMillis() - p3bVar.f173601b > 1728000000;
    }
}
