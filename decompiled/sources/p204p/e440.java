package p204p;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.music.R;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class e440 implements eft0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55971a;

    /* JADX INFO: renamed from: b */
    public final Context f55972b;

    /* JADX INFO: renamed from: c */
    public final xre f55973c;

    /* JADX INFO: renamed from: d */
    public final pwj0 f55974d;

    /* JADX INFO: renamed from: e */
    public final ri5 f55975e;

    /* JADX INFO: renamed from: f */
    public final p0p0 f55976f;

    public /* synthetic */ e440(Context context, xre xreVar, pwj0 pwj0Var, ri5 ri5Var, p0p0 p0p0Var, int i) {
        this.f55971a = i;
        this.f55972b = context;
        this.f55973c = xreVar;
        this.f55974d = pwj0Var;
        this.f55975e = ri5Var;
        this.f55976f = p0p0Var;
    }

    @Override // p204p.eft0
    /* JADX INFO: renamed from: a */
    public final Object mo37734a(sy61 sy61Var, ibk ibkVar) {
        Long l;
        switch (this.f55971a) {
            case 0:
                d440 d440Var = (d440) sy61Var;
                wdt0 wdt0Var = d440Var.f45081i;
                int iM75550s = this.f55975e.m75550s(wdt0Var.f250327a, wdt0Var.f250330d);
                Context context = this.f55972b;
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.image_and_info_layout);
                remoteViews.setTextViewText(R.id.expanded_title, d440Var.f45075c);
                remoteViews.setTextViewText(R.id.expanded_subtitle, d440Var.f45076d);
                remoteViews.setTextViewText(R.id.expanded_description, d440Var.f45077e);
                remoteViews.setTextViewText(R.id.expanded_duration, d440Var.f45078f);
                Bitmap bitmap = d440Var.f45074b;
                remoteViews.setImageViewBitmap(R.id.expanded_image, bitmap);
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.image_and_info_layout_collapsed);
                atj0 atj0Var = d440Var.f45073a;
                String str = atj0Var.f19700a;
                remoteViews2.setTextViewText(R.id.collapsed_title, str);
                String str2 = atj0Var.f19701b;
                remoteViews2.setTextViewText(R.id.collapsed_subtitle, str2);
                remoteViews2.setImageViewBitmap(R.id.collapsed_image, bitmap);
                ktj0 ktj0Var = new ktj0(context, "NOTIFICATION_CHANNEL_DEFAULT");
                ktj0Var.f126314e = ktj0.m57322d(str);
                ktj0Var.f126315f = ktj0.m57322d(str2);
                ktj0Var.m57338q(new rtj0());
                ktj0Var.f126333x = remoteViews;
                ktj0Var.f126332w = remoteViews2;
                ktj0Var.f126307D.icon = R.drawable.icn_notification;
                ((wy3) this.f55973c).getClass();
                ktj0Var.f126307D.when = Calendar.getInstance().getTimeInMillis();
                ktj0Var.m57332k(16, true);
                ktj0Var.f126330u = context.getColor(R.color.green_light);
                ktj0Var.f126307D.deleteIntent = (PendingIntent) d440Var.f45079g.invoke(new Integer(iM75550s));
                ktj0Var.f126316g = (PendingIntent) d440Var.f45080h.invoke(new Integer(iM75550s));
                exg1.m40249r(ktj0Var, yqg1.m94355R(d440Var), wdt0Var);
                Iterator it = this.f55976f.m68724b(iM75550s, atj0Var.f19702c, wdt0Var, d440Var.f45082j).iterator();
                while (it.hasNext()) {
                    ktj0Var.m57324b((ctj0) it.next());
                }
                this.f55974d.m71293a(iM75550s, ktj0Var.m57325c());
                return new wb20(new rzq0(iM75550s, 0), wdt0Var, yqg1.m94355R(d440Var));
            case 1:
                return m37735b((xc40) sy61Var, ibkVar);
            case 2:
                ezd0 ezd0Var = (ezd0) sy61Var;
                wdt0 wdt0Var2 = ezd0Var.f64350i;
                int iM75550s2 = this.f55975e.m75550s(wdt0Var2.f250327a, wdt0Var2.f250330d);
                Context context2 = this.f55972b;
                RemoteViews remoteViews3 = new RemoteViews(context2.getPackageName(), R.layout.media_with_action_button_layout);
                atj0 atj0Var2 = ezd0Var.f64342a;
                String str3 = atj0Var2.f19700a;
                remoteViews3.setTextViewText(R.id.template_expanded_title, str3);
                String str4 = atj0Var2.f19701b;
                remoteViews3.setTextViewText(R.id.template_expanded_subtitle, str4);
                remoteViews3.setTextViewText(R.id.media_title, ezd0Var.f64344c);
                remoteViews3.setTextViewText(R.id.media_subtitle, ezd0Var.f64345d);
                Bitmap bitmap2 = ezd0Var.f64343b;
                remoteViews3.setImageViewBitmap(R.id.media_image, bitmap2);
                remoteViews3.setImageViewBitmap(R.id.media_action_button, ezd0Var.f64346e);
                remoteViews3.setOnClickPendingIntent(R.id.media_action_button, (PendingIntent) ezd0Var.f64349h.invoke(Integer.valueOf(iM75550s2)));
                RemoteViews remoteViews4 = new RemoteViews(context2.getPackageName(), R.layout.media_with_action_button_layout_collapsed);
                remoteViews4.setTextViewText(R.id.template_collapsed_title, str3);
                remoteViews4.setTextViewText(R.id.template_collapsed_subtitle, str4);
                remoteViews4.setImageViewBitmap(R.id.media_collapsed_image, bitmap2);
                ktj0 ktj0Var2 = new ktj0(context2, "NOTIFICATION_CHANNEL_DEFAULT");
                ktj0Var2.f126314e = ktj0.m57322d(str3);
                ktj0Var2.f126315f = ktj0.m57322d(str4);
                ktj0Var2.m57338q(new rtj0());
                ktj0Var2.f126333x = remoteViews3;
                ktj0Var2.f126332w = remoteViews4;
                ktj0Var2.f126307D.icon = R.drawable.icn_notification;
                ((wy3) this.f55973c).getClass();
                ktj0Var2.f126307D.when = Calendar.getInstance().getTimeInMillis();
                ktj0Var2.m57332k(16, true);
                ktj0Var2.f126330u = context2.getColor(R.color.green_light);
                ktj0Var2.f126307D.deleteIntent = (PendingIntent) ezd0Var.f64347f.invoke(new Integer(iM75550s2));
                ktj0Var2.f126316g = (PendingIntent) ezd0Var.f64348g.invoke(new Integer(iM75550s2));
                exg1.m40249r(ktj0Var2, yqg1.m94355R(ezd0Var), wdt0Var2);
                Iterator it2 = this.f55976f.m68724b(iM75550s2, atj0Var2.f19702c, wdt0Var2, ezd0Var.f64351j).iterator();
                while (it2.hasNext()) {
                    ktj0Var2.m57324b((ctj0) it2.next());
                }
                this.f55974d.m71293a(iM75550s2, ktj0Var2.m57325c());
                return new wb20(new rzq0(iM75550s2, 0), wdt0Var2, yqg1.m94355R(ezd0Var));
            default:
                cd21 cd21Var = (cd21) sy61Var;
                wdt0 wdt0Var3 = cd21Var.f36718d;
                int iM75550s3 = this.f55975e.m75550s(wdt0Var3.f250327a, wdt0Var3.f250330d);
                Context context3 = this.f55972b;
                ktj0 ktj0Var3 = new ktj0(context3, "NOTIFICATION_CHANNEL_DEFAULT");
                atj0 atj0Var3 = cd21Var.f36715a;
                ktj0Var3.f126314e = ktj0.m57322d(atj0Var3.f19700a);
                String str5 = atj0Var3.f19701b;
                ktj0Var3.f126315f = ktj0.m57322d(str5);
                itj0 itj0Var = new itj0(false);
                itj0Var.f105612f = ktj0.m57322d(str5);
                ktj0Var3.m57338q(itj0Var);
                ktj0Var3.f126307D.icon = R.drawable.icn_notification;
                ((wy3) this.f55973c).getClass();
                ktj0Var3.f126307D.when = Calendar.getInstance().getTimeInMillis();
                ktj0Var3.m57332k(16, true);
                ktj0Var3.f126330u = context3.getColor(R.color.green_light);
                ktj0Var3.f126307D.deleteIntent = (PendingIntent) cd21Var.f36716b.invoke(new Integer(iM75550s3));
                ktj0Var3.f126316g = (PendingIntent) cd21Var.f36717c.invoke(new Integer(iM75550s3));
                exg1.m40249r(ktj0Var3, yqg1.m94355R(cd21Var), wdt0Var3);
                cii ciiVar = cd21Var.f36720f;
                if (ciiVar != null && (l = ciiVar.f38351a) != null) {
                    ktj0Var3.f126304A = l.longValue();
                }
                Iterator it3 = this.f55976f.m68724b(iM75550s3, atj0Var3.f19702c, wdt0Var3, cd21Var.f36719e).iterator();
                while (it3.hasNext()) {
                    ktj0Var3.m57324b((ctj0) it3.next());
                }
                this.f55974d.m71293a(iM75550s3, ktj0Var3.m57325c());
                return new wb20(new rzq0(iM75550s3, cd21Var.f36721g), wdt0Var3, yqg1.m94355R(cd21Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:26:0x0107  */
    /* JADX WARN: Code duplicated, block: B:35:0x0135 A[LOOP:0: B:33:0x012f->B:35:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m37735b(xc40 xc40Var, ibk ibkVar) {
        yc40 yc40Var;
        int iM75550s;
        ktj0 ktj0Var;
        htj0 htj0Var;
        Uri uri;
        Object objInvoke;
        ktj0 ktj0Var2;
        htj0 htj0Var2;
        cii ciiVar;
        Iterator it;
        Long l;
        if (ibkVar instanceof yc40) {
            yc40Var = (yc40) ibkVar;
            int i = yc40Var.f271377g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yc40Var.f271377g = i - Integer.MIN_VALUE;
            } else {
                yc40Var = new yc40(this, ibkVar);
            }
        } else {
            yc40Var = new yc40(this, ibkVar);
        }
        Object obj = yc40Var.f271375e;
        int i2 = yc40Var.f271377g;
        if (i2 == 0) {
            bga.m29073P(obj);
            wdt0 wdt0Var = xc40Var.f260088f;
            atj0 atj0Var = xc40Var.f260083a;
            iM75550s = this.f55975e.m75550s(wdt0Var.f250327a, wdt0Var.f250330d);
            Context context = this.f55972b;
            ktj0Var = new ktj0(context, "NOTIFICATION_CHANNEL_DEFAULT");
            String str = atj0Var.f19700a;
            String str2 = atj0Var.f19701b;
            ktj0Var.f126314e = ktj0.m57322d(str);
            ktj0Var.f126315f = ktj0.m57322d(str2);
            ktj0Var.m57333l(xc40Var.f260084b);
            Notification notification = ktj0Var.f126307D;
            notification.icon = R.drawable.icn_notification;
            ((wy3) this.f55973c).getClass();
            notification.when = Calendar.getInstance().getTimeInMillis();
            ktj0Var.m57332k(16, true);
            ktj0Var.f126330u = context.getColor(R.color.green_light);
            notification.deleteIntent = (PendingIntent) xc40Var.f260086d.invoke(new Integer(iM75550s));
            ktj0Var.f126316g = (PendingIntent) xc40Var.f260087e.invoke(new Integer(iM75550s));
            exg1.m40249r(ktj0Var, yqg1.m94355R(xc40Var), xc40Var.f260088f);
            htj0Var = new htj0();
            htj0Var.f62990b = ktj0.m57322d(atj0Var.f19700a);
            htj0Var.f62991c = ktj0.m57322d(str2);
            htj0Var.f62992d = true;
            th00 th00Var = xc40Var.f260085c;
            if (th00Var != null) {
                Integer num = new Integer(iM75550s);
                yc40Var.f271371a = xc40Var;
                yc40Var.f271372b = ktj0Var;
                yc40Var.f271373c = htj0Var;
                yc40Var.f271374d = iM75550s;
                yc40Var.f271377g = 1;
                objInvoke = th00Var.invoke(num, yc40Var);
                yuk yukVar = yuk.f276404a;
                if (objInvoke == yukVar) {
                    return yukVar;
                }
                ktj0Var2 = ktj0Var;
                htj0Var2 = htj0Var;
            } else {
                uri = null;
            }
            if (uri != null) {
                htj0Var.m48584h(xc40Var.f260084b);
            } else if (Build.VERSION.SDK_INT >= 31) {
                Icon iconCreateWithContentUri = Icon.createWithContentUri(uri);
                htj0Var.getClass();
                PorterDuff.Mode mode = IconCompat.f774k;
                htj0Var.f95054e = x5i0.m90041t(iconCreateWithContentUri);
            }
            ktj0Var.m57338q(htj0Var);
            ciiVar = xc40Var.f260090h;
            wdt0 wdt0Var2 = xc40Var.f260088f;
            if (ciiVar != null && (l = ciiVar.f38351a) != null) {
                ktj0Var.f126304A = l.longValue();
            }
            it = this.f55976f.m68724b(iM75550s, xc40Var.f260083a.f19702c, wdt0Var2, xc40Var.f260089g).iterator();
            while (it.hasNext()) {
                ktj0Var.m57324b((ctj0) it.next());
            }
            this.f55974d.m71293a(iM75550s, ktj0Var.m57325c());
            return new wb20(new rzq0(iM75550s, 0), wdt0Var2, yqg1.m94355R(xc40Var));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = yc40Var.f271374d;
        htj0Var2 = yc40Var.f271373c;
        ktj0Var2 = yc40Var.f271372b;
        xc40 xc40Var2 = yc40Var.f271371a;
        bga.m29073P(obj);
        iM75550s = i3;
        xc40Var = xc40Var2;
        objInvoke = obj;
        uri = (Uri) objInvoke;
        htj0Var = htj0Var2;
        ktj0Var = ktj0Var2;
        if (uri != null) {
            htj0Var.m48584h(xc40Var.f260084b);
        } else if (Build.VERSION.SDK_INT >= 31) {
            Icon iconCreateWithContentUri2 = Icon.createWithContentUri(uri);
            htj0Var.getClass();
            PorterDuff.Mode mode2 = IconCompat.f774k;
            htj0Var.f95054e = x5i0.m90041t(iconCreateWithContentUri2);
        }
        ktj0Var.m57338q(htj0Var);
        ciiVar = xc40Var.f260090h;
        wdt0 wdt0Var3 = xc40Var.f260088f;
        if (ciiVar != null) {
            ktj0Var.f126304A = l.longValue();
        }
        it = this.f55976f.m68724b(iM75550s, xc40Var.f260083a.f19702c, wdt0Var3, xc40Var.f260089g).iterator();
        while (it.hasNext()) {
            ktj0Var.m57324b((ctj0) it.next());
        }
        this.f55974d.m71293a(iM75550s, ktj0Var.m57325c());
        return new wb20(new rzq0(iM75550s, 0), wdt0Var3, yqg1.m94355R(xc40Var));
    }

    public /* synthetic */ e440(pwj0 pwj0Var, ri5 ri5Var, Context context, xre xreVar, p0p0 p0p0Var, int i) {
        this.f55971a = i;
        this.f55974d = pwj0Var;
        this.f55975e = ri5Var;
        this.f55972b = context;
        this.f55973c = xreVar;
        this.f55976f = p0p0Var;
    }
}
