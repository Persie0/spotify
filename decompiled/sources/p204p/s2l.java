package p204p;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s2l {

    /* JADX INFO: renamed from: a */
    public final mc7 f205027a;

    /* JADX INFO: renamed from: b */
    public final rb5 f205028b;

    public s2l(mc7 mc7Var, twy twyVar) {
        this.f205027a = mc7Var;
        this.f205028b = new rb5(twyVar);
    }

    /* JADX INFO: renamed from: a */
    public final String m77049a(String str) {
        String strSubstring;
        rb5 rb5Var = this.f205028b;
        synchronized (rb5Var) {
            if (Objects.equals((String) rb5Var.f197472c, str)) {
                return (String) rb5Var.f197473d;
            }
            List listM81796S = ((twy) rb5Var.f197471b).m81796S(str, rb5.f197466g);
            if (listM81796S.isEmpty()) {
                haz.f89320X.m46953t();
                strSubstring = null;
            } else {
                strSubstring = ((File) Collections.min(listM81796S, rb5.f197467h)).getName().substring(4);
            }
            return strSubstring;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77050b(String str) {
        rb5 rb5Var = this.f205028b;
        synchronized (rb5Var) {
            if (!Objects.equals((String) rb5Var.f197472c, str)) {
                rb5.m75142E((twy) rb5Var.f197471b, str, (String) rb5Var.f197473d);
                rb5Var.f197472c = str;
            }
        }
    }
}
