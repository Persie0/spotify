package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p961 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jz6 f175174a;

    public p961(jz6 jz6Var) {
        this.f175174a = jz6Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        g961 g961Var = (g961) obj;
        ta61 ta61Var = g961Var.f77681a;
        ta61 ta61Var2 = g961Var.f77682b;
        fa61 fa61Var = g961Var.f77683c;
        List list = ta61Var.f218467b;
        int i = fa61Var.f67446a;
        List list2 = ((ma61) list.get(i)).f141486e;
        int i2 = fa61Var.f67447b;
        boolean z = ((la61) list2.get(i2)).f131284d;
        List list3 = ta61Var2.f218467b;
        boolean z2 = ((la61) ((ma61) list3.get(i)).f141486e.get(i2)).f131284d;
        ma61 ma61Var = (ma61) list3.get(i);
        if (z != z2) {
            jz6 jz6Var = this.f175174a;
            if (z2) {
                if (((la61) ma61Var.f141486e.get(i2)).f131283c || ma61Var.f141485d == 2) {
                    int size = list2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (i3 != i2 && ((la61) list2.get(i3)).f131284d) {
                            jz6.m54837f(jz6Var, ta61Var2, "event_option_deselected", Integer.valueOf(i3), null, 8);
                        }
                    }
                }
                jz6.m54837f(jz6Var, ta61Var2, "event_option_selected", Integer.valueOf(i2), null, 8);
            } else {
                jz6.m54837f(jz6Var, ta61Var2, "event_option_deselected", Integer.valueOf(i2), null, 8);
            }
        }
        return w2a1.f247311a;
    }
}
