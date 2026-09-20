package p204p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cge {

    /* JADX INFO: renamed from: a */
    public final String f37642a;

    /* JADX INFO: renamed from: b */
    public List f37643b = lau.f131415a;

    /* JADX INFO: renamed from: c */
    public final ArrayList f37644c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashSet f37645d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final ArrayList f37646e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f37647f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f37648g = new ArrayList();

    public cge(String str) {
        this.f37642a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m32690a(String str, ktz0 ktz0Var, boolean z) {
        if (!this.f37645d.add(str)) {
            StringBuilder sbM38572u = edb.m38572u("Element with name '", str, "' is already registered in ");
            sbM38572u.append(this.f37642a);
            throw new IllegalArgumentException(sbM38572u.toString().toString());
        }
        this.f37644c.add(str);
        this.f37646e.add(ktz0Var);
        this.f37647f.add(lau.f131415a);
        this.f37648g.add(Boolean.valueOf(z));
    }
}
