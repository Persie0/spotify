package p204p;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o101 extends Handler {

    /* JADX INFO: renamed from: a */
    public boolean f160559a;

    /* JADX INFO: renamed from: b */
    public long f160560b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f160561c;

    public o101(Looper looper) {
        super(looper);
        this.f160561c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m66033a(Messenger messenger) {
        if (this.f160559a) {
            m66035c(messenger, jkg1.m53630o().m46374a().f246598a);
            return;
        }
        fbz fbzVar = (fbz) ((szz0) jbr0.m52911d()).f215703c.get();
        String str = fbzVar != null ? fbzVar.f67959a : null;
        if (str != null) {
            m66035c(messenger, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66034b() {
        h101 h101VarM53630o = jkg1.m53630o();
        int i = h101VarM53630o.f86399d + 1;
        h101VarM53630o.f86399d = i;
        String lowerCase = i == 0 ? h101VarM53630o.f86398c : bm51.m29801l0(((UUID) h101VarM53630o.f86397b.invoke()).toString(), "-", "").toLowerCase(Locale.ROOT);
        String str = h101VarM53630o.f86398c;
        int i2 = h101VarM53630o.f86399d;
        h101VarM53630o.f86396a.getClass();
        h101VarM53630o.f86400e = new vzz0(i2, lowerCase, str, System.currentTimeMillis() * 1000);
        h101VarM53630o.m46374a();
        jkg1.m53630o().m46374a();
        jkg1.m53630o().m46374a().toString();
        f101 f101Var = (f101) tjr0.m80989b();
        fbk fbkVar = null;
        x0h1.m89578u(kk40.m56661c(f101Var.f64762e), null, 0, new mm0(f101Var, jkg1.m53630o().m46374a(), (fbk) null), 3);
        Iterator it = new ArrayList(this.f160561c).iterator();
        while (it.hasNext()) {
            m66033a((Messenger) it.next());
        }
        szz0 szz0Var = (szz0) jbr0.m52911d();
        x0h1.m89578u(kk40.m56661c(szz0Var.f215702b), null, 0, new xay0(szz0Var, jkg1.m53630o().m46374a().f246598a, fbkVar, 15), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m66035c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Objects.toString(messenger);
            this.f160561c.remove(messenger);
        } catch (Exception unused2) {
            Objects.toString(messenger);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        wxz0 wxz0Var;
        cks cksVar;
        Integer num;
        long jM54449D;
        if (this.f160560b > message.getWhen()) {
            message.getWhen();
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                message.getWhen();
                this.f160560b = message.getWhen();
                return;
            }
            if (i != 4) {
                message.toString();
                super.handleMessage(message);
                return;
            }
            Messenger messenger = message.replyTo;
            ArrayList arrayList = this.f160561c;
            arrayList.add(messenger);
            m66033a(message.replyTo);
            Objects.toString(message.replyTo);
            message.getWhen();
            arrayList.size();
            return;
        }
        message.getWhen();
        if (this.f160559a) {
            long when = message.getWhen() - this.f160560b;
            l401.f129467c.getClass();
            l401 l401Var = (l401) ltf1.m59891m().m41198b(l401.class);
            cks cksVarM95406v = l401Var.f129469a.m95406v();
            if (cksVarM95406v != null) {
                jM54449D = cksVarM95406v.f39083a;
                if (!cks.m33193l(jM54449D) || cks.m33192k(jM54449D)) {
                    wxz0Var = l401Var.f129470b.m75417b().f45951b;
                    cksVar = null;
                    if (wxz0Var != null) {
                        wj50.m88260d0("sessionConfigs");
                        throw null;
                    }
                    num = wxz0Var.f256163c;
                    if (num != null) {
                        hvi0 hvi0Var = cks.f39079b;
                        cksVar = new cks(jwg1.m54449D(num.intValue(), ils.SECONDS));
                    }
                    if (cksVar != null) {
                        jM54449D = cksVar.f39083a;
                        if (cks.m33193l(jM54449D) || cks.m33192k(jM54449D)) {
                            hvi0 hvi0Var2 = cks.f39079b;
                            jM54449D = jwg1.m54449D(30, ils.MINUTES);
                        }
                    } else {
                        hvi0 hvi0Var3 = cks.f39079b;
                        jM54449D = jwg1.m54449D(30, ils.MINUTES);
                    }
                }
            } else {
                wxz0Var = l401Var.f129470b.m75417b().f45951b;
                cksVar = null;
                if (wxz0Var != null) {
                    wj50.m88260d0("sessionConfigs");
                    throw null;
                }
                num = wxz0Var.f256163c;
                if (num != null) {
                    hvi0 hvi0Var4 = cks.f39079b;
                    cksVar = new cks(jwg1.m54449D(num.intValue(), ils.SECONDS));
                }
                if (cksVar != null) {
                    jM54449D = cksVar.f39083a;
                    if (cks.m33193l(jM54449D)) {
                        hvi0 hvi0Var5 = cks.f39079b;
                        jM54449D = jwg1.m54449D(30, ils.MINUTES);
                    } else {
                        hvi0 hvi0Var6 = cks.f39079b;
                        jM54449D = jwg1.m54449D(30, ils.MINUTES);
                    }
                } else {
                    hvi0 hvi0Var7 = cks.f39079b;
                    jM54449D = jwg1.m54449D(30, ils.MINUTES);
                }
            }
            if (when > cks.m33187f(jM54449D)) {
                m66034b();
            }
        } else {
            this.f160559a = true;
            m66034b();
        }
        this.f160560b = message.getWhen();
    }
}
