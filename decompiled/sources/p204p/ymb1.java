package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ymb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f274215a;

    /* JADX INFO: renamed from: b */
    public final boolean f274216b;

    /* JADX INFO: renamed from: c */
    public final fu3 f274217c;

    public ymb1(boolean z, boolean z2, fu3 fu3Var) {
        this.f274215a = z;
        this.f274216b = z2;
        this.f274217c = fu3Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m94190a(snb1 snb1Var) {
        return snb1Var.mo70437d() && snb1Var.isVisible() && !snb1Var.mo70438f();
    }

    /* JADX INFO: renamed from: b */
    public static Next m94191b(snb1 snb1Var, String str) {
        return Next.m15605a(Effects.m15571a(new nm70(snb1Var.mo70434a().f103345d, str)));
    }

    /* JADX INFO: renamed from: c */
    public static Set m94192c(snb1 snb1Var, snb1 snb1Var2) {
        if (m94190a(snb1Var) || !m94190a(snb1Var2)) {
            return (!m94190a(snb1Var) || m94190a(snb1Var2)) ? gbu.f78413a : Collections.singleton(edn0.f58549a);
        }
        return Collections.singleton(b9x0.f25014a);
    }
}
