package p204p;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class j430 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ qr60[] f108568k = {new spi0(j430.class, "isPageFocused", "isPageFocused()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final zz11 f108569a;

    /* JADX INFO: renamed from: b */
    public final jqz f108570b;

    /* JADX INFO: renamed from: c */
    public final boolean f108571c;

    /* JADX INFO: renamed from: d */
    public final xp4 f108572d;

    /* JADX INFO: renamed from: e */
    public boolean f108573e;

    /* JADX INFO: renamed from: f */
    public boolean f108574f;

    /* JADX INFO: renamed from: g */
    public sjv0 f108575g;

    /* JADX INFO: renamed from: h */
    public i430 f108576h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f108577i = new LinkedHashSet();

    /* JADX INFO: renamed from: j */
    public final pc0 f108578j = new pc0(this);

    public j430(zz11 zz11Var, jqz jqzVar, m95 m95Var, boolean z, xp4 xp4Var) {
        this.f108569a = zz11Var;
        this.f108570b = jqzVar;
        this.f108571c = z;
        this.f108572d = xp4Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m52322a(RecyclerView recyclerView, List list, Set set, boolean z) {
        boolean zM91622i = this.f108572d.m91622i();
        zz11 zz11Var = this.f108569a;
        jqz jqzVar = this.f108570b;
        if (!zM91622i) {
            Integer numM97254i = zz11Var.m97254i(recyclerView);
            if (numM97254i != null) {
                int iIntValue = numM97254i.intValue();
                if (this.f108574f) {
                    iIntValue--;
                }
                String str = (String) g6f.m43747t0(iIntValue, list);
                jqzVar.m54126a(new t00(new uqz(str != null ? str : "", 1)));
                return;
            }
            return;
        }
        Iterator it = zz11Var.m97258p(recyclerView).iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.f108574f) {
                iIntValue2--;
            }
            String str2 = (String) g6f.m43747t0(iIntValue2, list);
            if (g6f.m43725i0(set, str2)) {
                jqzVar.m54126a(new t00(new uqz(str2 != null ? str2 : "", 1)));
                return;
            }
        }
        if (z) {
            jqzVar.m54126a(hcp0.f89874c);
        }
    }
}
