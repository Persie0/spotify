package p204p;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zh11 {

    /* JADX INFO: renamed from: a */
    public Context f282766a;

    /* JADX INFO: renamed from: b */
    public String f282767b;

    /* JADX INFO: renamed from: c */
    public Intent[] f282768c;

    /* JADX INFO: renamed from: d */
    public ComponentName f282769d;

    /* JADX INFO: renamed from: e */
    public CharSequence f282770e;

    /* JADX INFO: renamed from: f */
    public CharSequence f282771f;

    /* JADX INFO: renamed from: g */
    public CharSequence f282772g;

    /* JADX INFO: renamed from: h */
    public IconCompat f282773h;

    /* JADX INFO: renamed from: i */
    public nsn0[] f282774i;

    /* JADX INFO: renamed from: j */
    public Set f282775j;

    /* JADX INFO: renamed from: k */
    public kpa0 f282776k;

    /* JADX INFO: renamed from: l */
    public boolean f282777l;

    /* JADX INFO: renamed from: m */
    public int f282778m;

    /* JADX INFO: renamed from: n */
    public PersistableBundle f282779n;

    /* JADX INFO: renamed from: o */
    public long f282780o;

    /* JADX INFO: renamed from: a */
    public static ArrayList m96111a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new yh11(context, (ShortcutInfo) it.next()).m93617a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final ShortcutInfo m96112b() {
        xh11.m90948b();
        ShortcutInfo.Builder intents = xh11.m90947a(this.f282766a, this.f282767b).setShortLabel(this.f282770e).setIntents(this.f282768c);
        IconCompat iconCompat = this.f282773h;
        if (iconCompat != null) {
            intents.setIcon(x5i0.m90019G(iconCompat, this.f282766a));
        }
        if (!TextUtils.isEmpty(this.f282771f)) {
            intents.setLongLabel(this.f282771f);
        }
        if (!TextUtils.isEmpty(this.f282772g)) {
            intents.setDisabledMessage(this.f282772g);
        }
        ComponentName componentName = this.f282769d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f282775j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f282778m);
        PersistableBundle persistableBundle = this.f282779n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            nsn0[] nsn0VarArr = this.f282774i;
            if (nsn0VarArr != null && nsn0VarArr.length > 0) {
                int length = nsn0VarArr.length;
                Person[] personArr = new Person[length];
                while (i < length) {
                    personArr[i] = this.f282774i[i].m65577h();
                    i++;
                }
                intents.setPersons(personArr);
            }
            kpa0 kpa0Var = this.f282776k;
            if (kpa0Var != null) {
                intents.setLocusId(kpa0Var.m57024b());
            }
            intents.setLongLived(this.f282777l);
        } else {
            if (this.f282779n == null) {
                this.f282779n = new PersistableBundle();
            }
            nsn0[] nsn0VarArr2 = this.f282774i;
            if (nsn0VarArr2 != null && nsn0VarArr2.length > 0) {
                this.f282779n.putInt("extraPersonCount", nsn0VarArr2.length);
                while (i < this.f282774i.length) {
                    PersistableBundle persistableBundle2 = this.f282779n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i2 = i + 1;
                    sb.append(i2);
                    persistableBundle2.putPersistableBundle(sb.toString(), this.f282774i[i].m65579j());
                    i = i2;
                }
            }
            kpa0 kpa0Var2 = this.f282776k;
            if (kpa0Var2 != null) {
                this.f282779n.putString("extraLocusId", kpa0Var2.m57023a());
            }
            this.f282779n.putBoolean("extraLongLived", this.f282777l);
            intents.setExtras(this.f282779n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2254pf.m69753J(intents);
        }
        return intents.build();
    }
}
