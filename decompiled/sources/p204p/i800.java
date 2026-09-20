package p204p;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i800 {

    /* JADX INFO: renamed from: a */
    public static final h800 f99657a = h800.f88585a;

    /* JADX INFO: renamed from: a */
    public static h800 m49889a(i500 i500Var) {
        while (i500Var != null) {
            if (i500Var.m49727z0()) {
                i500Var.m49720s0();
            }
            i500Var = i500Var.f98683V0;
        }
        return f99657a;
    }

    /* JADX INFO: renamed from: b */
    public static void m49890b(Violation violation) {
        if (c700.m31595O(3)) {
            violation.f888a.getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m49891c(String str, i500 i500Var) {
        m49890b(new FragmentReuseViolation("Attempting to reuse fragment " + i500Var + " with previous ID " + str, i500Var));
        m49889a(i500Var).getClass();
    }

    /* JADX INFO: renamed from: d */
    public static final void m49892d(i500 i500Var, ViewGroup viewGroup) {
        m49890b(new FragmentTagUsageViolation("Attempting to use <fragment> tag to add fragment " + i500Var + " to container " + viewGroup, i500Var));
        m49889a(i500Var).getClass();
    }

    /* JADX INFO: renamed from: e */
    public static final void m49893e(i500 i500Var) {
        m49890b(new GetRetainInstanceUsageViolation("Attempting to get retain instance for fragment " + i500Var, i500Var));
        m49889a(i500Var).getClass();
    }

    /* JADX INFO: renamed from: f */
    public static final void m49894f(i500 i500Var) {
        m49890b(new GetTargetFragmentUsageViolation("Attempting to get target fragment from fragment " + i500Var, i500Var));
        m49889a(i500Var).getClass();
    }

    /* JADX INFO: renamed from: g */
    public static final void m49895g(i500 i500Var) {
        m49890b(new SetRetainInstanceUsageViolation("Attempting to set retain instance for fragment " + i500Var, i500Var));
        m49889a(i500Var).getClass();
    }

    /* JADX INFO: renamed from: h */
    public static final void m49896h(i500 i500Var, i500 i500Var2) {
        m49890b(new SetTargetFragmentUsageViolation("Attempting to set target fragment " + i500Var2 + " with request code 0 for fragment " + i500Var, i500Var));
        m49889a(i500Var).getClass();
    }

    /* JADX INFO: renamed from: i */
    public static final void m49897i(i500 i500Var, ViewGroup viewGroup) {
        m49890b(new WrongFragmentContainerViolation("Attempting to add fragment " + i500Var + " to container " + viewGroup + " which is not a FragmentContainerView", i500Var));
        m49889a(i500Var).getClass();
    }

    /* JADX INFO: renamed from: j */
    public static final void m49898j(i500 i500Var, i500 i500Var2, int i) {
        StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
        sb.append(i500Var);
        sb.append(" within the view of parent fragment ");
        sb.append(i500Var2);
        sb.append(" via container with ID ");
        m49890b(new WrongNestedHierarchyViolation(klh.m56832d(i, " without using parent's childFragmentManager", sb), i500Var));
        m49889a(i500Var).getClass();
    }
}
