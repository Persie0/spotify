package p204p;

import com.google.android.recaptcha.internal.zzagk;
import com.google.android.recaptcha.internal.zzahy;

/* JADX INFO: loaded from: classes4.dex */
public final class kaf1 implements obf1 {

    /* JADX INFO: renamed from: b */
    public static final haf1 f120894b;

    /* JADX INFO: renamed from: a */
    public final laf1 f120895a;

    static {
        haf1 haf1Var = haf1.f89214b;
        int i = m9f1.f141300a;
        f120894b = haf1.f89214b;
    }

    public kaf1(laf1 laf1Var) {
        this.f120895a = laf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final laf1 m55905a(byte[] bArr) throws zzagk {
        laf1 laf1VarM58552s = laf1.m58552s(this.f120895a, bArr, bArr.length, f120894b);
        if (laf1VarM58552s == null || laf1.m58551r(laf1VarM58552s, true)) {
            return laf1VarM58552s;
        }
        throw new zzagk(new zzahy().getMessage());
    }
}
