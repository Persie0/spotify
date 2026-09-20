package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class gyn0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hyn0 f85681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyn0(hyn0 hyn0Var, int i) {
        super(3);
        this.f85680a = i;
        this.f85681b = hyn0Var;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, p.eh00] */
    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f85680a) {
            case 0:
                eyn0 eyn0Var = (eyn0) obj2;
                if (eyn0Var.equals(dyn0.f54417a)) {
                    this.f85681b.f96617b.invoke();
                } else if (!eyn0Var.equals(cyn0.f43330a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            default:
                eyn0 eyn0Var2 = (eyn0) obj3;
                if (!eyn0Var2.equals(dyn0.f54417a)) {
                    if (eyn0Var2.equals(cyn0.f43330a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                qag0 qag0Var = (qag0) this.f85681b.f96616a.invoke();
                qag0Var.getClass();
                yt91 yt91VarM96903c = qag0Var.f186874a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("search_bar", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("input_field", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
