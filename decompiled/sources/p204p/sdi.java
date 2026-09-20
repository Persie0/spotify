package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class sdi extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208015a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f208016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f208017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdi(String str, ArrayList arrayList) {
        super(1);
        this.f208016b = str;
        this.f208017c = arrayList;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        switch (this.f208015a) {
            case 0:
                cqx cqxVar = (cqx) obj;
                ArrayList arrayList = this.f208017c;
                cqxVar.m33647b(luh.class, arrayList, false);
                cqxVar.m33647b(i3i.class, arrayList, false);
                cqxVar.m33647b(pfa0.class, arrayList, false);
                String str = this.f208016b;
                if (str != null) {
                    cqxVar.m33646a(str, wth.class, false);
                }
                return w2a1.f247311a;
            default:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1(this.f208016b);
                try {
                    Iterator it = this.f208017c.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        ezx0VarMo63454G1.mo24842R(i, (String) it.next());
                        i++;
                    }
                    ezx0VarMo63454G1.mo24841E1();
                    return w2a1.f247311a;
                } finally {
                    ezx0VarMo63454G1.close();
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdi(ArrayList arrayList, String str) {
        super(1);
        this.f208017c = arrayList;
        this.f208016b = str;
    }
}
