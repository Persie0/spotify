package p204p;

import android.app.Application;
import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class t35 {
    /* JADX INFO: renamed from: a */
    public static nsn0 m79961a(Person person) {
        IconCompat iconCompatM90041t;
        vpp vppVar = new vpp();
        vppVar.m86173h(person.getName());
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.f774k;
            iconCompatM90041t = x5i0.m90041t(icon);
        } else {
            iconCompatM90041t = null;
        }
        vppVar.m86170e(iconCompatM90041t);
        vppVar.m86174i(person.getUri());
        vppVar.m86172g(person.getKey());
        vppVar.m86169d(person.isBot());
        vppVar.m86171f(person.isImportant());
        return vppVar.m86166a();
    }

    /* JADX INFO: renamed from: b */
    public static String m79962b() {
        return Application.getProcessName();
    }

    /* JADX INFO: renamed from: c */
    public static Person m79963c(nsn0 nsn0Var) {
        Person.Builder name = new Person.Builder().setName(nsn0Var.m65573d());
        Icon iconM90019G = null;
        if (nsn0Var.m65571b() != null) {
            IconCompat iconCompatM65571b = nsn0Var.m65571b();
            iconCompatM65571b.getClass();
            iconM90019G = x5i0.m90019G(iconCompatM65571b, null);
        }
        return name.setIcon(iconM90019G).setUri(nsn0Var.m65574e()).setKey(nsn0Var.m65572c()).setBot(nsn0Var.m65575f()).setImportant(nsn0Var.m65576g()).build();
    }
}
