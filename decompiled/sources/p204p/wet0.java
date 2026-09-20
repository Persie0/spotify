package p204p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class wet0 {

    /* JADX INFO: renamed from: a */
    public final Context f250621a;

    /* JADX INFO: renamed from: b */
    public final hv31 f250622b;

    /* JADX INFO: renamed from: c */
    public final fk60 f250623c;

    /* JADX INFO: renamed from: d */
    public final Object f250624d = new Object();

    public wet0(Context context, hv31 hv31Var, fk60 fk60Var) {
        this.f250621a = context;
        this.f250622b = hv31Var;
        this.f250623c = fk60Var;
    }

    /* JADX INFO: renamed from: a */
    public static fv31 m87908a(int i) {
        return fv31.f73628b.m78180K("push_notification_pending_intents_" + i);
    }

    /* JADX INFO: renamed from: b */
    public final void m87909b(int i) {
        synchronized (this.f250624d) {
            try {
                Iterator it = m87911d(i).iterator();
                while (it.hasNext()) {
                    m87910c(i, (vet0) it.next());
                }
                m87914g(Collections.singleton(Integer.valueOf(i)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m87910c(int i, vet0 vet0Var) {
        int i2;
        PendingIntent activity;
        Intent intent = new Intent(vet0Var.f240809a);
        intent.addCategory(vet0Var.f240810b);
        String str = vet0Var.f240811c;
        Context context = this.f250621a;
        intent.setClassName(context, str);
        String str2 = vet0Var.f240813e;
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        }
        String str3 = vet0Var.f240812d;
        if (str3 == null) {
            throw new NullPointerException("Name is null");
        }
        if (str3.equals("ACTIVITY")) {
            i2 = 1;
        } else {
            if (!str3.equals("BROADCAST")) {
                throw new IllegalArgumentException("No enum constant com.spotify.musicappplatform.state.processor.PendingIntentType.".concat(str3));
            }
            i2 = 2;
        }
        int iM38547C = edb.m38547C(i2);
        if (iM38547C == 0) {
            activity = PendingIntent.getActivity(context, i, intent, 603979776);
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            activity = PendingIntent.getBroadcast(context, i, intent, 603979776);
        }
        if (activity != null) {
            activity.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Set m87911d(int i) {
        Object c6x0Var;
        fv31 fv31VarM87908a = m87908a(i);
        hv31 hv31Var = this.f250622b;
        Set set = gbu.f78413a;
        Set setMo48707b = hv31Var.mo48707b(fv31VarM87908a, set);
        if (setMo48707b != null) {
            set = setMo48707b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                c6x0Var = (vet0) this.f250623c.m41880a((String) it.next(), vet0.Companion.serializer());
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            if (c6x0Var instanceof c6x0) {
                c6x0Var = null;
            }
            vet0 vet0Var = (vet0) c6x0Var;
            if (vet0Var != null) {
                arrayList.add(vet0Var);
            }
        }
        return g6f.m43736n1(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final List m87912e() {
        Object c6x0Var;
        String strMo48710e = this.f250622b.mo48710e(xet0.f260771a, null);
        lau lauVar = lau.f131415a;
        if (strMo48710e == null) {
            return lauVar;
        }
        try {
            c6x0Var = (List) this.f250623c.m41880a(strMo48710e, xet0.f260772b);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Object obj = lauVar;
        if (!(c6x0Var instanceof c6x0)) {
            obj = c6x0Var;
        }
        return (List) obj;
    }

    /* JADX INFO: renamed from: f */
    public final PendingIntent m87913f(int i, int i2, Intent intent) {
        PendingIntent activity;
        String str;
        ComponentName component;
        String className;
        String str2;
        synchronized (this.f250624d) {
            try {
                int iM38547C = edb.m38547C(i2);
                if (iM38547C == 0) {
                    activity = PendingIntent.getActivity(this.f250621a, i, intent, 201326592);
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    activity = PendingIntent.getBroadcast(this.f250621a, i, intent, 201326592);
                }
                String action = intent.getAction();
                vet0 vet0Var = null;
                if (action != null) {
                    Set<String> categories = intent.getCategories();
                    if (categories == null || (str = (String) g6f.m43707U0(categories)) == null || (component = intent.getComponent()) == null || (className = component.getClassName()) == null) {
                        vet0Var = null;
                    } else {
                        if (i2 == 1) {
                            str2 = "ACTIVITY";
                        } else {
                            if (i2 != 2) {
                                throw null;
                            }
                            str2 = "BROADCAST";
                        }
                        Uri data = intent.getData();
                        vet0Var = new vet0(action, str, className, str2, data != null ? data.toString() : null);
                    }
                }
                if (vet0Var != null) {
                    m87915h(i, vet0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activity;
    }

    /* JADX INFO: renamed from: g */
    public final void m87914g(Set set) {
        List listM87912e = m87912e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM87912e) {
            if (!set.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        lv31 lv31VarEdit = this.f250622b.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            lv31VarEdit.m60053f(m87908a(((Number) it.next()).intValue()));
        }
        if (arrayList.isEmpty()) {
            lv31VarEdit.m60053f(xet0.f260771a);
        } else {
            lv31VarEdit.m60051d(xet0.f260771a, this.f250623c.m41881b(xet0.f260772b, arrayList));
        }
        lv31VarEdit.m60055h();
    }

    /* JADX INFO: renamed from: h */
    public final void m87915h(int i, vet0 vet0Var) {
        fv31 fv31VarM87908a = m87908a(i);
        hv31 hv31Var = this.f250622b;
        Set set = gbu.f78413a;
        Set setMo48707b = hv31Var.mo48707b(fv31VarM87908a, set);
        if (setMo48707b != null) {
            set = setMo48707b;
        }
        Set setM43734m1 = g6f.m43734m1(set);
        rr60 rr60VarSerializer = vet0.Companion.serializer();
        fk60 fk60Var = this.f250623c;
        setM43734m1.add(fk60Var.m41881b(rr60VarSerializer, vet0Var));
        List listM87912e = m87912e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM87912e) {
            if (((Number) obj).intValue() != i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListM43701O0 = g6f.m43701O0(Integer.valueOf(i), arrayList);
        int size = arrayListM43701O0.size() - 30;
        if (size < 0) {
            size = 0;
        }
        Set setM43736n1 = g6f.m43736n1(g6f.m43714b1(arrayListM43701O0, size));
        List listM43715c1 = g6f.m43715c1(30, arrayListM43701O0);
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60052e(fv31VarM87908a, setM43734m1);
        lv31VarEdit.m60051d(xet0.f260771a, fk60Var.m41881b(xet0.f260772b, listM43715c1));
        Iterator it = setM43736n1.iterator();
        while (it.hasNext()) {
            lv31VarEdit.m60053f(m87908a(((Number) it.next()).intValue()));
        }
        lv31VarEdit.m60055h();
    }
}
