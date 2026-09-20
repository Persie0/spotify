package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g741 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77176a;

    /* JADX INFO: renamed from: b */
    public final Object f77177b;

    /* JADX INFO: renamed from: c */
    public final Object f77178c;

    public g741(e7h1 e7h1Var, List list, List list2) {
        this.f77176a = 2;
        this.f77177b = list;
        this.f77178c = list2;
    }

    /* JADX INFO: renamed from: d */
    public static g741 m43795d(r55 r55Var) {
        return new g741(r55Var);
    }

    /* JADX INFO: renamed from: a */
    public void m43796a(ComponentName componentName) {
        Context context = (Context) this.f77178c;
        ArrayList arrayList = (ArrayList) this.f77177b;
        int size = arrayList.size();
        try {
            for (Intent intentM85482w = vgg1.m85482w(context, componentName); intentM85482w != null; intentM85482w = vgg1.m85482w(context, intentM85482w.getComponent())) {
                arrayList.add(size, intentM85482w);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m43797b(r55 r55Var) {
        Intent intentM85483x = vgg1.m85483x(r55Var);
        if (intentM85483x == null) {
            intentM85483x = vgg1.m85483x(r55Var);
        }
        if (intentM85483x != null) {
            ComponentName component = intentM85483x.getComponent();
            if (component == null) {
                component = intentM85483x.resolveActivity(((Context) this.f77178c).getPackageManager());
            }
            m43796a(component);
            ((ArrayList) this.f77177b).add(intentM85483x);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m43798e() {
        ArrayList arrayList = (ArrayList) this.f77177b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ((Context) this.f77178c).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f77176a) {
            case 0:
                i741 i741Var = (i741) this.f77178c;
                return i741Var.f99427c.mo37398c(i741Var, (String) this.f77177b);
            case 1:
                return ((ArrayList) this.f77177b).iterator();
            default:
                return new c7h1(((List) this.f77177b).iterator(), ((List) this.f77178c).iterator());
        }
    }

    public String toString() {
        switch (this.f77176a) {
            case 0:
                bk60 bk60Var = new bk60(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                bk60Var.m29644b(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public g741(Context context) {
        this.f77176a = 1;
        this.f77177b = new ArrayList();
        this.f77178c = context;
    }

    public g741(i741 i741Var, String str) {
        this.f77176a = 0;
        this.f77177b = str;
        this.f77178c = i741Var;
    }
}
