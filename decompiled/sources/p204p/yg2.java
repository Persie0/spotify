package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yg2 implements Update {

    /* JADX INFO: renamed from: a */
    public static final yg2 f272453a = new yg2();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        Object next;
        adb1 adb1Var;
        eh2 eh2Var = (eh2) obj;
        ug2 ug2Var = (ug2) obj2;
        String str = null;
        if (ug2Var instanceof rg2) {
            rg2 rg2Var = (rg2) ug2Var;
            adb1 adb1Var2 = rg2Var.f198800a;
            int i = rg2Var.f198801b;
            Iterator it = eh2Var.f59461c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                vcb1 vcb1Var = (vcb1) next;
                if (vcb1Var instanceof ucb1) {
                    adb1Var = adb1.f14596a;
                } else {
                    if (!(vcb1Var instanceof tcb1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    adb1Var = adb1.f14597b;
                }
            } while (adb1Var != adb1Var2);
            vcb1 vcb1Var2 = (vcb1) next;
            if (vcb1Var2 != null) {
                if (vcb1Var2 instanceof ucb1) {
                    str = ((ucb1) vcb1Var2).f229000b;
                } else {
                    if (!(vcb1Var2 instanceof tcb1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((tcb1) vcb1Var2).f219063b;
                }
            }
            return str == null ? Next.m15608j() : Next.m15605a(Collections.singleton(new df2(adb1Var2, str, i)));
        }
        boolean z = ug2Var instanceof qg2;
        bdb1 bdb1Var = bdb1.f26071a;
        bdb1 bdb1Var2 = bdb1.f26072b;
        if (z) {
            qg2 qg2Var = (qg2) ug2Var;
            int iOrdinal = qg2Var.f188342a.ordinal();
            if (iOrdinal == 0) {
                return Next.m15606h(eh2.m38891c(eh2Var, false, false, bdb1Var, 63));
            }
            if (iOrdinal == 1) {
                return Next.m15606h(eh2.m38891c(eh2Var, false, false, bdb1Var2, 63));
            }
            if (iOrdinal == 2) {
                return Next.m15607i(eh2.m38891c(eh2Var, true, false, null, 119), Collections.singleton(new jf2(qg2Var.f188343b, qg2Var.f188344c)));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (ug2Var instanceof ng2) {
            return Next.m15605a(Collections.singleton(lf2.f132789a));
        }
        if (ug2Var instanceof hg2) {
            return Next.m15605a(Collections.singleton(af2.f15006a));
        }
        if (ug2Var instanceof og2) {
            return eh2Var.f59462d ? Next.m15607i(eh2.m38891c(eh2Var, false, true, null, 103), Collections.singleton(kf2.f122041a)) : Next.m15608j();
        }
        boolean z2 = ug2Var instanceof tg2;
        if2 if2Var = if2.f101608a;
        if (z2) {
            int iOrdinal2 = ((tg2) ug2Var).f220105a.ordinal();
            if (iOrdinal2 == 0) {
                return Next.m15607i(eh2.m38891c(eh2Var, false, false, null, ContentType.SHORT_FORM_ON_DEMAND), Collections.singleton(if2Var));
            }
            if (iOrdinal2 == 1) {
                return Next.m15606h(eh2.m38891c(eh2Var, false, false, bdb1Var2, 47));
            }
            if (iOrdinal2 == 2) {
                return Next.m15608j();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (ug2Var instanceof sg2) {
            return Next.m15607i(eh2.m38891c(eh2Var, false, false, null, ContentType.SHORT_FORM_ON_DEMAND), Collections.singleton(if2Var));
        }
        if (!(ug2Var instanceof mg2)) {
            if (ug2Var instanceof jg2) {
                return Next.m15605a(Collections.singleton(ef2.f58911a));
            }
            if (ug2Var instanceof ig2) {
                return Next.m15605a(Collections.singleton(bf2.f26527a));
            }
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal3 = ((mg2) ug2Var).f143286a.ordinal();
        if (iOrdinal3 == 0) {
            return Next.m15606h(eh2.m38891c(eh2Var, false, false, bdb1Var, 63));
        }
        if (iOrdinal3 == 1) {
            return Next.m15606h(eh2.m38891c(eh2Var, false, false, bdb1Var2, 63));
        }
        if (iOrdinal3 == 2) {
            return Next.m15608j();
        }
        throw new NoWhenBranchMatchedException();
    }
}
