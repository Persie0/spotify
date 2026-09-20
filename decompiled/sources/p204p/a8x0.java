package p204p;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class a8x0 implements p7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b8x0 f13423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f13424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f13425c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Type f13426d;

    public a8x0(b8x0 b8x0Var, String str, String str2, Class cls) {
        this.f13423a = b8x0Var;
        this.f13424b = str;
        this.f13425c = str2;
        this.f13426d = cls;
    }

    @Override // p204p.p7x0
    /* JADX INFO: renamed from: a */
    public final void mo25060a(Object obj, String str) {
        b8x0 b8x0Var = this.f13423a;
        b8x0Var.f24691b.add(this.f13424b);
        Type type = this.f13426d;
        String str2 = this.f13425c;
        String strM28438a = b8x0.m28438a(str2, type);
        Iterator it = b8x0Var.f24691b.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!str3.equals(strM28438a) && bm51.m29803n0(str3, str2, false)) {
                it.remove();
            }
        }
    }

    @Override // p204p.p7x0
    public final void unregister() {
        b8x0 b8x0Var = this.f13423a;
        HashSet hashSet = b8x0Var.f24691b;
        String str = this.f13424b;
        hashSet.remove(str);
        b8x0Var.f24690a.remove(str);
    }
}
