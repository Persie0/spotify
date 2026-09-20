package p204p;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class gw40 {

    /* JADX INFO: renamed from: a */
    public final ydo0 f84917a;

    /* JADX INFO: renamed from: b */
    public final jk4 f84918b;

    /* JADX INFO: renamed from: c */
    public final Object f84919c = new Object();

    /* JADX INFO: renamed from: d */
    public final qqi0 f84920d = new qqi0(0, new yjd1[16]);

    /* JADX INFO: renamed from: e */
    public boolean f84921e;

    public gw40(ydo0 ydo0Var, jk4 jk4Var) {
        this.f84917a = ydo0Var;
        this.f84918b = jk4Var;
    }

    /* JADX INFO: renamed from: a */
    public final llk0 m45917a(EditorInfo editorInfo) {
        llk0 mlk0Var;
        synchronized (this.f84919c) {
            if (this.f84921e) {
                return null;
            }
            InputConnection inputConnectionMo48322a = this.f84917a.mo48322a(editorInfo);
            zc30 zc30Var = new zc30(this, 19);
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                mlk0Var = new nlk0(inputConnectionMo48322a, zc30Var);
            } else {
                mlk0Var = i >= 25 ? new mlk0(inputConnectionMo48322a, zc30Var) : new llk0(inputConnectionMo48322a, zc30Var);
            }
            this.f84920d.m73556b(new yjd1(mlk0Var));
            return mlk0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m45918b() {
        return !this.f84921e;
    }
}
