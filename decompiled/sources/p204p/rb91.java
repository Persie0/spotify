package p204p;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rb91 {

    /* JADX INFO: renamed from: b */
    public final View f197534b;

    /* JADX INFO: renamed from: a */
    public final HashMap f197533a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f197535c = new ArrayList();

    public rb91(View view) {
        this.f197534b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rb91)) {
            return false;
        }
        rb91 rb91Var = (rb91) obj;
        return this.f197534b == rb91Var.f197534b && this.f197533a.equals(rb91Var.f197533a);
    }

    public final int hashCode() {
        return this.f197533a.hashCode() + (this.f197534b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM75191i = rbz.m75191i("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM75191i.append(this.f197534b);
        sbM75191i.append("\n");
        String strM77250i = s571.m77250i(sbM75191i.toString(), "    values:");
        HashMap map = this.f197533a;
        for (String str : map.keySet()) {
            strM77250i = strM77250i + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM77250i;
    }
}
