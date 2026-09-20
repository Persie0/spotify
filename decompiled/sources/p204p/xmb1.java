package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class xmb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f263332a;

    /* JADX INFO: renamed from: b */
    public final boolean f263333b;

    public xmb1(boolean z, boolean z2) {
        this.f263332a = z;
        this.f263333b = z2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m91457a(snb1 snb1Var) {
        return (snb1Var.mo70437d() || snb1Var.mo70436c()) && snb1Var.isVisible() && !snb1Var.mo70438f();
    }

    /* JADX INFO: renamed from: b */
    public static Next m91458b(snb1 snb1Var, String str) {
        return Next.m15605a(Effects.m15571a(new om70(snb1Var.mo70434a().f103345d, str)));
    }

    /* JADX INFO: renamed from: c */
    public static Set m91459c(snb1 snb1Var, snb1 snb1Var2) {
        if (m91457a(snb1Var) || !m91457a(snb1Var2)) {
            return (!m91457a(snb1Var) || m91457a(snb1Var2)) ? gbu.f78413a : Collections.singleton(ddn0.f47844a);
        }
        return Collections.singleton(a9x0.f13670a);
    }

    /* JADX INFO: renamed from: d */
    public static snb1 m91460d(snb1 snb1Var, boolean z, boolean z2) {
        if (snb1Var instanceof pnb1) {
            return pnb1.m70433g((pnb1) snb1Var, z2, false, false, z, 0, 93);
        }
        if (snb1Var instanceof qnb1) {
            return qnb1.m73341g((qnb1) snb1Var, z2, false, false, z, 0, 93);
        }
        if (snb1Var instanceof rnb1) {
            return rnb1.m75998g((rnb1) snb1Var, z2, false, false, z, 0, 93);
        }
        if (snb1Var instanceof tnb1) {
            return tnb1.m81170g((tnb1) snb1Var, z2, false, false, false, z, 0, 93);
        }
        if (snb1Var instanceof unb1) {
            return unb1.m83542g((unb1) snb1Var, z2, false, false, z, 0, 93);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    public static snb1 m91461e(snb1 snb1Var, boolean z) {
        if (snb1Var instanceof pnb1) {
            return pnb1.m70433g((pnb1) snb1Var, false, false, z, false, 0, 119);
        }
        if (snb1Var instanceof qnb1) {
            return qnb1.m73341g((qnb1) snb1Var, false, false, z, false, 0, 119);
        }
        if (snb1Var instanceof rnb1) {
            return rnb1.m75998g((rnb1) snb1Var, false, false, z, false, 0, 119);
        }
        if (snb1Var instanceof tnb1) {
            return tnb1.m81170g((tnb1) snb1Var, false, false, z, false, false, 0, 119);
        }
        if (snb1Var instanceof unb1) {
            return unb1.m83542g((unb1) snb1Var, false, false, z, false, 0, 119);
        }
        throw new NoWhenBranchMatchedException();
    }
}
