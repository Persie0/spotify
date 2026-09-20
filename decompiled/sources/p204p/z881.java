package p204p;

import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class z881 implements qr91 {

    /* JADX INFO: renamed from: a */
    public final a981 f280407a;

    /* JADX INFO: renamed from: b */
    public final o881 f280408b;

    /* JADX INFO: renamed from: c */
    public final lwr f280409c = new lwr();

    public z881(a981 a981Var, o881 o881Var) {
        this.f280407a = a981Var;
        this.f280408b = o881Var;
    }

    @Override // p204p.qr91
    public final void start() {
        r881 r881Var = this.f280407a.f13518a;
        o881 o881Var = this.f280408b;
        ArrayList<n881> arrayList = o881Var.f162733a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (n881 n881Var : arrayList) {
            int i = n881Var.f151394b;
            Date date = n881Var.f151396d;
            Date date2 = n881Var.f151395c;
            int i2 = n881Var.f151393a;
            arrayList2.add(i > 0 ? new snl0(i2, i, date2, date) : new bbv(i2, date2, date));
        }
        String str = o881Var.f162734b;
        String str2 = o881Var.f162735c;
        gvw0 gvw0Var = new gvw0(str, str2, o881Var.f162736d);
        ArrayList arrayList3 = r881Var.f196737e;
        arrayList3.clear();
        arrayList3.add(oo80.f167512c);
        arrayList3.addAll(arrayList2);
        arrayList3.add(oo80.f167511b);
        if (str2.length() > 0) {
            arrayList3.add(gvw0Var);
        }
    }

    @Override // p204p.qr91
    public final void stop() {
        this.f280409c.m60129c();
    }
}
