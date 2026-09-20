package p204p;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class vid implements eft0 {

    /* JADX INFO: renamed from: a */
    public final Context f241674a;

    /* JADX INFO: renamed from: b */
    public final xre f241675b;

    /* JADX INFO: renamed from: c */
    public final pwj0 f241676c;

    /* JADX INFO: renamed from: d */
    public final d9k f241677d;

    /* JADX INFO: renamed from: e */
    public final ri5 f241678e;

    /* JADX INFO: renamed from: f */
    public final p0p0 f241679f;

    /* JADX INFO: renamed from: g */
    public final eet0 f241680g;

    public vid(Context context, xre xreVar, pwj0 pwj0Var, d9k d9kVar, ri5 ri5Var, p0p0 p0p0Var, eet0 eet0Var) {
        this.f241674a = context;
        this.f241675b = xreVar;
        this.f241676c = pwj0Var;
        this.f241677d = d9kVar;
        this.f241678e = ri5Var;
        this.f241679f = p0p0Var;
        this.f241680g = eet0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m85606b(tid tidVar, ktj0 ktj0Var, String str, Bitmap bitmap, nsn0 nsn0Var) {
        String strConcat = "CHAT_".concat(tidVar.f220609c);
        zh11 zh11Var = new zh11();
        zh11Var.f282766a = this.f241674a;
        zh11Var.f282767b = strConcat;
        zh11Var.f282777l = true;
        zh11Var.f282770e = str;
        zh11Var.f282773h = IconCompat.m389c(bitmap);
        zh11Var.f282768c = new Intent[]{new Intent("android.intent.action.VIEW", Uri.parse(tidVar.f220607a.f19702c))};
        zh11Var.f282774i = new nsn0[]{nsn0Var};
        if (TextUtils.isEmpty(zh11Var.f282770e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = zh11Var.f282768c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        if (zh11Var.f282776k == null) {
            zh11Var.f282776k = new kpa0(zh11Var.f282767b);
        }
        zh11Var.f282777l = true;
        d9k d9kVar = this.f241677d;
        List listM35375a = d9kVar.m35375a();
        if (listM35375a != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM35375a) {
                if (bm51.m29803n0(((zh11) obj).f282767b, "CHAT_", false)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                Context context = d9kVar.f46849a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((zh11) it.next()).f282767b);
                }
                ci11.m32860v(context, arrayList2);
            }
        }
        if (d9kVar.m35376b(zh11Var)) {
            ktj0Var.f126335z = strConcat;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3 A[LOOP:0: B:38:0x00d4->B:43:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x020a  */
    /* JADX WARN: Code duplicated, block: B:70:0x021d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0233 A[LOOP:1: B:72:0x022d->B:74:0x0233, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // p204p.eft0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object mo37734a(tid tidVar, ibk ibkVar) {
        uid uidVar;
        int iM75550s;
        fsz0 fsz0Var;
        String str;
        Uri uri;
        nsn0 nsn0Var;
        gxy gxyVar;
        String str2;
        nsn0 nsn0Var2;
        ome0 ome0Var;
        String str3;
        wdt0 wdt0Var;
        String str4;
        String str5;
        Iterator it;
        Notification notification;
        ztj0 ztj0Var;
        xre xreVar;
        ktj0 ktj0Var;
        ome0 ome0Var2;
        vid vidVar;
        Iterator it2;
        euj0 euj0VarM40075c;
        StatusBarNotification statusBarNotification;
        tid tidVar2 = tidVar;
        if (ibkVar instanceof uid) {
            uidVar = (uid) ibkVar;
            int i = uidVar.f230664g;
            if ((i & Integer.MIN_VALUE) != 0) {
                uidVar.f230664g = i - Integer.MIN_VALUE;
            } else {
                uidVar = new uid(this, ibkVar);
            }
        } else {
            uidVar = new uid(this, ibkVar);
        }
        uid uidVar2 = uidVar;
        Object objM38710b = uidVar2.f230662e;
        int i2 = uidVar2.f230664g;
        if (i2 == 0) {
            bga.m29073P(objM38710b);
            wdt0 wdt0Var2 = tidVar2.f220614h;
            iM75550s = this.f241678e.m75550s(wdt0Var2.f250327a, wdt0Var2.f250330d);
            ome0 ome0Var3 = tidVar2.f220608b;
            if (ome0Var3 instanceof nme0) {
                fsz0Var = ((nme0) ome0Var3).f155415a;
            } else {
                if (!(ome0Var3 instanceof mme0)) {
                    throw new NoWhenBranchMatchedException();
                }
                fsz0Var = ((mme0) ome0Var3).f145129a;
            }
            str = fsz0Var.f73077a;
            IconCompat iconCompatM389c = IconCompat.m389c(fsz0Var.f73079c);
            String str6 = fsz0Var.f73078b;
            nsn0 nsn0Var3 = new nsn0();
            nsn0Var3.f157848a = str;
            nsn0Var3.f157849b = iconCompatM389c;
            nsn0Var3.f157850c = null;
            nsn0Var3.f157851d = str6;
            nsn0Var3.f157852e = false;
            nsn0Var3.f157853f = true;
            e8d0 e8d0Var = tidVar2.f220610d;
            if (e8d0Var != null) {
                int iM38547C = edb.m38547C(e8d0Var.f57145b);
                if (iM38547C == 0) {
                    gxyVar = gxy.GIF;
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gxyVar = gxy.IMAGE;
                }
                gxy gxyVar2 = gxyVar;
                String str7 = tidVar2.f220609c;
                String str8 = e8d0Var.f57144a;
                uidVar2.f230658a = tidVar2;
                uidVar2.f230659b = str;
                uidVar2.f230660c = nsn0Var3;
                uidVar2.f230661d = iM75550s;
                uidVar2.f230664g = 1;
                objM38710b = this.f241680g.m38710b(str7, iM75550s, str8, gxyVar2, uidVar2);
                Object obj = yuk.f276404a;
                if (objM38710b == obj) {
                    return obj;
                }
                str2 = str;
                nsn0Var2 = nsn0Var3;
            } else {
                uri = null;
                nsn0Var = nsn0Var3;
            }
            atj0 atj0Var = tidVar2.f220607a;
            ome0Var = tidVar2.f220608b;
            str3 = tidVar2.f220609c;
            wdt0Var = tidVar2.f220614h;
            str4 = atj0Var.f19700a;
            str5 = atj0Var.f19701b;
            pwj0 pwj0Var = this.f241676c;
            it = nqg1.m65440n(pwj0Var.f182068b).iterator();
            while (true) {
                if (it.hasNext()) {
                    notification = null;
                    break;
                }
                statusBarNotification = (StatusBarNotification) it.next();
                if (wj50.m88271j(statusBarNotification.getNotification().getGroup(), str3)) {
                    notification = statusBarNotification.getNotification();
                    break;
                }
            }
            if (notification != null) {
                euj0VarM40075c = euj0.m40075c(notification);
                if (euj0VarM40075c instanceof ztj0) {
                    ztj0Var = (ztj0) euj0VarM40075c;
                } else {
                    ztj0Var = null;
                }
                if (ztj0Var == null) {
                    ztj0Var = new ztj0(nsn0Var);
                }
            } else {
                ztj0Var = new ztj0(nsn0Var);
                ztj0Var.f286203h = str4;
            }
            xreVar = this.f241675b;
            if (uri != null) {
                if (str5.length() > 0) {
                    ((wy3) xreVar).getClass();
                    ztj0Var.m96936f(new ytj0(str5, Calendar.getInstance().getTimeInMillis(), nsn0Var));
                }
                ((wy3) xreVar).getClass();
                ytj0 ytj0Var = new ytj0("", Calendar.getInstance().getTimeInMillis(), nsn0Var);
                ytj0Var.f276135e = "image/*";
                ytj0Var.f276136f = uri;
                ztj0Var.m96936f(ytj0Var);
            } else {
                ome0Var = ome0Var;
                wdt0Var = wdt0Var;
                ((wy3) xreVar).getClass();
                ztj0Var.m96936f(new ytj0(str5, Calendar.getInstance().getTimeInMillis(), nsn0Var));
            }
            Context context = this.f241674a;
            ktj0Var = new ktj0(context, "NOTIFICATION_CHANNEL_MESSAGES");
            ktj0Var.f126314e = ktj0.m57322d(atj0Var.f19700a);
            ktj0Var.f126315f = ktj0.m57322d(atj0Var.f19701b);
            ktj0Var.m57338q(ztj0Var);
            ktj0Var.f126307D.icon = R.drawable.icn_notification;
            ((wy3) xreVar).getClass();
            ktj0Var.f126307D.when = Calendar.getInstance().getTimeInMillis();
            ktj0Var.f126328s = "msg";
            ktj0Var.f126319j = 2;
            ktj0Var.f126326q = str3;
            ktj0Var.m57332k(16, true);
            if (nsn0Var != null) {
                ktj0Var.f126312c.add(nsn0Var);
            }
            ktj0Var.f126330u = context.getColor(R.color.green_light);
            ktj0Var.f126307D.deleteIntent = (PendingIntent) tidVar2.f220611e.invoke(new Integer(iM75550s));
            ktj0Var.f126316g = (PendingIntent) tidVar2.f220612f.invoke(new Integer(iM75550s));
            ktj0Var.f126329t = tidVar2.f220613g;
            wdt0 wdt0Var3 = wdt0Var;
            exg1.m40249r(ktj0Var, yqg1.m94355R(tidVar2), wdt0Var3);
            ome0Var2 = ome0Var;
            if (ome0Var2 instanceof nme0) {
                m85606b(tidVar2, ktj0Var, str, ((nme0) ome0Var2).f155415a.f73079c, nsn0Var);
            }
            if (ome0Var2 instanceof mme0) {
                ztj0Var.f286204i = Boolean.TRUE;
                mme0 mme0Var = (mme0) ome0Var2;
                String str9 = mme0Var.f145130b;
                ztj0Var.f286203h = str9;
                Bitmap bitmap = mme0Var.f145131c;
                vidVar = this;
                vidVar.m85606b(tidVar2, ktj0Var, str9, bitmap, nsn0Var);
            } else {
                vidVar = this;
            }
            it2 = vidVar.f241679f.m68724b(iM75550s, atj0Var.f19702c, wdt0Var3, tidVar2.f220615i).iterator();
            while (it2.hasNext()) {
                ktj0Var.m57324b((ctj0) it2.next());
            }
            pwj0Var.m71293a(iM75550s, ktj0Var.m57325c());
            return new wb20(new rzq0(iM75550s, 0), wdt0Var3, yqg1.m94355R(tidVar2));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = uidVar2.f230661d;
        nsn0Var2 = uidVar2.f230660c;
        str2 = uidVar2.f230659b;
        tid tidVar3 = uidVar2.f230658a;
        bga.m29073P(objM38710b);
        iM75550s = i3;
        tidVar2 = tidVar3;
        uri = (Uri) objM38710b;
        nsn0Var = nsn0Var2;
        str = str2;
        atj0 atj0Var2 = tidVar2.f220607a;
        ome0Var = tidVar2.f220608b;
        str3 = tidVar2.f220609c;
        wdt0Var = tidVar2.f220614h;
        str4 = atj0Var2.f19700a;
        str5 = atj0Var2.f19701b;
        pwj0 pwj0Var2 = this.f241676c;
        it = nqg1.m65440n(pwj0Var2.f182068b).iterator();
        while (true) {
            if (it.hasNext()) {
                notification = null;
                break;
            }
            statusBarNotification = (StatusBarNotification) it.next();
            if (wj50.m88271j(statusBarNotification.getNotification().getGroup(), str3)) {
                notification = statusBarNotification.getNotification();
                break;
            }
        }
        if (notification != null) {
            euj0VarM40075c = euj0.m40075c(notification);
            if (euj0VarM40075c instanceof ztj0) {
                ztj0Var = (ztj0) euj0VarM40075c;
            } else {
                ztj0Var = null;
            }
            if (ztj0Var == null) {
                ztj0Var = new ztj0(nsn0Var);
            }
        } else {
            ztj0Var = new ztj0(nsn0Var);
            ztj0Var.f286203h = str4;
        }
        xreVar = this.f241675b;
        if (uri != null) {
            if (str5.length() > 0) {
                ((wy3) xreVar).getClass();
                ztj0Var.m96936f(new ytj0(str5, Calendar.getInstance().getTimeInMillis(), nsn0Var));
            }
            ((wy3) xreVar).getClass();
            ytj0 ytj0Var2 = new ytj0("", Calendar.getInstance().getTimeInMillis(), nsn0Var);
            ytj0Var2.f276135e = "image/*";
            ytj0Var2.f276136f = uri;
            ztj0Var.m96936f(ytj0Var2);
        } else {
            ome0Var = ome0Var;
            wdt0Var = wdt0Var;
            ((wy3) xreVar).getClass();
            ztj0Var.m96936f(new ytj0(str5, Calendar.getInstance().getTimeInMillis(), nsn0Var));
        }
        Context context2 = this.f241674a;
        ktj0Var = new ktj0(context2, "NOTIFICATION_CHANNEL_MESSAGES");
        ktj0Var.f126314e = ktj0.m57322d(atj0Var2.f19700a);
        ktj0Var.f126315f = ktj0.m57322d(atj0Var2.f19701b);
        ktj0Var.m57338q(ztj0Var);
        ktj0Var.f126307D.icon = R.drawable.icn_notification;
        ((wy3) xreVar).getClass();
        ktj0Var.f126307D.when = Calendar.getInstance().getTimeInMillis();
        ktj0Var.f126328s = "msg";
        ktj0Var.f126319j = 2;
        ktj0Var.f126326q = str3;
        ktj0Var.m57332k(16, true);
        if (nsn0Var != null) {
            ktj0Var.f126312c.add(nsn0Var);
        }
        ktj0Var.f126330u = context2.getColor(R.color.green_light);
        ktj0Var.f126307D.deleteIntent = (PendingIntent) tidVar2.f220611e.invoke(new Integer(iM75550s));
        ktj0Var.f126316g = (PendingIntent) tidVar2.f220612f.invoke(new Integer(iM75550s));
        ktj0Var.f126329t = tidVar2.f220613g;
        wdt0 wdt0Var4 = wdt0Var;
        exg1.m40249r(ktj0Var, yqg1.m94355R(tidVar2), wdt0Var4);
        ome0Var2 = ome0Var;
        if (ome0Var2 instanceof nme0) {
            m85606b(tidVar2, ktj0Var, str, ((nme0) ome0Var2).f155415a.f73079c, nsn0Var);
        }
        if (ome0Var2 instanceof mme0) {
            ztj0Var.f286204i = Boolean.TRUE;
            mme0 mme0Var2 = (mme0) ome0Var2;
            String str10 = mme0Var2.f145130b;
            ztj0Var.f286203h = str10;
            Bitmap bitmap2 = mme0Var2.f145131c;
            vidVar = this;
            vidVar.m85606b(tidVar2, ktj0Var, str10, bitmap2, nsn0Var);
        } else {
            vidVar = this;
        }
        it2 = vidVar.f241679f.m68724b(iM75550s, atj0Var2.f19702c, wdt0Var4, tidVar2.f220615i).iterator();
        while (it2.hasNext()) {
            ktj0Var.m57324b((ctj0) it2.next());
        }
        pwj0Var2.m71293a(iM75550s, ktj0Var.m57325c());
        return new wb20(new rzq0(iM75550s, 0), wdt0Var4, yqg1.m94355R(tidVar2));
    }
}
