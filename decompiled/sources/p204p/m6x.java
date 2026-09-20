package p204p;

import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class m6x {

    /* JADX INFO: renamed from: a */
    public final wsz0 f140591a;

    /* JADX INFO: renamed from: b */
    public final xsz0 f140592b;

    /* JADX INFO: renamed from: c */
    public final t4x f140593c;

    /* JADX INFO: renamed from: d */
    public final u9x f140594d;

    /* JADX INFO: renamed from: e */
    public final p94 f140595e;

    /* JADX INFO: renamed from: f */
    public final wra0 f140596f;

    public m6x(wsz0 wsz0Var, xsz0 xsz0Var, t4x t4xVar, u9x u9xVar, p94 p94Var, wra0 wra0Var) {
        this.f140591a = wsz0Var;
        this.f140592b = xsz0Var;
        this.f140593c = t4xVar;
        this.f140594d = u9xVar;
        this.f140595e = p94Var;
        this.f140596f = wra0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m61033a(String str, byte[] bArr, byte[] bArr2, boolean z, String str2, long j) {
        String strM69356a = this.f140595e.m69356a();
        u9x u9xVar = this.f140594d;
        nsf1.m65528n(u9xVar.f228306b, false, true, new t9x(u9xVar, str, bArr, this.f140592b, bArr2, this.f140593c, this.f140596f, z, str2, strM69356a, j));
    }

    /* JADX INFO: renamed from: b */
    public final void m61034b(String str, byte[] bArr, boolean z, String str2, long j, boolean z2) {
        String string;
        wsz0 wsz0Var = this.f140591a;
        String strM69356a = wsz0Var.f254786a.m69356a();
        String strM76852a = wsz0Var.f254787b.m76852a();
        vzn vznVar = wsz0Var.f254788c;
        yb11 yb11Var = (yb11) vznVar.f246487b;
        if (((Number) nsf1.m65528n(((l8x) vznVar.f246489d).f130954a, true, false, new mgi(1, 26))).intValue() == 0) {
            string = UUID.randomUUID().toString();
            yb11Var.f271047a.m28217b().edit().putString("database_id", string).apply();
            vznVar.f246488c = string;
        } else {
            string = (String) vznVar.f246488c;
            if (string == null) {
                yb11Var.getClass();
                b5y0 b5y0Var = yb11Var.f271047a;
                string = b5y0Var.m28217b().getString("database_id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    b5y0Var.m28217b().edit().putString("database_id", string).apply();
                    vznVar.f246488c = string;
                }
            }
        }
        byte[] bArrM88901a = wsz0Var.m88901a(str2, strM69356a, strM76852a, string);
        if (str2 != null && !wsz0Var.f254789d.containsKey("")) {
            wsz0Var.m88901a(null, strM69356a, strM76852a, string);
        }
        m61035c(str, bArr, bArrM88901a, z, str2, j, z2);
    }

    /* JADX INFO: renamed from: c */
    public final void m61035c(String str, byte[] bArr, byte[] bArr2, boolean z, String str2, long j, boolean z2) {
        if (!z2) {
            try {
                m61033a(str, bArr, bArr2, z, str2, j);
                return;
            } catch (SQLiteReadOnlyDatabaseException unused) {
                Thread.yield();
                m61033a(str, bArr, bArr2, z, str2, j);
                return;
            }
        }
        try {
            m61033a(str, bArr, bArr2, z, str2, j);
        } catch (Throwable th) {
            th.getMessage();
            this.f140596f.mo46852b();
            Thread.yield();
            m61033a(str, bArr, bArr2, z, str2, j);
        }
    }
}
