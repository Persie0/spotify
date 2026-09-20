package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class sfq0 {

    /* JADX INFO: renamed from: a */
    public final pn91 f208626a;

    /* JADX INFO: renamed from: b */
    public final List f208627b;

    /* JADX INFO: renamed from: c */
    public final String f208628c;

    /* JADX INFO: renamed from: d */
    public final sfq0 f208629d;

    public sfq0(pn91 pn91Var, List list, String str) {
        this.f208626a = pn91Var;
        this.f208627b = list;
        this.f208628c = str;
        sfq0 sfq0Var = null;
        if (str != null) {
            pn91 pn91VarM70430a = pn91Var != null ? pn91Var.m70430a() : null;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pn91 pn91Var2 = (pn91) it.next();
                arrayList.add(pn91Var2 != null ? pn91Var2.m70430a() : null);
            }
            sfq0Var = new sfq0(pn91VarM70430a, arrayList, null);
        }
        this.f208629d = sfq0Var;
    }
}
