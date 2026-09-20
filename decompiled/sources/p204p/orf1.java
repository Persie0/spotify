package p204p;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class orf1 {

    /* JADX INFO: renamed from: a */
    public final ura0 f168556a;

    /* JADX INFO: renamed from: b */
    public final String f168557b;

    /* JADX INFO: renamed from: c */
    public g7d1 f168558c;

    /* JADX INFO: renamed from: d */
    public final List f168559d;

    public orf1(String str) {
        acc.m25452b(str);
        this.f168557b = str;
        this.f168556a = new ura0("MediaControlChannel", null);
        this.f168559d = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    public final void m67690a(shf1 shf1Var) {
        this.f168559d.add(shf1Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m67691b(long j, String str) {
        Object[] objArr = {str, null};
        ura0 ura0Var = this.f168556a;
        ura0Var.getClass();
        if (!Build.TYPE.equals("user") && ura0Var.f233312b && Log.isLoggable(ura0Var.f233311a, 2)) {
            ura0Var.m83850c("Sending text message: %s to: %s", objArr);
        }
        g7d1 g7d1Var = this.f168558c;
        if (g7d1Var == null) {
            ura0Var.m83850c("Attempt to send text message without a sink", new Object[0]);
        } else {
            g7d1Var.m43811j(j, this.f168557b, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m67692c() {
        g7d1 g7d1Var = this.f168558c;
        if (g7d1Var != null) {
            return g7d1Var.m43812k();
        }
        this.f168556a.m83850c("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }
}
