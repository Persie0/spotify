package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zo01 extends yo01 {

    /* JADX INFO: renamed from: a */
    public final wf0 f284610a;

    /* JADX INFO: renamed from: b */
    public final qf40 f284611b;

    /* JADX INFO: renamed from: c */
    public final String f284612c;

    /* JADX INFO: renamed from: d */
    public final String f284613d;

    /* JADX INFO: renamed from: e */
    public final String f284614e;

    /* JADX INFO: renamed from: f */
    public final String f284615f;

    public zo01(wf0 wf0Var, qf40 qf40Var, String str, String str2, String str3, int i) {
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        String str4 = (i & 32) == 0 ? "android.intent.category.DEFAULT" : null;
        this.f284610a = wf0Var;
        this.f284611b = qf40Var;
        this.f284612c = str;
        this.f284613d = str2;
        this.f284614e = str3;
        this.f284615f = str4;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo75991f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo43586g(Intent intent, ys01 ys01Var, fbk fbkVar);

    /* JADX INFO: renamed from: h */
    public final Object m96604h(ys01 ys01Var, zx01 zx01Var) {
        Intent intentM87917a = this.f284610a.m87917a(this);
        if (intentM87917a != null) {
            return mo43586g(intentM87917a, ys01Var, zx01Var);
        }
        throw new IllegalStateException(("No resolvable intent found for destination " + this + ". At this stage, the intent must be resolvable.").toString());
    }
}
