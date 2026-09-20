package p204p;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class er00 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f61990c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f61991a = -1;

    /* JADX INFO: renamed from: b */
    public int f61992b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m39737a(String str) {
        Matcher matcher = f61990c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = h0b1.f86200a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f61991a = i;
            this.f61992b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX INFO: renamed from: b */
    public final void m39738b(j6f0 j6f0Var) {
        s5f0 s5f0Var;
        s5f0 s5f0Var2;
        j6f0Var.getClass();
        jf40 jf40VarM69788m = pf40.m69788m();
        for (s5f0 s5f0Var3 : j6f0Var.f109303a) {
            if (cef.class.isAssignableFrom(s5f0Var3.getClass())) {
                s5f0Var2 = (s5f0) cef.class.cast(s5f0Var3);
                if (!((cef) s5f0Var2).f37117c.equals("iTunSMPB")) {
                    s5f0Var2 = null;
                }
            } else {
                s5f0Var2 = null;
            }
            if (s5f0Var2 != null) {
                jf40VarM69788m.m28985c(s5f0Var2);
            }
        }
        kf40 kf40VarListIterator = jf40VarM69788m.m53150g().listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            if (m39737a(((cef) kf40VarListIterator.next()).f37118d)) {
                return;
            }
        }
        sx6 sx6Var = new sx6(5);
        j6f0Var.getClass();
        jf40 jf40VarM69788m2 = pf40.m69788m();
        for (s5f0 s5f0Var4 : j6f0Var.f109303a) {
            if (sf50.class.isAssignableFrom(s5f0Var4.getClass())) {
                s5f0Var = (s5f0) sf50.class.cast(s5f0Var4);
                if (!sx6Var.apply(s5f0Var)) {
                    s5f0Var = null;
                }
            } else {
                s5f0Var = null;
            }
            if (s5f0Var != null) {
                jf40VarM69788m2.m28985c(s5f0Var);
            }
        }
        kf40 kf40VarListIterator2 = jf40VarM69788m2.m53150g().listIterator(0);
        while (kf40VarListIterator2.hasNext() && !m39737a(((sf50) kf40VarListIterator2.next()).f208469d)) {
        }
    }
}
