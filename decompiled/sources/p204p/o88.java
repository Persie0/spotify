package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.pam.p118v2.Action;
import com.spotify.pam.p118v2.ActionTypeMap;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o88 implements Update {
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        String uri;
        Action actionM16395n;
        Action actionM16395n2;
        String uri2;
        Action actionM16395n3;
        String uri3;
        w88 w88Var = (w88) obj;
        n88 n88Var = (n88) obj2;
        qf40 qf40Var = w88Var.f248877b;
        if (n88Var instanceof l88) {
            l88 l88Var = (l88) n88Var;
            return wqb0.m88741g(w88Var, l88Var.f130820a, false, l88Var.f130821b);
        }
        if (n88Var instanceof j88) {
            j88 j88Var = (j88) n88Var;
            return wqb0.m88741g(w88Var, j88Var.f109862a, true, j88Var.f109863b);
        }
        if (n88Var instanceof m88) {
            m88 m88Var = (m88) n88Var;
            return Next.m15605a(Collections.singleton(new f88(m88Var.f140939a, m88Var.f140940b)));
        }
        String str = "";
        Object obj3 = null;
        if (n88Var instanceof g88) {
            g88 g88Var = (g88) n88Var;
            int i = g88Var.f77433a;
            boolean z = g88Var.f77434b;
            v851 v851Var = (v851) qf40Var.get(i);
            qf40 qf40Var2 = ((v851) qf40Var.get(i)).f238407l;
            if (qf40Var2 != null) {
                for (Object obj4 : qf40Var2) {
                    if (((ActionTypeMap) obj4).m16396o() == j70.ASTRO_ENROLL) {
                        obj3 = obj4;
                        break;
                    }
                }
                ActionTypeMap actionTypeMap = (ActionTypeMap) obj3;
                if (actionTypeMap != null && (actionM16395n3 = actionTypeMap.m16395n()) != null && (uri3 = actionM16395n3.getUri()) != null) {
                    str = uri3;
                }
            }
            return Next.m15605a(Collections.singleton(new a88(v851Var, i, z, str)));
        }
        if (n88Var instanceof h88) {
            h88 h88Var = (h88) n88Var;
            int i2 = h88Var.f88650a;
            boolean z2 = h88Var.f88651b;
            v851 v851Var2 = (v851) qf40Var.get(i2);
            qf40 qf40Var3 = ((v851) qf40Var.get(i2)).f238407l;
            if (qf40Var3 != null) {
                for (Object obj5 : qf40Var3) {
                    if (((ActionTypeMap) obj5).m16396o() == j70.ASTRO_MANAGE) {
                        obj3 = obj5;
                        break;
                    }
                }
                ActionTypeMap actionTypeMap2 = (ActionTypeMap) obj3;
                if (actionTypeMap2 != null && (actionM16395n2 = actionTypeMap2.m16395n()) != null && (uri2 = actionM16395n2.getUri()) != null) {
                    str = uri2;
                }
            }
            return Next.m15605a(Collections.singleton(new b88(v851Var2, i2, z2, str)));
        }
        if (!(n88Var instanceof i88)) {
            if (!(n88Var instanceof k88)) {
                throw new NoWhenBranchMatchedException();
            }
            k88 k88Var = (k88) n88Var;
            int i3 = k88Var.f120266a;
            return Next.m15605a(Collections.singleton(new e88((c8o0) w88Var.f248878c.get(i3), i3, k88Var.f120267b, k88Var.f120268c)));
        }
        i88 i88Var = (i88) n88Var;
        int i4 = i88Var.f99731a;
        boolean z3 = i88Var.f99732b;
        v851 v851Var3 = (v851) qf40Var.get(i4);
        qf40 qf40Var4 = ((v851) qf40Var.get(i4)).f238407l;
        if (qf40Var4 != null) {
            for (Object obj6 : qf40Var4) {
                if (((ActionTypeMap) obj6).m16396o() == j70.ASTRO_REQUEST) {
                    obj3 = obj6;
                    break;
                }
            }
            ActionTypeMap actionTypeMap3 = (ActionTypeMap) obj3;
            if (actionTypeMap3 == null || (actionM16395n = actionTypeMap3.m16395n()) == null || (uri = actionM16395n.getUri()) == null) {
                uri = "spotify:account-management:aom";
            }
        } else {
            uri = "spotify:account-management:aom";
        }
        return Next.m15605a(Collections.singleton(new c88(v851Var3, i4, z3, uri)));
    }
}
